package com.google.android.finsky.instantapps.install;

import p000c.p001a.C0000a;

final class C3510l {
    public final C0000a f17740a;
    public final C0000a f17741b;

    C3510l(C0000a c0000a, C0000a c0000a2) {
        this.f17740a = (C0000a) C3510l.m17085a(c0000a, 1);
        this.f17741b = (C0000a) C3510l.m17085a(c0000a2, 2);
    }

    static Object m17085a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: " + i);
    }
}
