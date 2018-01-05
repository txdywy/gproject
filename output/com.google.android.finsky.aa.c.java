package com.google.android.finsky.aa;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.util.HashSet;
import java.util.Set;

public final class com.google.android.finsky.aa.c
{

    public static Context a;
    public final String b;
    public final int c;

    c(String p0) {
        new HashSet();
        this.b = p0;
        this.c = 0;
    }

    public final SharedPreferences a() {
        return com.google.android.finsky.aa.c.a.getSharedPreferences(this.b, this.c);
    }

    public final com.google.android.finsky.aa.n a(String p0, Boolean p1) {
        return new com.google.android.finsky.aa.g(this, p0, p1);
    }

    public final com.google.android.finsky.aa.n a(String p0, Integer p1) {
        return new com.google.android.finsky.aa.h(this, p0, p1);
    }

    public final com.google.android.finsky.aa.n a(String p0, Long p1) {
        return new com.google.android.finsky.aa.d(this, p0, p1);
    }

    public final com.google.android.finsky.aa.n a(String p0, String p1) {
        return new com.google.android.finsky.aa.e(this, p0, p1);
    }

    public final com.google.android.finsky.aa.n a(String p0, Set p1) {
        return new com.google.android.finsky.aa.f(this, p0, p1);
    }

    public final com.google.android.finsky.aa.m b(String p0, Boolean p1) {
        return new com.google.android.finsky.aa.k(this, this, p0, p1);
    }

    public final com.google.android.finsky.aa.m b(String p0, Integer p1) {
        return new com.google.android.finsky.aa.l(this, this, p0, p1);
    }

    public final com.google.android.finsky.aa.m b(String p0, Long p1) {
        return new com.google.android.finsky.aa.i(this, this, p0, p1);
    }

    public final com.google.android.finsky.aa.m b(String p0, String p1) {
        return new com.google.android.finsky.aa.j(this, this, p0, p1);
    }

    public final void b() {
        this.a().edit().clear().commit();
    }

}
