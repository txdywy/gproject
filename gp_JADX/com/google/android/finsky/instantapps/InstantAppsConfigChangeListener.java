package com.google.android.finsky.instantapps;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.os.C0327a;
import com.google.android.finsky.instantapps.p216c.C3410c;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import com.google.android.finsky.providers.C3947d;

public class InstantAppsConfigChangeListener extends BroadcastReceiver {
    public C3600b f17316a;

    public void onReceive(Context context, Intent intent) {
        if (C0327a.m1722b()) {
            ((C3410c) C3947d.m18649a(C3410c.class)).mo3508a(this);
            for (InstantAppInfo a : this.f17316a.m17194a()) {
                this.f17316a.m17195a(a.m17188a(), true);
            }
        }
    }
}
