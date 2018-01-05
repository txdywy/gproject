package com.google.android.finsky.p229o;

import com.google.wireless.android.finsky.dfe.b.b.a.a;

final class C3833h {
    public long f19192a;
    public a f19193b = new a();

    C3833h(long j, String str) {
        this.f19192a = j;
        a aVar = this.f19193b;
        if (str == null) {
            throw new NullPointerException();
        }
        aVar.b |= 1;
        aVar.c = str;
    }
}
