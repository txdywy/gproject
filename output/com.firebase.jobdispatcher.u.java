package com.firebase.jobdispatcher;

import android.os.Bundle;

public final class com.firebase.jobdispatcher.u implements com.firebase.jobdispatcher.z
{

    public final ValidationEnforcer a;
    public String b;
    public Bundle c;
    public String d;
    public com.firebase.jobdispatcher.ag e;
    public int f;
    public int[] g;
    public com.firebase.jobdispatcher.am h;
    public boolean i;
    public boolean j;

    u(ValidationEnforcer p0) {
        this.e = com.firebase.jobdispatcher.ao.a;
        this.f = 1;
        this.h = com.firebase.jobdispatcher.am.a;
        this.i = 0;
        this.j = 0;
        this.a = p0;
    }

    u(ValidationEnforcer p0, com.firebase.jobdispatcher.z p1) {
        this.e = com.firebase.jobdispatcher.ao.a;
        this.f = 1;
        this.h = com.firebase.jobdispatcher.am.a;
        this.i = 0;
        this.j = 0;
        this.a = p0;
        this.d = p1.e();
        this.b = p1.i();
        this.e = p1.f();
        this.j = p1.h();
        this.f = p1.g();
        this.g = p1.a();
        this.c = p1.b();
        this.h = p1.c();
    }

    public final com.firebase.jobdispatcher.u a(int p0) {
        if (this.g == 0)
            v0 = 1;
        else
            v0 = this.g.length + 1;
        v0 = new int[v0];
        if (this.g != 0 && this.g.length != 0)
            System.arraycopy(this.g, 0, v0, 0, this.g.length);
        v0[v0.length - 1] = p0;
        this.g = v0;
        return this;
    }

    public final com.firebase.jobdispatcher.u a(Class p0) {
        this.b = p0.getName();
        return this;
    }

    public final int[] a() {
        if (this.g == 0)
            v0 = new int[0];
        else
            v0 = this.g;
        return v0;
    }

    public final Bundle b() {
        return this.c;
    }

    public final com.firebase.jobdispatcher.am c() {
        return this.h;
    }

    public final boolean d() {
        return this.i;
    }

    public final String e() {
        return this.d;
    }

    public final com.firebase.jobdispatcher.ag f() {
        return this.e;
    }

    public final int g() {
        return this.f;
    }

    public final boolean h() {
        return this.j;
    }

    public final String i() {
        return this.b;
    }

    public final com.firebase.jobdispatcher.t j() {
        v0 = this.a.a(this);
        if (v0 != 0)
            throw new ValidationEnforcer$ValidationException("JobParameters is invalid", v0);
        return new com.firebase.jobdispatcher.t(this);
    }

}
