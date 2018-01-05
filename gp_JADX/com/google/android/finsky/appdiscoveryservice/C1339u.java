package com.google.android.finsky.appdiscoveryservice;

import android.content.pm.PackageManager;
import p000c.p001a.C0000a;

public final class C1339u implements C0000a {
    public final C0000a f7842a;
    public final C0000a f7843b;

    public C1339u(C0000a c0000a, C0000a c0000a2) {
        this.f7842a = c0000a;
        this.f7843b = c0000a2;
    }

    public final /* synthetic */ Object mo1a() {
        this.f7842a.mo1a();
        return new C1338t((PackageManager) this.f7843b.mo1a());
    }
}
