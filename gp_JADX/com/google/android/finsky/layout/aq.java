package com.google.android.finsky.layout;

import android.support.v4.view.ai;

final class aq implements Runnable {
    public final /* synthetic */ int f18493a;
    public final /* synthetic */ LightPurchaseView f18494b;

    aq(LightPurchaseView lightPurchaseView, int i) {
        this.f18494b = lightPurchaseView;
        this.f18493a = i;
    }

    public final void run() {
        this.f18494b.f18255b.m16059a(this.f18494b.f18261h, Math.max(this.f18493a, ai.f1848a.mo395g(this.f18494b)));
        this.f18494b.startAnimation(this.f18494b.f18255b);
    }
}
