package com.google.android.finsky.billing.lightpurchase.vr.p163a;

final class ad implements Runnable {
    public final /* synthetic */ String f9995a;
    public final /* synthetic */ ac f9996b;

    ad(ac acVar, String str) {
        this.f9996b = acVar;
        this.f9995a = str;
    }

    public final void run() {
        C1986w.f10097a.post(new ae(this));
    }
}
