package com.google.android.finsky.dfemodel;

import com.android.volley.VolleyError;
import com.android.volley.w;
import java.util.HashSet;

public final class com.google.android.finsky.dfemodel.k implements com.android.volley.w
{

    public VolleyError h;
    public final HashSet i;
    public final HashSet j;

    k() {
        this.i = new HashSet();
        this.j = new HashSet();
    }

    public void a(VolleyError p0) {
        this.h = p0;
        this.b(p0);
    }

    public final void a(com.android.volley.w p0) {
        if (!this.j.contains(p0))
            this.j.add(p0);
    }

    public final void a(com.google.android.finsky.dfemodel.w p0) {
        if (!this.i.contains(p0))
            this.i.add(p0);
    }

    public abstract boolean a();

    protected final void b(VolleyError p0) {
        v0 = this.j.toArray(new w[this.j.size()]);
        v1 = 0;
        while (v1 < ((w[])v0).length) {
            ((w[])v0)[v1].a(p0);
            v1 = v1 + 1;
        }
    }

    public final void b(com.android.volley.w p0) {
        this.j.remove(p0);
    }

    public final void b(com.google.android.finsky.dfemodel.w p0) {
        this.i.remove(p0);
    }

    public VolleyError g() {
        return this.h;
    }

    public boolean h() {
        if (this.h != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected void i() {
        this.h = 0;
    }

    public final void j() {
        this.i.clear();
        this.j.clear();
    }

    public final void l() {
        v0 = this.i.toArray(new w[this.i.size()]);
        v1 = 0;
        while (v1 < ((w[])v0).length) {
            ((w[])v0)[v1].m_();
            v1 = v1 + 1;
        }
    }

}
