package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Paint;

public class com.caverock.androidsvg.ck extends com.caverock.androidsvg.co
{

    public final com.caverock.androidsvg.cf b;
    public float c;
    public float d;

    ck(com.caverock.androidsvg.cf p0, float p1, float p2) {
        this.b = p0;
        com.caverock.androidsvg.co();
        this.c = p1;
        this.d = p2;
    }

    public void a(String p0) {
        if (this.b.c()) {
            if (this.b.h.b != 0)
                this.b.a.drawText(p0, this.c, this.d, this.b.h.d);
            if (this.b.h.c != 0)
                this.b.a.drawText(p0, this.c, this.d, this.b.h.e);
        }
        this.c = this.c + this.b.h.d.measureText(p0);
    }

}
