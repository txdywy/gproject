package com.google.android.finsky.dk;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.support.v4.os.C0327a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.an;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.a.a.a.a.co;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C2830g {
    public static final AtomicBoolean f15212d = new AtomicBoolean(false);
    public static final String[] f15213e = new String[]{Environment.DIRECTORY_ALARMS, Environment.DIRECTORY_MUSIC, Environment.DIRECTORY_NOTIFICATIONS, Environment.DIRECTORY_PODCASTS, Environment.DIRECTORY_RINGTONES};
    public static final String[] f15214f = new String[]{Environment.DIRECTORY_DCIM, Environment.DIRECTORY_PICTURES};
    public static final String[] f15215g = new String[]{Environment.DIRECTORY_MOVIES};
    public static final long f15216h = an.f24044g.mo4319a(500);
    public final Context f15217a;
    public final C1461c f15218b;
    public StorageManager f15219c;

    public C2830g(Context context, C1461c c1461c) {
        this.f15217a = context;
        this.f15218b = c1461c;
    }

    public static boolean m14966a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static long m14967b() {
        if (C2830g.m14966a()) {
            return C2830g.m14962a(C2830g.m14964a(Environment.getExternalStorageDirectory().getPath()));
        }
        return -1;
    }

    @TargetApi(26)
    public final long m14976c() {
        long j = -1;
        if (C2830g.m14966a()) {
            try {
                StorageManager h = m14972h();
                j = h.getAllocatableBytes(h.getUuidForPath(Environment.getExternalStorageDirectory()));
            } catch (Throwable e) {
                FinskyLog.m21660a(e, "Failed to get bytes info on external storage of storage via StorageManager API.", new Object[0]);
            }
        }
        return j;
    }

    public static long m14970d() {
        return C2830g.m14962a(C2830g.m14964a(Environment.getDataDirectory().getPath()));
    }

    @TargetApi(26)
    public final long m14977e() {
        try {
            StorageManager h = m14972h();
            return h.getAllocatableBytes(h.getUuidForPath(Environment.getDataDirectory()));
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Failed to get bytes info on internal storage of storage via StorageManager API.", new Object[0]);
            return -1;
        }
    }

    @TargetApi(26)
    public final void m14975a(long j, boolean z) {
        try {
            UUID uuidForPath;
            StorageManager h = m14972h();
            if (z) {
                uuidForPath = h.getUuidForPath(Environment.getDataDirectory());
            } else {
                uuidForPath = h.getUuidForPath(Environment.getExternalStorageDirectory());
            }
            h.allocateBytes(uuidForPath, j);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Failed to allocate required bytes of storage via StorageManager API.", new Object[0]);
        }
    }

    public final boolean m14978f() {
        return C0327a.m1722b() && this.f15218b.dj().mo2294a(12632721);
    }

    public static long m14971g() {
        return C2830g.m14969b(C2830g.m14964a(Environment.getDataDirectory().getPath()));
    }

    @TargetApi(18)
    public static long m14962a(StatFs statFs) {
        if (statFs == null) {
            return -1;
        }
        if (C4671b.m21785b()) {
            return statFs.getAvailableBytes();
        }
        return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
    }

    @TargetApi(18)
    private static long m14969b(StatFs statFs) {
        if (statFs == null) {
            return -1;
        }
        if (C4671b.m21785b()) {
            return statFs.getTotalBytes();
        }
        return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
    }

    @TargetApi(17)
    public final long m14974a(long j) {
        ContentResolver contentResolver = this.f15217a.getContentResolver();
        long longValue = ((Long) C0955b.aX.m28964b()).longValue();
        if (longValue > 0) {
            return longValue;
        }
        int i;
        if (C4671b.m21784a()) {
            i = Global.getInt(contentResolver, "sys_storage_threshold_percentage", 10);
            longValue = Global.getLong(contentResolver, "sys_storage_threshold_max_bytes", f15216h);
        } else {
            i = Secure.getInt(contentResolver, "sys_storage_threshold_percentage", 10);
            longValue = Secure.getLong(contentResolver, "sys_storage_threshold_max_bytes", f15216h);
        }
        return Math.min(longValue, (((long) i) * j) / 100);
    }

    public static long m14968b(long j) {
        return an.f24044g.mo4319a(an.f24038a.mo4326g(j));
    }

    public static co m14965a(boolean z) {
        StatFs a;
        long b;
        StatFs a2 = C2830g.m14964a(Environment.getDataDirectory().getAbsolutePath());
        if (C2830g.m14966a()) {
            a = C2830g.m14964a(Environment.getExternalStorageDirectory().getAbsolutePath());
        } else {
            a = null;
        }
        co coVar = new co();
        boolean isExternalStorageEmulated = Environment.isExternalStorageEmulated();
        coVar.a |= 16;
        coVar.f = isExternalStorageEmulated;
        if (a2 != null) {
            long a3 = C2830g.m14962a(a2);
            b = C2830g.m14969b(a2);
            if (z) {
                a3 = C2830g.m14968b(a3);
                b = C2830g.m14968b(b);
            }
            coVar.a |= 1;
            coVar.b = a3;
            coVar.a |= 2;
            coVar.c = b;
        }
        if (a != null) {
            b = C2830g.m14962a(a);
            long b2 = C2830g.m14969b(a);
            if (z) {
                b = C2830g.m14968b(b);
                b2 = C2830g.m14968b(b2);
            }
            coVar.a |= 4;
            coVar.d = b;
            coVar.a |= 8;
            coVar.e = b2;
        }
        return coVar;
    }

    public final long m14973a(int i) {
        int i2 = (f15212d.get() || !bb.m21795c()) ? 0 : 1;
        if (i2 != 0) {
            FinskyLog.m21669e("StorageUtils.getDiskUsageForDirectory should not be called on the main thread", new Object[0]);
            return -1;
        }
        String[] strArr;
        switch (i) {
            case 1:
                strArr = f15213e;
                break;
            case 2:
                strArr = f15214f;
                break;
            case 3:
                strArr = f15215g;
                break;
            default:
                FinskyLog.m21669e("Invalid directory type: %d", Integer.valueOf(i));
                return -1;
        }
        long j = 0;
        for (String externalStoragePublicDirectory : strArr) {
            j += m14963a(Environment.getExternalStoragePublicDirectory(externalStoragePublicDirectory));
        }
        return j;
    }

    private final long m14963a(File file) {
        long j = 0;
        if (file == null || !file.exists()) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        int i = 0;
        while (i < listFiles.length) {
            long a = m14963a(listFiles[i]) + j;
            i++;
            j = a;
        }
        return j;
    }

    private final StorageManager m14972h() {
        if (this.f15219c == null) {
            this.f15219c = (StorageManager) this.f15217a.getSystemService("storage");
        }
        return this.f15219c;
    }

    private static StatFs m14964a(String str) {
        try {
            return new StatFs(str);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
