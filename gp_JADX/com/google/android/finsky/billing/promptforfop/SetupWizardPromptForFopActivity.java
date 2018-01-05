package com.google.android.finsky.billing.promptforfop;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.setup.cs;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public class SetupWizardPromptForFopActivity extends C2071a {
    public static final C2471a f10616o = C1473m.f7980a.aR();
    public SetupWizardParams f10617p;

    public static Intent m10860a(Account account) {
        Intent intent = new Intent(C1473m.f7980a.f7981b, SetupWizardPromptForFopActivity.class);
        C2071a.m10837a(account, null, intent);
        intent.putExtra("via_create_intent", true);
        f10616o.m13178a(account).m13376a(intent);
        return intent;
    }

    protected final boolean mo2591g() {
        return true;
    }

    protected void onCreate(Bundle bundle) {
        int i;
        Intent intent = getIntent();
        if (!intent.getBooleanExtra("via_create_intent", false) && "com.android.vending.billing.ADD_CREDIT_CARD".equals(intent.getAction())) {
            if (intent.hasExtra("authAccount")) {
                Account b = C1473m.f7980a.mo2041U().mo1183b(intent.getStringExtra("authAccount"));
                if (b == null) {
                    FinskyLog.m21667d("Cannot find the account: %s", r0);
                    setResult(-1);
                    finish();
                    return;
                }
                C2071a.m10837a(b, null, intent);
            } else {
                FinskyLog.m21667d("No account name passed.", new Object[0]);
                setResult(-1);
                finish();
                return;
            }
        }
        this.f10617p = (SetupWizardParams) intent.getParcelableExtra("setup_wizard_params");
        if (this.f10617p == null) {
            this.f10617p = new SetupWizardParams(intent);
        }
        if (this.f10617p.f21126c) {
            i = C7582R.style.SetupWizardTheme.Light;
        } else {
            i = C7582R.style.SetupWizardTheme;
        }
        setTheme(i);
        super.onCreate(bundle);
        ((TextView) findViewById(C7582R.id.title)).setText(C7582R.string.setup_wizard_play_add_fop_title);
        cs.m19399a(this, this.f10617p, 0, cs.m19403a((Context) this));
    }

    protected final int mo2616h() {
        return C7582R.layout.setup_wizard_play_frame;
    }

    protected final Fragment mo1274i() {
        Account account = this.n;
        byte[] bArr = this.C;
        Parcelable parcelable = this.f10617p;
        Fragment c2077h = new C2077h();
        Bundle a = C2073b.m10869a(account, bArr);
        a.putParcelable("setup_wizard_params", parcelable);
        c2077h.m600f(a);
        return c2077h;
    }

    protected final int mo2368f() {
        return 892;
    }

    protected final void mo2615a(int i, int i2) {
        setResult(-1);
        finish();
    }

    protected final int mo2617j() {
        return 364;
    }

    protected final int mo2618k() {
        return 366;
    }

    protected final int mo2619l() {
        return 365;
    }

    public void onBackPressed() {
        super.onBackPressed();
        cs.m19401a((Activity) this, true);
    }

    public void finish() {
        super.finish();
        cs.m19401a((Activity) this, false);
    }
}
