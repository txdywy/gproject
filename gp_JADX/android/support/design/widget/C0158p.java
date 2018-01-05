package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C0158p extends AnimatorListenerAdapter {
    public final /* synthetic */ C0138g f973a;

    C0158p(C0138g c0138g) {
        this.f973a = c0138g;
    }

    public final void onAnimationStart(Animator animator) {
        this.f973a.f660f.mo65a();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f973a.m497c();
    }
}
