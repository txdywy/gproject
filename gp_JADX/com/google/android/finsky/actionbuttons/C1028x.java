package com.google.android.finsky.actionbuttons;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

public final class C1028x extends ImageSpan {
    public Drawable f6285a;

    public C1028x(Drawable drawable) {
        super(drawable);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        Rect bounds = m6014a().getBounds();
        if (fontMetricsInt != null) {
            FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable a = m6014a();
        canvas.save();
        canvas.translate(f, (float) ((i5 - a.getBounds().bottom) / 2));
        a.draw(canvas);
        canvas.restore();
    }

    private final Drawable m6014a() {
        if (this.f6285a == null) {
            this.f6285a = getDrawable();
        }
        return this.f6285a;
    }
}
