package com.google.android.finsky.billing.a;

import com.android.volley.aa;
import com.android.volley.b;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

final class com.google.android.finsky.billing.a.f
{

    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Map h;

    f(String p0, com.android.volley.b p1) {
        com.google.android.finsky.billing.a.f(p0, p1.b, p1.c, p1.d, p1.e, p1.f, p1.g);
        this.a = (long)p1.a.length;
    }

    f(String p0, String p1, long p2, long p4, long p6, long p8, Map p10) {
        this.b = p0;
        if ("".equals(p1))
            p1 = 0;
        this.c = p1;
        this.d = p2;
        this.e = p4;
        this.f = p6;
        this.g = p8;
        this.h = p10;
    }

    static com.google.android.finsky.billing.a.f a(com.google.android.finsky.billing.a.g p0) {
        if (com.google.android.finsky.billing.a.e.a(p0) != 538247942)
            throw new IOException();
        return new com.google.android.finsky.billing.a.f(com.google.android.finsky.billing.a.e.a(p0), com.google.android.finsky.billing.a.e.a(p0), com.google.android.finsky.billing.a.e.b(p0), com.google.android.finsky.billing.a.e.b(p0), com.google.android.finsky.billing.a.e.b(p0), com.google.android.finsky.billing.a.e.b(p0), com.google.android.finsky.billing.a.e.b(p0));
    }

    final boolean a(OutputStream p0) {
        v0 = 1;
        try {
            com.google.android.finsky.billing.a.e.a(p0, 538247942);
            com.google.android.finsky.billing.a.e.a(p0, this.b);
            if (this.c == 0)
                v2 = "";
            else
                v2 = this.c;
            com.google.android.finsky.billing.a.e.a(p0, v2);
            com.google.android.finsky.billing.a.e.a(p0, this.d);
            com.google.android.finsky.billing.a.e.a(p0, this.e);
            com.google.android.finsky.billing.a.e.a(p0, this.f);
            com.google.android.finsky.billing.a.e.a(p0, this.g);
            com.google.android.finsky.billing.a.e.a(this.h, p0);
            p0.flush();
            return v0;
        }
        catch (IOException ex) {
            v0 = new Object[v0];
            v0[0] = ex.toString();
            com.android.volley.aa.b("%s", v0);
            v0 = 0;
            return v0;
        }
    }

}
