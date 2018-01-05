package com.google.android.finsky.instantapps;

import android.util.Log;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;

final class C3496g implements C1643x {
    public final /* synthetic */ String f17699a;
    public final /* synthetic */ Long f17700b;

    C3496g(String str, Long l) {
        this.f17699a = str;
        this.f17700b = l;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        if (((Status) c4980w).m23271a()) {
            Log.i("EphemeralInstallerAct", String.format("Package: %s is snoozed until millis: %d", new Object[]{this.f17699a, this.f17700b}));
            return;
        }
        String str = "EphemeralInstallerAct";
        String str2 = "Unable to snooze package: ";
        String valueOf = String.valueOf(this.f17699a);
        Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
