package com.google.android.finsky.billing.iab;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.acquire.C1690f;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.lightpurchase.IabV3Activity;
import com.google.android.finsky.billing.lightpurchase.vr.VrPurchaseActivity;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.vr.b.a.e;

public final class C1870z implements C1869y {
    public final Intent mo2489a(Account account, PurchaseParams purchaseParams) {
        C2171b bo = C1473m.f7980a.bo();
        C1552e j = C1473m.f7980a.mo2249j(account.name);
        Context context = C1473m.f7980a.f7981b;
        if (C1503a.m8830a(context)) {
            return bo.mo2727a(account, context, purchaseParams, j);
        }
        if (C1503a.m8831b(context)) {
            return bo.mo2729a(account, purchaseParams);
        }
        boolean z;
        int i = purchaseParams.f9285a != null ? purchaseParams.f9285a.f11834c : 0;
        boolean z2;
        if (!C2726q.m14750a(i) || j.mo2294a(12633472)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!C2726q.m14753b(i) || j.mo2294a(12633473)) {
            z = false;
        } else {
            z = true;
        }
        if (j.mo2294a(12626591) && (r5 || r1)) {
            z = true;
        } else {
            z = false;
        }
        if (!purchaseParams.f9299o || (j.mo2294a(12637988) && C1690f.m9476a() && z)) {
            if (z) {
                return bo.mo2726a(account, context, j, null, null, purchaseParams, null, false, true);
            }
            return IabV3Activity.m10048a(account, purchaseParams);
        } else if (e.a(C1473m.f7980a.f7981b) == 0) {
            return VrPurchaseActivity.m10429a(account, purchaseParams, null);
        } else {
            return null;
        }
    }
}
