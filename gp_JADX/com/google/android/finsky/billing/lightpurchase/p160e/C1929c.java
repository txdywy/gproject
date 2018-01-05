package com.google.android.finsky.billing.lightpurchase.p160e;

import com.google.android.finsky.utils.FinskyLog;

final class C1929c implements C1928v {
    public final /* synthetic */ C1927b f9884a;

    C1929c(C1927b c1927b) {
        this.f9884a = c1927b;
    }

    public final void mo2543a() {
        this.f9884a.al = true;
        if (this.f9884a.m610k()) {
            this.f9884a.af();
        } else {
            FinskyLog.m21669e("Callback triggered despite being detached.", new Object[0]);
        }
    }

    public final void mo2544b() {
        this.f9884a.al = true;
        if (this.f9884a.m610k()) {
            this.f9884a.ad();
        } else {
            FinskyLog.m21669e("Callback triggered despite being detached.", new Object[0]);
        }
    }
}
