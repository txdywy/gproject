package com.google.android.finsky.billing.promptforfop;

import android.accounts.Account;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;

public final class PromptForFopActivity extends com.google.android.finsky.billing.promptforfop.a implements com.google.android.finsky.billing.promptforfop.g
{

    PromptForFopActivity() {
        com.google.android.finsky.billing.promptforfop.a();
    }

    protected final void a(int p0, int p1) {
        this.H_().a().b(2131755313, com.google.android.finsky.billing.promptforfop.f.a(this.n.name, this.getString(p0), p1, this.E), "PromptForFopBaseActivity.fragment").c();
    }

    protected final int f() {
        return 1001;
    }

    protected final int h() {
        return 2130969309;
    }

    protected final Fragment i() {
        return com.google.android.finsky.billing.promptforfop.b.a(this.n, this.C, this.E);
    }

    protected final int j() {
        return 354;
    }

    protected final int k() {
        return 356;
    }

    protected final int l() {
        return 355;
    }

    public final void m() {
        this.setResult(-1);
        this.finish();
    }

}
