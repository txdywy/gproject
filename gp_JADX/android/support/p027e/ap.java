package android.support.p027e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.p037h.C0305a;

final class ap extends AnimatorListenerAdapter {
    public final /* synthetic */ C0305a f1058a;
    public final /* synthetic */ an f1059b;

    ap(an anVar, C0305a c0305a) {
        this.f1059b = anVar;
        this.f1058a = c0305a;
    }

    public final void onAnimationStart(Animator animator) {
        this.f1059b.f1036K.add(animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1058a.remove(animator);
        this.f1059b.f1036K.remove(animator);
    }
}
