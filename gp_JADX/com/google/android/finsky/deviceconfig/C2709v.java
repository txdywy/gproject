package com.google.android.finsky.deviceconfig;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.CountDownLatch;

final class C2709v implements C1050j {
    public final /* synthetic */ CountDownLatch f14872a;

    C2709v(CountDownLatch countDownLatch) {
        this.f14872a = countDownLatch;
    }

    public final void mo1306a() {
        FinskyLog.m21659a("Device configuration updated successfully.", new Object[0]);
        this.f14872a.countDown();
    }

    public final void mo1307a(VolleyError volleyError) {
        FinskyLog.m21665c("Error when uploading device configuration: %s.", volleyError);
        this.f14872a.countDown();
    }
}
