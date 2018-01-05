package com.google.android.finsky.billing.lightpurchase.vr.a;

import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.a.a.a.c;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.j implements com.google.vr.a.a.a.d
{

    public final com.google.vr.a.a.a.b a;
    public final com.google.android.finsky.billing.lightpurchase.vr.a.i b;

    j(com.google.android.finsky.billing.lightpurchase.vr.a.i p0, com.google.vr.a.a.a.b p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a(com.google.vr.a.a.a.c p0) {
        if (this.b.g == 0)
            v0 = 1;
        else
            v0 = 0;
        this.b.g = v0;
        if (this.b.g != 0)
            this.a.b("lull::ShowEvent");
        else
            this.a.b("lull::HideEvent");
    }

}
