package com.google.android.finsky.billing.lightpurchase;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.api.c;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.iab.w;
import com.google.android.finsky.by.l;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.et;
import com.google.wireless.android.finsky.dfe.nano.fb;

public final class com.google.android.finsky.billing.lightpurchase.l implements com.android.volley.x
{

    public final com.google.android.finsky.d.w a;
    public final com.google.android.finsky.billing.lightpurchase.i b;

    l(com.google.android.finsky.billing.lightpurchase.i p0, com.google.android.finsky.d.w p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void b_(Object p0) {
        this.b.aq = 0;
        this.b.an = 0;
        this.b.as = 0;
        this.b.ao = 0;
        this.b.a(this.a, 305, ((com.google.wireless.android.finsky.dfe.nano.et)p0).b.b, this.b.aa(), this.b.Z(), ((com.google.wireless.android.finsky.dfe.nano.et)p0).f);
        com.google.android.finsky.m.a.ai().a(this.b.b.b(), "CheckoutPurchaseSidecar.commit", new com.google.android.finsky.billing.lightpurchase.k(this.b, (com.google.wireless.android.finsky.dfe.nano.et)p0, this.a, ((com.google.wireless.android.finsky.dfe.nano.et)p0).b), ((com.google.wireless.android.finsky.dfe.nano.et)p0).d);
        if (((com.google.wireless.android.finsky.dfe.nano.et)p0).m != 0)
            this.b.am = com.google.android.finsky.billing.iab.w.a(((com.google.wireless.android.finsky.dfe.nano.et)p0).m);
        else
            this.b.am = com.google.android.finsky.billing.iab.w.a(((com.google.wireless.android.finsky.dfe.nano.et)p0).d, this.b.e.a);
        if (this.b.am == 0)
            this.b.am = new Bundle();
        if (((com.google.wireless.android.finsky.dfe.nano.et)p0).k != 0)
            this.b.am.putParcelable("ExtraPurchaseData.purchaseTotalPrice", ParcelableProto.a(((com.google.wireless.android.finsky.dfe.nano.et)p0).k));
        if (!TextUtils.isEmpty(this.b.at))
            v0 = 1;
        else
            v0 = 0;
        this.b.am.putBoolean("ExtraPurchaseData.iapGmpReportingDone", v0);
    }

}
