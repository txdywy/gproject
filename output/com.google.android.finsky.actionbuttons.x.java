package com.google.android.finsky.actionbuttons;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

public final class com.google.android.finsky.actionbuttons.x extends ImageSpan
{

    public Drawable a;

    x(Drawable p0) {
        ImageSpan(p0);
    }

    private final Drawable a() {
        if (this.a == 0)
            this.a = this.getDrawable();
        return this.a;
    }

    public final void draw(Canvas p0, CharSequence p1, int p2, int p3, float p4, int p5, int p6, int p7, Paint p8) {
        v0 = this.a();
        p0.save();
        p0.translate(p4, (float)((p7 - v0.getBounds().bottom) / 2));
        v0.draw(p0);
        p0.restore();
    }

    public final int getSize(Paint p0, CharSequence p1, int p2, int p3, Paint$FontMetricsInt p4) {
        if (p4 != 0) {
            v1 = p0.getFontMetricsInt();
            p4.ascent = v1.ascent;
            p4.descent = v1.descent;
            p4.top = v1.top;
            p4.bottom = v1.bottom;
        }
        return this.a().getBounds().right;
    }

}
