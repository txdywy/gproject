package com.google.android.finsky.billing.lightpurchase;

import android.support.v4.app.Fragment;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.m;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.family.remoteescalation.p;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.h.a.e;

public final class com.google.android.finsky.billing.lightpurchase.ba extends com.google.android.finsky.billing.common.s implements com.android.volley.w, com.android.volley.x
{

    public String a;
    public String b;

    ba() {
        com.google.android.finsky.billing.common.s();
    }

    public final void a(VolleyError p0) {
        FinskyLog.a(p0, "Error sending remote escalation", new Object[0]);
        if (this.k()) {
            this.a = com.google.android.finsky.api.m.a(this.h(), p0);
            this.b(3, 0);
        }
    }

    public final void b_(Object p0) {
        if (this.k()) {
            this.b = ((com.google.wireless.android.finsky.dfe.h.a.e)p0).b;
            this.a = ((com.google.wireless.android.finsky.dfe.h.a.e)p0).c;
            this.b(2, 0);
        }
        com.google.android.finsky.family.remoteescalation.p.a(com.google.android.finsky.m.a.cZ(), ((com.google.wireless.android.finsky.dfe.h.a.e)p0).e);
    }

}
