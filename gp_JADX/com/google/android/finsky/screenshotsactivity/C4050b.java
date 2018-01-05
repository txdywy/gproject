package com.google.android.finsky.screenshotsactivity;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class C4050b implements AnimationListener {
    public final /* synthetic */ ScreenshotView f20353a;

    C4050b(ScreenshotView screenshotView) {
        this.f20353a = screenshotView;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f20353a.f20348c.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
