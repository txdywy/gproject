package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.vr.a.a.a.c;
import com.google.vr.a.a.a.d;

public final class C1971h implements d {
    public boolean f10047a = false;
    public final /* synthetic */ C1968e f10048b;

    public C1971h(C1968e c1968e) {
        this.f10048b = c1968e;
    }

    public final void m10474a(c cVar) {
        this.f10047a = !this.f10047a;
        if (this.f10047a) {
            this.f10048b.f10037k.b("lull::EnableEvent");
            this.f10048b.f10036j.b("lull::DisableEvent");
            this.f10048b.f10039m.b("lull::EnableEvent");
            return;
        }
        this.f10048b.f10037k.b("lull::DisableEvent");
        this.f10048b.f10036j.b("lull::EnableEvent");
        this.f10048b.f10039m.b("lull::DisableEvent");
    }
}
