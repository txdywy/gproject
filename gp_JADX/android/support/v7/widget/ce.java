package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

final class ce extends AnimatorListenerAdapter {
    public final /* synthetic */ cg f3255a;
    public final /* synthetic */ ViewPropertyAnimator f3256b;
    public final /* synthetic */ View f3257c;
    public final /* synthetic */ bx f3258d;

    ce(bx bxVar, cg cgVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3258d = bxVar;
        this.f3255a = cgVar;
        this.f3256b = viewPropertyAnimator;
        this.f3257c = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.f3258d.dispatchChangeStarting(this.f3255a.f3263a, true);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3256b.setListener(null);
        this.f3257c.setAlpha(1.0f);
        this.f3257c.setTranslationX(0.0f);
        this.f3257c.setTranslationY(0.0f);
        this.f3258d.dispatchChangeFinished(this.f3255a.f3263a, true);
        this.f3258d.mChangeAnimations.remove(this.f3255a.f3263a);
        this.f3258d.dispatchFinishedWhenDone();
    }
}
