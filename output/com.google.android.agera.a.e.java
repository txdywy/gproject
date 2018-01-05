package com.google.android.agera.a;

import android.support.v7.widget.em;
import com.google.android.agera.x;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.agera.a.e implements android.support.v7.f.j
{

    public static com.google.android.agera.a.e a;
    public final List b;
    public int c;
    public int d;
    public int e;

    e() {
        this.b = new ArrayList();
    }

    static com.google.android.agera.a.e a(int p0) {
        enter com.google.android.agera.a.e;
        try {
            v0 = com.google.android.agera.a.e.a;
            com.google.android.agera.a.e.a = 0;
            exit com.google.android.agera.a.e;
        }
        catch (Throwable ex) {
            try {
                exit com.google.android.agera.a.e;
            }
            catch (Throwable ex) {
                exit com.google.android.agera.a.e;
                throw ex;
            }
            throw ex;
        }
        if (v0 == 0)
            v0 = new com.google.android.agera.a.e();
        v0.d = p0;
        return v0;
    }

    private final com.google.android.agera.a.d c() {
        if (this.d != -1)
            v0 = 1;
        else
            v0 = 0;
        com.google.android.agera.x.a(v0, "Illegal call to ListUpdateCallback");
        this.c = this.c + 1;
        if (this.b.size() > this.c)
            v0 = (com.google.android.agera.a.d)this.b.get(this.c);
        else {
            v0 = new com.google.android.agera.a.d();
            this.b.add(v0);
        }
        return v0;
    }

    final int a() {
        this.d = this.d + this.e;
        return this.d + this.e;
    }

    public final void a(int p0, int p1) {
        v2 = 0;
        if (p0 >= 0 && p0 <= this.e)
            v0 = 1;
        else
            v0 = 0;
        com.google.android.agera.x.b(v0, "onInserted: invalid position");
        if (p1 >= 0)
            v2 = 1;
        com.google.android.agera.x.b(v2, "onInserted: invalid count");
        v0 = this.c();
        v0.a = 1;
        v0.b = this.d + p0;
        v0.c = p1;
        v0.d = 0;
        this.e = this.e + p1;
    }

    public final void a(int p0, int p1, Object p2) {
        v1 = 1;
        if (p0 >= 0 && p0 < this.e)
            v0 = 1;
        else
            v0 = 0;
        com.google.android.agera.x.b(v0, "onChanged: invalid position");
        if (p1 < 0 || p0 + p1 > this.e)
            v1 = 0;
        com.google.android.agera.x.b(v1, "onChanged: invalid count");
        v0 = this.c();
        v0.a = 4;
        v0.b = this.d + p0;
        v0.c = p1;
        v0.d = p2;
    }

    final void a(com.google.android.agera.a.a p0) {
        v1 = 0;
        while (v1 < this.c) {
            v0 = (com.google.android.agera.a.d)this.b.get(v1);
            switch (v0.a) {
                case 1:
                    p0.c(v0.b, v0.c);
                    break;
                case 2:
                    p0.d(v0.b, v0.c);
                    break;
                case 3:
                    p0.b(v0.b, v0.c);
                    break;
                case 4:
                    p0.a(v0.b, v0.c, v0.d);
                    break;
                default:
                    break;
            }
            v1 = v1 + 1;
        }
        this.b();
    }

    final void b() {
        this.c = 0;
        this.d = -1;
        this.e = 0;
        enter com.google.android.agera.a.e;
        try {
            com.google.android.agera.a.e.a = this;
            exit com.google.android.agera.a.e;
            return;
            exit com.google.android.agera.a.e;
        }
        catch (Throwable ex) {
            exit com.google.android.agera.a.e;
            throw ex;
        }
    }

    public final void b(int p0, int p1) {
        v1 = 1;
        if (p0 >= 0 && p0 < this.e)
            v0 = 1;
        else
            v0 = 0;
        com.google.android.agera.x.b(v0, "onRemoved: invalid position");
        if (p1 < 0 || p0 + p1 > this.e)
            v1 = 0;
        com.google.android.agera.x.b(v1, "onRemoved: invalid count");
        v0 = this.c();
        v0.a = 2;
        v0.b = this.d + p0;
        v0.c = p1;
        v0.d = 0;
        this.e = this.e - p1;
    }

    public final void c(int p0, int p1) {
        v1 = 1;
        if (p0 >= 0 && p0 < this.e)
            v0 = 1;
        else
            v0 = 0;
        com.google.android.agera.x.b(v0, "onMoved: invalid fromPosition");
        if (p1 < 0 || p1 >= this.e)
            v1 = 0;
        com.google.android.agera.x.b(v1, "onMoved: invalid toPosition");
        v0 = this.c();
        v0.a = 3;
        v0.b = this.d + p0;
        v0.c = this.d + p1;
        v0.d = 0;
    }

}
