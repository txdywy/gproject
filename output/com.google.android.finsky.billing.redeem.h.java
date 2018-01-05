package com.google.android.finsky.billing.redeem;

import com.google.android.finsky.api.c;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.by.l;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.el;

public final class com.google.android.finsky.billing.redeem.h implements com.android.volley.x
{

    public final com.google.android.finsky.d.w a;
    public final com.google.android.finsky.billing.redeem.c b;

    h(com.google.android.finsky.billing.redeem.c p0, com.google.android.finsky.d.w p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void b_(Object p0) {
        this.b.c = (com.google.wireless.android.finsky.dfe.nano.el)p0;
        v3 = new com.google.android.finsky.d.c(801).a(((com.google.wireless.android.finsky.dfe.nano.el)p0).l);
        if (((com.google.wireless.android.finsky.dfe.nano.el)p0).b != 1)
            v3.a(((com.google.wireless.android.finsky.dfe.nano.el)p0).b);
        this.a.a(v3);
        switch (((com.google.wireless.android.finsky.dfe.nano.el)p0).b) {
            case 1:
                com.google.android.finsky.m.a.ai().a(this.b.a.b(), "redeem-code-sidecar", new com.google.android.finsky.billing.redeem.d(this.b), ((com.google.wireless.android.finsky.dfe.nano.el)p0).o);
                break;
            case 2:
                v2 = new Object[1];
                v2[0] = Integer.valueOf(((com.google.wireless.android.finsky.dfe.nano.el)p0).b);
                FinskyLog.c("Received error/unknown result: %d", v2);
                this.b.d = ((com.google.wireless.android.finsky.dfe.nano.el)p0).g;
                this.b.b(3, 0);
                break;
            case 3:
                this.b.b(4, 0);
                break;
            case 4:
                v2 = new Object[1];
                v2[0] = Integer.valueOf(((com.google.wireless.android.finsky.dfe.nano.el)p0).b);
                FinskyLog.c("Received error/unknown result: %d", v2);
                this.b.d = ((com.google.wireless.android.finsky.dfe.nano.el)p0).g;
                this.b.b(3, 0);
                break;
            case 5:
                this.b.b(5, 0);
                break;
            default:
                v2 = new Object[1];
                v2[0] = Integer.valueOf(((com.google.wireless.android.finsky.dfe.nano.el)p0).b);
                FinskyLog.c("Received error/unknown result: %d", v2);
                this.b.d = ((com.google.wireless.android.finsky.dfe.nano.el)p0).g;
                this.b.b(3, 0);
                break;
        }
    }

}
