package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

final class cb extends AnimatorListenerAdapter {
    public final /* synthetic */ fr f3241a;
    public final /* synthetic */ ViewPropertyAnimator f3242b;
    public final /* synthetic */ View f3243c;
    public final /* synthetic */ bx f3244d;

    cb(bx bxVar, fr frVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3244d = bxVar;
        this.f3241a = frVar;
        this.f3242b = viewPropertyAnimator;
        this.f3243c = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.f3244d.dispatchRemoveStarting(this.f3241a);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3242b.setListener(null);
        this.f3243c.setAlpha(1.0f);
        this.f3244d.dispatchRemoveFinished(this.f3241a);
        this.f3244d.mRemoveAnimations.remove(this.f3241a);
        this.f3244d.dispatchFinishedWhenDone();
    }
}
