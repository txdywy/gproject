package com.google.android.gms.internal;

import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcCacheRequest;

final class nr extends nu {
    public /* synthetic */ UdcCacheRequest f27210a;

    nr(C5058o c5058o, UdcCacheRequest udcCacheRequest) {
        this.f27210a = udcCacheRequest;
        super(c5058o);
    }

    protected final /* synthetic */ C4980w mo4495a(Status status) {
        return new nv(status, null);
    }

    protected final void mo4831a(no noVar) {
        noVar.mo4829a(new ns(this), this.f27210a);
    }
}
