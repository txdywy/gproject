package com.google.android.finsky.deviceconfig;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C2692b implements C1050j {
    public final /* synthetic */ C2691a f14829a;

    C2692b(C2691a c2691a) {
        this.f14829a = c2691a;
    }

    public final void mo1306a() {
        FinskyLog.m21659a("Device configuration updated successfully.", new Object[0]);
        this.f14829a.f14827a.countDown();
    }

    public final void mo1307a(VolleyError volleyError) {
        FinskyLog.m21665c("Error when uploading device configuration: %s.", volleyError);
        this.f14829a.f14827a.countDown();
    }
}
