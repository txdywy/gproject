package com.google.android.finsky.dp;

import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.deviceconfig.C2701n;

public final class C2866c {
    public final C2693e f15329a;
    public final C1461c f15330b;
    public final C2701n f15331c;
    public final C1556d f15332d;

    public C2866c(C2693e c2693e, C1461c c1461c, C2701n c2701n, C1556d c1556d) {
        this.f15329a = c2693e;
        this.f15330b = c1461c;
        this.f15331c = c2701n;
        this.f15332d = c1556d;
    }

    public final void m15108a(C1254c c1254c, boolean z, boolean z2, C1096g c1096g) {
        m15109a(c1254c, true, z, z2, c1096g, false);
    }

    final void m15109a(C1254c c1254c, boolean z, boolean z2, boolean z3, C1096g c1096g, boolean z4) {
        this.f15329a.m14562a(c1254c, new C2869f(this, c1254c, z, z2, z3, c1096g), z4, false);
    }
}
