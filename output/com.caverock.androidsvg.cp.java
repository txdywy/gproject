package com.caverock.androidsvg;

import android.graphics.Paint;

public final class com.caverock.androidsvg.cp extends com.caverock.androidsvg.co
{

    public float a;
    public final com.caverock.androidsvg.cf b;

    cp(com.caverock.androidsvg.cf p0) {
        this.b = p0;
        com.caverock.androidsvg.co();
        this.a = 0;
    }

    public final void a(String p0) {
        this.a = this.a + this.b.h.d.measureText(p0);
    }

}
