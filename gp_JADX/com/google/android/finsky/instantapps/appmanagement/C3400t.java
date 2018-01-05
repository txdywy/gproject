package com.google.android.finsky.instantapps.appmanagement;

import p000c.p001a.C0000a;

public final class C3400t {
    public final C0000a f17411a;
    public final C0000a f17412b;

    C3400t(C0000a c0000a, C0000a c0000a2) {
        this.f17411a = (C0000a) C3400t.m16899a(c0000a, 1);
        this.f17412b = (C0000a) C3400t.m16899a(c0000a2, 2);
    }

    static Object m16899a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: " + i);
    }
}
