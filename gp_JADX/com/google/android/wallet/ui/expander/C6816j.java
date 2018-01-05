package com.google.android.wallet.ui.expander;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class C6816j extends AnimatorListenerAdapter {
    public final /* synthetic */ View f33794a;
    public final /* synthetic */ int f33795b;

    C6816j(View view, int i) {
        this.f33794a = view;
        this.f33795b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f33794a.setVisibility(this.f33795b);
        animator.removeListener(this);
    }
}
