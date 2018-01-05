package android.support.design.p019b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class C0110b extends AnimatorListenerAdapter {
    public final /* synthetic */ C0107e f447a;

    public C0110b(C0107e c0107e) {
        this.f447a = c0107e;
    }

    public final void onAnimationStart(Animator animator) {
        this.f447a.mo50a();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f447a.mo51b();
    }
}
