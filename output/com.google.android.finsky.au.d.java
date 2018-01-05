package com.google.android.finsky.au;

import com.google.android.finsky.cj.a;
import com.google.wireless.android.finsky.b.d;
import com.google.wireless.android.finsky.b.f;
import java.io.File;
import java.io.OutputStream;

public class com.google.android.finsky.au.d
{

    public final String e;
    public final String f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final com.google.wireless.android.finsky.b.f k;
    public final com.google.wireless.android.finsky.b.d l;

    d(String p0, String p1, long p2, String p4, String p5, String p6, com.google.wireless.android.finsky.b.f p7, com.google.wireless.android.finsky.b.d p8) {
        this.f = p1;
        this.g = p2;
        this.h = p4;
        this.i = p5;
        this.j = p6;
        this.k = p7;
        this.l = p8;
        this.e = p0;
    }

    public abstract String a(String p0);

    public abstract void a(OutputStream p0);

    public abstract boolean a();

    public abstract boolean a(boolean p0);

    public abstract File b();

    public abstract int c();

    public abstract boolean d();

    public abstract OutputStream e();

    public abstract void f();

    public abstract boolean g();

    public File h() {
        return 0;
    }

    public com.google.android.finsky.cj.a i() {
        return 0;
    }

    public boolean j() {
        return 1;
    }

}
