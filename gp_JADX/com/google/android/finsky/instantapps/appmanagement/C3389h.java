package com.google.android.finsky.instantapps.appmanagement;

import p000c.p001a.C0000a;

public final class C3389h {
    public final C0000a f17372a;
    public final C0000a f17373b;

    C3389h(C0000a c0000a, C0000a c0000a2) {
        this.f17372a = (C0000a) C3389h.m16889a(c0000a, 1);
        this.f17373b = (C0000a) C3389h.m16889a(c0000a2, 2);
    }

    static Object m16889a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: " + i);
    }
}
