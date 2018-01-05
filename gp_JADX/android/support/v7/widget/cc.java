package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

final class cc extends AnimatorListenerAdapter {
    public final /* synthetic */ fr f3245a;
    public final /* synthetic */ View f3246b;
    public final /* synthetic */ ViewPropertyAnimator f3247c;
    public final /* synthetic */ bx f3248d;

    cc(bx bxVar, fr frVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3248d = bxVar;
        this.f3245a = frVar;
        this.f3246b = view;
        this.f3247c = viewPropertyAnimator;
    }

    public final void onAnimationStart(Animator animator) {
        this.f3248d.dispatchAddStarting(this.f3245a);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f3246b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3247c.setListener(null);
        this.f3248d.dispatchAddFinished(this.f3245a);
        this.f3248d.mAddAnimations.remove(this.f3245a);
        this.f3248d.dispatchFinishedWhenDone();
    }
}
