package com.google.android.play.drawer;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class C6293c implements AnimatorUpdateListener {
    public final /* synthetic */ C6292b f31466a;

    C6293c(C6292b c6292b) {
        this.f31466a = c6292b;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f31466a.m28912b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
