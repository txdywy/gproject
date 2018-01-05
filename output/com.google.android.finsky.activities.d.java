package com.google.android.finsky.activities;

import com.google.android.finsky.accounts.a;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.activities.d implements com.google.android.finsky.dx.h
{

    public final boolean[] a;
    public final boolean b;
    public final com.google.android.finsky.activities.b c;

    d(com.google.android.finsky.activities.b p0, boolean[] p1, boolean p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void P_() {
        this.a[0] = 0;
        this.c.D.b(this);
        if (this.c.E.a(this.c.q()))
            this.c.g(this.b);
        else {
            if (this.b != 0)
                v0 = this.c.getIntent();
            else
                v0 = 0;
            this.c.a(0, v0, 0, "account_switched");
        }
    }

    public final void ce_() {
        this.a[0] = 0;
        this.c.D.b(this);
        FinskyLog.c("User settings failed to load, continuing start anyways.", new Object[0]);
        this.c.g(this.b);
    }

}
