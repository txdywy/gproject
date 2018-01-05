package com.google.android.finsky.activities;

import com.google.android.finsky.dx.C1054h;
import com.google.android.finsky.utils.FinskyLog;

final class C1059e implements Runnable {
    public final /* synthetic */ boolean[] f6689a;
    public final /* synthetic */ C1054h f6690b;
    public final /* synthetic */ boolean f6691c;
    public final /* synthetic */ C1036b f6692d;

    C1059e(C1036b c1036b, boolean[] zArr, C1054h c1054h, boolean z) {
        this.f6692d = c1036b;
        this.f6689a = zArr;
        this.f6690b = c1054h;
        this.f6691c = z;
    }

    public final void run() {
        if (this.f6689a[0]) {
            FinskyLog.m21665c("Timeout waiting for UserSettings, continuing start anyways.", new Object[0]);
            this.f6692d.f6317D.m15191b(this.f6690b);
            this.f6692d.m6067g(this.f6691c);
        }
    }
}
