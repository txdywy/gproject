package com.google.android.finsky.verifier.impl;

import android.app.Activity;
import android.content.Context;
import com.google.android.finsky.utils.bb;

class VerifyPerSourceInstallationConsentInstallTask$1 extends ActivityListener {
    public final /* synthetic */ ec f24348a;

    VerifyPerSourceInstallationConsentInstallTask$1(ec ecVar) {
        this.f24348a = ecVar;
    }

    public final /* synthetic */ void mo4338b(Activity activity) {
        PerSourceInstallationConsentWarningDialog perSourceInstallationConsentWarningDialog = (PerSourceInstallationConsentWarningDialog) activity;
        bb.m21791a();
        if (perSourceInstallationConsentWarningDialog.isFinishing()) {
            this.f24348a.f24673h = perSourceInstallationConsentWarningDialog.f24331s;
            if (perSourceInstallationConsentWarningDialog.f24331s == 1) {
                ec ecVar = this.f24348a;
                int i = this.f24348a.f24671f;
                Context context = ecVar.f24666a;
                if (aj.m22055b(context, i)) {
                    context.getSharedPreferences("per_source_installation_consent_data_store", 0).edit().putBoolean(Integer.toString(i), true).apply();
                } else {
                    aj.m22054a(context, i);
                }
            }
            this.f24348a.m22069l();
        }
    }

    public final /* synthetic */ void mo4337a(Activity activity) {
        PerSourceInstallationConsentWarningDialog perSourceInstallationConsentWarningDialog = (PerSourceInstallationConsentWarningDialog) activity;
        bb.m21791a();
        if (this.f24348a.m22070m()) {
            perSourceInstallationConsentWarningDialog.finish();
        }
    }
}
