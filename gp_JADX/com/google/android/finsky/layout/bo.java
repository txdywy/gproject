package com.google.android.finsky.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class bo extends AnimatorListenerAdapter {
    public final /* synthetic */ ScreenshotFifeImageView f18534a;

    bo(ScreenshotFifeImageView screenshotFifeImageView) {
        this.f18534a = screenshotFifeImageView;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f18534a.k != null) {
            this.f18534a.d();
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.f18534a.setAlpha(1.0f);
    }
}
