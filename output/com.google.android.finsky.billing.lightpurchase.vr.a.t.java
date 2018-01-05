package com.google.android.finsky.billing.lightpurchase.vr.a;

import com.google.vr.a.a.a.c;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.t implements com.google.vr.a.a.a.d
{

    public final String a;
    public final com.google.android.finsky.billing.lightpurchase.vr.a.q b;

    t(com.google.android.finsky.billing.lightpurchase.vr.a.q p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a(com.google.vr.a.a.a.c p0) {
        if (this.b.n == 0 && this.b.l.length() != this.b.k) {
            v2 = String.valueOf(this.b.l);
            v0 = String.valueOf(this.a);
            if (v0.length() != 0)
                v0 = v2.concat(v0);
            else
                v0 = new String(v2);
            this.b.b(v0);
            this.b.a(0);
            if (this.b.l.length() == this.b.k) {
                this.b.n = 1;
                if (this.b.m != 0)
                    this.b.m.a(this.b.l);
            }
        }
    }

}
