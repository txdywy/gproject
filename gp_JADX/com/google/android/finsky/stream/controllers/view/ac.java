package com.google.android.finsky.stream.controllers.view;

import android.view.animation.Animation;
import com.google.android.finsky.bg.C1603c;
import com.google.android.finsky.bg.C1621v;

final class ac extends C1603c {
    public final /* synthetic */ PlayCardRateAndSuggestClusterView f23078a;

    ac(PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView) {
        this.f23078a = playCardRateAndSuggestClusterView;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f23078a.f23020r.setVisibility(8);
        C1621v.m9306a(this.f23078a, this.f23078a.f23019q);
    }
}
