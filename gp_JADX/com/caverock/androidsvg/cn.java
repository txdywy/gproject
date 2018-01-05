package com.caverock.androidsvg;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

final class cn extends co {
    public float f4445a;
    public float f4446b;
    public RectF f4447c = new RectF();
    public final /* synthetic */ cf f4448d;

    public cn(cf cfVar, float f, float f2) {
        this.f4448d = cfVar;
        this.f4445a = f;
        this.f4446b = f2;
    }

    public final boolean mo1106a(bx bxVar) {
        if (!(bxVar instanceof by)) {
            return true;
        }
        bm b = bxVar.t.m4794b(((by) bxVar).f4373a);
        if (b == null) {
            cf.m4645b("TextPath path reference '%s' not found", r0.f4373a);
            return false;
        }
        al alVar = (al) b;
        Path path = new ci(alVar.f4251a).f4424a;
        if (alVar.e != null) {
            path.transform(alVar.e);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f4447c.union(rectF);
        return false;
    }

    public final void mo1105a(String str) {
        if (this.f4448d.m4664c()) {
            Rect rect = new Rect();
            this.f4448d.f4406h.f4439d.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.f4445a, this.f4446b);
            this.f4447c.union(rectF);
        }
        this.f4445a += this.f4448d.f4406h.f4439d.measureText(str);
    }
}
