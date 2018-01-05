package com.google.android.finsky.verifier.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.utils.FinskyLog;

public final class cq {
    public static cq f24557a;
    public Context f24558b;
    public RestrictionsManager f24559c;
    public IntentFilter f24560d;
    public boolean f24561e = false;
    public BroadcastReceiver f24562f = new cr(this);

    static synchronized cq m22272a(Context context) {
        cq cqVar;
        synchronized (cq.class) {
            if (f24557a == null) {
                f24557a = new cq(context.getApplicationContext());
            }
            cqVar = f24557a;
        }
        return cqVar;
    }

    private cq(Context context) {
        this.f24558b = context;
        this.f24559c = (RestrictionsManager) context.getSystemService("restrictions");
        this.f24560d = new IntentFilter("android.intent.action.APPLICATION_RESTRICTIONS_CHANGED");
    }

    final void m22273a() {
        boolean z = this.f24559c.getApplicationRestrictions().getBoolean("verify_apps:device_wide_unknown_source_block", false);
        FinskyLog.m21659a("Device wide unknown source restriction is changed.", new Object[0]);
        C0954a.bx.m5763a(Boolean.valueOf(z));
        SingleUserSettingsReceiver.m22016a(this.f24558b, "device_wide_unlock_source_block", z);
    }
}
