package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.StrictMode;
import android.os.SystemClock;
import com.google.p409c.p410a.p411a.p412a.p413a.C6918a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.metrics.RecordHistogram;

public class PathUtils {
    public static AsyncTask f40496a;
    public static String f40497b;

    private PathUtils() {
    }

    static String[] m37801a() {
        Throwable th;
        try {
            C7903p c7903p;
            Throwable th2;
            if (!f40496a.cancel(false)) {
                return (String[]) f40496a.get();
            }
            c7903p = new C7903p(StrictMode.allowThreadDiskWrites(), (byte) 0);
            try {
                r0 = new String[5];
                Context context = C7888e.f40514a;
                r0[0] = context.getDir(f40497b, 0).getPath();
                r0[1] = context.getDir("textures", 0).getPath();
                r0[4] = context.getDir("download_internal", 0).getPath();
                r0[2] = context.getDatabasePath("foo").getParent();
                if (context.getCacheDir() != null) {
                    r0[3] = context.getCacheDir().getPath();
                }
                c7903p.close();
                return r0;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th3 = th2;
                th2 = th4;
            }
            throw th2;
            return null;
            if (th3 != null) {
                try {
                    c7903p.close();
                } catch (Throwable th5) {
                    C6918a.m31587a(th3, th5);
                }
            } else {
                c7903p.close();
            }
            throw th2;
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
    }

    @CalledByNative
    public static String getDataDirectory() {
        return C7901n.f40546a[0];
    }

    @CalledByNative
    public static String getDatabaseDirectory() {
        return C7901n.f40546a[2];
    }

    @CalledByNative
    public static String getCacheDirectory() {
        return C7901n.f40546a[3];
    }

    @CalledByNative
    public static String getThumbnailCacheDirectory() {
        return C7901n.f40546a[1];
    }

    @CalledByNative
    public static String getDownloadInternalDirectory() {
        return C7901n.f40546a[4];
    }

    @CalledByNative
    private static String getDownloadsDirectory() {
        Throwable th;
        C7903p c7903p = new C7903p(StrictMode.allowThreadDiskReads(), (byte) 0);
        Throwable th2 = null;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            RecordHistogram.m37823a("Android.StrictMode.DownloadsDir", SystemClock.elapsedRealtime() - elapsedRealtime, TimeUnit.MILLISECONDS);
            c7903p.close();
            return path;
        } catch (Throwable th22) {
            Throwable th3 = th22;
            th22 = th;
            th = th3;
        }
        if (th22 != null) {
            try {
                c7903p.close();
            } catch (Throwable th4) {
                C6918a.m31587a(th22, th4);
            }
        } else {
            c7903p.close();
        }
        throw th;
        throw th;
    }

    @CalledByNative
    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = C7888e.f40514a.getApplicationInfo();
        if ((applicationInfo.flags & 128) != 0 || (applicationInfo.flags & 1) == 0) {
            return applicationInfo.nativeLibraryDir;
        }
        return "/system/lib/";
    }

    @CalledByNative
    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    static {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
    }
}
