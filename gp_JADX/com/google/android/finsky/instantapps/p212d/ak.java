package com.google.android.finsky.instantapps.p212d;

import p000c.p001a.C0000a;

public final class ak {
    public final C0000a f17534a;
    public final C0000a f17535b;
    public final C0000a f17536c;
    public final C0000a f17537d;
    public final C0000a f17538e;

    public ak(C0000a c0000a, C0000a c0000a2, C0000a c0000a3, C0000a c0000a4, C0000a c0000a5) {
        this.f17534a = (C0000a) ak.m16965a(c0000a, 1);
        this.f17535b = (C0000a) ak.m16965a(c0000a2, 2);
        this.f17536c = (C0000a) ak.m16965a(c0000a3, 3);
        this.f17537d = (C0000a) ak.m16965a(c0000a4, 4);
        this.f17538e = (C0000a) ak.m16965a(c0000a5, 5);
    }

    static Object m16965a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: " + i);
    }
}
