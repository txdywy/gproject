package com.google.android.finsky.ba.p129a;

import android.support.v4.p037h.C0313h;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1550a;
import com.google.android.finsky.p140i.C3216c;
import com.google.android.finsky.providers.C3947d;
import p002a.C0002a;

public final class C1551a implements C1550a {
    public C0002a f8317a;
    public C1461c f8318b;
    public boolean f8319c;
    public boolean f8320d;

    public C1551a() {
        ((C1345b) C3947d.m18649a(C1345b.class)).mo1711a(this);
        if (((Boolean) C0954a.ay.m5760a()).booleanValue()) {
            this.f8319c = true;
        }
    }

    public final boolean mo2288a() {
        return this.f8319c;
    }

    public final void mo2289b() {
        this.f8319c = false;
        if (!this.f8318b.dj().mo2294a(12644215) || !this.f8320d) {
            C0954a.ay.m5763a(Boolean.valueOf(false));
        }
    }

    public final void mo2287a(boolean z) {
        this.f8320d = true;
        C0954a.ay.m5763a(Boolean.valueOf(true));
        C0954a.az.m5763a(Boolean.valueOf(z));
        ((C3216c) this.f8317a.mo1a()).m16265a();
    }

    public final void mo2286a(C0313h c0313h, C0313h c0313h2) {
    }
}
