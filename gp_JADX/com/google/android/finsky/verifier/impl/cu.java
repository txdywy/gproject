package com.google.android.finsky.verifier.impl;

import android.view.View;
import android.view.View.OnClickListener;

final class cu implements OnClickListener {
    public final /* synthetic */ VerifyInstallSnackbarActivity f24564a;

    cu(VerifyInstallSnackbarActivity verifyInstallSnackbarActivity) {
        this.f24564a = verifyInstallSnackbarActivity;
    }

    public final void onClick(View view) {
        this.f24564a.f24342t.postDelayed(new cv(this), 15000);
    }
}
