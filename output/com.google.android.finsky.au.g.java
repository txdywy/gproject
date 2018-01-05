package com.google.android.finsky.au;

import android.content.Context;
import com.google.android.finsky.cj.a;
import com.google.android.finsky.cj.c;
import com.google.wireless.android.finsky.b.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class com.google.android.finsky.au.g extends com.google.android.finsky.au.d
{

    public final com.google.android.finsky.cj.a a;
    public final Context b;
    public int c;

    g(Context p0, String p1, String p2, com.google.android.finsky.cj.a p3, com.google.wireless.android.finsky.b.e p4) {
        com.google.android.finsky.au.d(p1, p2, p4.e, p4.f, "", p4.h, com.google.android.finsky.au.e.a(p4), p4.j);
        this.c = -2;
        this.a = p3;
        this.b = p0;
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
        return 0;
    }

    public final File b() {
        return new File(com.google.android.finsky.cj.c.a(this.f), com.google.android.finsky.cj.c.a(this.a.a, this.c(), this.f));
    }

    public final synchronized int c() {
        enter this;
        try {
            if (this.c == -2) {
                v4 = com.google.android.finsky.cj.c.a(this.f).listFiles();
                v0 = -1;
                if (v4 != 0) {
                    v1 = 0;
                    while (v1 < v4.length) {
                        v6 = com.google.android.finsky.cj.c.a(v4[v1].getName(), this.f, this.a.a);
                        if (v6 != 0) {
                            if (v6.intValue() > v0)
                                v0 = v6.intValue();
                        }
                        v1 = v1 + 1;
                    }
                }
                this.c = v0;
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return this.c;
    }

    public final boolean d() {
        this.a.a();
        if (this.a.e == 4)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final OutputStream e() {
        v0 = this.a.c();
        v0.delete();
        return new FileOutputStream(v0);
    }

    public final void f() {
        v0 = this.a.c();
        if (v0 != 0)
            v0.delete();
    }

    public final boolean g() {
        return 1;
    }

    public final File h() {
        return this.a.c();
    }

    public final com.google.android.finsky.cj.a i() {
        return this.a;
    }

    public final boolean j() {
        return 0;
    }

}
