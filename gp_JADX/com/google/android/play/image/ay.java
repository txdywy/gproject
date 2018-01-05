package com.google.android.play.image;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class ay implements AnimationListener {
    public final /* synthetic */ FifeImageView f32038a;

    ay(FifeImageView fifeImageView) {
        this.f32038a = fifeImageView;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.f32038a.m29188d();
    }
}
