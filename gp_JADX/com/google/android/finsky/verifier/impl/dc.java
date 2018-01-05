package com.google.android.finsky.verifier.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;

final class dc extends BroadcastReceiver {
    public final /* synthetic */ VerifyInstallSnackbarActivity f24579a;

    dc(VerifyInstallSnackbarActivity verifyInstallSnackbarActivity) {
        this.f24579a = verifyInstallSnackbarActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        int i = -1;
        switch (action.hashCode()) {
            case -974778492:
                if (action.equals("verify_install_dialog_shown")) {
                    i = 0;
                    break;
                }
                break;
            case 59446883:
                if (action.equals("verify_install_complete")) {
                    i = 1;
                    break;
                }
                break;
            case 1438697911:
                if (action.equals("verify_install_safe")) {
                    i = 2;
                    break;
                }
                break;
        }
        switch (i) {
            case 0:
                this.f24579a.f24341s.m494a(3);
                return;
            case 1:
                this.f24579a.m22022k();
                return;
            case 2:
                this.f24579a.f24342t.postDelayed(new dd(this), 1000);
                return;
            default:
                action = "Unknown snackbar intent: ";
                String valueOf = String.valueOf(intent.getAction());
                if (valueOf.length() != 0) {
                    valueOf = action.concat(valueOf);
                } else {
                    valueOf = new String(action);
                }
                FinskyLog.m21669e(valueOf, new Object[0]);
                return;
        }
    }
}
