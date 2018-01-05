package com.google.android.finsky.cj;

import android.os.Environment;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C2286c {
    public static final Pattern f11306a = Pattern.compile("^patch\\.(\\d+)\\.([\\w\\.]+)\\.obb$");
    public static final Pattern f11307b = Pattern.compile("^main\\.(\\d+)\\.([\\w\\.]+)\\.obb$");
    public static File f11308c;

    public static synchronized File m11779a(String str) {
        File file;
        synchronized (C2286c.class) {
            if (f11308c == null) {
                f11308c = new File(new File(Environment.getExternalStorageDirectory(), "Android"), "obb");
            }
            file = new File(f11308c, str);
        }
        return file;
    }

    public static String m11781a(boolean z, int i, String str) {
        return (z ? "patch" : "main") + "." + i + "." + str + ".obb";
    }

    public static Integer m11780a(String str, String str2, boolean z) {
        Matcher matcher = (z ? f11306a : f11307b).matcher(str);
        if (matcher.matches()) {
            if (matcher.group(2).equals(str2)) {
                try {
                    return Integer.valueOf(Integer.parseInt(matcher.group(1)));
                } catch (NumberFormatException e) {
                }
            }
            FinskyLog.m21667d("Unable to parse version code from OBB file name %s for package %s", str, str2);
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @java.lang.Deprecated
    public static long m11778a(com.google.android.finsky.cv.p177a.C2441n r12) {
        /*
        r11 = 2;
        r10 = 1;
        r7 = 0;
        r0 = 0;
        r6 = r7;
        r8 = r0;
    L_0x0007:
        r0 = r12.f13174n;
        r0 = r0.length;
        if (r6 >= r0) goto L_0x0052;
    L_0x000c:
        r0 = r12.f13174n;
        r4 = r0[r6];
        r0 = r4.f12154c;
        switch(r0) {
            case 0: goto L_0x0033;
            case 1: goto L_0x0038;
            case 2: goto L_0x0038;
            default: goto L_0x0015;
        };
    L_0x0015:
        r1 = "Bad file type %d in %s entry# %d";
        r2 = 3;
        r2 = new java.lang.Object[r2];
        r0 = java.lang.Integer.valueOf(r0);
        r2[r7] = r0;
        r0 = r12.f13171k;
        r2[r10] = r0;
        r0 = java.lang.Integer.valueOf(r6);
        r2[r11] = r0;
        com.google.android.finsky.utils.FinskyLog.m21665c(r1, r2);
    L_0x002d:
        r2 = r8;
    L_0x002e:
        r0 = r6 + 1;
        r6 = r0;
        r8 = r2;
        goto L_0x0007;
    L_0x0033:
        r0 = r4.f12156e;
        r8 = r8 + r0;
        r2 = r8;
        goto L_0x002e;
    L_0x0038:
        if (r0 != r11) goto L_0x0050;
    L_0x003a:
        r1 = r10;
    L_0x003b:
        r0 = new com.google.android.finsky.cj.a;
        r2 = r12.f13171k;
        r3 = r4.f12155d;
        r4 = r4.f12156e;
        r0.<init>(r1, r2, r3, r4);
        r1 = r0.f11300e;
        r2 = 4;
        if (r1 != r2) goto L_0x002d;
    L_0x004b:
        r0 = r0.f11299d;
        r8 = r8 + r0;
        r2 = r8;
        goto L_0x002e;
    L_0x0050:
        r1 = r7;
        goto L_0x003b;
    L_0x0052:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cj.c.a(com.google.android.finsky.cv.a.n):long");
    }
}
