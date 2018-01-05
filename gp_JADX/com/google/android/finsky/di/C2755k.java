package com.google.android.finsky.di;

import android.content.Context;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cm.C2296c;
import com.google.android.finsky.p108z.C4817d;
import p000c.p001a.C0000a;

public final class C2755k implements C0000a {
    public final C0000a f14994a;
    public final C0000a f14995b;
    public final C0000a f14996c;
    public final C0000a f14997d;
    public final C0000a f14998e;

    public C2755k(C0000a c0000a, C0000a c0000a2, C0000a c0000a3, C0000a c0000a4, C0000a c0000a5) {
        this.f14994a = c0000a;
        this.f14995b = c0000a2;
        this.f14996c = c0000a3;
        this.f14997d = c0000a4;
        this.f14998e = c0000a5;
    }

    public final /* synthetic */ Object mo1a() {
        Context context = (Context) this.f14994a.mo1a();
        C2296c c2296c = (C2296c) this.f14995b.mo1a();
        this.f14996c.mo1a();
        return new C2748d(context, c2296c, (C1461c) this.f14997d.mo1a(), (C4817d) this.f14998e.mo1a());
    }
}
