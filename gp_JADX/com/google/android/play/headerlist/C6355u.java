package com.google.android.play.headerlist;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class C6355u implements OnGlobalLayoutListener {
    public final /* synthetic */ PlayHeaderListTabStrip f31917a;

    C6355u(PlayHeaderListTabStrip playHeaderListTabStrip) {
        this.f31917a = playHeaderListTabStrip;
    }

    public final void onGlobalLayout() {
        this.f31917a.m29104a(this.f31917a.f31870n.getCurrentItem(), 0, false);
        this.f31917a.f31869m.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
