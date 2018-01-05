package com.google.android.finsky.billing.lightpurchase;

import android.os.Bundle;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.legacyauth.AuthState;

public final class com.google.android.finsky.billing.lightpurchase.a extends com.google.android.finsky.billing.common.s implements com.google.android.finsky.billing.legacyauth.i
{

    public AuthState a;

    a() {
        com.google.android.finsky.billing.common.s();
    }

    public final AuthState W() {
        this.a.k = 0;
        return this.a;
    }

    protected final void a(Bundle p0) {
        super.a(p0);
        this.a = (AuthState)p0.getParcelable("AuthStateSidecar.authState");
    }

    public final void a(AuthState p0) {
        this.a = p0;
        this.b(2, 0);
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putParcelable("AuthStateSidecar.authState", this.a);
    }

}
