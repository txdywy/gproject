package com.google.android.finsky.billing.myaccount;

import android.widget.Toast;

final class bp implements Runnable {
    public final /* synthetic */ int f10264a;
    public final /* synthetic */ bo f10265b;

    bp(bo boVar, int i) {
        this.f10265b = boVar;
        this.f10264a = i;
    }

    public final void run() {
        Toast.makeText(this.f10265b, this.f10264a, 0).show();
        this.f10265b.setResult(-1);
        this.f10265b.finish();
    }
}
