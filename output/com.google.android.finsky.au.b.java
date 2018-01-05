package com.google.android.finsky.au;

import com.google.android.finsky.cm.c;
import com.google.wireless.android.finsky.b.a;
import java.io.File;
import java.io.OutputStream;

public final class com.google.android.finsky.au.b extends com.google.android.finsky.au.d
{

    public final com.google.android.finsky.cm.c a;
    public final File b;
    public final int c;
    public final boolean d;

    b(String p0, String p1, com.google.wireless.android.finsky.b.a p2, com.google.android.finsky.cm.c p3, File p4, int p5, boolean p6) {
        com.google.android.finsky.au.d(p0, p1, p2.b, p2.d, p2.e, p2.f, com.google.android.finsky.au.e.a(p2), p2.q);
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.d = p6;
    }

    public final String a(String p0) {
        return p0;
    }

    public final void a(OutputStream p0) {
        this.a.a(p0);
    }

    public final boolean a() {
        return 1;
    }

    public final boolean a(boolean p0) {
        return 1;
    }

    public final File b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final OutputStream e() {
        return this.a.a(this.f, this.f, this.g);
    }

    public final void f() {
        this.a.b(this.f);
    }

    public final boolean g() {
        return 0;
    }

}
