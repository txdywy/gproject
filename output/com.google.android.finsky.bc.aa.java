package com.google.android.finsky.bc;

import android.content.Intent;
import com.android.volley.VolleyError;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.bc.aa extends com.google.android.finsky.bc.y implements com.android.volley.w, com.android.volley.x, com.google.android.finsky.bc.m
{

    public com.google.android.finsky.dx.a a;
    public com.google.android.finsky.bc.l b;

    aa(com.google.android.finsky.bc.q p0) {
        com.google.android.finsky.bc.y(p0);
        ((com.google.android.finsky.bc.t)com.google.android.finsky.providers.d.a(com.google.android.finsky.bc.t)).a(this);
    }

    public final void a() {
        com.google.android.finsky.bc.l.a(new com.google.android.finsky.bc.ab(this), this.e.d(), 1);
    }

    public final void a(int p0, Intent p1) {
        FinskyLog.a(22 + "resultCode=" + p0, new Object[0]);
        if (p0 == 1) {
            this.b = com.google.android.finsky.bc.l.a(this, this.e.d());
            this.c();
        }
        else
            this.d();
    }

    public final void a(VolleyError p0) {
        this.b.b(p0);
    }

    public final void b_(Object p0) {
        this.b = 0;
        this.e.d().e = 1;
        this.e();
    }

    public final void c() {
        this.a.a(this.e.a(), this, this, "1");
    }

}
