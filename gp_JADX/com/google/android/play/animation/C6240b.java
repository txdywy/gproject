package com.google.android.play.animation;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class C6240b implements AnimationListener {
    public final /* synthetic */ float f31244a;
    public final /* synthetic */ C6239a f31245b;

    C6240b(C6239a c6239a, float f) {
        this.f31245b = c6239a;
        this.f31244a = f;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.f31245b.f31241b = this.f31244a;
    }
}
