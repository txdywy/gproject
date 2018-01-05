package com.google.android.finsky.billing.myaccount;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;

final class bi implements OnClickListener {
    public final /* synthetic */ Intent f10251a;
    public final /* synthetic */ ManageSubscriptionActivity f10252b;

    bi(ManageSubscriptionActivity manageSubscriptionActivity, Intent intent) {
        this.f10252b = manageSubscriptionActivity;
        this.f10251a = intent;
    }

    public final void onClick(View view) {
        this.f10252b.E.m13379b(new C2475d(this.f10252b).m13256a(2643).m13258a(this.f10252b.f10143p.f14885a.f12087D));
        this.f10252b.startActivityForResult(this.f10251a, 2);
    }
}
