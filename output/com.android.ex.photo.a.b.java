package com.android.ex.photo.a;

import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.h.i;
import android.support.v4.view.af;
import android.view.View;

public final class com.android.ex.photo.a.b extends android.support.v4.view.af
{

    public final android.support.v4.app.ab h;
    public android.support.v4.app.aw i;
    public Fragment j;
    public android.support.v4.h.i k;

    b(android.support.v4.app.ab p0) {
        android.support.v4.view.af();
        this.i = 0;
        this.j = 0;
        this.k = new com.android.ex.photo.a.c(this);
        this.h = p0;
    }

    public Object a(View p0, int p1) {
        if (this.i == 0)
            this.i = this.h.a();
        v0 = this.a(p0.getId(), p1);
        this.k.b(v0);
        v0 = this.h.a(v0);
        if (v0 != 0)
            this.i.e(v0);
        else {
            v0 = this.c(p1);
            if (v0 == 0) {
                v0 = 0;
                return v0;
            }
            this.i.a(p0.getId(), v0, this.a(p0.getId(), p1));
        }
        if (v0 != this.j)
            v0.c(0);
        return v0;
    }

    protected String a(int p0, int p1) {
        return 40 + "android:switcher:" + p0 + ":" + p1;
    }

    public void a(View p0, int p1, Object p2) {
        if (this.i == 0)
            this.i = this.h.a();
        v0 = ((Fragment)p2).I;
        if (v0 == 0)
            v0 = this.a(p0.getId(), p1);
        this.k.a(v0, (Fragment)p2);
        this.i.d((Fragment)p2);
    }

    public final void a(Object p0) {
        if ((Fragment)p0 != this.j) {
            if (this.j != 0)
                this.j.c(0);
            if ((Fragment)p0 != 0)
                ((Fragment)p0).c(1);
            this.j = (Fragment)p0;
        }
    }

    public final boolean a(View p0, Object p1) {
        v0 = p0;
        while (v0 instanceof View) {
            if (v0 == ((Fragment)p1).R) {
                v0 = 1;
                return v0;
            }
            v0 = ((View)v0).getParent();
        }
        v0 = 0;
        return v0;
    }

    public abstract Fragment c(int p0);

    public final void c() {
        if (this.i != 0 && !this.h.h()) {
            this.i.d();
            this.i = 0;
            this.h.b();
        }
    }

}
