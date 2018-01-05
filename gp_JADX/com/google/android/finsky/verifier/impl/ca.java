package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.ap;
import com.google.android.finsky.utils.C4691w;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import com.google.android.finsky.verifier.p259a.p260a.ab;

final class ca extends ap {
    public final /* synthetic */ byte[] f24525a;

    ca(ag agVar, byte[] bArr) {
        this.f24525a = bArr;
        super(agVar);
    }

    public final /* synthetic */ Object call() {
        ab abVar = (ab) ag.m15236a(this.f15542f.f15534k.mo3199a().mo1521a(C4691w.m21842a(this.f24525a)));
        if (abVar == null) {
            return null;
        }
        return new C4735g(abVar.f24103d, abVar.f24105f, null, null, false, 0, abVar.f24104e, false, false, null, true, false);
    }
}
