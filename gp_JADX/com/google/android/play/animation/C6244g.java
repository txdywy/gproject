package com.google.android.play.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.fr;
import android.view.View;
import android.view.ViewPropertyAnimator;

final class C6244g extends AnimatorListenerAdapter {
    public final /* synthetic */ View f31252a;
    public final /* synthetic */ fr f31253b;
    public final /* synthetic */ ViewPropertyAnimator f31254c;
    public final /* synthetic */ ShuffleAddItemAnimator f31255d;

    C6244g(ShuffleAddItemAnimator shuffleAddItemAnimator, View view, fr frVar, ViewPropertyAnimator viewPropertyAnimator) {
        this.f31255d = shuffleAddItemAnimator;
        this.f31252a = view;
        this.f31253b = frVar;
        this.f31254c = viewPropertyAnimator;
    }

    public final void onAnimationStart(Animator animator) {
        this.f31252a.setAlpha(1.0f);
        this.f31255d.dispatchAddStarting(this.f31253b);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f31255d.reset(this.f31252a);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f31254c.setListener(null);
        this.f31255d.dispatchAddFinished(this.f31253b);
        this.f31255d.mRunningAddAnimations.remove(this.f31253b);
        this.f31255d.dispatchFinishedWhenDone();
    }
}
