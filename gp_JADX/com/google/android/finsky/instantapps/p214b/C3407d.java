package com.google.android.finsky.instantapps.p214b;

import p000c.p001a.C0000a;

public final class C3407d {
    public final C0000a f17427a;
    public final C0000a f17428b;
    public final C0000a f17429c;

    public C3407d(C0000a c0000a, C0000a c0000a2, C0000a c0000a3) {
        this.f17427a = (C0000a) C3407d.m16906a(c0000a, 1);
        this.f17428b = (C0000a) C3407d.m16906a(c0000a2, 2);
        this.f17429c = (C0000a) C3407d.m16906a(c0000a3, 3);
    }

    public static Object m16906a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: " + i);
    }
}
