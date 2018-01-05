package com.firebase.jobdispatcher;

import android.os.Bundle;

public final class com.firebase.jobdispatcher.t implements com.firebase.jobdispatcher.z
{

    public final String a;
    public final String b;
    public final com.firebase.jobdispatcher.ag c;
    public final com.firebase.jobdispatcher.am d;
    public final int e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final Bundle i;

    t(com.firebase.jobdispatcher.u p0) {
        this.a = p0.b;
        if (p0.c == 0)
            v0 = 0;
        else
            v0 = new Bundle(p0.c);
        this.i = v0;
        this.b = p0.d;
        this.c = p0.e;
        this.d = p0.h;
        this.e = p0.f;
        this.f = p0.j;
        if (p0.g != 0)
            v0 = p0.g;
        else
            v0 = new int[0];
        this.g = v0;
        this.h = p0.i;
    }

    public final int[] a() {
        return this.g;
    }

    public final Bundle b() {
        return this.i;
    }

    public final com.firebase.jobdispatcher.am c() {
        return this.d;
    }

    public final boolean d() {
        return this.h;
    }

    public final String e() {
        return this.b;
    }

    public final com.firebase.jobdispatcher.ag f() {
        return this.c;
    }

    public final int g() {
        return this.e;
    }

    public final boolean h() {
        return this.f;
    }

    public final String i() {
        return this.a;
    }

}
