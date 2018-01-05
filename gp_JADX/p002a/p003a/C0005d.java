package p002a.p003a;

import p000c.p001a.C0000a;
import p002a.C0002a;

public final class C0005d implements C0002a, C0000a {
    public static final Object f4a = new Object();
    public volatile C0000a f5b;
    public volatile Object f6c = f4a;

    private C0005d(C0000a c0000a) {
        this.f5b = c0000a;
    }

    public final Object mo1a() {
        C0000a c0000a = this.f5b;
        if (this.f6c == f4a) {
            this.f6c = c0000a.mo1a();
            this.f5b = null;
        }
        return this.f6c;
    }

    public static C0000a m8a(C0000a c0000a) {
        return ((c0000a instanceof C0005d) || (c0000a instanceof C0003b)) ? c0000a : new C0005d((C0000a) C0004c.m6a(c0000a));
    }
}
