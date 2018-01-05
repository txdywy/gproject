package com.google.android.finsky.billing.myaccount;

import android.widget.Toast;
import com.squareup.leakcanary.C7582R;

final class C2030t implements Runnable {
    public final /* synthetic */ CancelSubscriptionActivity f10478a;

    C2030t(CancelSubscriptionActivity cancelSubscriptionActivity) {
        this.f10478a = cancelSubscriptionActivity;
    }

    public final void run() {
        Toast.makeText(this.f10478a, C7582R.string.cancel_subscription_okay, 0).show();
        this.f10478a.setResult(-1);
        this.f10478a.finish();
    }
}
