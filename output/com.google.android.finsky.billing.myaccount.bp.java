package com.google.android.finsky.billing.myaccount;

import android.widget.Toast;

public final class com.google.android.finsky.billing.myaccount.bp implements Runnable
{

    public final int a;
    public final com.google.android.finsky.billing.myaccount.bo b;

    bp(com.google.android.finsky.billing.myaccount.bo p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        Toast.makeText(this.b, this.a, 0).show();
        this.b.setResult(-1);
        this.b.finish();
    }

}
