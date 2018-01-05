package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.vr.a.a.a.b;
import com.google.vr.a.a.a.c;
import com.google.vr.a.a.a.d;

final class C1979p implements d {
    public boolean f10071a = false;
    public final /* synthetic */ b f10072b;
    public final /* synthetic */ b f10073c;
    public final /* synthetic */ b f10074d;
    public final /* synthetic */ b f10075e;

    C1979p(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f10072b = bVar;
        this.f10073c = bVar2;
        this.f10074d = bVar3;
        this.f10075e = bVar4;
    }

    public final void m10484a(c cVar) {
        this.f10071a = !this.f10071a;
        if (this.f10071a) {
            this.f10072b.b("lull::DisableEvent");
            this.f10073c.b("lull::EnableEvent");
            this.f10074d.b("lull::EnableEvent");
            this.f10075e.b("lull::EnableEvent");
            return;
        }
        this.f10072b.b("lull::EnableEvent");
        this.f10073c.b("lull::DisableEvent");
        this.f10074d.b("lull::DisableEvent");
        this.f10075e.b("lull::DisableEvent");
    }
}
