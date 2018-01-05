package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.iab.w;
import com.google.android.finsky.billing.iab.x;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.wallet.common.util.a;

public class IabV3Activity extends PurchaseActivity
{

    public final com.google.android.finsky.d.a q;

    IabV3Activity() {
        PurchaseActivity();
        this.q = com.google.android.finsky.m.a.aR();
    }

    public static Intent a(Account p0, PurchaseParams p1) {
        v0 = PurchaseActivity.a(p0, p1, 0, 0);
        v0.setClass(com.google.android.finsky.m.a.b, IabV3Activity);
        return v0;
    }

    private final com.google.android.finsky.d.c c(int p0) {
        return new com.google.android.finsky.d.c(p0).c(com.google.android.wallet.common.util.a.a(this)).a(this.u.b).a(this.u.a).b(this.u.d).b(1);
    }

    protected final void a(com.google.android.finsky.billing.lightpurchase.am p0) {
        v6 = 0;
        v3 = com.google.android.finsky.billing.iab.w.a(p0.ak, p0.aj);
        v4 = this.m();
        if (v3 == com.google.android.finsky.billing.iab.x.a)
            v0 = 1;
        else
            v0 = 0;
        v4.a(this.c(601).a(v0).a(v3.l).a, 0);
        if (p0.al != 0)
            v2 = p0.al;
        else
            v2 = p0.c.am;
        this.x = com.google.android.finsky.billing.iab.w.a(this.getApplicationContext(), this.u, v2, v3, v4, com.google.android.finsky.m.a.dj());
        if (v3 == com.google.android.finsky.billing.iab.x.a)
            v6 = -1;
        this.y = v6;
    }

    protected final void k() {
        v1 = new Intent();
        v1.putExtra("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.b.l);
        this.x = v1;
        this.y = 0;
    }

    public void onCreate(Bundle p0) {
        this.w = this.q.a(p0, this.getIntent());
        this.u = (PurchaseParams)this.getIntent().getParcelableExtra("PurchaseActivity.params");
        if (p0 == 0 && this.u.t != 3)
            this.w.a(this.c(600).a, 0);
        super.onCreate(p0);
    }

}
