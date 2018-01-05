package com.google.android.finsky.activities;

import com.google.android.finsky.utils.FinskyLog;

final class C1094k implements Runnable {
    public final /* synthetic */ boolean f6958a;
    public final /* synthetic */ C1036b f6959b;

    C1094k(C1036b c1036b, boolean z) {
        this.f6959b = c1036b;
        this.f6958a = z;
    }

    public final void run() {
        if (this.f6959b.f6327x) {
            FinskyLog.m21659a("onSaveInstanceState() called, not firing onReady().", new Object[0]);
            this.f6959b.f6328y = true;
            this.f6959b.f6315B = this.f6958a;
            return;
        }
        this.f6959b.mo1249b(this.f6958a);
    }
}
