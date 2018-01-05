package com.google.android.finsky.installer.p207a;

import com.google.android.finsky.utils.FinskyLog;

final class C3295n implements Runnable {
    public final /* synthetic */ C3289h f17050a;

    C3295n(C3289h c3289h) {
        this.f17050a = c3289h;
    }

    public final void run() {
        FinskyLog.m21659a("End of recovery holdoff", new Object[0]);
        if (!this.f17050a.m16523a("com.android.vending", "recovery_holdoff")) {
            FinskyLog.m21669e("Could not resume for holdoff recovery", new Object[0]);
        }
    }
}
