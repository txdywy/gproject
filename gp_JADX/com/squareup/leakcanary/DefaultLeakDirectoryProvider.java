package com.squareup.leakcanary;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import com.squareup.leakcanary.internal.LeakCanaryInternals;
import com.squareup.leakcanary.internal.RequestStoragePermissionActivity;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class DefaultLeakDirectoryProvider implements LeakDirectoryProvider {
    public static final int ANALYSIS_MAX_DURATION_MS = 600000;
    public static final int DEFAULT_MAX_STORED_HEAP_DUMPS = 7;
    public static final String HPROF_SUFFIX = ".hprof";
    public static final String PENDING_HEAPDUMP_SUFFIX = "_pending.hprof";
    public final Context context;
    public final int maxStoredHeapDumps;
    public volatile boolean permissionNotificationDisplayed;
    public volatile boolean writeExternalStorageGranted;

    class C75731 implements FilenameFilter {
        C75731(DefaultLeakDirectoryProvider defaultLeakDirectoryProvider) {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(DefaultLeakDirectoryProvider.PENDING_HEAPDUMP_SUFFIX);
        }
    }

    class C75742 implements FilenameFilter {
        C75742(DefaultLeakDirectoryProvider defaultLeakDirectoryProvider) {
        }

        public boolean accept(File file, String str) {
            return !str.endsWith(DefaultLeakDirectoryProvider.PENDING_HEAPDUMP_SUFFIX);
        }
    }

    class C75753 implements FilenameFilter {
        C75753(DefaultLeakDirectoryProvider defaultLeakDirectoryProvider) {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(DefaultLeakDirectoryProvider.HPROF_SUFFIX);
        }
    }

    class C75764 implements Comparator {
        C75764(DefaultLeakDirectoryProvider defaultLeakDirectoryProvider) {
        }

        public int compare(File file, File file2) {
            return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
        }
    }

    public DefaultLeakDirectoryProvider(Context context) {
        this(context, 7);
    }

    public DefaultLeakDirectoryProvider(Context context, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxStoredHeapDumps must be at least 1");
        }
        this.context = context.getApplicationContext();
        this.maxStoredHeapDumps = i;
    }

    public final List listFiles(FilenameFilter filenameFilter) {
        if (!hasStoragePermission()) {
            requestWritePermissionNotification();
        }
        List arrayList = new ArrayList();
        File[] listFiles = externalStorageDirectory().listFiles(filenameFilter);
        if (listFiles != null) {
            arrayList.addAll(Arrays.asList(listFiles));
        }
        listFiles = appStorageDirectory().listFiles(filenameFilter);
        if (listFiles != null) {
            arrayList.addAll(Arrays.asList(listFiles));
        }
        return arrayList;
    }

    public final File newHeapDumpFile() {
        for (File lastModified : listFiles(new C75731(this))) {
            if (System.currentTimeMillis() - lastModified.lastModified() < 600000) {
                CanaryLog.m36611d("Could not dump heap, previous analysis still is in progress.", new Object[0]);
                return HeapDumper.RETRY_LATER;
            }
        }
        cleanupOldHeapDumps();
        File lastModified2 = externalStorageDirectory();
        if (!directoryWritableAfterMkdirs(lastModified2)) {
            if (hasStoragePermission()) {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    CanaryLog.m36611d("Could not create heap dump directory in external storage: [%s]", lastModified2.getAbsolutePath());
                } else {
                    CanaryLog.m36611d("External storage not mounted, state: %s", Environment.getExternalStorageState());
                }
            } else {
                CanaryLog.m36611d("WRITE_EXTERNAL_STORAGE permission not granted", new Object[0]);
                requestWritePermissionNotification();
            }
            lastModified2 = appStorageDirectory();
            if (!directoryWritableAfterMkdirs(lastModified2)) {
                CanaryLog.m36611d("Could not create heap dump directory in app storage: [%s]", lastModified2.getAbsolutePath());
                return HeapDumper.RETRY_LATER;
            }
        }
        String valueOf = String.valueOf(UUID.randomUUID().toString());
        String valueOf2 = String.valueOf(PENDING_HEAPDUMP_SUFFIX);
        return new File(lastModified2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public final void clearLeakDirectory() {
        for (File delete : listFiles(new C75742(this))) {
            if (!delete.delete()) {
                CanaryLog.m36611d("Could not delete file %s", ((File) r1.next()).getPath());
            }
        }
    }

    @TargetApi(23)
    private final boolean hasStoragePermission() {
        boolean z = true;
        if (VERSION.SDK_INT < 23 || this.writeExternalStorageGranted) {
            return true;
        }
        if (this.context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z = false;
        }
        this.writeExternalStorageGranted = z;
        return this.writeExternalStorageGranted;
    }

    private final void requestWritePermissionNotification() {
        if (!this.permissionNotificationDisplayed) {
            this.permissionNotificationDisplayed = true;
            PendingIntent createPendingIntent = RequestStoragePermissionActivity.createPendingIntent(this.context);
            CharSequence string = this.context.getString(C7582R.string.leak_canary_permission_notification_title);
            String packageName = this.context.getPackageName();
            LeakCanaryInternals.showNotification(this.context, string, this.context.getString(C7582R.string.leak_canary_permission_notification_text, new Object[]{packageName}), createPendingIntent, -558907665);
        }
    }

    private final File externalStorageDirectory() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        String str = "leakcanary-";
        String valueOf = String.valueOf(this.context.getPackageName());
        return new File(externalStoragePublicDirectory, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    private final File appStorageDirectory() {
        return new File(this.context.getFilesDir(), LeakCanaryInternals.NOTIFICATION_CHANNEL_ID);
    }

    private final boolean directoryWritableAfterMkdirs(File file) {
        return (file.mkdirs() || file.exists()) && file.canWrite();
    }

    private final void cleanupOldHeapDumps() {
        List listFiles = listFiles(new C75753(this));
        int size = listFiles.size() - this.maxStoredHeapDumps;
        if (size > 0) {
            CanaryLog.m36611d("Removing %d heap dumps", Integer.valueOf(size));
            Collections.sort(listFiles, new C75764(this));
            for (int i = 0; i < size; i++) {
                if (!((File) listFiles.get(i)).delete()) {
                    CanaryLog.m36611d("Could not delete old hprof file %s", ((File) listFiles.get(i)).getPath());
                }
            }
        }
    }
}
