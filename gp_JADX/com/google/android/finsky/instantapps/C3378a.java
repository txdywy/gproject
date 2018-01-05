package com.google.android.finsky.instantapps;

import android.util.Log;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;

final class C3378a implements C1643x {
    public final /* synthetic */ String f17344a;

    C3378a(String str) {
        this.f17344a = str;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        if (((Status) c4980w).m23271a()) {
            Log.i("AppManagementService", String.format("Package: %s is not snoozed!", new Object[]{this.f17344a}));
            return;
        }
        String str = "AppManagementService";
        String str2 = "Unable to un-snooze package: ";
        String valueOf = String.valueOf(this.f17344a);
        Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
