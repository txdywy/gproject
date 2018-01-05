package com.google.android.finsky.bc;

import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.h.a.d;

public final class com.google.android.finsky.bc.x extends com.google.android.finsky.bc.q
{

    public final com.google.android.finsky.bc.u a;
    public final String b;
    public final com.google.android.finsky.bc.a c;
    public final SparseArray d;
    public com.google.android.finsky.cv.a.bd e;
    public com.google.wireless.android.finsky.dfe.h.a.d f;
    public com.google.android.finsky.cv.a.bd g;
    public String h;
    public final com.google.android.finsky.bc.w i;

    x(com.google.android.finsky.bc.w p0, Activity p1) {
        this.i = p0;
        com.google.android.finsky.bc.q();
        v0 = p1.getIntent().getStringExtra("accountName");
        if (v0 == 0)
            v0 = p0.c.cZ();
        this.b = v0;
        if (((com.google.android.finsky.bc.s)p1).B())
            this.c = new com.google.android.finsky.bc.a("pfm", "play");
        else
            this.c = new com.google.android.finsky.bc.a("pfl", "play");
        this.a = new com.google.android.finsky.bc.u(this);
        this.a.c = p1;
        this.d = new SparseArray();
    }

    public final String a() {
        return this.b;
    }

    public final String a(int p0) {
        v0 = (String)this.d.get(p0);
        if (v0 == 0) {
            FinskyLog.b(42 + "Unable to find server text for " + p0, new Object[0]);
            v0 = "";
        }
        return v0;
    }

    public final com.google.android.finsky.cv.a.bd b() {
        return this.e;
    }

    public final com.google.wireless.android.finsky.dfe.h.a.d c() {
        return this.f;
    }

    public final com.google.android.finsky.bc.u d() {
        return this.a;
    }

    public final com.google.android.finsky.bc.a e() {
        return this.c;
    }

    public final com.google.android.finsky.cv.a.bd f() {
        return this.g;
    }

    public final String g() {
        return this.h;
    }

}
