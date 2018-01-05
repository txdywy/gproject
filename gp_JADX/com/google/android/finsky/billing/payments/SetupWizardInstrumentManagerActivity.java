package com.google.android.finsky.billing.payments;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.finsky.providers.C1467c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.squareup.leakcanary.C7582R;

public class SetupWizardInstrumentManagerActivity extends C2040c {
    public C1462a f10509r;
    public C1467c f10510s;
    public SetupWizardParams f10511t;

    protected void onCreate(Bundle bundle) {
        int i;
        ((C1357b) C3947d.m18649a(C1357b.class)).mo1766a(this);
        this.f10511t = (SetupWizardParams) getIntent().getParcelableExtra("setupWizardParams");
        if (this.f10511t.f21126c) {
            i = C7582R.style.SetupWizardTheme.Light;
        } else {
            i = C7582R.style.SetupWizardTheme;
        }
        setTheme(i);
        super.onCreate(bundle);
        this.f10509r.mo2054a(this, this.f10511t);
        if (this.f10510s.dr()) {
            this.f10509r.mo2114b(this, this.f10511t);
        }
    }

    protected final int mo2368f() {
        return 1601;
    }

    protected final int mo2592h() {
        return C2043f.m10743a(this.f10511t);
    }

    public void finish() {
        super.finish();
        this.f10510s.mo2055a((Activity) this, true);
    }

    protected final boolean mo2591g() {
        return true;
    }
}
