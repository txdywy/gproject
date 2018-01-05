package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class ci extends AnimatorListenerAdapter {
    public final /* synthetic */ int f934a;
    public final /* synthetic */ cg f935b;

    ci(cg cgVar, int i) {
        this.f935b = cgVar;
        this.f934a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f935b.f922c = this.f934a;
        this.f935b.f923d = 0.0f;
    }
}
