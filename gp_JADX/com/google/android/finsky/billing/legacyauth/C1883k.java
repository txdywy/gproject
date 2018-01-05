package com.google.android.finsky.billing.legacyauth;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class C1883k implements OnClickListener {
    public final /* synthetic */ int f9610a;
    public final /* synthetic */ PurchaseAuthActivity f9611b;

    C1883k(PurchaseAuthActivity purchaseAuthActivity, int i) {
        this.f9611b = purchaseAuthActivity;
        this.f9610a = i;
    }

    public final void onClick(View view) {
        PurchaseAuthActivity purchaseAuthActivity = this.f9611b;
        int i = this.f9610a;
        if (purchaseAuthActivity.f9584q != i) {
            Intent intent = new Intent();
            intent.putExtra("purchase-auth-current", purchaseAuthActivity.f9584q);
            intent.putExtra("purchase-auth-new", i);
            purchaseAuthActivity.setResult(-1, intent);
        }
        this.f9611b.finish();
    }
}
