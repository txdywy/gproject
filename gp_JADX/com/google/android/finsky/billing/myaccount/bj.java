package com.google.android.finsky.billing.myaccount;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;

final class bj implements OnClickListener {
    public final /* synthetic */ Intent f10253a;
    public final /* synthetic */ ManageSubscriptionActivity f10254b;

    bj(ManageSubscriptionActivity manageSubscriptionActivity, Intent intent) {
        this.f10254b = manageSubscriptionActivity;
        this.f10253a = intent;
    }

    public final void onClick(View view) {
        this.f10254b.E.m13379b(new C2475d(this.f10254b).m13256a(2646).m13258a(this.f10254b.f10143p.f14885a.f12087D));
        this.f10254b.startActivityForResult(this.f10253a, 1);
    }
}
