package com.google.android.wallet.ui.common;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final /* synthetic */ class ae implements AnimatorUpdateListener {
    public final FocusedViewToTopScrollView f33514a;

    ae(FocusedViewToTopScrollView focusedViewToTopScrollView) {
        this.f33514a = focusedViewToTopScrollView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f33514a.m30617a(valueAnimator);
    }
}
