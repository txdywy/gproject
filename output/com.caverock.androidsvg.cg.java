package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.List;

public final class com.caverock.androidsvg.cg implements com.caverock.androidsvg.an
{

    public List a;
    public float b;
    public float c;
    public com.caverock.androidsvg.ch d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    cg(com.caverock.androidsvg.am p0) {
        this.a = new ArrayList();
        this.d = 0;
        this.e = 0;
        this.f = 1;
        this.g = -1;
        if (p0 != 0) {
            p0.a(this);
            if (this.h != 0) {
                this.d.a((com.caverock.androidsvg.ch)this.a.get(this.g));
                this.a.set(this.g, this.d);
                this.h = 0;
            }
            if (this.d != 0)
                this.a.add(this.d);
        }
    }

    public final void a() {
        this.a.add(this.d);
        this.b(this.b, this.c);
        this.h = 1;
    }

    public final void a(float p0, float p1) {
        if (this.h != 0) {
            this.d.a((com.caverock.androidsvg.ch)this.a.get(this.g));
            this.a.set(this.g, this.d);
            this.h = 0;
        }
        if (this.d != 0)
            this.a.add(this.d);
        this.b = p0;
        this.c = p1;
        this.d = new com.caverock.androidsvg.ch(p0, p1, 0, 0);
        this.g = this.a.size();
    }

    public final void a(float p0, float p1, float p2, float p3) {
        this.d.a(p0, p1);
        this.a.add(this.d);
        this.d = new com.caverock.androidsvg.ch(p2, p3, p2 - p0, p3 - p1);
        this.h = 0;
    }

    public final void a(float p0, float p1, float p2, float p3, float p4, float p5) {
        if (this.f != 0 || this.e != 0) {
            this.d.a(p0, p1);
            this.a.add(this.d);
            this.e = 0;
        }
        this.d = new com.caverock.androidsvg.ch(p4, p5, p4 - p2, p5 - p3);
        this.h = 0;
    }

    public final void a(float p0, float p1, float p2, boolean p3, boolean p4, float p5, float p6) {
        this.e = 1;
        this.f = 0;
        com.caverock.androidsvg.cf.a(this.d.a, this.d.b, p0, p1, p2, p3, p4, p5, p6, this);
        this.f = 1;
        this.h = 0;
    }

    public final void b(float p0, float p1) {
        this.d.a(p0, p1);
        this.a.add(this.d);
        this.d = new com.caverock.androidsvg.ch(p0, p1, p0 - this.d.a, p1 - this.d.b);
        this.h = 0;
    }

}
