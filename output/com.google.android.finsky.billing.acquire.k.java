package com.google.android.finsky.billing.acquire;

import com.google.android.finsky.billing.c.b;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.br.b;

public final class com.google.android.finsky.billing.acquire.k implements com.google.android.finsky.as.c
{

    public final com.google.android.finsky.billing.acquire.i a;

    k(com.google.android.finsky.billing.acquire.i p0) {
        this.a = p0;
    }

    public final void a(boolean p0) {
        if (p0 != 0) {
            this.a.startActivity(this.a.F.d(this.a));
            this.a.finish();
        }
        else {
            if (this.a.aa != 0 && this.a.aa.o != 0)
                v0 = 1;
            else
                v0 = 0;
            this.a.L.a(new com.google.android.finsky.billing.acquire.l(this.a), v0);
        }
    }

}
