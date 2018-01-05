package com.google.android.gms.ads.p239b;

import android.os.Bundle;

final class C4899i implements Runnable {
    public /* synthetic */ Bundle f25258a;
    public /* synthetic */ C4895e f25259b;

    C4899i(C4895e c4895e, Bundle bundle) {
        this.f25259b = c4895e;
        this.f25258a = bundle;
    }

    public final void run() {
        this.f25259b.f25252a.mo3899a(new C4893b(this.f25258a.getString("ad_id"), this.f25258a.getBoolean("lat_enabled")));
    }
}
