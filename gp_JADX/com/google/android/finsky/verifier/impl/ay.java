package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.ap;
import com.google.android.finsky.verifier.p259a.p260a.C4722z;

final class ay extends ap {
    public final /* synthetic */ String f24423a;
    public final /* synthetic */ boolean f24424b;
    public final /* synthetic */ aw f24425c;

    ay(aw awVar, ag agVar, String str, boolean z) {
        this.f24425c = awVar;
        this.f24423a = str;
        this.f24424b = z;
        super(agVar);
    }

    public final /* synthetic */ Object call() {
        Object obj = (C4722z) ag.m15236a(this.f15542f.f15534k.mo3202d().mo1521a(this.f24423a));
        if (obj == null || obj.f24295e == this.f24424b) {
            return this.f24425c.e.mo4401a(Long.valueOf(0));
        }
        obj.m21968a(this.f24424b);
        return this.f15542f.f15534k.mo3202d().mo1524b(obj);
    }
}
