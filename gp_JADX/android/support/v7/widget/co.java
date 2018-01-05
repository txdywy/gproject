package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class co extends AnimatorListenerAdapter {
    public boolean f3326a = false;
    public final /* synthetic */ cl f3327b;

    co(cl clVar) {
        this.f3327b = clVar;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f3326a) {
            this.f3326a = false;
        } else if (((Float) this.f3327b.f3296B.getAnimatedValue()).floatValue() == 0.0f) {
            this.f3327b.f3297C = 0;
            this.f3327b.m3418a(0);
        } else {
            this.f3327b.f3297C = 2;
            this.f3327b.f3318u.invalidate();
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.f3326a = true;
    }
}
