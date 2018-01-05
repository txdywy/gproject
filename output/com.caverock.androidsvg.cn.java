package com.caverock.androidsvg;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

public final class com.caverock.androidsvg.cn extends com.caverock.androidsvg.co
{

    public float a;
    public float b;
    public RectF c;
    public final com.caverock.androidsvg.cf d;

    cn(com.caverock.androidsvg.cf p0, float p1, float p2) {
        this.d = p0;
        com.caverock.androidsvg.co();
        this.c = new RectF();
        this.a = p1;
        this.b = p2;
    }

    public final void a(String p0) {
        if (this.d.c()) {
            v0 = new Rect();
            this.d.h.d.getTextBounds(p0, 0, p0.length(), v0);
            v1 = new RectF(v0);
            v1.offset(this.a, this.b);
            this.c.union(v1);
        }
        this.a = this.a + this.d.h.d.measureText(p0);
    }

    public final boolean a(com.caverock.androidsvg.bx p0) {
        if (p0 instanceof com.caverock.androidsvg.by) {
            v1 = p0.t.b(((com.caverock.androidsvg.by)p0).a);
            if (v1 == 0) {
                v3 = new Object[1];
                v3[0] = ((com.caverock.androidsvg.by)p0).a;
                com.caverock.androidsvg.cf.b("TextPath path reference '%s' not found", v3);
                v0 = 0;
            }
            else {
                v0 = (com.caverock.androidsvg.al)v1;
                v1 = new com.caverock.androidsvg.ci(v0.a);
                if (v0.e != 0)
                    v1.a.transform(v0.e);
                v0 = new RectF();
                v1.a.computeBounds(v0, 1);
                this.c.union(v0);
                v0 = 0;
            }
        }
        else
            v0 = 1;
        return v0;
    }

}
