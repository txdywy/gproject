package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.internal.C5110o;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.ax;
import java.util.Set;

final class au implements br, ax {
    public final C4949i f25730a;
    public final ch f25731b;
    public C5110o f25732c = null;
    public Set f25733d = null;
    public boolean f25734e = false;
    public final /* synthetic */ ao f25735f;

    public au(ao aoVar, C4949i c4949i, ch chVar) {
        this.f25735f = aoVar;
        this.f25730a = c4949i;
        this.f25731b = chVar;
    }

    final void m23446a() {
        if (this.f25734e && this.f25732c != null) {
            this.f25730a.m23035a(this.f25732c, this.f25733d);
        }
    }

    public final void mo4580a(ConnectionResult connectionResult) {
        this.f25735f.f25713q.post(new av(this, connectionResult));
    }

    public final void mo4581a(C5110o c5110o, Set set) {
        if (c5110o == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo4582b(new ConnectionResult(4));
            return;
        }
        this.f25732c = c5110o;
        this.f25733d = set;
        m23446a();
    }

    public final void mo4582b(ConnectionResult connectionResult) {
        aq aqVar = (aq) this.f25735f.f25709m.get(this.f25731b);
        am.m23737a(aqVar.f25725k.f25713q);
        aqVar.f25716b.mo4510e();
        aqVar.mo2364a(connectionResult);
    }
}
