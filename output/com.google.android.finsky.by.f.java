package com.google.android.finsky.by;

import com.google.android.finsky.aa.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class com.google.android.finsky.by.f extends com.google.android.finsky.by.g
{

    public static final String[] a;
    public static Map b;
    public final String[] c;
    public final long d;
    public final long e;
    public final boolean f;

    static {
        com.google.android.finsky.by.f.a = 0;
    }

    f(String p0, String p1, int p2, long p3, String[] p5, long p6, long p8, boolean p10, boolean p11, String p12, int p13, long p14) {
        com.google.android.finsky.by.g(p0, com.google.android.finsky.by.h.a, 3, p1, 1, p2, p3, 9223372036854775807, 0, p11, p12, p13, p14);
        this.c = p5;
        this.d = p6;
        this.e = p8;
        this.f = p10;
    }

    private static synchronized Map a() {
        enter com.google.android.finsky.by.f;
        try {
            if (com.google.android.finsky.by.f.b == 0) {
                com.google.android.finsky.by.f.b = new HashMap();
                v3 = ((String)com.google.android.finsky.aa.b.gJ.b()).split(";");
                v0 = 0;
                while (v0 < v3.length) {
                    v5 = v3[v0].split(":");
                    if (v5.length != 2) {
                        v6 = new Object[1];
                        v6[0] = v3[v0];
                        FinskyLog.a("Wrong format for package key rotation spec %s", v6);
                    }
                    else
                        com.google.android.finsky.by.f.b.put(v5[0], new ArrayList(Arrays.asList(com.google.android.finsky.utils.k.a(v5[1]))));
                    v0 = v0 + 1;
                }
            }
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.by.f;
            throw ex;
        }
        try {
            exit com.google.android.finsky.by.f;
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.by.f;
            throw ex;
        }
        return com.google.android.finsky.by.f.b;
    }

    public final boolean a(String[] p0) {
        if (p0 == com.google.android.finsky.by.f.a)
            v0 = 1;
        else {
            v3 = 0;
            while (v3 < p0.length) {
                v0 = 0;
                while (v0 < this.c.length) {
                    if (p0[v3].equals(this.c[v0])) {
                        v0 = 1;
                        return v0;
                    }
                    v0 = v0 + 1;
                }
                v3 = v3 + 1;
            }
            if (p0 == com.google.android.finsky.by.f.a) {
                v0 = 1;
                return v0;
            }
            v0 = (List)com.google.android.finsky.by.f.a().get(this.k);
            if (v0 != 0) {
                v3 = 0;
                while (v3 < p0.length) {
                    if (v0.contains(p0[v3])) {
                        v0 = 1;
                        return v0;
                    }
                    v3 = v3 + 1;
                }
            }
            v0 = 0;
        }
        return v0;
    }

    public final boolean equals(Object p0) {
  1:    v0 = 0;
  6:    if (!super.equals(p0))
  8:        return v0;
 11:    if (!(p0 instanceof com.google.android.finsky.by.f)) {
 13:        v0 = 1;
 14:        return v0;
        }
 23:    if (this.c.length != ((com.google.android.finsky.by.f)p0).c.length)
  8:        return v0;
 28:    v3 = 0;
 29:    if (v3 >= this.c.length) {
 58:        v0 = 1;
 59:        return v0;
        }
 31:    v2 = 0;
 32:    if (v2 >= this.c.length) goto 60;
 46:    if (!this.c[v3].equals(((com.google.android.finsky.by.f)p0).c[v2])) goto 55;
 48:    v2 = 1;
 49:    if (v2 == 0)
  8:        return v0;
 53:    v3 = v3 + 1;
 54:    goto 29;
 55:    v2 = v2 + 1;
 57:    goto 32;
 60:    v2 = 0;
 61:    goto 49;
    }

    public final String toString() {
        v1 = new Object[1];
        v1[0] = this.k;
        return String.format("{package=%s}", v1);
    }

}
