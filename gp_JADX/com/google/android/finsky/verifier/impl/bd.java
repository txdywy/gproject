package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.ap;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4691w;
import com.google.android.finsky.verifier.p259a.p260a.aa;

final class bd extends ap {
    public final /* synthetic */ String f24443a;
    public final /* synthetic */ byte[] f24444b;

    bd(ag agVar, String str, byte[] bArr) {
        this.f24443a = str;
        this.f24444b = bArr;
        super(agVar);
    }

    public final /* synthetic */ Object call() {
        ag.m15236a(this.f15542f.f15534k.mo3202d().mo1527d(this.f24443a));
        Object obj = (aa) ag.m15236a(this.f15542f.f15534k.mo3203e().mo1521a(C4691w.m21842a(this.f24444b)));
        if (obj == null) {
            obj = new aa();
            byte[] bArr = this.f24444b;
            if (bArr == null) {
                throw new NullPointerException();
            }
            obj.f24094a |= 1;
            obj.f24095b = bArr;
        }
        long a = C4678i.m21812a();
        obj.f24094a |= 2;
        obj.f24096c = a;
        return this.f15542f.f15534k.mo3203e().mo1524b(obj);
    }
}
