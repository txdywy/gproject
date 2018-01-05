package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class ao extends AnimatorListenerAdapter {
    public View f1345a;

    ao(View view) {
        this.f1345a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.f1345a.setLayerType(2, null);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1345a.setLayerType(0, null);
        animator.removeListener(this);
    }
}
