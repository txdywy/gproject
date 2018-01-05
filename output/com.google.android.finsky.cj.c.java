package com.google.android.finsky.cj;

import android.os.Environment;
import com.google.android.finsky.cv.a.dl;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public static class com.google.android.finsky.cj.c
{

    public static final Pattern a;
    public static final Pattern b;
    public static File c;

    static {
        com.google.android.finsky.cj.c.a = Pattern.compile("^patch\\.(\\d+)\\.([\\w\\.]+)\\.obb$");
        com.google.android.finsky.cj.c.b = Pattern.compile("^main\\.(\\d+)\\.([\\w\\.]+)\\.obb$");
    }

    public static long a(com.google.android.finsky.cv.a.n p0) {
  5:    v6 = 0;
  6:    v8 = 0;
 10:    if (v6 >= p0.n.length)
 82:        return v8;
 18:    switch (p0.n[v6].c) {
            case 0:
 18:            goto 51;
            case 1:
 18:            goto 56;
            case 2:
 18:            goto 56;
            default:
        }
 24:    v2 = new Object[3];
 30:    v2[0] = Integer.valueOf(p0.n[v6].c);
 34:    v2[1] = p0.k;
 40:    v2[2] = Integer.valueOf(v6);
 42:    FinskyLog.c("Bad file type %d in %s entry# %d", v2);
 45:    v2 = v8;
 48:    v6 = v6 + 1;
 49:    v8 = v2;
 50:    goto 7;
 54:    v2 = v8 + p0.n[v6].e;
 55:    goto 46;
 56:    if (p0.n[v6].c == 2)
 58:        v1 = 1;
        else
 80:        v1 = 0;
 67:    v0 = new com.google.android.finsky.cj.a(v1, p0.k, p0.n[v6].d, p0.n[v6].e);
 73:    if (v0.e != 4) goto 45;
 78:    v2 = v8 + v0.d;
 79:    goto 46;
    }

    public static synchronized File a(String p0) {
        enter com.google.android.finsky.cj.c;
        try {
            if (com.google.android.finsky.cj.c.c == 0)
                com.google.android.finsky.cj.c.c = new File(new File(Environment.getExternalStorageDirectory(), "Android"), "obb");
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.cj.c;
            throw ex;
        }
        exit com.google.android.finsky.cj.c;
        return new File(com.google.android.finsky.cj.c.c, p0);
    }

    public static Integer a(String p0, String p1, boolean p2) {
        if (p2 != 0)
            v0 = com.google.android.finsky.cj.c.a;
        else
            v0 = com.google.android.finsky.cj.c.b;
        v0 = v0.matcher(p0);
        if (v0.matches()) {
            if (v0.group(2).equals(p1)) {
                try {
                    v0 = Integer.valueOf(Integer.parseInt(v0.group(1)));
                }
                catch (NumberFormatException ex) {
                    v1 = new Object[2];
                    v1[0] = p0;
                    v1[1] = p1;
                    FinskyLog.d("Unable to parse version code from OBB file name %s for package %s", v1);
                    v0 = 0;
                }
                return v0;
            }
            v1 = new Object[2];
            v1[0] = p0;
            v1[1] = p1;
            FinskyLog.d("Unable to parse version code from OBB file name %s for package %s", v1);
        }
        v0 = 0;
        return v0;
    }

    public static String a(boolean p0, int p1, String p2) {
        if (p0 != 0)
            v0 = "patch";
        else
            v0 = "main";
        return v0 + "." + p1 + "." + p2 + ".obb";
    }

}
