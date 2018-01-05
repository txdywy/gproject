package com.google.android.finsky.billing.payments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.cr;
import com.google.android.finsky.providers.c;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;

protected class SetupWizardInstrumentManagerActivity extends com.google.android.finsky.billing.payments.c
{

    public com.google.android.finsky.billing.payments.a r;
    public com.google.android.finsky.providers.c s;
    public SetupWizardParams t;

    SetupWizardInstrumentManagerActivity() {
        com.google.android.finsky.billing.payments.c();
    }

    protected final int f() {
        return 1601;
    }

    public void finish() {
        super.finish();
        this.s.a(this, 1);
    }

    protected final boolean g() {
        return 1;
    }

    protected final int h() {
        return com.google.android.finsky.billing.payments.f.a(this.t);
    }

    protected void onCreate(Bundle p0) {
        ((com.google.android.finsky.billing.payments.b)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.payments.b)).a(this);
        this.t = (SetupWizardParams)this.getIntent().getParcelableExtra("setupWizardParams");
        if (this.t.c != 0)
            v0 = 2132018147;
        else
            v0 = 2132017751;
        this.setTheme(v0);
        super.onCreate(p0);
        this.r.a(this, this.t);
        if (this.s.dr())
            this.r.b(this, this.t);
    }

}
