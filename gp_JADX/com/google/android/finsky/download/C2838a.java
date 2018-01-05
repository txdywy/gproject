package com.google.android.finsky.download;

import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.common.C1789d;
import com.google.android.finsky.ce.C2266a;

public final class C2838a {
    public final C2266a f15249a;
    public final C1506e f15250b;
    public final C1461c f15251c;

    public C2838a(C2266a c2266a, C1506e c1506e, C1461c c1461c) {
        this.f15249a = c2266a;
        this.f15250b = c1506e;
        this.f15251c = c1461c;
    }

    public final boolean m14997a() {
        return this.f15249a.m11722d() && this.f15251c.dj().mo2294a(12604154);
    }

    public final int m14996a(boolean z) {
        if (z && !((Boolean) C1789d.f9316c.m5760a()).booleanValue()) {
            return 2;
        }
        if (C1789d.f9315b.m5764b()) {
            return ((Integer) C1789d.f9315b.m5760a()).intValue();
        }
        if (this.f15251c.dj().mo2294a(12604154) || this.f15250b.m8839b()) {
            return 2;
        }
        return ((Integer) C1789d.f9315b.m5760a()).intValue();
    }
}
