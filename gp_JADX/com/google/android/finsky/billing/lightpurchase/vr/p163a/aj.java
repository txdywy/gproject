package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.vr.a.a.a.c;
import com.google.vr.a.a.a.d;

final class aj implements d {
    public final /* synthetic */ C1984u f10002a;
    public final /* synthetic */ Runnable f10003b;
    public final /* synthetic */ Runnable f10004c;
    public final /* synthetic */ C1986w f10005d;

    aj(C1986w c1986w, C1984u c1984u, Runnable runnable, Runnable runnable2) {
        this.f10005d = c1986w;
        this.f10002a = c1984u;
        this.f10003b = runnable;
        this.f10004c = runnable2;
    }

    public final void m10463a(c cVar) {
        this.f10002a.f9987t = false;
        this.f10005d.f10099c.m10436a(this.f10002a, 771);
        C1986w c1986w = this.f10005d;
        Runnable runnable = this.f10003b;
        Runnable runnable2 = this.f10004c;
        aq c1974k = new C1974k(c1986w.f10101e, c1986w.f10102f, c1986w.f10099c);
        c1974k.p.a(runnable, runnable2);
        c1986w.f10102f = c1974k;
        c1986w.f10102f.m10459b();
        c1986w.f10099c.m10439b(c1986w.f10102f);
    }
}
