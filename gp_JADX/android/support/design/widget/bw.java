package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class bw extends AnimatorListenerAdapter {
    public final /* synthetic */ bv f904a;

    bw(bv bvVar) {
        this.f904a = bvVar;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f904a.f902c == animator) {
            this.f904a.f902c = null;
        }
    }
}
