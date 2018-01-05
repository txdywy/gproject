package com.google.android.finsky.dq;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class C2876g implements AnimatorListener {
    public final Animator f15366a;
    public final AnimatorListener f15367b;

    public C2876g(Animator animator, AnimatorListener animatorListener) {
        this.f15366a = animator;
        this.f15367b = animatorListener;
    }

    public final void onAnimationStart(Animator animator) {
        this.f15367b.onAnimationStart(this.f15366a);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f15367b.onAnimationEnd(this.f15366a);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f15367b.onAnimationCancel(this.f15366a);
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f15367b.onAnimationRepeat(this.f15366a);
    }
}
