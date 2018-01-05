package com.google.android.gms.peerdownloadmanager.p289a;

import android.content.Context;

public final class C5346a {
    public final Context f27858a;

    public C5346a(Context context) {
        this.f27858a = context.getApplicationContext();
    }

    public final boolean m26070a() {
        return this.f27858a.getSharedPreferences("peerdownloadmanager_cleanup.prefs", 0).getBoolean("bt_on", false);
    }
}
