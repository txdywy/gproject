package com.google.android.play.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

final class C6456b implements AnimatorUpdateListener {
    public final /* synthetic */ View f32439a;

    C6456b(View view) {
        this.f32439a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f32439a.setScaleX(floatValue);
        this.f32439a.setScaleY(floatValue);
    }
}
