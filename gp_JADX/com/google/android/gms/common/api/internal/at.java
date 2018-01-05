package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

final class at implements Runnable {
    public /* synthetic */ ConnectionResult f25728a;
    public /* synthetic */ aq f25729b;

    at(aq aqVar, ConnectionResult connectionResult) {
        this.f25729b = aqVar;
        this.f25728a = connectionResult;
    }

    public final void run() {
        this.f25729b.mo2364a(this.f25728a);
    }
}
