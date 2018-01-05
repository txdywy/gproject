package com.google.android.libraries.play.entertainment.story;

import android.animation.Animator;
import android.animation.ValueAnimator;

final class C6177u extends C6176x {
    public final /* synthetic */ boolean f30691a;
    public final /* synthetic */ boolean f30692b;
    public final /* synthetic */ boolean f30693c;
    public final /* synthetic */ MediaPlayerOverlayView f30694d;

    C6177u(MediaPlayerOverlayView mediaPlayerOverlayView, boolean z, boolean z2, boolean z3) {
        this.f30694d = mediaPlayerOverlayView;
        this.f30691a = z;
        this.f30692b = z2;
        this.f30693c = z3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (this.f30691a) {
            this.f30694d.m28154a(1.0f - animatedFraction);
        }
        if (this.f30692b) {
            this.f30694d.m28162b(animatedFraction);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f30690q) {
            MediaPlayerOverlayView mediaPlayerOverlayView = this.f30694d;
            boolean z = this.f30693c;
            if (mediaPlayerOverlayView.f30324h.isEmpty()) {
                mediaPlayerOverlayView.m28166c(z);
            } else {
                mediaPlayerOverlayView.m28171g();
            }
        }
    }
}
