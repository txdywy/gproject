package com.google.android.instantapps.common.gms;

import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.Status;

final /* synthetic */ class ab implements Runnable {
    public final C1643x f29190a;
    public final Status f29191b;

    ab(C1643x c1643x, Status status) {
        this.f29190a = c1643x;
        this.f29191b = status;
    }

    public final void run() {
        this.f29190a.mo2367a(this.f29191b);
    }
}
