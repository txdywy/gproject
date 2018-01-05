package com.google.android.finsky.cg;

import android.content.Context;
import android.support.v4.h.h;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.bp;
import com.google.android.play.utils.f;

public final class com.google.android.finsky.cg.a implements com.google.android.finsky.ba.f
{

    public static final long[] a;
    public boolean b;
    public float c;
    public int d;
    public final com.google.android.finsky.ba.c e;
    public final Context f;

    static {
        com.google.android.finsky.cg.a.a = new long[7]{12605174, 12605175, 12605176, 12605177, 12605178, 12605179, 12605180};
    }

    a(com.google.android.finsky.ba.c p0, Context p1) {
        this.b = 0;
        this.c = 1065353216;
        this.d = 0;
        this.e = p0;
        this.f = p1;
        this.e.dj().a(this);
        this.c();
    }

    private final void a(long p0) {
        this.b();
        if (p0 == 12605174)
            this.c = 1065353216;
        else if (p0 == 12605175)
            this.c = 1069547520;
        else if (p0 == 12605176)
            this.c = 1073741824;
        else if (p0 == 12605177) {
            this.c = 1073741824;
            this.d = 300;
        }
        else if (p0 == 12605178)
            this.c = 1075838976;
        else if (p0 == 12605179)
            this.c = 1077936128;
        else {
            if (p0 != 12605180) {
                FinskyLog.a("Bucket experiment disabled", new Object[0]);
                return;
            }
            this.b = 1;
        }
        v1 = new Object[3];
        v1[0] = Float.valueOf(this.c);
        v1[1] = Integer.valueOf(this.d);
        v1[2] = Boolean.valueOf(this.b);
        FinskyLog.a("Enabling bucket experiment: factor=%.3f, zeroDelta=%dms, forceNetwork=%b", v1);
        com.google.android.play.image.bp.a().b = new com.google.android.finsky.cg.b(this);
    }

    private final void b() {
        this.b = 0;
        this.c = 1065353216;
        this.d = 0;
        com.google.android.play.image.bp.a().b = 0;
    }

    private final synchronized void c() {
  0:    enter this;
 10:    v0 = 0;
 11:    if (v0 >= com.google.android.finsky.cg.a.a.length) goto 29;
 19:    if (!this.e.dj().a(com.google.android.finsky.cg.a.a[v0])) goto 26;
 21:    this.a(com.google.android.finsky.cg.a.a[v0]);
 24:    exit this;
 25:    return;
 26:    v0 = v0 + 1;
 28:    goto 11;
 29:    try {
 29:        this.b();
        }
        catch (Throwable ex) {
 34:        exit this;
 35:        throw ex;
        }
 32:    goto 24;
 34:    exit this;
 35:    throw ex;
 37:    try
            run 1...24
        catch (Throwable ex) {
  1:        goto 33;
        }
    }

    final int a() {
        v0 = 2;
        switch (com.google.android.play.utils.f.a(this.f)) {
            case 1:
                v0 = 3;
                break;
            case 2:
                break;
            case 3:
                v0 = 1;
                break;
            case 4:
                v0 = 1;
                break;
            case 5:
                break;
            case 6:
                v0 = 1;
                break;
            default:
                break;
        }
        return v0;
    }

    public final synchronized void a(android.support.v4.h.h p0, android.support.v4.h.h p1) {
  0:    v0 = 0;
  1:    enter this;
  5:    v1 = 0;
  6:    if (v1 >= com.google.android.finsky.cg.a.a.length) goto 19;
 14:    if (p1.c(com.google.android.finsky.cg.a.a[v1]) < 0) goto 37;
 16:    this.b();
 22:    if (v0 >= com.google.android.finsky.cg.a.a.length) {
 35:        exit this;
 36:        return;
        }
 30:    if (p0.c(com.google.android.finsky.cg.a.a[v0]) >= 0) {
 32:        this.a(com.google.android.finsky.cg.a.a[v0]);
 35:        exit this;
 36:        return;
        }
 31:    goto 40;
 37:    v1 = v1 + 1;
 39:    goto 6;
 40:    v0 = v0 + 1;
 42:    goto 22;
 44:    exit this;
 45:    throw ex;
 46:    try
            run 2...35
        catch (Throwable ex) {
  2:        goto 43;
        }
    }

    public final void a(boolean p0) {
    }

}
