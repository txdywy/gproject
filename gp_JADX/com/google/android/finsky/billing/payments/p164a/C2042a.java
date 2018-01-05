package com.google.android.finsky.billing.payments.p164a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.billing.payments.C2040c;
import com.google.android.finsky.billing.payments.C2041d;
import com.google.android.finsky.billing.payments.InstrumentManagerActivity;
import com.google.android.finsky.billing.payments.SetupWizardInstrumentManagerActivity;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C1467c;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.squareup.leakcanary.C7582R;

public final class C2042a implements C2041d {
    public final C1467c f10512a;

    public C2042a(C1467c c1467c) {
        this.f10512a = c1467c;
    }

    public final void mo2593a(Fragment fragment, String str, byte[] bArr, byte[] bArr2, SetupWizardParams setupWizardParams, C2495w c2495w, int i) {
        if (setupWizardParams == null) {
            fragment.startActivityForResult(InstrumentManagerActivity.m10735a(fragment.m603h(), str, bArr, bArr2, Bundle.EMPTY, c2495w, i), 6);
            return;
        }
        Activity h = fragment.m603h();
        Bundle bundle = new Bundle();
        if (h.getResources().getBoolean(C7582R.bool.setup_wizard_use_tablet_graphic) && this.f10512a.dr()) {
            bundle.putString("com.google.android.wallet.orchestration.TITLE_IMAGE_FIFE_URL", this.f10512a.mo2052a((Context) h));
        }
        Intent intent = new Intent(h, SetupWizardInstrumentManagerActivity.class);
        C2040c.m10729a(str, bArr, bArr2, bundle, intent, i);
        intent.putExtra("setupWizardParams", setupWizardParams);
        c2495w.m13380b(str).m13376a(intent);
        fragment.startActivityForResult(intent, 6);
        this.f10512a.mo2055a(h, false);
    }
}
