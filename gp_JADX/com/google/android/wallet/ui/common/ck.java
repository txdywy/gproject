package com.google.android.wallet.ui.common;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class ck extends AnimatorListenerAdapter {
    public final /* synthetic */ View f33641a;
    public final /* synthetic */ int f33642b;

    ck(View view, int i) {
        this.f33641a = view;
        this.f33642b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        ci.m30883c(this.f33641a, true);
        this.f33641a.setVisibility(this.f33642b);
        this.f33641a.setAlpha(1.0f);
        this.f33641a.animate().setListener(null);
    }
}
