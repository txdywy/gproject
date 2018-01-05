package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.vending.a;

protected class SeparatorLinearLayout extends LinearLayout
{

    public final int a;
    public final Paint b;
    public int c;
    public boolean d;

    SeparatorLinearLayout(Context p0) {
        SeparatorLinearLayout(p0, 0);
    }

    SeparatorLinearLayout(Context p0, AttributeSet p1) {
        LinearLayout(p0, p1);
        this.setWillNotDraw(0);
        v0 = p0.getResources();
        v1 = v0.getDimensionPixelSize(2131625163);
        this.a = (v1 + 1) / 2;
        this.b = new Paint();
        this.b.setColor(this.a(v0));
        this.b.setStrokeWidth((float)v1);
        this.d = 1;
        v0 = p0.obtainStyledAttributes(p1, com.android.vending.a.SeparatorLinearLayout);
        this.c = v0.getInt(0, 2);
        v0.recycle();
    }

    public int a(Resources p0) {
        return p0.getColor(2131558766);
    }

    public final void a() {
        if (this.d != 0) {
            this.d = 0;
            this.invalidate();
        }
    }

    protected void onDraw(Canvas p0) {
        if (this.d != 0) {
            if (this.c & 1)
                p0.drawLine(0, (float)this.a, (float)this.getWidth(), (float)this.a, this.b);
            if (this.c & 2) {
                v0 = this.getHeight() - this.a;
                p0.drawLine(0, (float)v0, (float)this.getWidth(), (float)v0, this.b);
            }
        }
        super.onDraw(p0);
    }

}
