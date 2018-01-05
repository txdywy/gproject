package com.google.android.play.animation;

import android.content.Context;
import android.view.animation.Interpolator;

public final class C6243f implements Interpolator {
    public Interpolator f31250a = C6242e.m28755a(this.f31251b);
    public final /* synthetic */ Context f31251b;

    public C6243f(Context context) {
        this.f31251b = context;
    }

    public final float getInterpolation(float f) {
        return 1.0f - this.f31250a.getInterpolation(1.0f - f);
    }
}
