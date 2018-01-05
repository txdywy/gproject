package com.google.android.finsky.billing.lightpurchase;

import android.os.Bundle;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.C1882i;

public final class C1903a extends C1089s implements C1882i {
    public AuthState f9718a;

    public final AuthState mo968W() {
        this.f9718a.f9583k = false;
        return this.f9718a;
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putParcelable("AuthStateSidecar.authState", this.f9718a);
    }

    protected final void mo2462a(Bundle bundle) {
        super.mo2462a(bundle);
        this.f9718a = (AuthState) bundle.getParcelable("AuthStateSidecar.authState");
    }

    public final void mo2509a(AuthState authState) {
        this.f9718a = authState;
        m6758b(2, 0);
    }
}
