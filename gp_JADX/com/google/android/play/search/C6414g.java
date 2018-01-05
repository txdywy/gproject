package com.google.android.play.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C6414g extends AnimatorListenerAdapter {
    public final /* synthetic */ Runnable f32355a;

    C6414g(Runnable runnable) {
        this.f32355a = runnable;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.f32355a != null) {
            this.f32355a.run();
        }
    }
}
