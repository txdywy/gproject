package com.google.android.finsky.bn;

import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.installer.b.a.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.a;

public final class com.google.android.finsky.bn.d
{

    public final com.google.android.finsky.bn.c a;

    d(String p0) {
        this.a = new com.google.android.finsky.bn.c(p0);
    }

    public static com.google.android.finsky.bn.d a(com.google.android.finsky.bn.c p0, String p1) {
        v0 = new com.google.android.finsky.bn.d(p1);
        if (p0 != 0) {
            if (!p1.equals(p0.a)) {
                v2 = new Object[2];
                v2[0] = p1;
                v2[1] = p0.a;
                FinskyLog.e("Package name mismatch,  %s != %s", v2);
            }
            v0.a(p0.b);
            v0.b(p0.c);
            v0.c(p0.K);
            v0.d(p0.d);
            v0.a(p0.e, p0.f);
            v0.e(p0.g);
            v0.a(p0.h);
            v0.a(p0.j);
            v0.b(p0.k);
            v0.e(p0.n);
            v0.c(p0.i);
            v0.d(p0.l);
            v0.f(p0.m);
            v0.a.o = p0.o;
            v0.f(p0.p);
            v0.b(p0.q);
            v0.g(p0.r);
            v0.h(p0.s);
            v0.g(p0.t);
            v0.a(p0.a());
            v0.h(p0.v);
            v0.i(p0.w);
            v0.a(p0.x);
            v0.c(p0.y);
            v0.a(p0.z);
            v0.d(p0.A);
            v0.e(p0.B);
            v0.j(p0.C);
            v0.a.D = p0.D;
            v0.a.E = p0.c();
            v0.a.F = p0.d();
            v0.f(p0.G);
            v0.k(p0.H);
            v0.i(p0.I);
            v0.a.J = p0.J;
            v0.b(p0.L);
            v0.a(p0.M);
        }
        return v0;
    }

    public final com.google.android.finsky.bn.d a(int p0) {
        this.a.b = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d a(long p0) {
        this.a.j = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d a(com.google.android.finsky.cv.a.n p0) {
        this.a.z = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d a(com.google.android.finsky.installer.b.a.d p0) {
        this.a.M = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d a(com.google.wireless.android.finsky.b.a p0, long p1) {
        this.a.e = p0;
        this.a.f = p1;
        return this;
    }

    public final com.google.android.finsky.bn.d a(String p0) {
        this.a.h = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d a(byte[] p0) {
        this.a.x = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d a(String[] p0) {
        this.a.u = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d b(int p0) {
        this.a.c = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d b(long p0) {
        this.a.q = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d b(String p0) {
        this.a.k = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d b(String[] p0) {
        this.a.L = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d c(int p0) {
        this.a.K = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d c(long p0) {
        this.a.y = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d c(String p0) {
        this.a.i = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d d(int p0) {
        this.a.d = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d d(long p0) {
        this.a.A = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d d(String p0) {
        this.a.l = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d e(int p0) {
        this.a.g = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d e(long p0) {
        this.a.B = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d e(String p0) {
        this.a.n = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d f(int p0) {
        this.a.m = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d f(long p0) {
        this.a.G = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d f(String p0) {
        this.a.p = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d g(int p0) {
        this.a.r = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d g(String p0) {
        this.a.t = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d h(int p0) {
        this.a.s = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d h(String p0) {
        this.a.v = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d i(int p0) {
        this.a.I = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d i(String p0) {
        this.a.w = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d j(String p0) {
        this.a.C = p0;
        return this;
    }

    public final com.google.android.finsky.bn.d k(String p0) {
        this.a.H = p0;
        return this;
    }

}
