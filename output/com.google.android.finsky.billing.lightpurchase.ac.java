package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.lightpurchase.ac implements Runnable
{

    public final int a;
    public final Intent b;
    public final LightPurchaseFlowActivity c;

    ac(LightPurchaseFlowActivity p0, int p1, Intent p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        v4 = new Object[1];
        v4[0] = Integer.valueOf(this.a);
        FinskyLog.a("TV payment screen finished with result: %d", v4);
        if (this.a == -1) {
            if (this.c.P != 0) {
                v1 = new Intent();
                v1.putExtra("authAccount", this.c.I.name);
                v1.putExtras(this.b.getExtras());
                this.c.setResult(-1, v1);
            }
            else
                this.c.setResult(-1);
            this.c.m();
        }
        else
            this.c.l();
    }

}
