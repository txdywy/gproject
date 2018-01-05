package com.google.android.finsky.setup;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;

final class cf implements Runnable {
    public final /* synthetic */ SetupWizardFinalHoldActivity f20917a;

    cf(SetupWizardFinalHoldActivity setupWizardFinalHoldActivity) {
        this.f20917a = setupWizardFinalHoldActivity;
    }

    public final void run() {
        FinskyLog.m21665c("Watchdog fired, skipping hold.", new Object[0]);
        this.f20917a.m19112a(1);
        bo e = C2482j.m13310e();
        e.m28992a(126);
        if (this.f20917a.f20624j != null) {
            e.m28994a(this.f20917a.f20624j);
        }
        C1473m.f7980a.dc().m13319a(e, null);
    }
}
