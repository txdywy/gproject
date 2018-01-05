package com.google.android.finsky.ec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.utils.FinskyLog;

final class C2971d extends BroadcastReceiver {
    public final /* synthetic */ C2970c f15631a;

    C2971d(C2970c c2970c) {
        this.f15631a = c2970c;
    }

    public final void onReceive(Context context, Intent intent) {
        C1003o c1003o = this.f15631a;
        if (!c1003o.f15629i.isEmpty()) {
            String action = intent.getAction();
            String str = "onReceive: ";
            String valueOf = String.valueOf(action);
            FinskyLog.m21659a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            if (action.equals("com.google.android.finsky.UNMETERED_NETWORK_TIMEOUT")) {
                c1003o.m15393b();
                if (!c1003o.f15627g) {
                    c1003o.m15394c();
                }
            } else if (action.equals("com.google.android.finsky.wear.NOTIFICATION_DISMISSED")) {
                FinskyLog.m21659a("User dismissed the WiFi needed notification", new Object[0]);
                c1003o.f15627g = false;
                c1003o.f15629i.clear();
                C1473m.f7980a.bw().mo3484b(c1003o);
                c1003o.f15622b.unregisterReceiver(c1003o.f15630j);
                c1003o.m15393b();
            } else if (action.equals("com.google.android.finsky.wear.WIFI_NOTIFICATION_CLICKED")) {
                if (c1003o.f15626f == null) {
                    c1003o.m15389a();
                }
                c1003o.m15390a(((Long) C0955b.hm.m28964b()).longValue());
                Context context2 = c1003o.f15622b;
                Intent component = new Intent("android.intent.action.VIEW").setComponent(C2970c.f15621a);
                component.setAction("android.settings.WIFI_SETTINGS");
                context2.startActivity(component);
            }
        }
    }
}
