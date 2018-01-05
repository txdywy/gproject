package android.support.v7.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class cp implements AnimatorUpdateListener {
    public final /* synthetic */ cl f3328a;

    cp(cl clVar) {
        this.f3328a = clVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.f3328a.f3302e.setAlpha(floatValue);
        this.f3328a.f3303f.setAlpha(floatValue);
        this.f3328a.f3318u.invalidate();
    }
}
