package com.google.android.finsky.billing.lightpurchase.vr.a;

import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.a.a.a.c;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.f implements com.google.vr.a.a.a.d
{

    public final com.google.vr.a.a.a.b a;
    public final com.google.android.finsky.billing.lightpurchase.vr.a.ap b;
    public final com.google.android.finsky.billing.lightpurchase.vr.a.e c;

    f(com.google.android.finsky.billing.lightpurchase.vr.a.e p0, com.google.vr.a.a.a.b p1, com.google.android.finsky.billing.lightpurchase.vr.a.ap p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void a(com.google.vr.a.a.a.c p0) {
        if (this.c.o == 0)
            v0 = 1;
        else
            v0 = 0;
        this.c.o = v0;
        if (this.c.o != 0)
            this.a.b("lull::ShowEvent");
        else
            this.a.b("lull::HideEvent");
        this.b.c(this.c.o);
    }

}
