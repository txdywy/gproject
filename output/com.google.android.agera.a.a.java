package com.google.android.agera.a;

import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.agera.t;
import com.google.android.agera.u;
import com.google.android.agera.x;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

final class com.google.android.agera.a.a extends android.support.v7.widget.em implements com.google.android.agera.am
{

    public final int c;
    public final int d;
    public final f[] e;
    public final Map f;
    public final com.google.android.agera.t g;
    public final int[] h;
    public boolean i;
    public int j;
    public int k;

    a(com.google.android.agera.a.c p0) {
        android.support.v7.widget.em();
        v4 = p0.a.size();
        if (v4 > 0)
            v0 = 1;
        else
            v0 = 0;
        com.google.android.agera.x.b(v0, "Must add at least one part");
        this.c = v4;
        this.d = p0.c;
        this.e = new f[v4];
        v3 = 0;
        while (v3 < v4) {
            v0 = (com.google.android.agera.a.f)p0.a.get(v3);
            this.e[v3] = v0;
            v0.a(this, v3);
            v3 = v3 + 1;
        }
        this.f = new IdentityHashMap();
        this.g = com.google.android.agera.u.a((t[])p0.b.toArray(new t[p0.b.size()]));
        this.h = new int[v4];
        this.i = 1;
        p0.a.clear();
        p0.b.clear();
        p0.c = 0;
    }

    private final void c(android.support.v7.widget.fr p0) {
        v0 = this.f.remove(p0);
        if ((com.google.android.agera.a.f)v0 != 0)
            ((com.google.android.agera.a.f)v0).b();
    }

    private final void e() {
        v0 = 0;
        v1 = 0;
        while (v0 < this.c) {
            v1 = v1 + this.e[v0].a();
            this.h[v0] = v1;
            v0 = v0 + 1;
        }
    }

    private final void e(int p0) {
  0:    v0 = this.a();
  4:    if (p0 < 0 || p0 >= v0)
 44:        throw new IndexOutOfBoundsException(57 + "Asked for position " + p0 + " while count is " + v0);
 47:    v0 = Arrays.binarySearch(this.h, p0);
 51:    if (v0 < 0) goto 68;
 53:    v0 = v0 + 1;
 59:    if (this.h[v0] == p0) goto 53;
 61:    this.j = v0;
 63:    if (v0 != 0)
 77:        p0 = p0 - this.h[v0 - 1];
 65:    this.k = p0;
 67:    return;
 68:    v0 = v0 ^ -1;
 70:    goto 61;
    }

    public final int a() {
        if (this.i != 0) {
            this.e();
            this.i = 0;
        }
        return this.h[this.c - 1];
    }

    public final int a(int p0) {
        this.e(p0);
        return this.e[this.j].a(this.k);
    }

    public android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        return new com.google.android.agera.a.b(LayoutInflater.from(p0.getContext()).inflate(p1, p0, 0));
    }

    public void a(android.support.v7.widget.fr p0) {
        this.c(p0);
    }

    public final void a(android.support.v7.widget.fr p0, int p1) {
        this.e(p1);
        this.f.put(p0, this.e[this.j]);
        this.e[this.j].a(this.k, p0);
    }

    public final void ad_() {
        if (this.i != 0)
            return;
        if (!this.a.a())
            this.e();
        else {
            v3 = com.google.android.agera.a.e.a(0);
            v2 = this.h[0];
            v0 = 0;
            while (v0 < this.c) {
                v3.e = v2;
                if (!this.e[v0].a(0)) {
                    this.i = 1;
                    this.a.b();
                    v3.b();
                    return;
                }
                if (v0 + 1 < this.c)
                    v2 = this.h[v0 + 1] - this.h[v0];
                this.h[v0] = v3.a();
                v0 = v0 + 1;
            }
            v3.a(this);
        }
    }

    public final long b(int p0) {
        this.e(p0);
        return this.e[this.j].a(this.k, (long)this.d);
    }

    public final void b() {
        this.g.a(this);
        v0 = 0;
        while (v0 < this.e.length) {
            this.e[v0].c();
            v0 = v0 + 1;
        }
    }

    public boolean b(android.support.v7.widget.fr p0) {
        this.c(p0);
        return super.b(p0);
    }

    public final void c() {
        this.g.b(this);
        v0 = 0;
        while (v0 < this.e.length) {
            this.e[v0].e();
            v0 = v0 + 1;
        }
    }

    final void e(int p0, int p1) {
        while (p0 < this.c) {
            this.h[p0] = this.h[p0] + p1;
            p0 = p0 + 1;
        }
    }

}
