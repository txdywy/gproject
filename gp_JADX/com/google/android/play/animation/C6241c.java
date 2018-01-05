package com.google.android.play.animation;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public final class C6241c implements AnimationListener {
    public final /* synthetic */ float f31246a;
    public final /* synthetic */ C6239a f31247b;

    public C6241c(C6239a c6239a, float f) {
        this.f31247b = c6239a;
        this.f31246a = f;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.f31247b.f31243d = this.f31246a;
    }
}
