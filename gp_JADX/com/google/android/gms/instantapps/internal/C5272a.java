package com.google.android.gms.instantapps.internal;

import android.content.Intent;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;

final class C5272a extends C5271i {
    public /* synthetic */ Intent f26454a;

    C5272a(C5058o c5058o, Intent intent) {
        this.f26454a = intent;
        super(c5058o);
    }

    protected final /* synthetic */ C4980w mo4495a(Status status) {
        return new C5283m(status, null);
    }

    protected final void mo4667a(ah ahVar) {
        ahVar.mo4671a(new C5275b(this), this.f26454a);
    }
}
