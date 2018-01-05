package com.google.android.finsky.settings;

import com.squareup.leakcanary.C7582R;

enum C4111u implements C4109x {
    ALWAYS(2, C7582R.string.purchase_auth_value_always),
    SESSION(1, C7582R.string.purchase_auth_value_session),
    NEVER(0, C7582R.string.purchase_auth_value_never);
    
    public final int f20544d;
    public final int f20545e;

    private C4111u(int i, int i2) {
        this.f20544d = i;
        this.f20545e = i2;
    }

    public final int mo3912a() {
        return this.f20545e;
    }
}
