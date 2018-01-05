package com.google.android.instantapps.common.loading.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class C5833s implements AnimationListener {
    public final /* synthetic */ C5822h f29301a;

    C5833s(C5822h c5822h) {
        this.f29301a = c5822h;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.f29301a.au.remove(animation);
    }
}
