package com.google.android.finsky.a;

import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;

protected final class com.google.android.finsky.a.b extends GradientDrawable
{

    public final int a;

    b(GradientDrawable$Orientation p0, int[] p1, int p2) {
        this.a = p2;
        GradientDrawable(p0, p1);
    }

    protected final void onBoundsChange(Rect p0) {
        if (p0.bottom - p0.top > this.a)
            p0.bottom = p0.top + this.a;
        super.onBoundsChange(p0);
    }

}
