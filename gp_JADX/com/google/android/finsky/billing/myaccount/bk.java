package com.google.android.finsky.billing.myaccount;

import android.widget.Toast;
import com.squareup.leakcanary.C7582R;

final class bk implements Runnable {
    public final /* synthetic */ ReactivateSubscriptionActivity f10255a;

    bk(ReactivateSubscriptionActivity reactivateSubscriptionActivity) {
        this.f10255a = reactivateSubscriptionActivity;
    }

    public final void run() {
        Toast.makeText(this.f10255a, C7582R.string.reactivate_subscription_okay, 0).show();
        this.f10255a.setResult(-1);
        this.f10255a.finish();
    }
}
