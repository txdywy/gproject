package com.google.android.gms.common.api;

import android.support.v4.p037h.C0305a;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ch;
import com.google.android.gms.common.internal.am;
import java.util.ArrayList;

public final class zza extends Exception {
    public final C0305a f25933a;

    public zza(C0305a c0305a) {
        this.f25933a = c0305a;
    }

    public final ConnectionResult m23654a(C5022m c5022m) {
        ch chVar = c5022m.f25588d;
        am.m23743b(this.f25933a.get(chVar) != null, "The given API was not part of the availability request.");
        return (ConnectionResult) this.f25933a.get(chVar);
    }

    public final String getMessage() {
        Iterable arrayList = new ArrayList();
        Object obj = 1;
        for (ch chVar : this.f25933a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.f25933a.get(chVar);
            if (connectionResult.m23264b()) {
                obj = null;
            }
            String str = chVar.f25798c.f25636c;
            String valueOf = String.valueOf(connectionResult);
            arrayList.add(new StringBuilder((String.valueOf(str).length() + 2) + String.valueOf(valueOf).length()).append(str).append(": ").append(valueOf).toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (obj != null) {
            stringBuilder.append("None of the queried APIs are available. ");
        } else {
            stringBuilder.append("Some of the queried APIs are unavailable. ");
        }
        stringBuilder.append(TextUtils.join("; ", arrayList));
        return stringBuilder.toString();
    }
}
