package com.google.android.finsky.billing.p130b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.iab.C1867w;

public final class C1761c {
    public PurchaseParams f9079a;
    public final C1552e f9080b;
    public final Context f9081c;
    public final C1867w f9082d;

    public C1761c(Context context, C1552e c1552e, C1867w c1867w, Bundle bundle) {
        this.f9080b = c1552e;
        this.f9081c = context;
        this.f9082d = c1867w;
        if (bundle != null) {
            this.f9079a = (PurchaseParams) bundle.getParcelable("purchaseParams");
        }
    }
}
