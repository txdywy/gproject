package com.google.android.gms.safetynet;

import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.internal.bw;
import com.google.android.gms.internal.lw;
import com.google.android.gms.internal.mi;
import com.google.android.gms.tasks.C5588e;

public final class C5583r extends bw {
    public /* synthetic */ String f28497a;
    public /* synthetic */ int f28498b = 12;
    public /* synthetic */ byte[] f28499c;

    public C5583r(String str, byte[] bArr) {
        this.f28497a = str;
        this.f28499c = bArr;
    }

    protected final /* synthetic */ void mo5048a(C4948f c4948f, C5588e c5588e) {
        mi miVar = (mi) c4948f;
        ((lw) miVar.m23032u()).mo4811a(new C5584s(c5588e), this.f28497a, this.f28498b, this.f28499c);
    }
}
