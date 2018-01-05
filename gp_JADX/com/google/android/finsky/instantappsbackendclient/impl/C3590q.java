package com.google.android.finsky.instantappsbackendclient.impl;

import p000c.p001a.C0000a;
import p002a.C0002a;
import p002a.p003a.C0003b;
import p002a.p003a.C0004c;

public final class C3590q implements C0000a {
    public final C0000a f17893a;
    public final C0000a f17894b;
    public final C0000a f17895c;

    public C3590q(C0000a c0000a, C0000a c0000a2, C0000a c0000a3) {
        this.f17893a = c0000a;
        this.f17894b = c0000a2;
        this.f17895c = c0000a3;
    }

    public final /* synthetic */ Object mo1a() {
        Object obj;
        boolean booleanValue = ((Boolean) this.f17893a.mo1a()).booleanValue();
        C0002a b = C0003b.m4b(this.f17894b);
        C0002a b2 = C0003b.m4b(this.f17895c);
        if (booleanValue) {
            obj = (C3570t) b2.mo1a();
        } else {
            C3570t c3570t = (C3570t) b.mo1a();
        }
        return (C3570t) C0004c.m7a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
