package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.updatechecker.impl.ReschedulerUsingAlarmManager.CheckWifiAndAutoUpdate;
import com.google.android.finsky.utils.FinskyLog;

final class C4648g implements Runnable {
    public final /* synthetic */ C2495w f23947a;
    public final /* synthetic */ CheckWifiAndAutoUpdate f23948b;

    C4648g(CheckWifiAndAutoUpdate checkWifiAndAutoUpdate, C2495w c2495w) {
        this.f23948b = checkWifiAndAutoUpdate;
        this.f23947a = c2495w;
    }

    public final void run() {
        if (this.f23948b.f23853b.f23994e.m9312b()) {
            ReschedulerUsingAlarmManager.m21597a(this.f23948b.getApplicationContext(), this.f23947a);
            this.f23948b.stopSelf();
            return;
        }
        FinskyLog.m21659a("Checking wifi: enabled, proceeding with auto-update.", new Object[0]);
        this.f23948b.f23853b.m21646a(this.f23948b, this.f23947a);
    }
}
