package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.support.v4.app.u;
import com.google.android.finsky.activities.b;
import com.google.android.finsky.billing.f.a;
import com.google.android.finsky.billing.legacyauth.a;
import com.google.android.finsky.br.a;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;

public final class com.google.android.finsky.billing.lightpurchase.aj implements com.google.android.finsky.billing.d.e
{

    public final WeakReference a;

    aj(LightPurchaseFlowActivity p0) {
        this.a = new WeakReference(p0);
    }

    public final void S_() {
        v0 = this.a.get();
        if ((LightPurchaseFlowActivity)v0 != 0)
            ((LightPurchaseFlowActivity)v0).l();
    }

    public final void a(Account p0, Document p1) {
        v1 = (LightPurchaseFlowActivity)this.a.get();
        if (v1 == 0)
            return;
        if (v1.K.c == 1) {
            if (v1.am == 0) {
                v1.z();
                if (v1.H())
                    v1.ar.a(v1.I, v1.C).a(v1);
                else
                    v1.m();
                return;
            }
            if (!v1.i(0)) {
                v1.a(v1.ah);
                v1.z();
                if (v1.H())
                    v1.ar.a(v1.I, v1.C).a(v1);
                else
                    v1.m();
            }
        }
        else if (v1.k())
            v1.m();
        else if (v1.K.d == 6) {
            if (!com.google.android.finsky.m.a.bn().a(v1, v1.I, v1.T, v1.H_(), 0, 5))
                v1.m();
        }
        else
            v1.A();
    }

}
