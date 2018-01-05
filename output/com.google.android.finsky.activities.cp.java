package com.google.android.finsky.activities;

import android.accounts.Account;
import android.view.ViewGroup;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.m;

protected final class com.google.android.finsky.activities.cp extends com.google.android.finsky.activities.dc
{

    public final boolean a;

    cp(DfeToc p0, Account p1) {
        com.google.android.finsky.activities.dc(p0, p1);
        this.a = com.google.android.finsky.m.a.dj().a(12624692);
    }

    protected final void a(boolean p0) {
        if (this.a != 0)
            this.I.setVisibility(8);
        else
            super.a(p0);
    }

    protected final boolean f() {
        if (this.a == 0 && super.f())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final boolean t_() {
        if (this.a == 0 && super.t_())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
