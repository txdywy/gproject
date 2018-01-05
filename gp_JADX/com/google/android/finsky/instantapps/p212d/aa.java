package com.google.android.finsky.instantapps.p212d;

import p000c.p001a.C0000a;

public final class aa {
    public final C0000a f17502a;
    public final C0000a f17503b;
    public final C0000a f17504c;
    public final C0000a f17505d;
    public final C0000a f17506e;
    public final C0000a f17507f;

    public aa(C0000a c0000a, C0000a c0000a2, C0000a c0000a3, C0000a c0000a4, C0000a c0000a5, C0000a c0000a6) {
        this.f17502a = (C0000a) aa.m16948a(c0000a, 1);
        this.f17503b = (C0000a) aa.m16948a(c0000a2, 2);
        this.f17504c = (C0000a) aa.m16948a(c0000a3, 3);
        this.f17505d = (C0000a) aa.m16948a(c0000a4, 4);
        this.f17506e = (C0000a) aa.m16948a(c0000a5, 5);
        this.f17507f = (C0000a) aa.m16948a(c0000a6, 6);
    }

    public static Object m16948a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: " + i);
    }
}
