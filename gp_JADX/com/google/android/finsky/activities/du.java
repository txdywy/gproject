package com.google.android.finsky.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class du extends AnimatorListenerAdapter {
    public final /* synthetic */ Runnable f6678a;

    du(Runnable runnable) {
        this.f6678a = runnable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6678a.run();
    }
}
