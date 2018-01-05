package com.google.android.agera.a;

import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.support.v7.widget.fr;
import com.google.android.agera.ac;
import com.google.android.agera.x;

final class com.google.android.agera.a.g extends com.google.android.agera.a.f implements com.google.android.agera.am
{

    public final com.google.android.agera.ac a;
    public final com.google.android.agera.a.h b;
    public Object c;
    public com.google.android.agera.a.a d;
    public int e;

    g(com.google.android.agera.ac p0, com.google.android.agera.a.h p1) {
        com.google.android.agera.a.f();
        this.a = p0;
        this.b = p1;
        this.c = p0.i_();
    }

    final int a() {
        this.c = this.a.i_();
        return this.b.a(this.c);
    }

    final int a(int p0) {
        return this.b.b(this.c, p0);
    }

    final long a(int p0, long p1) {
        return this.b.a(this.c, p0) + p1;
    }

    final void a(int p0, android.support.v7.widget.fr p1) {
        this.b.a(this.c, p0, p1);
    }

    final void a(com.google.android.agera.a.a p0, int p1) {
        this.d = p0;
        this.e = p1;
    }

    final boolean a(boolean p0) {
        if (p0 != 0)
            this.a.i_();
        return 0;
    }

    public final void ad_() {
        v2 = 0;
        if (this.e < this.d.c && this == this.d.e[this.e])
            v0 = 1;
        else
            v0 = 0;
        com.google.android.agera.x.a(v0, "Wrong RA-part connection");
        if (this.d.i == 0) {
            if (this.e != 0)
                v2 = this.d.h[this.e - 1];
            if (!this.d.a.a())
                this.d.e(this.e, this.a() - (this.d.h[this.e] - v2));
            else {
                v5 = com.google.android.agera.a.e.a(v2);
                v5.e = this.d.h[this.e] - v2;
                if (this.a(1)) {
                    v1 = v5.a();
                    this.d.h[this.e] = v1;
                    this.d.e(this.e + 1, v1 - this.d.h[this.e]);
                    v5.a(this.d);
                }
                else {
                    this.d.i = 1;
                    this.d.a.b();
                    v5.b();
                }
            }
        }
    }

    final void b() {
    }

    final void c() {
        this.a.a(this);
        this.ad_();
    }

    final void e() {
        this.a.b(this);
    }

}
