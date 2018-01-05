package com.google.android.finsky.billing.lightpurchase.vr.a;

import android.os.Handler;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.ad implements Runnable
{

    public final String a;
    public final com.google.android.finsky.billing.lightpurchase.vr.a.ac b;

    ad(com.google.android.finsky.billing.lightpurchase.vr.a.ac p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        com.google.android.finsky.billing.lightpurchase.vr.a.w.a.post(new com.google.android.finsky.billing.lightpurchase.vr.a.ae(this));
    }

}
