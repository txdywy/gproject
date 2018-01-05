package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.vr.a.a.a.b;
import com.google.vr.a.a.a.c;
import com.google.vr.a.a.a.d;

public final class C1969f implements d {
    public final /* synthetic */ b f10042a;
    public final /* synthetic */ ap f10043b;
    public final /* synthetic */ C1968e f10044c;

    public C1969f(C1968e c1968e, b bVar, ap apVar) {
        this.f10044c = c1968e;
        this.f10042a = bVar;
        this.f10043b = apVar;
    }

    public final void m10472a(c cVar) {
        this.f10044c.f10041o = !this.f10044c.f10041o;
        if (this.f10044c.f10041o) {
            this.f10042a.b("lull::ShowEvent");
        } else {
            this.f10042a.b("lull::HideEvent");
        }
        this.f10043b.mo2552c(this.f10044c.f10041o);
    }
}
