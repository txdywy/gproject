package com.google.android.finsky.dialogbuilder.layout;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

public final class C2805g implements AnimatorListener {
    public final Runnable f15152a;
    public final /* synthetic */ FixedBottomSheetBehavior f15153b;

    public C2805g(FixedBottomSheetBehavior fixedBottomSheetBehavior, Runnable runnable) {
        this.f15153b = fixedBottomSheetBehavior;
        this.f15152a = runnable;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f15153b.f15143h = false;
        if (this.f15152a != null) {
            this.f15152a.run();
        }
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }
}
