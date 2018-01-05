package com.firebase.jobdispatcher;

import android.os.Bundle;
import java.util.Arrays;
import org.json.JSONObject;

public final class com.firebase.jobdispatcher.x implements com.firebase.jobdispatcher.z
{

    public final String a;
    public final String b;
    public final com.firebase.jobdispatcher.ag c;
    public final boolean d;
    public final int e;
    public final int[] f;
    public final Bundle g;
    public final com.firebase.jobdispatcher.am h;
    public final boolean i;
    public final com.firebase.jobdispatcher.ap j;

    x(com.firebase.jobdispatcher.y p0) {
        this.a = p0.a;
        this.b = p0.b;
        this.c = p0.c;
        this.h = p0.h;
        this.d = p0.d;
        this.e = p0.e;
        this.f = p0.f;
        this.g = p0.g;
        this.i = p0.i;
        this.j = p0.j;
    }

    public final int[] a() {
        return this.f;
    }

    public final Bundle b() {
        return this.g;
    }

    public final com.firebase.jobdispatcher.am c() {
        return this.h;
    }

    public final boolean d() {
        return this.i;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (this != p0) {
            if (p0 == 0 || !this.getClass().equals(p0.getClass()))
                v0 = 0;
            else if ((!this.a.equals(((com.firebase.jobdispatcher.x)p0).a)) || !this.b.equals(((com.firebase.jobdispatcher.x)p0).b))
                v0 = 0;
        }
        return v0;
    }

    public final com.firebase.jobdispatcher.ag f() {
        return this.c;
    }

    public final int g() {
        return this.e;
    }

    public final boolean h() {
        return this.d;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public final String i() {
        return this.b;
    }

    public final String toString() {
        v0 = JSONObject.quote(this.a);
        v2 = String.valueOf(this.c);
        v5 = Arrays.toString(this.f);
        v6 = String.valueOf(this.g);
        v7 = String.valueOf(this.h);
        v9 = String.valueOf(this.j);
        return (String.valueOf(v0).length() + 159 + String.valueOf(this.b).length() + String.valueOf(v2).length() + String.valueOf(v5).length() + String.valueOf(v6).length() + String.valueOf(v7).length() + String.valueOf(v9).length()) + "JobInvocation{tag='" + v0 + 39 + ", service='" + this.b + 39 + ", trigger=" + v2 + ", recurring=" + this.d + ", lifetime=" + this.e + ", constraints=" + v5 + ", extras=" + v6 + ", retryStrategy=" + v7 + ", replaceCurrent=" + this.i + ", triggerReason=" + v9 + 125;
    }

}
