package com.google.android.finsky.bh;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1634r;

final class C1635g implements C1634r {
    public final /* synthetic */ C1627b f8560a;

    C1635g(C1627b c1627b) {
        this.f8560a = c1627b;
    }

    public final void mo2364a(ConnectionResult connectionResult) {
        FinskyLog.m21665c("Could not connect to GMS for Auto connection state: %s", connectionResult);
        this.f8560a.m9309a();
    }
}
