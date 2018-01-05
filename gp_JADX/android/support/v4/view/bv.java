package android.support.v4.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class bv implements AnimatorUpdateListener {
    public final /* synthetic */ bz f1889a;

    bv(bz bzVar) {
        this.f1889a = bzVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1889a.mo599a();
    }
}
