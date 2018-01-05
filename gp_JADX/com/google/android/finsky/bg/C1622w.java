package com.google.android.finsky.bg;

import android.animation.TimeInterpolator;

final class C1622w implements TimeInterpolator {
    public final /* synthetic */ float f8539a;

    C1622w(float f) {
        this.f8539a = f;
    }

    public final float getInterpolation(float f) {
        return ((1.0f - f) * this.f8539a) * ((float) Math.sin((double) (((2.0f * f) * 3.1415927f) * 3.0f)));
    }
}
