package com.google.android.instantapps.common.gms;

import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.Status;

final /* synthetic */ class ae implements Runnable {
    public final C1643x f29197a;
    public final int f29198b = 17;

    ae(C1643x c1643x) {
        this.f29197a = c1643x;
    }

    public final void run() {
        this.f29197a.mo2367a(new Status(this.f29198b));
    }
}
