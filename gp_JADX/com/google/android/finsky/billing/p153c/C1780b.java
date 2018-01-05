package com.google.android.finsky.billing.p153c;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.finsky.billing.p131e.C1822k;
import com.google.android.finsky.billing.p131e.C1823l;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;

public final class C1780b {
    public final C1822k f9216a;
    public final Account f9217b;
    public final C2792h f9218c;
    public C1680g f9219d;
    public Boolean f9220e;
    public String f9221f;
    public int f9222g;
    public int f9223h;
    public String f9224i;
    public int f9225j;
    public boolean f9226k;
    public boolean f9227l;

    public C1780b(C1822k c1822k, Account account, C2792h c2792h, boolean z, Bundle bundle) {
        this.f9227l = z;
        if (bundle != null) {
            if (bundle.containsKey("AcquireReauthModel.result")) {
                this.f9220e = Boolean.valueOf(bundle.getBoolean("AcquireReauthModel.result"));
                this.f9221f = bundle.getString("AcquireReauthModel.token");
                this.f9222g = bundle.getInt("AcquireReauthModel.retry");
                this.f9223h = bundle.getInt("AcquireReauthModel.status");
                this.f9226k = bundle.getBoolean("AcquireReauthModel.blank");
            }
            this.f9224i = bundle.getString("AcquireReauthModel.input");
            this.f9227l = bundle.getBoolean("AcquireReauthModel.prefetch");
        }
        this.f9217b = account;
        this.f9216a = c1822k;
        this.f9218c = c2792h;
    }

    public final void m9732a(Runnable runnable, boolean z) {
        C1823l a = this.f9216a.m9843a(this.f9217b);
        if (a != null) {
            m9731a(a, z);
            runnable.run();
            return;
        }
        new C1783e(this, z, runnable).execute(new Void[0]);
    }

    final void m9731a(C1823l c1823l, boolean z) {
        int i = c1823l.f9402b != null ? 1 : 0;
        int i2;
        if (c1823l.f9403c == null || !c1823l.f9403c.f9409e) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (z && r3 != 0) {
            this.f9225j = 2;
        } else if (i != 0) {
            this.f9225j = 1;
        } else if (c1823l.f9403c != null) {
            this.f9225j = 2;
        } else {
            this.f9225j = 0;
        }
    }
}
