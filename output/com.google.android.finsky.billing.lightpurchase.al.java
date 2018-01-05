package com.google.android.finsky.billing.lightpurchase;

import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import com.google.android.finsky.br.b;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;

public final class com.google.android.finsky.billing.lightpurchase.al implements com.google.android.finsky.as.c
{

    public final PurchaseActivity a;

    al(PurchaseActivity p0) {
        this.a = p0;
    }

    public final void a(boolean p0) {
        if (p0 != 0) {
            this.a.startActivity(com.google.android.finsky.m.a.bo().d(this.a));
            this.a.k();
            this.a.finish();
        }
        else if (this.a.l() == 0) {
            this.a.w.a(new com.google.android.finsky.d.p().b(this.a));
            this.a.H_().a().a(2131755313, com.google.android.finsky.billing.lightpurchase.am.a(this.a.v, this.a.u, this.a.z, this.a.w)).c();
        }
    }

}
