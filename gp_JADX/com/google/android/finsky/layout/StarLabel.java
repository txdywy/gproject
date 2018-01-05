package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import android.view.View;
import com.squareup.leakcanary.C7582R;

public class StarLabel extends View {
    public int f18412a;
    public int f18413b;
    public int f18414c;
    public final int f18415d;
    public final Drawable f18416e;

    public StarLabel(Context context) {
        this(context, null);
    }

    public StarLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setNumStars(0);
        setWillNotDraw(false);
        Resources resources = context.getResources();
        this.f18416e = C0216d.m1112a(context, (int) C7582R.drawable.ic_star_rating_graph);
        this.f18415d = resources.getDimensionPixelSize(C7582R.dimen.details_histogram_star_padding);
    }

    public void setNumStars(int i) {
        this.f18412a = i;
    }

    public void setMaxStars(int i) {
        this.f18413b = i;
    }

    public void setStarHeight(int i) {
        this.f18414c = i;
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension((this.f18416e.getIntrinsicWidth() * this.f18413b) + ((this.f18413b - 1) * this.f18415d), this.f18414c);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f18413b > 0) {
            int intrinsicWidth = this.f18416e.getIntrinsicWidth();
            int width = getWidth();
            int height = (getHeight() - intrinsicWidth) / 2;
            for (int i = 0; i < this.f18412a; i++) {
                this.f18416e.setBounds(width - intrinsicWidth, height, width, height + intrinsicWidth);
                this.f18416e.draw(canvas);
                width -= this.f18415d + intrinsicWidth;
            }
        }
    }
}
