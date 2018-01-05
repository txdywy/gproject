package android.support.design.widget.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.support.design.p019b.C0107e;

final class C0167e extends AnimatorListenerAdapter {
    public final /* synthetic */ C0107e f997a;
    public final /* synthetic */ Drawable f998b;

    C0167e(C0107e c0107e, Drawable drawable) {
        this.f997a = c0107e;
        this.f998b = drawable;
    }

    public final void onAnimationStart(Animator animator) {
        this.f997a.setCircularRevealOverlayDrawable(this.f998b);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f997a.setCircularRevealOverlayDrawable(null);
    }
}
