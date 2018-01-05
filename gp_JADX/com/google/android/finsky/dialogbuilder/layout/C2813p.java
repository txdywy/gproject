package com.google.android.finsky.dialogbuilder.layout;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;

final class C2813p implements AnimatorListener {
    public final View f15176a;
    public final int f15177b;

    C2813p(View view, int i) {
        this.f15176a = view;
        this.f15177b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f15176a.setVisibility(this.f15177b);
        this.f15176a.setAlpha(1.0f);
        this.f15176a.setTranslationX(0.0f);
        this.f15176a.animate().setListener(null);
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }
}
