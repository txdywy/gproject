package com.google.android.finsky.ar;

import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.utils.ai;
import com.google.wireless.android.a.a.a.a.aj;

public final class C1502a {
    public final C2266a f8173a;
    public final ai f8174b;

    public C1502a(C2266a c2266a, ai aiVar) {
        this.f8173a = c2266a;
        this.f8174b = aiVar;
    }

    public final aj m8828a() {
        int i;
        int i2 = 1;
        aj ajVar = new aj();
        ajVar.b = this.f8173a.m11721c() ? 2 : 1;
        ajVar.a |= 1;
        Boolean a = this.f8174b.m21696a();
        if (a == null || !a.booleanValue()) {
            i = 1;
        } else {
            i = 2;
        }
        ajVar.c = i;
        ajVar.a |= 2;
        if (!this.f8174b.m21698c()) {
            i2 = 2;
        }
        ajVar.d = i2;
        ajVar.a |= 4;
        return ajVar;
    }
}
