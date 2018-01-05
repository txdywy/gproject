package com.caverock.androidsvg;

import android.graphics.Path;

public final class com.caverock.androidsvg.ci implements com.caverock.androidsvg.an
{

    public Path a;
    public float b;
    public float c;

    ci(com.caverock.androidsvg.am p0) {
        this.a = new Path();
        if (p0 != 0)
            p0.a(this);
    }

    public final void a() {
        this.a.close();
    }

    public final void a(float p0, float p1) {
        this.a.moveTo(p0, p1);
        this.b = p0;
        this.c = p1;
    }

    public final void a(float p0, float p1, float p2, float p3) {
        this.a.quadTo(p0, p1, p2, p3);
        this.b = p2;
        this.c = p3;
    }

    public final void a(float p0, float p1, float p2, float p3, float p4, float p5) {
        this.a.cubicTo(p0, p1, p2, p3, p4, p5);
        this.b = p4;
        this.c = p5;
    }

    public final void a(float p0, float p1, float p2, boolean p3, boolean p4, float p5, float p6) {
        com.caverock.androidsvg.cf.a(this.b, this.c, p0, p1, p2, p3, p4, p5, p6, this);
        this.b = p5;
        this.c = p6;
    }

    public final void b(float p0, float p1) {
        this.a.lineTo(p0, p1);
        this.b = p0;
        this.c = p1;
    }

}
