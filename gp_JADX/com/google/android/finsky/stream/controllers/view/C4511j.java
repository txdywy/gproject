package com.google.android.finsky.stream.controllers.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C4511j extends AnimatorListenerAdapter {
    public final /* synthetic */ JpkrFlatMiniTopChartsClusterView f23115a;

    C4511j(JpkrFlatMiniTopChartsClusterView jpkrFlatMiniTopChartsClusterView) {
        this.f23115a = jpkrFlatMiniTopChartsClusterView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f23115a.f22927z.setVisibility(8);
    }
}
