package com.google.android.finsky.instantappsbackendclient.impl;

import p000c.p001a.C0000a;
import p002a.C0002a;
import p002a.p003a.C0003b;
import p002a.p003a.C0004c;

public final class C3587n implements C0000a {
    public final C0000a f17888a;
    public final C0000a f17889b;
    public final C0000a f17890c;

    public C3587n(C0000a c0000a, C0000a c0000a2, C0000a c0000a3) {
        this.f17888a = c0000a;
        this.f17889b = c0000a2;
        this.f17890c = c0000a3;
    }

    public final /* synthetic */ Object mo1a() {
        Object obj;
        C0002a b = C0003b.m4b(this.f17888a);
        C0002a b2 = C0003b.m4b(this.f17889b);
        if (((Boolean) this.f17890c.mo1a()).booleanValue()) {
            obj = (C3570t) b2.mo1a();
        } else {
            C3570t c3570t = (C3570t) b.mo1a();
        }
        return (C3570t) C0004c.m7a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
