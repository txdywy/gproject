package com.google.android.finsky.billing.lightpurchase.vr.a;

import com.google.vr.a.a.a;
import com.google.vr.a.a.a.c;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.h implements com.google.vr.a.a.a.d
{

    public boolean a;
    public final com.google.android.finsky.billing.lightpurchase.vr.a.e b;

    h(com.google.android.finsky.billing.lightpurchase.vr.a.e p0) {
        this.b = p0;
        this.a = 0;
    }

    public final void a(com.google.vr.a.a.a.c p0) {
        if (this.a == 0)
            v0 = 1;
        else
            v0 = 0;
        this.a = v0;
        if (this.a != 0) {
            this.b.k.b("lull::EnableEvent");
            this.b.j.b("lull::DisableEvent");
            this.b.m.b("lull::EnableEvent");
        }
        else {
            this.b.k.b("lull::DisableEvent");
            this.b.j.b("lull::EnableEvent");
            this.b.m.b("lull::DisableEvent");
        }
    }

}
