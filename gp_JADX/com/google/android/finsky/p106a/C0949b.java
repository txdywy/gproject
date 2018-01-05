package com.google.android.finsky.p106a;

import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;

final class C0949b extends GradientDrawable {
    public final /* synthetic */ int f5789a;

    C0949b(Orientation orientation, int[] iArr, int i) {
        this.f5789a = i;
        super(orientation, iArr);
    }

    protected final void onBoundsChange(Rect rect) {
        if (rect.bottom - rect.top > this.f5789a) {
            rect.bottom = rect.top + this.f5789a;
        }
        super.onBoundsChange(rect);
    }
}
