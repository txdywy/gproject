package com.caverock.androidsvg;

import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Typeface;

protected final class com.caverock.androidsvg.cm implements Cloneable
{

    public com.caverock.androidsvg.av a;
    public boolean b;
    public boolean c;
    public Paint d;
    public Paint e;
    public com.caverock.androidsvg.r f;
    public com.caverock.androidsvg.r g;
    public boolean h;
    public boolean i;

    cm() {
        this.d = new Paint();
        this.d.setFlags(385);
        this.d.setStyle(Paint$Style.FILL);
        this.d.setTypeface(Typeface.DEFAULT);
        this.e = new Paint();
        this.e.setFlags(385);
        this.e.setStyle(Paint$Style.STROKE);
        this.e.setTypeface(Typeface.DEFAULT);
        this.a = com.caverock.androidsvg.av.a();
    }

    protected final Object clone() {
        try {
            v0 = (com.caverock.androidsvg.cm)super.clone();
            v0.a = (com.caverock.androidsvg.av)this.a.clone();
            v0.d = new Paint(this.d);
            v0.e = new Paint(this.e);
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError(ex.toString());
        }
        return v0;
    }

}
