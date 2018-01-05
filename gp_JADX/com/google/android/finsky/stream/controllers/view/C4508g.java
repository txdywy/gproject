package com.google.android.finsky.stream.controllers.view;

import android.os.Build.VERSION;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public final class C4508g implements OnGlobalLayoutListener {
    public final /* synthetic */ JpkrFlatMiniTopChartsClusterView f23112a;

    public C4508g(JpkrFlatMiniTopChartsClusterView jpkrFlatMiniTopChartsClusterView) {
        this.f23112a = jpkrFlatMiniTopChartsClusterView;
    }

    public final void onGlobalLayout() {
        if (VERSION.SDK_INT < 16) {
            this.f23112a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        } else {
            this.f23112a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        this.f23112a.m21013b();
    }
}
