package com.google.android.finsky.bi;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.p277c.C4979a;

public final class C1642b implements C1632q, C1634r {
    public final Context f8568a;
    public C5058o f8569b;
    public C1645d f8570c;
    public boolean f8571d;
    public Account f8572e;

    public C1642b(Context context) {
        this.f8568a = context;
    }

    public final void mo2363a(Bundle bundle) {
        C4979a.m23125a(this.f8569b).mo4490a(new C1644c(this));
    }

    public final void mo2362a(int i) {
        if (this.f8571d && this.f8570c != null) {
            this.f8570c.m9341a();
        }
    }

    public final void mo2364a(ConnectionResult connectionResult) {
        if (this.f8571d && this.f8570c != null) {
            this.f8570c.m9341a();
        }
        int i = connectionResult.f25611c;
        if (i != 1 && i != 2 && i != 3) {
            FinskyLog.m21665c("onConnectionFailed result: %s", connectionResult);
        }
    }
}
