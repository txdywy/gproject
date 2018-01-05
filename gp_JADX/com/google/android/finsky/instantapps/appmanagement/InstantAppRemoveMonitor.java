package com.google.android.finsky.instantapps.appmanagement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.os.C0327a;
import com.google.android.finsky.instantapps.p216c.C3410c;
import com.google.android.finsky.providers.C3947d;

public class InstantAppRemoveMonitor extends BroadcastReceiver {
    public C3403w f17347a;

    public void onReceive(Context context, Intent intent) {
        if (C0327a.m1722b()) {
            ((C3410c) C3947d.m18649a(C3410c.class)).mo3513a(this);
            String action = intent.getAction();
            Uri data = intent.getData();
            String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
            if ("android.intent.action.PACKAGE_REMOVED".equals(action) && schemeSpecificPart != null && this.f17347a.m16903a(schemeSpecificPart)) {
                this.f17347a.f17419a.edit().remove(schemeSpecificPart).apply();
            }
        }
    }
}
