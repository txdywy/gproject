package com.google.android.finsky.hygiene;

import com.android.volley.VolleyError;
import com.google.android.finsky.deviceconfig.C1050j;
import com.google.android.finsky.utils.FinskyLog;

final class C3194e implements C1050j {
    C3194e() {
    }

    public final void mo1306a() {
        FinskyLog.m21659a("Account synced successfully.", new Object[0]);
    }

    public final void mo1307a(VolleyError volleyError) {
        FinskyLog.m21665c("Error when syncing account: %s.", volleyError);
    }
}
