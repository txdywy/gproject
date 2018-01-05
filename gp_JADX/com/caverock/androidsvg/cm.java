package com.caverock.androidsvg;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;

final class cm implements Cloneable {
    public av f4436a;
    public boolean f4437b;
    public boolean f4438c;
    public Paint f4439d = new Paint();
    public Paint f4440e;
    public C0723r f4441f;
    public C0723r f4442g;
    public boolean f4443h;
    public boolean f4444i;

    public cm() {
        this.f4439d.setFlags(385);
        this.f4439d.setStyle(Style.FILL);
        this.f4439d.setTypeface(Typeface.DEFAULT);
        this.f4440e = new Paint();
        this.f4440e.setFlags(385);
        this.f4440e.setStyle(Style.STROKE);
        this.f4440e.setTypeface(Typeface.DEFAULT);
        this.f4436a = av.m4598a();
    }

    protected final Object clone() {
        try {
            cm cmVar = (cm) super.clone();
            cmVar.f4436a = (av) this.f4436a.clone();
            cmVar.f4439d = new Paint(this.f4439d);
            cmVar.f4440e = new Paint(this.f4440e);
            return cmVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
