package com.google.android.wallet.ui.common;

import android.animation.TimeInterpolator;

final class cl implements TimeInterpolator {
    public final /* synthetic */ int f33643a = 3;
    public final /* synthetic */ float f33644b;

    cl(float f) {
        this.f33644b = f;
    }

    public final float getInterpolation(float f) {
        return (((float) Math.sin(((((double) f) * 2.0d) * 3.141592653589793d) * ((double) this.f33643a))) * (1.0f - f)) * this.f33644b;
    }
}
