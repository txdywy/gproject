package com.google.android.finsky.verifier.impl;

import android.app.Activity;
import com.google.android.finsky.utils.bb;

class VerifyAppsInstallTask$6 extends ActivityListener {
    public final /* synthetic */ bx f24336a;

    VerifyAppsInstallTask$6(bx bxVar) {
        this.f24336a = bxVar;
    }

    public final /* synthetic */ void mo4338b(Activity activity) {
        PackageWarningDialog packageWarningDialog = (PackageWarningDialog) activity;
        bb.m21791a();
        this.f24336a.f24487A = null;
        if (packageWarningDialog.isFinishing() && !this.f24336a.m22070m()) {
            this.f24336a.m22069l();
        }
    }

    public final /* synthetic */ void mo4337a(Activity activity) {
        PackageWarningDialog packageWarningDialog = (PackageWarningDialog) activity;
        bb.m21791a();
        synchronized (this.f24336a) {
            if (this.f24336a.f24514w && this.f24336a.f24517z == 1) {
                packageWarningDialog.finish();
            } else {
                this.f24336a.f24487A = packageWarningDialog;
            }
        }
    }
}
