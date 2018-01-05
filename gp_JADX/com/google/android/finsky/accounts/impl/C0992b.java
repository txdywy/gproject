package com.google.android.finsky.accounts.impl;

import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class C0992b implements Runnable {
    public final AccountsChangedReceiver f5988a;
    public final boolean f5989b;
    public final String f5990c;

    C0992b(AccountsChangedReceiver accountsChangedReceiver, boolean z, String str) {
        this.f5988a = accountsChangedReceiver;
        this.f5989b = z;
        this.f5990c = str;
    }

    public final void run() {
        AccountsChangedReceiver accountsChangedReceiver = this.f5988a;
        boolean z = this.f5989b;
        String str = this.f5990c;
        String cZ = accountsChangedReceiver.f5968b.cZ();
        boolean z2 = (cZ == null || accountsChangedReceiver.f5967a.mo1184c(cZ)) ? false : true;
        if (z) {
            new C0993c(str, z2, accountsChangedReceiver.f5974h, accountsChangedReceiver.f5967a, accountsChangedReceiver.f5970d, accountsChangedReceiver.f5971e, accountsChangedReceiver.f5976j).execute(new Void[0]);
        } else if (z2) {
            FinskyLog.m21659a("Killing app because current account has been removed", new Object[0]);
            System.exit(0);
        }
    }
}
