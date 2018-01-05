package com.google.android.finsky.fastscroll;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C3123s extends AnimatorListenerAdapter {
    public final /* synthetic */ C3119o f16107a;

    C3123s(C3119o c3119o) {
        this.f16107a = c3119o;
    }

    public final void onAnimationEnd(Animator animator) {
        if (((Float) this.f16107a.f16084e.getAnimatedValue()).floatValue() == 0.0f) {
            this.f16107a.m15972a(0);
        }
    }
}
