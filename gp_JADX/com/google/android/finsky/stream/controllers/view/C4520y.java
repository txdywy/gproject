package com.google.android.finsky.stream.controllers.view;

import android.view.animation.Animation;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1603c;

final class C4520y extends C1603c {
    public final /* synthetic */ C4519x f23129a;

    C4520y(C4519x c4519x) {
        this.f23129a = c4519x;
    }

    public final void onAnimationEnd(Animation animation) {
        if (PlayCardRateAndSuggestClusterView.f23014l && C1601a.m9200a(this.f23129a.f23128c.getContext())) {
            this.f23129a.f23126a.performAccessibilityAction(64, null);
        }
    }
}
