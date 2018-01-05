package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public final class com.caverock.androidsvg.cj extends com.caverock.androidsvg.ck
{

    public Path a;
    public final com.caverock.androidsvg.cf b;

    cj(com.caverock.androidsvg.cf p0, Path p1, float p2) {
        this.b = p0;
        com.caverock.androidsvg.ck(p0, p2, 0);
        this.a = p1;
    }

    public final void a(String p0) {
        if (this.b.c()) {
            if (this.b.h.b != 0)
                this.b.a.drawTextOnPath(p0, this.a, this.c, this.d, this.b.h.d);
            if (this.b.h.c != 0)
                this.b.a.drawTextOnPath(p0, this.a, this.c, this.d, this.b.h.e);
        }
        this.c = this.c + this.b.h.d.measureText(p0);
    }

}
