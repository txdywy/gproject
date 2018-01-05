package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.vr.a.a.a.b;
import com.google.vr.a.a.a.c;
import com.google.vr.a.a.a.d;

public final class C1973j implements d {
    public final /* synthetic */ b f10057a;
    public final /* synthetic */ C1972i f10058b;

    public C1973j(C1972i c1972i, b bVar) {
        this.f10058b = c1972i;
        this.f10057a = bVar;
    }

    public final void m10476a(c cVar) {
        this.f10058b.f10053g = !this.f10058b.f10053g;
        if (this.f10058b.f10053g) {
            this.f10057a.b("lull::ShowEvent");
        } else {
            this.f10057a.b("lull::HideEvent");
        }
    }
}
