package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import android.text.TextUtils;
import com.google.vr.a.a.a.c;
import com.google.vr.a.a.a.d;

public final class ac implements d {
    public final /* synthetic */ C1986w f9994a;

    public ac(C1986w c1986w) {
        this.f9994a = c1986w;
    }

    public final void m10462a(c cVar) {
        if (cVar != null) {
            Object a = cVar.a("href");
            if (!TextUtils.isEmpty(a)) {
                this.f9994a.f10100d.mo2556i();
                Runnable adVar = new ad(this, a);
                Runnable afVar = new af(this);
                C1986w c1986w = this.f9994a;
                aq c1974k = new C1974k(c1986w.f10101e, c1986w.f10102f, c1986w.f10099c);
                c1974k.p.a(adVar, afVar);
                c1986w.f10102f = c1974k;
                c1986w.f10102f.m10459b();
                c1986w.f10099c.m10439b(c1986w.f10102f);
            }
        }
    }
}
