package com.google.android.finsky.by;

import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;

public class com.google.android.finsky.by.g
{

    public static final String g;
    public final String h;
    public String i;
    public int j;
    public String k;
    public int l;
    public int m;
    public final long n;
    public final long o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final int s;
    public final long t;

    static {
        com.google.android.finsky.by.g.g = 0;
    }

    g(String p0, String p1, int p2, String p3, int p4, int p5) {
        com.google.android.finsky.by.g(p0, p1, p2, p3, p4, p5, -9223372036854775808, 9223372036854775807, 0, 0, 0, 0, 0);
    }

    g(String p0, String p1, int p2, String p3, int p4, int p5, long p6, long p8, boolean p10, boolean p11, String p12, int p13, long p14) {
        if (p3 == 0)
            throw new NullPointerException();
        this.h = p0;
        this.i = p1;
        this.j = p2;
        this.k = p3;
        this.l = p4;
        this.m = p5;
        this.n = p6;
        this.o = p8;
        this.p = p10;
        this.q = p11;
        this.r = p12;
        this.s = p13;
        this.t = p14;
    }

    public static com.google.android.finsky.by.g a(String p0, String p1, com.google.android.finsky.cv.a.ax p2, int p3) {
        return new com.google.android.finsky.by.g(p0, p1, p2.d, p2.b, p2.c, p3);
    }

    public static com.google.android.finsky.by.g a(String p0, String p1, Document p2, int p3) {
        return new com.google.android.finsky.by.g(p0, p1, p2.a.f, p2.a.d, p2.a.e, p3);
    }

    public boolean equals(Object p0) {
        v0 = 1;
        if (this != p0) {
            if (!(p0 instanceof com.google.android.finsky.by.g))
                v0 = 0;
            else if (this.j != ((com.google.android.finsky.by.g)p0).j)
                v0 = 0;
            else if (this.l != ((com.google.android.finsky.by.g)p0).l)
                v0 = 0;
            else if (this.m != ((com.google.android.finsky.by.g)p0).m)
                v0 = 0;
            else if (this.h != com.google.android.finsky.by.g.g && ((com.google.android.finsky.by.g)p0).h != com.google.android.finsky.by.g.g && !this.h.equals(((com.google.android.finsky.by.g)p0).h))
                v0 = 0;
            else if (!this.k.equals(((com.google.android.finsky.by.g)p0).k))
                v0 = 0;
            else if (!this.i.equals(((com.google.android.finsky.by.g)p0).i))
                v0 = 0;
        }
        return v0;
    }

    public int hashCode() {
        v1 = 0;
        if (this.i != 0)
            v0 = this.i.hashCode();
        else
            v0 = 0;
        if (this.k != 0)
            v1 = this.k.hashCode();
        return (((v0 + 0) * 31 + v1) * 31 + this.l) * 31 + this.m;
    }

}
