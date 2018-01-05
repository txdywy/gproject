package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;

final class ax extends cb {
    public /* synthetic */ String f28587a;
    public /* synthetic */ String f28588u;
    public /* synthetic */ byte[] f28589v;

    ax(C5058o c5058o, String str, String str2, byte[] bArr) {
        this.f28587a = str;
        this.f28588u = str2;
        this.f28589v = bArr;
        super(c5058o);
    }

    protected final /* synthetic */ C4980w mo4495a(Status status) {
        return new ay(status);
    }

    protected final /* synthetic */ void mo4496a(C4948f c4948f) {
        bt btVar = (bt) c4948f;
        ((at) btVar.m23032u()).mo5108a(new bs(this), this.f28587a, this.f28588u, this.f28589v);
    }
}
