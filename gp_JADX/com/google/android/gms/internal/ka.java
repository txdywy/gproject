package com.google.android.gms.internal;

public final class ka extends nd {
    public ka(jp jpVar, String str, String str2, ci ciVar, int i) {
        super(jpVar, str, str2, ciVar, i, 5);
    }

    protected final void mo4764a() {
        this.g.f26583e = Long.valueOf(-1);
        this.g.f26584f = Long.valueOf(-1);
        int[] iArr = (int[]) this.h.invoke(null, new Object[]{this.d.f27072b});
        synchronized (this.g) {
            this.g.f26583e = Long.valueOf((long) iArr[0]);
            this.g.f26584f = Long.valueOf((long) iArr[1]);
        }
    }
}
