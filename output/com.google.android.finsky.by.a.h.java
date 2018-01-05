package com.google.android.finsky.by.a;

import android.accounts.Account;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

public final class com.google.android.finsky.by.a.h implements Runnable
{

    public final Account a;
    public final int[] b;
    public final List c;
    public final int d;
    public final com.google.android.finsky.by.a.f e;

    h(com.google.android.finsky.by.a.f p0, Account p1, int[] p2, List p3, int p4) {
        this.e = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
    }

    public final void run() {
        v1 = new Object[1];
        v1[0] = FinskyLog.a(this.a.name);
        FinskyLog.a("Loaded library for account: %s", v1);
        this.b[0] = this.b[0] + 1;
        if (this.b[0] == this.c.size()) {
            v1 = new Object[1];
            v1[0] = Integer.valueOf(this.c.size());
            FinskyLog.a("Finished loading %d libraries.", v1);
            this.e.i();
            this.e.k();
            this.e.k = this.d;
        }
    }

}
