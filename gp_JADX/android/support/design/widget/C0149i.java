package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v4.view.ai;

final class C0149i implements AnimatorUpdateListener {
    public int f966a = 0;
    public final /* synthetic */ C0138g f967b;

    C0149i(C0138g c0138g) {
        this.f967b = c0138g;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (C0138g.f656b) {
            ai.m1844d(this.f967b.f659e, intValue - this.f966a);
        } else {
            this.f967b.f659e.setTranslationY((float) intValue);
        }
        this.f966a = intValue;
    }
}
