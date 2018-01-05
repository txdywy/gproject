package com.google.android.finsky.billing.promptforfop;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.cr;
import android.widget.TextView;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.setup.cs;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.utils.FinskyLog;

protected class SetupWizardPromptForFopActivity extends com.google.android.finsky.billing.promptforfop.a
{

    public static final com.google.android.finsky.d.a o;
    public SetupWizardParams p;

    static {
        SetupWizardPromptForFopActivity.o = com.google.android.finsky.m.a.aR();
    }

    SetupWizardPromptForFopActivity() {
        com.google.android.finsky.billing.promptforfop.a();
    }

    public static Intent a(Account p0) {
        v0 = new Intent(com.google.android.finsky.m.a.b, SetupWizardPromptForFopActivity);
        SetupWizardPromptForFopActivity.a(p0, 0, v0);
        v0.putExtra("via_create_intent", 1);
        SetupWizardPromptForFopActivity.o.a(p0).a(v0);
        return v0;
    }

    protected final void a(int p0, int p1) {
        this.setResult(-1);
        this.finish();
    }

    protected final int f() {
        return 892;
    }

    public void finish() {
        super.finish();
        com.google.android.finsky.setup.cs.a(this, 0);
    }

    protected final boolean g() {
        return 1;
    }

    protected final int h() {
        return 2130969383;
    }

    protected final Fragment i() {
        v3 = new com.google.android.finsky.billing.promptforfop.h();
        v0 = com.google.android.finsky.billing.promptforfop.h.a(this.n, this.C);
        v0.putParcelable("setup_wizard_params", this.p);
        v3.f(v0);
        return v3;
    }

    protected final int j() {
        return 364;
    }

    protected final int k() {
        return 366;
    }

    protected final int l() {
        return 365;
    }

    public void onBackPressed() {
        super.onBackPressed();
        com.google.android.finsky.setup.cs.a(this, 1);
    }

    protected void onCreate(Bundle p0) {
        v1 = this.getIntent();
        if (!v1.getBooleanExtra("via_create_intent", 0) && "com.android.vending.billing.ADD_CREDIT_CARD".equals(v1.getAction())) {
            if (!v1.hasExtra("authAccount")) {
                FinskyLog.d("No account name passed.", new Object[0]);
                this.setResult(-1);
                this.finish();
                return;
            }
            v0 = v1.getStringExtra("authAccount");
            v2 = com.google.android.finsky.m.a.U().b(v0);
            if (v2 == 0) {
                v2 = new Object[1];
                v2[0] = v0;
                FinskyLog.d("Cannot find the account: %s", v2);
                this.setResult(-1);
                this.finish();
                return;
            }
            SetupWizardPromptForFopActivity.a(v2, 0, v1);
        }
        this.p = (SetupWizardParams)v1.getParcelableExtra("setup_wizard_params");
        if (this.p == 0)
            this.p = new SetupWizardParams(v1);
        if (this.p.c != 0)
            v0 = 2132018147;
        else
            v0 = 2132017751;
        this.setTheme(v0);
        super.onCreate(p0);
        ((TextView)this.findViewById(2131755114)).setText(2131953161);
        com.google.android.finsky.setup.cs.a(this, this.p, 0, com.google.android.finsky.setup.cs.a(this));
    }

}
