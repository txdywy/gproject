package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C0497f extends AnimatorListenerAdapter {
    public final /* synthetic */ ActionBarOverlayLayout f3440a;

    C0497f(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f3440a = actionBarOverlayLayout;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3440a.f2909w = null;
        this.f3440a.f2897k = false;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f3440a.f2909w = null;
        this.f3440a.f2897k = false;
    }
}
