package com.google.android.finsky.layout;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class C3674c implements AnimationListener {
    public final /* synthetic */ AppScreenshot f18558a;

    C3674c(AppScreenshot appScreenshot) {
        this.f18558a = appScreenshot;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f18558a.f18078c.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
