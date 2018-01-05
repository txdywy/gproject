package com.google.android.finsky.screenshotsactivity;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.squareup.leakcanary.C7582R;

final class C4049a implements Runnable {
    public final /* synthetic */ ScreenshotView f20352a;

    C4049a(ScreenshotView screenshotView) {
        this.f20352a = screenshotView;
    }

    public final void run() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f20352a.f20348c.getContext(), C7582R.anim.play_fade_in);
        this.f20352a.f20348c.setVisibility(0);
        this.f20352a.f20348c.startAnimation(loadAnimation);
    }
}
