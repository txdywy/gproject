package com.google.android.finsky.installer.p207a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.os.C0327a;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.installer.C3281b;
import com.google.android.finsky.installer.C3283a;
import com.google.android.finsky.p227n.C3747c;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public final class C3282b implements C3281b {
    public static final String[] f16962a = new String[]{"version", "cert_hash", "derived_id", "archive_uri", "obb_main_uri", "obb_main_version", "obb_patch_uri", "obb_patch_version"};
    public final Context f16963b;
    public final C1461c f16964c;
    public final C1503a f16965d;
    public final C3747c f16966e;

    public C3282b(Context context, C1461c c1461c, C1503a c1503a, C3747c c3747c) {
        this.f16963b = context;
        this.f16964c = c1461c;
        this.f16965d = c1503a;
        this.f16966e = c3747c;
    }

    public final C3283a mo3413a(String str) {
        if (!this.f16965d.f8184h) {
            return m16475b(str);
        }
        if (!this.f16964c.dj().mo2294a(12642495) || !this.f16966e.m17636a()) {
            return null;
        }
        String[] strArr = new String[]{str};
        Cursor query = this.f16963b.getContentResolver().query(C3747c.f18902a, f16962a, "package_name=?", strArr, null);
        if (query == null || !query.moveToFirst()) {
            return null;
        }
        int i = query.getInt(query.getColumnIndexOrThrow("version"));
        String string = query.getString(query.getColumnIndexOrThrow("cert_hash"));
        int i2 = query.getInt(query.getColumnIndexOrThrow("derived_id"));
        Uri parse = Uri.parse(query.getString(query.getColumnIndexOrThrow("archive_uri")));
        int i3 = query.getInt(query.getColumnIndexOrThrow("obb_main_version"));
        Uri parse2 = Uri.parse(query.getString(query.getColumnIndexOrThrow("obb_main_uri")));
        int i4 = query.getInt(query.getColumnIndexOrThrow("obb_patch_version"));
        Uri parse3 = Uri.parse(query.getString(query.getColumnIndexOrThrow("obb_patch_uri")));
        query.close();
        C3287e c3287e = new C3287e(str, i3, i4, parse2, parse3, this.f16963b);
        return new C3286d(str, i, i2, string, parse, c3287e, this.f16963b);
    }

    private final C3283a m16475b(String str) {
        Throwable e;
        String str2 = null;
        if (!this.f16964c.dj().mo2294a(12637748) || !C0327a.m1722b()) {
            return null;
        }
        try {
            File file = (File) Context.class.getDeclaredMethod("getPreloadsFileCache", new Class[0]).invoke(this.f16963b, new Object[0]);
            if (file == null || !file.isDirectory()) {
                FinskyLog.m21669e("Preloads directory was not found.", new Object[0]);
                return null;
            }
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(".apk");
            if (valueOf2.length() != 0) {
                valueOf2 = valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            File file2 = new File(file, valueOf2);
            if (!file2.exists()) {
                return null;
            }
            File a = C3282b.m16474a(file, str, 0);
            file = C3282b.m16474a(file, str, 1);
            PackageInfo packageArchiveInfo = this.f16963b.getPackageManager().getPackageArchiveInfo(file2.getPath(), 64);
            if (packageArchiveInfo == null) {
                return null;
            }
            int i;
            int i2 = packageArchiveInfo.versionCode;
            if (packageArchiveInfo.applicationInfo.metaData == null) {
                i = 0;
            } else {
                i = packageArchiveInfo.applicationInfo.metaData.getInt("com.android.vending.derived.apk.id", 0);
            }
            if (!(packageArchiveInfo.signatures == null || packageArchiveInfo.signatures.length == 0)) {
                str2 = C4688t.m21838a(packageArchiveInfo.signatures[0].toByteArray());
            }
            return new bb(i2, i, str2, file2, new bc(C3282b.m16473a(a, 0), a, C3282b.m16473a(file, 1), file));
        } catch (NoSuchMethodException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Invocation of Context.getPreloadsFileCache() failed", new Object[0]);
            return null;
        } catch (InvocationTargetException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Invocation of Context.getPreloadsFileCache() failed", new Object[0]);
            return null;
        } catch (IllegalAccessException e4) {
            e = e4;
            FinskyLog.m21663b(e, "Invocation of Context.getPreloadsFileCache() failed", new Object[0]);
            return null;
        }
    }

    private static File m16474a(File file, String str, int i) {
        String str2 = "";
        if (i == 0) {
            str2 = "main.";
        } else if (i == 1) {
            str2 = "patch.";
        } else {
            FinskyLog.m21669e("Wrong file type", new Object[0]);
        }
        File[] listFiles = file.listFiles(new C3285c(str2, str));
        if (listFiles == null || listFiles.length != 1) {
            return null;
        }
        return listFiles[0];
    }

    private static int m16473a(File file, int i) {
        int i2 = 0;
        if (file == null) {
            return -1;
        }
        String str = "";
        if (i == 0) {
            str = "main.";
        } else if (i == 1) {
            str = "patch.";
        } else {
            FinskyLog.m21669e("Wrong file type", new Object[0]);
        }
        String name = file.getName();
        for (int length = str.length(); length < name.length(); length++) {
            char charAt = name.charAt(length);
            if (!Character.isDigit(charAt)) {
                return i2;
            }
            i2 = (i2 * 10) + Character.getNumericValue(charAt);
        }
        return i2;
    }
}
