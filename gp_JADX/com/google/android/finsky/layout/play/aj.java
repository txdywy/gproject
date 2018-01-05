package com.google.android.finsky.layout.play;

import android.support.v4.view.p039b.C0344b;
import android.view.animation.Interpolator;

final class aj implements Interpolator {
    public Interpolator f18765a = new C0344b();

    aj() {
    }

    public final float getInterpolation(float f) {
        return 1.0f - this.f18765a.getInterpolation(1.0f - f);
    }
}
