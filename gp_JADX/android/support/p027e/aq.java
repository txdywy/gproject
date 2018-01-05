package android.support.p027e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class aq extends AnimatorListenerAdapter {
    public final /* synthetic */ an f1060a;

    aq(an anVar) {
        this.f1060a = anVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1060a.m863d();
        animator.removeListener(this);
    }
}
