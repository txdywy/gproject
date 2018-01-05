package com.google.android.finsky.billing.payments.a;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.billing.payments.InstrumentManagerActivity;
import com.google.android.finsky.billing.payments.SetupWizardInstrumentManagerActivity;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.c;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;

public final class com.google.android.finsky.billing.payments.a.a implements com.google.android.finsky.billing.payments.d
{

    public final com.google.android.finsky.providers.c a;

    a(com.google.android.finsky.providers.c p0) {
        this.a = p0;
    }

    public final void a(Fragment p0, String p1, byte[] p2, byte[] p3, SetupWizardParams p4, com.google.android.finsky.d.w p5, int p6) {
        if (p4 == 0)
            p0.startActivityForResult(InstrumentManagerActivity.a(p0.h(), p1, p2, p3, Bundle.EMPTY, p5, p6), 6);
        else {
            v6 = p0.h();
            v3 = new Bundle();
            if (v6.getResources().getBoolean(2131492890) && this.a.dr())
                v3.putString("com.google.android.wallet.orchestration.TITLE_IMAGE_FIFE_URL", this.a.a(v6));
            v4 = new Intent(v6, SetupWizardInstrumentManagerActivity);
            SetupWizardInstrumentManagerActivity.a(p1, p2, p3, v3, v4, p6);
            v4.putExtra("setupWizardParams", p4);
            p5.b(p1).a(v4);
            p0.startActivityForResult(v4, 6);
            this.a.a(v6, 0);
        }
    }

}
