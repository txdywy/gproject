package com.google.android.finsky.billing.lightpurchase.e;

import android.os.Bundle;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.billing.payments.e;
import com.google.android.finsky.d.j;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.billing.lightpurchase.e.aa extends com.google.android.finsky.billing.payments.e
{

    public com.google.wireless.android.a.a.a.a.ce a;

    aa() {
        com.google.android.finsky.billing.payments.e();
        this.a = com.google.android.finsky.d.j.a(740);
    }

    public final void a(int p0, Bundle p1) {
        if (com.google.android.finsky.billing.lightpurchase.e.aa.a(p0))
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).Y();
        else
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ac();
    }

    public final void b(int p0, Bundle p1) {
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

}
