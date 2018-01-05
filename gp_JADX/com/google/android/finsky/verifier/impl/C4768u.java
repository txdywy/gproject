package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.ap;
import com.google.android.finsky.utils.C4691w;
import com.google.android.finsky.verifier.p259a.p260a.aa;

final class C4768u extends ap {
    public final /* synthetic */ byte[] f24707a;
    public final /* synthetic */ C4767t f24708b;

    C4768u(C4767t c4767t, ag agVar, byte[] bArr) {
        this.f24708b = c4767t;
        this.f24707a = bArr;
        super(agVar);
    }

    public final /* synthetic */ Object call() {
        Object obj = (aa) ag.m15236a(this.f15542f.f15534k.mo3203e().mo1521a(C4691w.m21842a(this.f24707a)));
        if (obj == null) {
            return this.f24708b.f24706d.mo4401a(Long.valueOf(0));
        }
        obj.f24094a |= 16;
        obj.f24099f = true;
        return this.f15542f.f15534k.mo3203e().mo1524b(obj);
    }
}
