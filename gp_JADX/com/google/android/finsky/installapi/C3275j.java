package com.google.android.finsky.installapi;

import android.os.Bundle;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;

final class C3275j implements C0978f {
    C3275j() {
    }

    public final void mo1172a(C4809e c4809e) {
        try {
            Bundle bundle = (Bundle) c4809e.get();
            if (bundle.getInt("status_code") != 0) {
                bundle = bundle.getBundle("error");
                FinskyLog.m21665c("Error uninstalling split: %s", bundle.getString("reason"));
            }
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Failed to get ListenableFuture for uninstallSplit.", new Object[0]);
        }
    }
}
