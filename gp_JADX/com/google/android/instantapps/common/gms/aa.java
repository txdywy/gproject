package com.google.android.instantapps.common.gms;

import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.Status;

final /* synthetic */ class aa implements Runnable {
    public final C1643x f29188a;
    public final int f29189b = 17;

    aa(C1643x c1643x) {
        this.f29188a = c1643x;
    }

    public final void run() {
        this.f29188a.mo2367a(new Status(this.f29189b));
    }
}
