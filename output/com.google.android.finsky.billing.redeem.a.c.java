package com.google.android.finsky.billing.redeem.a;

import android.os.Bundle;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.billing.payments.e;
import com.google.android.finsky.billing.redeem.a;
import com.google.android.finsky.billing.redeem.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.billing.redeem.a.c extends com.google.android.finsky.billing.payments.e
{

    public com.google.wireless.android.a.a.a.a.ce a;

    c() {
        com.google.android.finsky.billing.payments.e();
        this.a = com.google.android.finsky.d.j.a(1106);
    }

    public final void a(int p0, Bundle p1) {
        v0 = (com.google.android.finsky.billing.redeem.a)this.aa();
        if (com.google.android.finsky.billing.redeem.a.c.a(p0)) {
            if (v0.d.l != 5) {
                v2 = new Object[1];
                v2[0] = Integer.valueOf(v0.d.l);
                FinskyLog.e("Invalid state: %d", v2);
            }
            else
                v0.d.a(v0.aJ);
        }
        else
            v0.Y();
    }

    public final void b(int p0, Bundle p1) {
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

}
