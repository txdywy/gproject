package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C0160r extends AnimatorListenerAdapter {
    public final /* synthetic */ int f977a;
    public final /* synthetic */ C0138g f978b;

    C0160r(C0138g c0138g, int i) {
        this.f978b = c0138g;
        this.f977a = i;
    }

    public final void onAnimationStart(Animator animator) {
        this.f978b.f660f.mo66b();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f978b.m496b(this.f977a);
    }
}
