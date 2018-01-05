package android.support.design.p019b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewAnimationUtils;

public final class C0109a {
    public static Animator m221a(C0107e c0107e, float f, float f2, float f3) {
        Animator ofObject = ObjectAnimator.ofObject(c0107e, C0114g.f451a, C0113f.f449a, new C0116i[]{new C0116i(f, f2, f3)});
        if (VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C0116i revealInfo = c0107e.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) c0107e, (int) f, (int) f2, revealInfo.f455c, f3);
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
        return animatorSet;
    }
}
