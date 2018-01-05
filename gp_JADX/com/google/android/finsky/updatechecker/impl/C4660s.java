package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4030h;
import com.google.android.finsky.utils.FinskyLog;

final class C4660s implements Runnable {
    public final /* synthetic */ C2495w f23988a;
    public final /* synthetic */ C4659r f23989b;

    C4660s(C4659r c4659r, C2495w c2495w) {
        this.f23989b = c4659r;
        this.f23988a = c2495w;
    }

    public final void run() {
        if (this.f23989b.f23987d != null) {
            if (this.f23989b.f23986c.f23994e.m9312b()) {
                C4023a b = C4656o.m21638b();
                if (b != null) {
                    this.f23989b.m5802b(new C4030h(true, b, C4656o.m21639b(this.f23988a)));
                } else {
                    this.f23989b.m5802b(null);
                }
                this.f23989b.f23987d = null;
                return;
            }
            FinskyLog.m21659a("Checking wifi: enabled, proceeding with auto-update.", new Object[0]);
            this.f23989b.f23986c.m21646a(this.f23989b, this.f23988a);
        }
    }
}
