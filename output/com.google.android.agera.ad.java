package com.google.android.agera;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.agera.ad implements com.google.android.agera.ae, com.google.android.agera.ag, com.google.android.agera.ah, com.google.android.agera.aj
{

    public static final ThreadLocal a;
    public Object b;
    public final ArrayList c;
    public int d;
    public final ArrayList e;
    public com.google.android.agera.j f;
    public com.google.android.agera.y g;
    public com.google.android.agera.p h;
    public int i;
    public int j;
    public com.google.android.agera.z k;
    public int l;

    static {
        com.google.android.agera.ad.a = new ThreadLocal();
    }

    ad() {
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.h = com.google.android.agera.q.a;
        this.k = com.google.android.agera.d.a;
    }

    public static com.google.android.agera.af a(Object p0) {
        com.google.android.agera.x.a(Looper.myLooper());
        v0 = (com.google.android.agera.ad)com.google.android.agera.ad.a.get();
        if (v0 == 0)
            v0 = new com.google.android.agera.ad();
        else
            com.google.android.agera.ad.a.set(0);
        v0.a(0);
        v0.l = 1;
        v0.b = p0;
        return v0;
    }

    private final void a(int p0) {
        if (this.l == p0)
            v0 = 1;
        else
            v0 = 0;
        com.google.android.agera.x.a(v0, "Unexpected compiler state");
    }

    private final void a(int p0, int p1) {
        if (this.l == p0 || this.l == p1)
            v0 = 1;
        else
            v0 = 0;
        com.google.android.agera.x.a(v0, "Unexpected compiler state");
    }

    private final void c() {
        this.e.add(Integer.valueOf(0));
        this.e.add(Boolean.valueOf(0));
        this.l = 6;
    }

    public final com.google.android.agera.ac a() {
        this.a(6);
        this.l = 0;
        this.b = 0;
        this.c.clear();
        this.d = 0;
        this.e.clear();
        this.h = com.google.android.agera.q.a;
        this.i = 0;
        this.j = 0;
        this.k = com.google.android.agera.d.a;
        com.google.android.agera.ad.a.set(this);
        return new com.google.android.agera.i(this.b, com.google.android.agera.u.a(this.d, (t[])this.c.toArray(new t[this.c.size()])), this.e.toArray(), this.h, this.i, this.j, this.k);
    }

    public final com.google.android.agera.ae a(com.google.android.agera.j p0) {
        this.a(3);
        this.e.add(Integer.valueOf(3));
        this.e.add(p0);
        this.c();
        return this;
    }

    public final com.google.android.agera.ah a(t[] p0) {
        this.a(1, 2);
        v1 = 0;
        while (v1 < p0.length) {
            this.c.add((com.google.android.agera.t)com.google.android.agera.x.a(p0[v1]));
            v1 = v1 + 1;
        }
        this.l = 2;
        return this;
    }

    public final com.google.android.agera.aj a(com.google.android.agera.al p0) {
        this.a(3);
        this.e.add(Integer.valueOf(1));
        this.e.add(p0);
        this.l = 4;
        return this;
    }

    public final com.google.android.agera.ag b() {
        this.a(2);
        this.d = Math.max(0, 0);
        this.l = 3;
        return this;
    }

    public final Object b(com.google.android.agera.j p0) {
        this.a(4, 5);
        if (this.f != 0) {
            this.e.add(Integer.valueOf(4));
            this.e.add(this.f);
            this.e.add((com.google.android.agera.y)com.google.android.agera.x.a(this.g));
            this.e.add(p0);
        }
        else {
            this.e.add(Integer.valueOf(9));
            this.e.add(p0);
        }
        this.f = 0;
        this.g = 0;
        if (this.l == 5)
            this.c();
        else
            this.l = 3;
        return this;
    }

}
