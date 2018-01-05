package com.google.android.wallet.ui.common;

import android.view.animation.Interpolator;

final class af implements Interpolator {
    public final float f33515a;
    public final float f33516b;
    public final Interpolator f33517c;

    public af(Interpolator interpolator, float f) {
        this.f33515a = f;
        this.f33517c = interpolator;
        this.f33516b = 1.0f - (0.5f * f);
    }

    public final float getInterpolation(float f) {
        return (this.f33517c.getInterpolation(f) * this.f33516b) + (((0.5f * f) + (0.15915494f * ((float) Math.sin(3.141592653589793d * ((double) f))))) * this.f33515a);
    }
}
