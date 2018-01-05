package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.utils.FinskyLog;

final class cv implements Runnable {
    public final /* synthetic */ cu f24565a;

    cv(cu cuVar) {
        this.f24565a = cuVar;
    }

    public final void run() {
        FinskyLog.m21665c("User manually dismissed verify apps bar", new Object[0]);
        this.f24565a.f24564a.finish();
    }
}
