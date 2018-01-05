package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.internal.am;

public final class cx implements C1632q, C1634r {
    public final C5053a f25824a;
    public final boolean f25825b;
    public cy f25826c;

    public cx(C5053a c5053a, boolean z) {
        this.f25824a = c5053a;
        this.f25825b = z;
    }

    private final void m23551a() {
        am.m23734a(this.f25826c, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    public final void mo2362a(int i) {
        m23551a();
        this.f25826c.mo2362a(i);
    }

    public final void mo2363a(Bundle bundle) {
        m23551a();
        this.f25826c.mo2363a(bundle);
    }

    public final void mo2364a(ConnectionResult connectionResult) {
        m23551a();
        this.f25826c.mo4570a(connectionResult, this.f25824a, this.f25825b);
    }
}
