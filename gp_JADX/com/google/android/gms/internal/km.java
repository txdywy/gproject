package com.google.android.gms.internal;

import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;

final class km extends kj {
    public /* synthetic */ String f27129a;
    public /* synthetic */ int f27130u;
    public /* synthetic */ String[] f27131v;
    public /* synthetic */ byte[] f27132w;

    km(C5058o c5058o, String str, int i, String[] strArr, byte[] bArr) {
        this.f27129a = str;
        this.f27130u = i;
        this.f27131v = strArr;
        this.f27132w = bArr;
        super(c5058o);
    }

    public final /* synthetic */ C4980w mo4495a(Status status) {
        return status;
    }

    protected final /* synthetic */ void mo4496a(C4948f c4948f) {
        kx kxVar = (kx) c4948f;
        ((kf) kxVar.m23032u()).mo4766a(new kn(this), this.f27129a, this.f27130u, this.f27131v, this.f27132w);
    }
}
