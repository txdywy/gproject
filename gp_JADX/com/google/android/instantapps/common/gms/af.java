package com.google.android.instantapps.common.gms;

import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.Status;

final /* synthetic */ class af implements Runnable {
    public final C1643x f29199a;
    public final Status f29200b;

    af(C1643x c1643x, Status status) {
        this.f29199a = c1643x;
        this.f29200b = status;
    }

    public final void run() {
        this.f29199a.mo2367a(this.f29200b);
    }
}
