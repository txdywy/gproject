package com.google.android.finsky.ds;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.utils.FinskyLog;
import p002a.C0002a;

public final class C2884a extends BroadcastReceiver {
    public final Context f15377a;
    public final C0988c f15378b;
    public final C0002a f15379c;

    public C2884a(Context context, C0988c c0988c, C0002a c0002a) {
        this.f15377a = context;
        this.f15378b = c0988c;
        this.f15379c = c0002a;
    }

    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("account_name");
        Object cZ = this.f15378b.cZ();
        if (TextUtils.isEmpty(cZ)) {
            FinskyLog.m21659a("Ignoring Unicorn broadcast because no current account", new Object[0]);
        } else if (cZ.equals(stringExtra)) {
            Bundle bundleExtra = intent.getBundleExtra("disabled_apps_by_state");
            if (bundleExtra != null) {
                for (String stringExtra2 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(stringExtra2);
                    if ("enabled".equals(string)) {
                        FinskyLog.m21659a("Removing Unicorn %s", stringExtra2);
                        ((C2885b) this.f15379c.mo1a()).m15132e(stringExtra2);
                    } else {
                        FinskyLog.m21659a("Adding Unicorn %s reason %s", stringExtra2, string);
                        if ("disabled_by_parent".equals(string) || "disabled_permanently".equals(string) || "disabled_until_updated".equals(string)) {
                            ((C2885b) this.f15379c.mo1a()).m15128a(stringExtra2, string);
                        }
                    }
                }
            }
        } else {
            FinskyLog.m21659a("Ignoring Unicorn broadcast for account %s", stringExtra2);
        }
    }
}
