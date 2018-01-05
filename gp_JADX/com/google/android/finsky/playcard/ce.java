package com.google.android.finsky.playcard;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

final /* synthetic */ class ce implements AnimatorUpdateListener {
    public final View f19719a;

    ce(View view) {
        this.f19719a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f19719a.invalidate();
    }
}
