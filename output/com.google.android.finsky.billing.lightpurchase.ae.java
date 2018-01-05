package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.activities.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.billing.lightpurchase.ae implements Runnable
{

    public final int a;
    public final Intent b;
    public final LightPurchaseFlowActivity c;

    ae(LightPurchaseFlowActivity p0, int p1, Intent p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        if (this.a == 0)
            this.c.c(this.a);
        else if (this.a != -1)
            this.c.l();
        else {
            this.b.removeExtra("AskToDownloadActivity.authMethod");
            v6 = new HashMap();
            v6.put("pcam", String.valueOf(this.b.getIntExtra("AskToDownloadActivity.authMethod", 0)));
            v1 = this.b.getExtras();
            v2 = v1.keySet().iterator();
            while (v2.hasNext()) {
                v0 = (String)v2.next();
                v6.put(v0, String.valueOf(v1.get(v0)));
            }
            com.google.android.finsky.billing.lightpurchase.ar.a(this.c.I, this.c.T, this.c.K, this.c.J, this.c.L, this.c.U, v6, new com.google.android.finsky.billing.lightpurchase.aj(this.c), new com.google.android.finsky.billing.lightpurchase.ai(this.c), 1, this.c.ak, this.c.C, 0);
        }
    }

}
