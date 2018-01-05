package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.vr.a.a.a.c;
import com.google.vr.a.a.a.d;

final class C1988y implements d {
    public final /* synthetic */ C1984u f10105a;
    public final /* synthetic */ Runnable f10106b;
    public final /* synthetic */ Runnable f10107c;
    public final /* synthetic */ C1986w f10108d;

    C1988y(C1986w c1986w, C1984u c1984u, Runnable runnable, Runnable runnable2) {
        this.f10108d = c1986w;
        this.f10105a = c1984u;
        this.f10106b = runnable;
        this.f10107c = runnable2;
    }

    public final void m10501a(c cVar) {
        this.f10105a.f9987t = false;
        this.f10108d.f10099c.m10436a(this.f10105a, 771);
        C1986w c1986w = this.f10108d;
        Runnable runnable = this.f10106b;
        Runnable runnable2 = this.f10107c;
        aq c1974k = new C1974k(c1986w.f10101e, c1986w.f10102f, c1986w.f10099c);
        c1974k.p.a(runnable, runnable2);
        c1986w.f10102f = c1974k;
        c1986w.f10102f.m10459b();
        c1986w.f10099c.m10439b(c1986w.f10102f);
    }
}
