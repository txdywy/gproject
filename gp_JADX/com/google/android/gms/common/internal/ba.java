package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

public final class ba implements ax {
    public /* synthetic */ ar f26000a;

    public ba(ar arVar) {
        this.f26000a = arVar;
    }

    public final void mo4580a(ConnectionResult connectionResult) {
        if (connectionResult.m23264b()) {
            this.f26000a.m23013a(null, this.f26000a.mo4480p());
        } else if (this.f26000a.f25430w != null) {
            this.f26000a.f25430w.mo4621a(connectionResult);
        }
    }
}
