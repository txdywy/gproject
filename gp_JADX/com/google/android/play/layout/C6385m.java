package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.play.C6383k;
import com.google.android.play.d;
import com.google.android.play.e;

public class C6385m extends RelativeLayout {
    public boolean f32148k;
    public final int f32149l;
    public final int f32150m;
    public final int f32151n;
    public final int f32152o;
    public final int f32153p;
    public final int f32154q;
    public final Paint f32155r;

    public C6385m(Context context) {
        this(context, null, 0);
    }

    public C6385m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6385m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.f32148k = false;
        Resources resources = context.getResources();
        this.f32153p = resources.getDimensionPixelSize(e.play_hairline_separator_thickness);
        this.f32154q = (this.f32153p + 1) / 2;
        this.f32155r = new Paint();
        this.f32155r.setColor(resources.getColor(d.play_reason_separator));
        this.f32155r.setStrokeWidth((float) this.f32153p);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6383k.PlaySeparatorLayout);
        this.f32149l = obtainStyledAttributes.getDimensionPixelSize(C6383k.PlaySeparatorLayout_separator_padding_top, 0);
        this.f32150m = obtainStyledAttributes.getDimensionPixelSize(C6383k.PlaySeparatorLayout_separator_padding_bottom, 0);
        this.f32151n = obtainStyledAttributes.getDimensionPixelSize(C6383k.PlaySeparatorLayout_separator_padding_left, 0);
        this.f32152o = obtainStyledAttributes.getDimensionPixelSize(C6383k.PlaySeparatorLayout_separator_padding_right, 0);
        obtainStyledAttributes.recycle();
    }

    public void setSeparatorVisible(boolean z) {
        if (this.f32148k != z) {
            int i;
            this.f32148k = z;
            if (z) {
                i = (this.f32149l + this.f32150m) + this.f32153p;
            } else {
                i = 0;
            }
            ai.a(this, 0, i, 0, 0);
            invalidate();
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f32148k) {
            int i = this.f32149l + this.f32154q;
            canvas.drawLine((float) this.f32151n, (float) i, (float) (getWidth() - this.f32152o), (float) i, this.f32155r);
        }
    }
}
