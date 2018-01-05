package com.google.android.finsky.verifier.impl;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class cx implements OnAttachStateChangeListener {
    public final /* synthetic */ VerifyInstallSnackbarActivity f24567a;

    cx(VerifyInstallSnackbarActivity verifyInstallSnackbarActivity) {
        this.f24567a = verifyInstallSnackbarActivity;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f24567a.finish();
    }
}
