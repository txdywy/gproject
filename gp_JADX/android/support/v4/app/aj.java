package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

final class aj extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup f1338a;
    public final /* synthetic */ View f1339b;
    public final /* synthetic */ Fragment f1340c;

    aj(ViewGroup viewGroup, View view, Fragment fragment) {
        this.f1338a = viewGroup;
        this.f1339b = view;
        this.f1340c = fragment;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1338a.endViewTransition(this.f1339b);
        animator.removeListener(this);
        if (this.f1340c.f746R != null) {
            this.f1340c.f746R.setVisibility(8);
        }
    }
}
