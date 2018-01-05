package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class C4200c implements Runnable {
    public final Runnable f21227a;

    C4200c(Runnable runnable) {
        this.f21227a = runnable;
    }

    public final void run() {
        try {
            this.f21227a.run();
        } catch (Exception e) {
            FinskyLog.m21665c("Exception on SplitInstallService callback thread.", e);
        }
    }
}
