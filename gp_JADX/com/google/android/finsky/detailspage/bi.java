package com.google.android.finsky.detailspage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class bi implements AnimatorListener {
    public final /* synthetic */ bh f14298a;

    bi(bh bhVar) {
        this.f14298a = bhVar;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f14298a.f14294e = true;
        this.f14298a.f14292c.removeListener(this);
        this.f14298a.m13944b();
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }
}
