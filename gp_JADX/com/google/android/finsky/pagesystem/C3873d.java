package com.google.android.finsky.pagesystem;

import com.google.android.play.headerlist.PlayHeaderListLayout;

final class C3873d implements Runnable {
    public final /* synthetic */ PlayHeaderListLayout f19280a;
    public final /* synthetic */ C1045b f19281b;

    C3873d(C1045b c1045b, PlayHeaderListLayout playHeaderListLayout) {
        this.f19281b = c1045b;
        this.f19280a = playHeaderListLayout;
    }

    public final void run() {
        this.f19280a.setHeaderShadowMode(this.f19281b.ak());
    }
}
