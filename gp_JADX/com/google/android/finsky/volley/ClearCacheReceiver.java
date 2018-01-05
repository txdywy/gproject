package com.google.android.finsky.volley;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.p109w.C0989a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;

public class ClearCacheReceiver extends C0989a {
    public C4774e f24725a;

    public final void mo1179a() {
        ((C1450f) C3947d.m18649a(C1450f.class)).mo1997a(this);
    }

    public final void mo1180a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.LOCALE_CHANGED".equals(action) || "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED".equals(action)) {
            FinskyLog.m21659a("Received %s. Clearing cache and exiting.", intent.getAction());
            this.f24725a.mo4380a(C4777b.f24739a, "locale_changed");
        }
    }
}
