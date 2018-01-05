package com.google.android.gms.internal;

import com.google.android.gms.ads.p270c.C4909c;

public final class la extends nd {
    public long f27151a = -1;

    public la(jp jpVar, String str, String str2, ci ciVar, int i) {
        super(jpVar, str, str2, ciVar, i, 12);
    }

    protected final void mo4764a() {
        if (((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27753i)).booleanValue()) {
            this.g.f26590l = Long.valueOf(-1);
            if (this.f27151a == -1) {
                this.f27151a = ((Long) this.h.invoke(null, new Object[]{this.d.f27072b})).longValue();
            }
            synchronized (this.g) {
                this.g.f26590l = Long.valueOf(this.f27151a);
            }
            return;
        }
        this.g.f26590l = Long.valueOf(-1);
        this.g.f26590l = (Long) this.h.invoke(null, new Object[]{this.d.f27072b});
    }
}
