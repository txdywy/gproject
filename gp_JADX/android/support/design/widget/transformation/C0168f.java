package android.support.design.widget.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.p019b.C0107e;
import android.support.design.p019b.C0116i;

final class C0168f extends AnimatorListenerAdapter {
    public final /* synthetic */ C0107e f999a;

    C0168f(C0107e c0107e) {
        this.f999a = c0107e;
    }

    public final void onAnimationEnd(Animator animator) {
        C0116i revealInfo = this.f999a.getRevealInfo();
        revealInfo.f455c = Float.MAX_VALUE;
        this.f999a.setRevealInfo(revealInfo);
    }
}
