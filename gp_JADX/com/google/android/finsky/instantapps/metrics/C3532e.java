package com.google.android.finsky.instantapps.metrics;

import p000c.p001a.C0000a;

public final class C3532e {
    public final C0000a f17792a;
    public final C0000a f17793b;

    public C3532e(C0000a c0000a, C0000a c0000a2) {
        this.f17792a = (C0000a) C3532e.m17115a(c0000a, 1);
        this.f17793b = (C0000a) C3532e.m17115a(c0000a2, 2);
    }

    public static Object m17115a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: " + i);
    }
}
