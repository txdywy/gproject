package com.google.android.finsky.by;

import android.accounts.Account;
import com.google.wireless.android.finsky.dfe.nano.fw;

public final class com.google.android.finsky.by.p implements com.android.volley.x
{

    public final com.google.android.finsky.by.l a;
    public final Account b;
    public final Runnable c;

    p(com.google.android.finsky.by.l p0, Account p1, Runnable p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final void b_(Object p0) {
        v4 = new w[1];
        v4[0] = ((com.google.wireless.android.finsky.dfe.nano.fw)p0).a;
        this.a.a(this.b, "revoke", this.c, v4);
    }

}
