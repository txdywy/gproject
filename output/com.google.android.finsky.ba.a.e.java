package com.google.android.finsky.ba.a;

import com.google.android.finsky.accounts.a;
import com.google.android.finsky.utils.FinskyLog;

public final synchronized class com.google.android.finsky.ba.a.e extends com.google.android.finsky.ba.a.c
{

    public static final long[] k;

    static {
        com.google.android.finsky.ba.a.e.k = new long[5]{12603301, 12603329, 12603516, 12604154, 12607073};
    }

    e(String p0, com.google.android.finsky.accounts.a p1, f[] p2) {
        com.google.android.finsky.ba.a.c(p0, p1, p2);
    }

    public final synchronized boolean a(long p0) {
  0:    v0 = 1;
  1:    v1 = 0;
  2:    enter this;
  6:    if (v1 >= com.google.android.finsky.ba.a.e.k.length) goto 34;
 12:    if (p0 != com.google.android.finsky.ba.a.e.k[v1]) goto 31;
 17:    v2 = new Object[1];
 24:    v2[0] = Long.valueOf(p0);
 26:    FinskyLog.a("Target id: \"%s\" enabled by default on SW", v2);
 29:    exit this;
 30:    return v0;
 31:    v1 = v1 + 1;
 33:    goto 6;
 34:    try {
 34:        v0 = super.a(p0);
        }
        catch (Throwable ex) {
 40:        exit this;
 41:        throw ex;
        }
 38:    goto 29;
 40:    exit this;
 41:    throw ex;
 43:    try
            run 3...29
        catch (Throwable ex) {
  3:        goto 39;
        }
    }

}
