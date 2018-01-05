package com.google.android.instantapps.common.gms;

import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.Status;

final /* synthetic */ class C5787m implements Runnable {
    public final C1643x f29227a;
    public final Status f29228b;

    C5787m(C1643x c1643x, Status status) {
        this.f29227a = c1643x;
        this.f29228b = status;
    }

    public final void run() {
        this.f29227a.mo2367a(this.f29228b);
    }
}
