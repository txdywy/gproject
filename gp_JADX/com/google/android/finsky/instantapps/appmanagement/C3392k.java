package com.google.android.finsky.instantapps.appmanagement;

import p000c.p001a.C0000a;

public final class C3392k {
    public final C0000a f17383a;
    public final C0000a f17384b;
    public final C0000a f17385c;
    public final C0000a f17386d;
    public final C0000a f17387e;
    public final C0000a f17388f;

    C3392k(C0000a c0000a, C0000a c0000a2, C0000a c0000a3, C0000a c0000a4, C0000a c0000a5, C0000a c0000a6) {
        this.f17383a = (C0000a) C3392k.m16892a(c0000a, 1);
        this.f17384b = (C0000a) C3392k.m16892a(c0000a2, 2);
        this.f17385c = (C0000a) C3392k.m16892a(c0000a3, 3);
        this.f17386d = (C0000a) C3392k.m16892a(c0000a4, 4);
        this.f17387e = (C0000a) C3392k.m16892a(c0000a5, 5);
        this.f17388f = (C0000a) C3392k.m16892a(c0000a6, 6);
    }

    static Object m16892a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: " + i);
    }
}
