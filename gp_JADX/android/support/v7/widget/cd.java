package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

final class cd extends AnimatorListenerAdapter {
    public final /* synthetic */ fr f3249a;
    public final /* synthetic */ int f3250b;
    public final /* synthetic */ View f3251c;
    public final /* synthetic */ int f3252d;
    public final /* synthetic */ ViewPropertyAnimator f3253e;
    public final /* synthetic */ bx f3254f;

    cd(bx bxVar, fr frVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3254f = bxVar;
        this.f3249a = frVar;
        this.f3250b = i;
        this.f3251c = view;
        this.f3252d = i2;
        this.f3253e = viewPropertyAnimator;
    }

    public final void onAnimationStart(Animator animator) {
        this.f3254f.dispatchMoveStarting(this.f3249a);
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f3250b != 0) {
            this.f3251c.setTranslationX(0.0f);
        }
        if (this.f3252d != 0) {
            this.f3251c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3253e.setListener(null);
        this.f3254f.dispatchMoveFinished(this.f3249a);
        this.f3254f.mMoveAnimations.remove(this.f3249a);
        this.f3254f.dispatchFinishedWhenDone();
    }
}
