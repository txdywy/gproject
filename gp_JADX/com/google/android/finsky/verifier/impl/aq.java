package com.google.android.finsky.verifier.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.os.UserHandle;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.C4724b;
import java.util.Collection;

final class aq extends C4724b {
    public final /* synthetic */ SingleUserSettingsService f24396a;

    aq(SingleUserSettingsService singleUserSettingsService) {
        this.f24396a = singleUserSettingsService;
    }

    public final boolean mo4332a(String str) {
        av a = av.m22086a(this.f24396a);
        if (!a.f24410e) {
            Collection a2 = a.m22089a(true);
            if (!a.m22088a("synced_users_key").containsAll(a2)) {
                FinskyLog.m21665c("Not all users are synced, requesting all users send setting to primary phonesky", new Object[0]);
                Context context = a.f24409d;
                for (UserHandle userHandle : a.f24407a.f15463a.mo3194c()) {
                    Intent intent = new Intent("com.google.android.finsky.action.REQUEST_UPDATE_SETTINGS_ACTION");
                    intent.setComponent(new ComponentName(context, SingleUserSettingsReceiver.class));
                    context.sendBroadcastAsUser(intent, userHandle);
                }
                long uptimeMillis = SystemClock.uptimeMillis() + (((long) ((Integer) C0955b.ct.m28964b()).intValue()) * 1000);
                while (uptimeMillis > SystemClock.uptimeMillis()) {
                    if (a.m22088a("synced_users_key").containsAll(a2)) {
                        FinskyLog.m21659a("All user settings are updated", new Object[0]);
                    }
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        FinskyLog.m21665c("Should not happen", new Object[0]);
                    }
                }
            }
        }
        if (a.m22088a(str).isEmpty()) {
            return false;
        }
        return true;
    }

    public final long mo4333b(String str) {
        av a = av.m22086a(this.f24396a);
        a.m22090a();
        return a.f24408c.getLong(str, 0);
    }
}
