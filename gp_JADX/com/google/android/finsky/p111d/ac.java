package com.google.android.finsky.p111d;

import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p140i.C3212a;
import p000c.p001a.C0000a;

public final class ac implements C0000a {
    public final C0000a f13322a;
    public final C0000a f13323b;
    public final C0000a f13324c;
    public final C0000a f13325d;
    public final C0000a f13326e;
    public final C0000a f13327f;

    public ac(C0000a c0000a, C0000a c0000a2, C0000a c0000a3, C0000a c0000a4, C0000a c0000a5, C0000a c0000a6) {
        this.f13322a = c0000a;
        this.f13323b = c0000a2;
        this.f13324c = c0000a3;
        this.f13325d = c0000a4;
        this.f13326e = c0000a5;
        this.f13327f = c0000a6;
    }

    public final /* synthetic */ Object mo1a() {
        C1461c c1461c = (C1461c) this.f13322a.mo1a();
        this.f13323b.mo1a();
        return new ab(c1461c, (C1500a) this.f13324c.mo1a(), (C1503a) this.f13325d.mo1a(), ((Integer) this.f13326e.mo1a()).intValue(), (C3212a) this.f13327f.mo1a());
    }
}
