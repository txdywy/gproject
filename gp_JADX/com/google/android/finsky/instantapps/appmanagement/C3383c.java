package com.google.android.finsky.instantapps.appmanagement;

import p000c.p001a.C0000a;

public final class C3383c {
    public final C0000a f17359a;
    public final C0000a f17360b;
    public final C0000a f17361c;
    public final C0000a f17362d;
    public final C0000a f17363e;
    public final C0000a f17364f;
    public final C0000a f17365g;
    public final C0000a f17366h;

    public C3383c(C0000a c0000a, C0000a c0000a2, C0000a c0000a3, C0000a c0000a4, C0000a c0000a5, C0000a c0000a6, C0000a c0000a7, C0000a c0000a8) {
        this.f17359a = (C0000a) C3383c.m16885a(c0000a, 1);
        this.f17360b = (C0000a) C3383c.m16885a(c0000a2, 2);
        this.f17361c = (C0000a) C3383c.m16885a(c0000a3, 3);
        this.f17362d = (C0000a) C3383c.m16885a(c0000a4, 4);
        this.f17363e = (C0000a) C3383c.m16885a(c0000a5, 5);
        this.f17364f = (C0000a) C3383c.m16885a(c0000a6, 6);
        this.f17365g = (C0000a) C3383c.m16885a(c0000a7, 7);
        this.f17366h = (C0000a) C3383c.m16885a(c0000a8, 8);
    }

    public static Object m16885a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: " + i);
    }
}
