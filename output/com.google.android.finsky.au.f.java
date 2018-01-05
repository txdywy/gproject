package com.google.android.finsky.au;

import android.content.Context;
import com.google.android.finsky.cj.a;
import com.google.wireless.android.finsky.b.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class com.google.android.finsky.au.f extends com.google.android.finsky.au.d
{

    public final com.google.android.finsky.cj.a a;
    public final Context b;
    public final int c;
    public final File d;
    public final boolean m;

    f(Context p0, String p1, String p2, com.google.android.finsky.cj.a p3, com.google.wireless.android.finsky.b.e p4, int p5, File p6, boolean p7) {
        com.google.android.finsky.au.d(p1, p2, p4.e, p4.f, "", p4.h, com.google.android.finsky.au.e.a(p4), p4.j);
        this.a = p3;
        this.b = p0;
        this.d = p6;
        this.c = p5;
        this.m = p7;
    }

    public final String a(String p0) {
        v2 = new Object[1];
        v2[0] = p0;
        return this.b.getString(2131952640, v2);
    }

    public final void a(OutputStream p0) {
        p0.flush();
        p0.close();
    }

    public final boolean a() {
        return 1;
    }

    public final boolean a(boolean p0) {
        return 1;
    }

    public final File b() {
        return this.d;
    }

    public final synchronized int c() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.c;
    }

    public final boolean d() {
        return this.m;
    }

    public final OutputStream e() {
        return new FileOutputStream(this.h());
    }

    public final void f() {
        this.h().delete();
    }

    public final boolean g() {
        return 1;
    }

    public final File h() {
        return this.a.b();
    }

    public final com.google.android.finsky.cj.a i() {
        return this.a;
    }

    public final boolean j() {
        return 0;
    }

}
