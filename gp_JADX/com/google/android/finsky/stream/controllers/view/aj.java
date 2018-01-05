package com.google.android.finsky.stream.controllers.view;

import android.view.animation.Animation;
import com.google.android.finsky.bg.C1603c;
import com.google.android.finsky.bg.C1621v;

final class aj extends C1603c {
    public final /* synthetic */ PlayCardRateClusterView f23092a;

    aj(PlayCardRateClusterView playCardRateClusterView) {
        this.f23092a = playCardRateClusterView;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f23092a.a.setVisibility(8);
        C1621v.m9306a(this.f23092a, this.f23092a.f23031m);
    }
}
