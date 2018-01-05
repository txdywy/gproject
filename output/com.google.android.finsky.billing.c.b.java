package com.google.android.finsky.billing.c;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.finsky.billing.e.k;
import com.google.android.finsky.billing.e.l;
import com.google.android.finsky.billing.e.n;
import com.google.android.finsky.dialogbuilder.b.h;

public final class com.google.android.finsky.billing.c.b
{

    public final com.google.android.finsky.billing.e.k a;
    public final Account b;
    public final com.google.android.finsky.dialogbuilder.b.h c;
    public com.google.android.finsky.billing.c.g d;
    public Boolean e;
    public String f;
    public int g;
    public int h;
    public String i;
    public int j;
    public boolean k;
    public boolean l;

    b(com.google.android.finsky.billing.e.k p0, Account p1, com.google.android.finsky.dialogbuilder.b.h p2, boolean p3, Bundle p4) {
        this.l = p3;
        if (p4 != 0) {
            if (p4.containsKey("AcquireReauthModel.result")) {
                this.e = Boolean.valueOf(p4.getBoolean("AcquireReauthModel.result"));
                this.f = p4.getString("AcquireReauthModel.token");
                this.g = p4.getInt("AcquireReauthModel.retry");
                this.h = p4.getInt("AcquireReauthModel.status");
                this.k = p4.getBoolean("AcquireReauthModel.blank");
            }
            this.i = p4.getString("AcquireReauthModel.input");
            this.l = p4.getBoolean("AcquireReauthModel.prefetch");
        }
        this.b = p1;
        this.a = p0;
        this.c = p2;
    }

    final void a(com.google.android.finsky.billing.e.l p0, boolean p1) {
        if (p0.b != 0)
            v0 = 1;
        else
            v0 = 0;
        if (p0.c != 0 && p0.c.e != 0)
            v3 = 1;
        else
            v3 = 0;
        if (p1 != 0 && v3 != 0)
            this.j = 2;
        else if (v0 != 0)
            this.j = 1;
        else if (p0.c != 0)
            this.j = 2;
        else
            this.j = 0;
    }

    public final void a(Runnable p0, boolean p1) {
        v0 = this.a.a(this.b);
        if (v0 != 0) {
            this.a(v0, p1);
            p0.run();
        }
        else
            new com.google.android.finsky.billing.c.e(this, p1, p0).execute(new Void[0]);
    }

}
