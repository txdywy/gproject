package p002a.p003a;

import p000c.p001a.C0000a;

public final class C0001a implements C0000a {
    public C0000a f0a;

    public final Object mo1a() {
        if (this.f0a != null) {
            return this.f0a.mo1a();
        }
        throw new IllegalStateException();
    }
}
