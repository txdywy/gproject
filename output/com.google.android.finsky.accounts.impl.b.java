package com.google.android.finsky.accounts.impl;

import com.google.android.finsky.accounts.a;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.accounts.impl.b implements Runnable
{

    public final AccountsChangedReceiver a;
    public final boolean b;
    public final String c;

    b(AccountsChangedReceiver p0, boolean p1, String p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final void run() {
        v2 = this.a.b.cZ();
        if (v2 != 0 && !this.a.a.c(v2))
            v2 = 1;
        else
            v2 = 0;
        if (this.b == 0) {
            if (v2 != 0) {
                FinskyLog.a("Killing app because current account has been removed", new Object[0]);
                System.exit(0);
            }
        }
        else
            new com.google.android.finsky.accounts.impl.c(this.c, v2, this.a.h, this.a.a, this.a.d, this.a.e, this.a.j).execute(new Void[0]);
    }

}
