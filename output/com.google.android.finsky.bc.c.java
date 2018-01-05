package com.google.android.finsky.bc;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.android.volley.VolleyError;
import com.google.android.finsky.bb.b;
import com.google.android.finsky.bb.c;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.bc.c extends com.google.android.finsky.bc.y implements com.android.volley.w, com.android.volley.x, com.google.android.finsky.bc.m, com.google.android.finsky.dx.h
{

    public com.google.android.finsky.dx.a a;
    public com.google.android.finsky.bb.b b;
    public int c;
    public com.google.android.finsky.bc.l d;

    c(com.google.android.finsky.bc.q p0) {
        com.google.android.finsky.bc.y(p0);
        ((com.google.android.finsky.bc.t)com.google.android.finsky.providers.d.a(com.google.android.finsky.bc.t)).a(this);
    }

    public final void P_() {
        this.a.b(this);
        if (this.c == 1)
            this.a.a(this.e.a(), this, this, "1");
        else
            this.d();
    }

    public final void a() {
        com.google.android.finsky.bc.l.a(new com.google.android.finsky.bc.d(this), this.e.d(), 1);
    }

    public final void a(int p0, Intent p1) {
        FinskyLog.b(23 + "result code=" + p0, new Object[0]);
        this.c = p0;
        this.d = com.google.android.finsky.bc.l.a(this, this.e.d());
        if (p0 == 1) {
            v0 = p1.getStringExtra("consistencyToken");
            if (v0 != 0)
                this.b.a(this.e.a()).b(v0);
            this.c();
            this.e.d().f = 1;
        }
        else
            this.d();
    }

    public final void a(VolleyError p0) {
        this.d.b(p0);
    }

    public final void b_(Object p0) {
        this.d = 0;
        if (!"pfm".equals(this.e.e().a))
            this.e.d().e = 1;
        this.e();
    }

    public final void c() {
        this.a.a(this);
        this.a.a(this.e.a(), 3);
    }

    public final void ce_() {
        this.a.b(this);
        this.d.a(this.d.c(2131952120));
    }

}
