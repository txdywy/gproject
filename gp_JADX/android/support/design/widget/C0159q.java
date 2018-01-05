package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v4.view.ai;

final class C0159q implements AnimatorUpdateListener {
    public int f974a = this.f975b;
    public final /* synthetic */ int f975b;
    public final /* synthetic */ C0138g f976c;

    C0159q(C0138g c0138g, int i) {
        this.f976c = c0138g;
        this.f975b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (C0138g.f656b) {
            ai.m1844d(this.f976c.f659e, intValue - this.f974a);
        } else {
            this.f976c.f659e.setTranslationY((float) intValue);
        }
        this.f974a = intValue;
    }
}
