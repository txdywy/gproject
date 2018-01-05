package com.google.android.finsky.verifier.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;

final class cr extends BroadcastReceiver {
    public final /* synthetic */ cq f24563a;

    cr(cq cqVar) {
        this.f24563a = cqVar;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String str = "App restrictions broadcast received, action: ";
        String valueOf = String.valueOf(action);
        FinskyLog.m21659a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        if ("android.intent.action.APPLICATION_RESTRICTIONS_CHANGED".equals(action)) {
            this.f24563a.m22273a();
        }
    }
}
