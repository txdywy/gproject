package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.dy.C2933o;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.ap;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;
import com.google.android.finsky.verifier.p259a.p260a.C4719w;

final class cm extends ap {
    public final /* synthetic */ C4699c f24548a;
    public final /* synthetic */ int f24549b;
    public final /* synthetic */ bx f24550c;

    cm(bx bxVar, ag agVar, C4699c c4699c, int i) {
        this.f24550c = bxVar;
        this.f24548a = c4699c;
        this.f24549b = i;
        super(agVar);
    }

    public final /* synthetic */ Object call() {
        Object obj = (C4719w) ag.m15236a(this.f15542f.f15534k.mo3201c().mo1521a(new C2933o(this.f24548a.f24145d.f24199b, this.f24550c.f24508q)));
        if (obj == null) {
            return null;
        }
        obj.f24280i = this.f24549b;
        obj.f24272a |= 32;
        return this.f15542f.f15534k.mo3201c().mo1524b(obj);
    }
}
