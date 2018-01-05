package com.google.android.finsky.fastscroll;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final /* synthetic */ class C3120p implements AnimatorUpdateListener {
    public final C3119o f16104a;

    C3120p(C3119o c3119o) {
        this.f16104a = c3119o;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f16104a.f16099t.invalidate();
    }
}
