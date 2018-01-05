package com.google.android.finsky.notification.impl;

import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bu.C2186a;
import com.google.android.finsky.notification.C3667j;
import com.google.android.finsky.notification.C3784h;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.a.a.a.a.ay;

public final class C3791f implements C3667j {
    public final C1461c f19064a;
    public final C2186a f19065b;
    public C3784h f19066c;
    public C1463g f19067d;

    public C3791f(C2186a c2186a, C1461c c1461c) {
        ((C1403o) C3947d.m18649a(C1403o.class)).mo1869a(this);
        this.f19064a = c1461c;
        this.f19065b = c2186a;
    }

    public final boolean m18142a() {
        return this.f19064a.dj().mo2294a(12641193);
    }

    public final void mo3577a(int i) {
        if (m18142a() && this.f19065b.mo2776a(i)) {
            this.f19067d.dc().m13319a(new C2474c(2501).m13221a(new ay().a(true).a(i)).f13342a, null);
        }
    }
}
