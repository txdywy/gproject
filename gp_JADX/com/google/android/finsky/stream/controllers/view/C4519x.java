package com.google.android.finsky.stream.controllers.view;

import android.view.animation.Animation;
import com.google.android.finsky.bg.C1603c;
import com.google.android.finsky.bg.C1621v;
import com.google.android.finsky.playcard.PlayCardViewRate;

final class C4519x extends C1603c {
    public final /* synthetic */ PlayCardViewRate f23126a;
    public final /* synthetic */ float f23127b;
    public final /* synthetic */ PlayCardRateAndSuggestClusterView f23128c;

    C4519x(PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView, PlayCardViewRate playCardViewRate, float f) {
        this.f23128c = playCardRateAndSuggestClusterView;
        this.f23126a = playCardViewRate;
        this.f23127b = f;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f23126a.setState(0);
        this.f23128c.a.m19873a(0, 0, 0, this.f23128c);
        this.f23126a.setThumbnailAspectRatio(this.f23127b);
        this.f23126a.startAnimation(C1621v.m9304a(this.f23128c.getContext(), 150, new C4520y(this)));
        this.f23128c.m21037a(0, false);
    }
}
