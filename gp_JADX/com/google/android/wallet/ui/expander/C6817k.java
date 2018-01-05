package com.google.android.wallet.ui.expander;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class C6817k extends AnimatorListenerAdapter {
    public final /* synthetic */ View f33796a;

    C6817k(View view) {
        this.f33796a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f33796a.setAlpha(1.0f);
        this.f33796a.setTranslationY(0.0f);
        animator.removeListener(this);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f33796a.setAlpha(1.0f);
        this.f33796a.setTranslationY(0.0f);
        animator.removeListener(this);
    }
}
