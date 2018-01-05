package com.google.android.finsky.stream.controllers.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class C4513n implements OnTouchListener {
    public final /* synthetic */ JpkrHighlightsBannerClusterView f23117a;

    C4513n(JpkrHighlightsBannerClusterView jpkrHighlightsBannerClusterView) {
        this.f23117a = jpkrHighlightsBannerClusterView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            this.f23117a.m21020d();
        } else if (motionEvent.getAction() == 1) {
            this.f23117a.m21019c();
        }
        return false;
    }
}
