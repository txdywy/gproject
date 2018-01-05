package com.caverock.androidsvg;

import android.graphics.Paint;
import android.graphics.Path;

public final class com.caverock.androidsvg.cl extends com.caverock.androidsvg.co
{

    public float a;
    public float b;
    public Path c;
    public final com.caverock.androidsvg.cf d;

    cl(com.caverock.androidsvg.cf p0, float p1, float p2, Path p3) {
        this.d = p0;
        com.caverock.androidsvg.co();
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void a(String p0) {
        if (this.d.c()) {
            v6 = new Path();
            this.d.h.d.getTextPath(p0, 0, p0.length(), this.a, this.b, v6);
            this.c.addPath(v6);
        }
        this.a = this.a + this.d.h.d.measureText(p0);
    }

    public final boolean a(com.caverock.androidsvg.bx p0) {
        v0 = 0;
        if (p0 instanceof com.caverock.androidsvg.by)
            com.caverock.androidsvg.cf.a("Using <textPath> elements in a clip path is not supported.", new Object[0]);
        else
            v0 = 1;
        return v0;
    }

}
