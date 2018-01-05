package com.google.android.gms.common.api.internal;

import android.support.v4.p037h.C0305a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C5022m;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.tasks.C5588e;

public final class ck {
    public final C0305a f25808a = new C0305a();
    public final C5588e f25809b = new C5588e();
    public int f25810c;
    public boolean f25811d = false;

    public ck(Iterable iterable) {
        for (C5022m c5022m : iterable) {
            this.f25808a.put(c5022m.f25588d, null);
        }
        this.f25810c = this.f25808a.keySet().size();
    }

    public final void m23547a(ch chVar, ConnectionResult connectionResult) {
        this.f25808a.put(chVar, connectionResult);
        this.f25810c--;
        if (!connectionResult.m23264b()) {
            this.f25811d = true;
        }
        if (this.f25810c != 0) {
            return;
        }
        if (this.f25811d) {
            this.f25809b.m26582a(new zza(this.f25808a));
            return;
        }
        this.f25809b.m26583a(null);
    }
}
