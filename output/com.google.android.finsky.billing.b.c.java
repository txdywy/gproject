package com.google.android.finsky.billing.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.iab.w;

public class com.google.android.finsky.billing.b.c
{

    public PurchaseParams a;
    public final com.google.android.finsky.ba.e b;
    public final Context c;
    public final com.google.android.finsky.billing.iab.w d;

    c(Context p0, com.google.android.finsky.ba.e p1, com.google.android.finsky.billing.iab.w p2, Bundle p3) {
        this.b = p1;
        this.c = p0;
        this.d = p2;
        if (p3 != 0)
            this.a = (PurchaseParams)p3.getParcelable("purchaseParams");
    }

}
