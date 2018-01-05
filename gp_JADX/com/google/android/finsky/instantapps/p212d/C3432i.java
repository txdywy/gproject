package com.google.android.finsky.instantapps.p212d;

import android.util.Log;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;

final class C3432i implements C1643x {
    public final /* synthetic */ String f17568a;
    public final /* synthetic */ Long f17569b;

    C3432i(String str, Long l) {
        this.f17568a = str;
        this.f17569b = l;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        if (((Status) c4980w).m23271a()) {
            Log.i("GoToWebDelegate", String.format("Package: %s is snoozed until millis: %d", new Object[]{this.f17568a, this.f17569b}));
            return;
        }
        String str = "GoToWebDelegate";
        String str2 = "Unable to snooze package: ";
        String valueOf = String.valueOf(this.f17568a);
        Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
