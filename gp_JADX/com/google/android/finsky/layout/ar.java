package com.google.android.finsky.layout;

import android.widget.LinearLayout.LayoutParams;

final class ar implements Runnable {
    public final /* synthetic */ LightPurchaseView f18495a;

    ar(LightPurchaseView lightPurchaseView) {
        this.f18495a = lightPurchaseView;
    }

    public final void run() {
        this.f18495a.setLayoutParams(new LayoutParams(this.f18495a.getLayoutParams().width, -1));
    }
}
