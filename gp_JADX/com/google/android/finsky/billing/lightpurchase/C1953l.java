package com.google.android.finsky.billing.lightpurchase;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.cv.p177a.is;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.b.w;
import com.google.wireless.android.finsky.dfe.nano.et;
import com.google.wireless.android.finsky.dfe.nano.fb;

final class C1953l implements C0660x {
    public final C2495w f9951a;
    public final /* synthetic */ C1950i f9952b;

    public C1953l(C1950i c1950i, C2495w c2495w) {
        this.f9952b = c1950i;
        this.f9951a = c2495w;
    }

    public final /* synthetic */ void b_(Object obj) {
        et etVar = (et) obj;
        C1950i c1950i = this.f9952b;
        C2495w c2495w = this.f9951a;
        c1950i.aq = null;
        c1950i.an = null;
        c1950i.as = null;
        c1950i.ao = null;
        fb fbVar = etVar.b;
        c1950i.m10396a(c2495w, 305, fbVar.b, c1950i.aa(), c1950i.m10390Z(), etVar.f);
        is isVar = etVar.m;
        w[] wVarArr = etVar.d;
        C0757i c0757i = etVar.k;
        C1473m.f7980a.ai().mo2796a(c1950i.f9939b.mo1620b(), "CheckoutPurchaseSidecar.commit", new C1952k(c1950i, etVar, c2495w, fbVar), wVarArr);
        if (isVar != null) {
            c1950i.am = C1867w.m9981a(isVar);
        } else {
            c1950i.am = C1867w.m9982a(wVarArr, c1950i.f9942e.f9285a);
        }
        if (c1950i.am == null) {
            c1950i.am = new Bundle();
        }
        if (c0757i != null) {
            c1950i.am.putParcelable("ExtraPurchaseData.purchaseTotalPrice", ParcelableProto.m21671a(c0757i));
        }
        c1950i.am.putBoolean("ExtraPurchaseData.iapGmpReportingDone", !TextUtils.isEmpty(c1950i.at));
    }
}
