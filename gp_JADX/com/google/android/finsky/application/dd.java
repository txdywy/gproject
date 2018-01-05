package com.google.android.finsky.application;

import android.accounts.Account;
import com.google.android.finsky.C1473m;

final class dd implements Runnable {
    public final /* synthetic */ C1475d f8036a;

    dd(C1475d c1475d) {
        this.f8036a = c1475d;
    }

    public final void run() {
        C1473m c1473m = this.f8036a;
        for (Account account : c1473m.cX()) {
            c1473m.ag().mo2888d(account.name);
        }
    }
}
