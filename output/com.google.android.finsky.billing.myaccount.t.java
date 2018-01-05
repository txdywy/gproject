package com.google.android.finsky.billing.myaccount;

import android.widget.Toast;

public final class com.google.android.finsky.billing.myaccount.t implements Runnable
{

    public final CancelSubscriptionActivity a;

    t(CancelSubscriptionActivity p0) {
        this.a = p0;
    }

    public final void run() {
        Toast.makeText(this.a, 2131951805, 0).show();
        this.a.setResult(-1);
        this.a.finish();
    }

}
