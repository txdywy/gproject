package com.google.android.finsky.activities;

import android.accounts.Account;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.DfeToc;

public final class cp extends dc {
    public final boolean f6636a = C1473m.f7980a.dj().mo2294a(12624692);

    public cp(DfeToc dfeToc, Account account) {
        super(dfeToc, account);
    }

    protected final void mo1318a(boolean z) {
        if (this.f6636a) {
            this.I.setVisibility(8);
        } else {
            super.mo1318a(z);
        }
    }

    protected final boolean t_() {
        return !this.f6636a && super.t_();
    }

    protected final boolean mo1325f() {
        return !this.f6636a && super.mo1325f();
    }
}
