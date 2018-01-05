package com.google.android.gms.internal;

import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;

final class ko extends kj {
    public /* synthetic */ String f27134a;
    public /* synthetic */ int f27135u;
    public /* synthetic */ String[] f27136v;
    public /* synthetic */ byte[] f27137w;
    public /* synthetic */ String f27138x;
    public /* synthetic */ String f27139y = null;

    ko(C5058o c5058o, String str, int i, String[] strArr, byte[] bArr, String str2) {
        this.f27134a = str;
        this.f27135u = i;
        this.f27136v = strArr;
        this.f27137w = bArr;
        this.f27138x = str2;
        super(c5058o);
    }

    public final /* synthetic */ C4980w mo4495a(Status status) {
        return new kk(status, null);
    }

    protected final /* synthetic */ void mo4496a(C4948f c4948f) {
        kx kxVar = (kx) c4948f;
        ((kf) kxVar.m23032u()).mo4767a(new kp(this), this.f27134a, this.f27135u, this.f27136v, this.f27137w, this.f27138x, this.f27139y);
    }
}
