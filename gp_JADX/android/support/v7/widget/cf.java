package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

final class cf extends AnimatorListenerAdapter {
    public final /* synthetic */ cg f3259a;
    public final /* synthetic */ ViewPropertyAnimator f3260b;
    public final /* synthetic */ View f3261c;
    public final /* synthetic */ bx f3262d;

    cf(bx bxVar, cg cgVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3262d = bxVar;
        this.f3259a = cgVar;
        this.f3260b = viewPropertyAnimator;
        this.f3261c = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.f3262d.dispatchChangeStarting(this.f3259a.f3264b, false);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3260b.setListener(null);
        this.f3261c.setAlpha(1.0f);
        this.f3261c.setTranslationX(0.0f);
        this.f3261c.setTranslationY(0.0f);
        this.f3262d.dispatchChangeFinished(this.f3259a.f3264b, false);
        this.f3262d.mChangeAnimations.remove(this.f3259a.f3264b);
        this.f3262d.dispatchFinishedWhenDone();
    }
}
