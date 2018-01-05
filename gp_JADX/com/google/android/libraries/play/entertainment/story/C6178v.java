package com.google.android.libraries.play.entertainment.story;

import android.animation.Animator;
import android.animation.ValueAnimator;

final class C6178v extends C6176x {
    public final /* synthetic */ MediaPlayerOverlayView f30695a;

    C6178v(MediaPlayerOverlayView mediaPlayerOverlayView) {
        this.f30695a = mediaPlayerOverlayView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f30695a.m28162b(1.0f - valueAnimator.getAnimatedFraction());
    }

    public final void onAnimationCancel(Animator animator) {
        this.f30695a.f30338w.setAlpha(1.0f);
        this.f30695a.m28162b(0.0f);
    }
}
