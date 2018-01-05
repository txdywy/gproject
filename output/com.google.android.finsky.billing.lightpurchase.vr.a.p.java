package com.google.android.finsky.billing.lightpurchase.vr.a;

import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.a.a.a.c;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.p implements com.google.vr.a.a.a.d
{

    public boolean a;
    public final com.google.vr.a.a.a.b b;
    public final com.google.vr.a.a.a.b c;
    public final com.google.vr.a.a.a.b d;
    public final com.google.vr.a.a.a.b e;

    p(com.google.vr.a.a.a.b p0, com.google.vr.a.a.a.b p1, com.google.vr.a.a.a.b p2, com.google.vr.a.a.a.b p3) {
        this.b = p0;
        this.c = p1;
        this.d = p2;
        this.e = p3;
        this.a = 0;
    }

    public final void a(com.google.vr.a.a.a.c p0) {
        if (this.a == 0)
            v0 = 1;
        else
            v0 = 0;
        this.a = v0;
        if (this.a != 0) {
            this.b.b("lull::DisableEvent");
            this.c.b("lull::EnableEvent");
            this.d.b("lull::EnableEvent");
            this.e.b("lull::EnableEvent");
        }
        else {
            this.b.b("lull::EnableEvent");
            this.c.b("lull::DisableEvent");
            this.d.b("lull::DisableEvent");
            this.e.b("lull::DisableEvent");
        }
    }

}
