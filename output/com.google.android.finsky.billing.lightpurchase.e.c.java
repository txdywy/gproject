package com.google.android.finsky.billing.lightpurchase.e;

import android.support.v4.app.Fragment;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.lightpurchase.e.c implements com.google.android.finsky.billing.lightpurchase.e.v
{

    public final com.google.android.finsky.billing.lightpurchase.e.b a;

    c(com.google.android.finsky.billing.lightpurchase.e.b p0) {
        this.a = p0;
    }

    public final void a() {
        this.a.al = 1;
        if (this.a.k())
            this.a.af();
        else
            FinskyLog.e("Callback triggered despite being detached.", new Object[0]);
    }

    public final void b() {
        this.a.al = 1;
        if (this.a.k())
            this.a.ad();
        else
            FinskyLog.e("Callback triggered despite being detached.", new Object[0]);
    }

}
