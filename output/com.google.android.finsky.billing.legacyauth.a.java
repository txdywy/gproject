package com.google.android.finsky.billing.legacyauth;

import android.accounts.Account;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.c.a.a;
import android.text.TextUtils;
import com.google.android.finsky.billing.e.e;
import com.google.android.finsky.billing.e.k;
import com.google.android.finsky.billing.e.l;
import com.google.android.finsky.billing.e.m;
import com.google.android.finsky.billing.e.n;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.bb;

public final class com.google.android.finsky.billing.legacyauth.a
{

    public final Account a;
    public final com.google.android.finsky.billing.e.k b;
    public final com.google.android.finsky.billing.e.e c;
    public Context d;
    public AsyncTask e;

    a(Account p0, com.google.android.finsky.d.w p1) {
        ((com.google.android.finsky.billing.legacyauth.j)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.legacyauth.j)).a(this);
        this.a = p0;
        this.c = new com.google.android.finsky.billing.e.e(android.support.v4.c.a.a.a(this.d));
        this.b = new com.google.android.finsky.billing.e.k(this.d, p1);
    }

    public final void a() {
        if (this.e != 0) {
            this.e.cancel(1);
            this.e = 0;
        }
    }

    final void a(com.google.android.finsky.billing.legacyauth.i p0, com.google.android.finsky.billing.e.l p1, boolean p2) {
        if (p2 != 0 || p1.a == 0 && p1.c != 0 && p1.b == 0)
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0 && p1.c != 0)
            v2 = p1.c.a;
        else
            v2 = 0;
        if (v1 != 0 && p1.c != 0)
            v5 = p1.c.b;
        else
            v5 = 0;
        if (v1 != 0 && p1.c != 0)
            v3 = p1.c.c;
        else
            v3 = 0;
        if (p1.b != 0)
            v7 = p1.b.a;
        else
            v7 = 0;
        if (v1 != 0 && p1.c != 0)
            v4 = p1.c.d;
        else
            v4 = 0;
        this.e = 0;
        if (!TextUtils.isEmpty(v5))
            v2 = v5;
        p0.a(new AuthState(v1, v2, v3, v4, this.c.a(this.a.name), 0, v7, this.a.name));
    }

    public final void a(com.google.android.finsky.billing.legacyauth.i p0, boolean p1) {
        v0 = this.b.a(this.a);
        if (v0 != 0)
            this.a(p0, v0, p1);
        else {
            this.e = new com.google.android.finsky.billing.legacyauth.c(this, p0, p1);
            com.google.android.finsky.utils.bb.a(this.e, new Void[0]);
            p0.g_();
        }
    }

    public final void a(com.google.android.finsky.billing.legacyauth.l p0) {
        com.google.android.finsky.utils.bb.a(new com.google.android.finsky.billing.legacyauth.d(this, p0), new Void[0]);
    }

}
