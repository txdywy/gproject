package com.google.android.finsky.billing.myaccount;

import android.widget.Toast;

public final class com.google.android.finsky.billing.myaccount.bk implements Runnable
{

    public final ReactivateSubscriptionActivity a;

    bk(ReactivateSubscriptionActivity p0) {
        this.a = p0;
    }

    public final void run() {
        Toast.makeText(this.a, 2131952978, 0).show();
        this.a.setResult(-1);
        this.a.finish();
    }

}
