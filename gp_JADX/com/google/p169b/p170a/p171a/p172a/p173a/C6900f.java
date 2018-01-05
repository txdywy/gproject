package com.google.p169b.p170a.p171a.p172a.p173a;

final class C6900f extends an {
    public final int f34194a;
    public final int f34195b;
    public final int f34196c;
    public final am f34197d;

    C6900f(int i, int i2, int i3, am amVar) {
        this.f34194a = i;
        this.f34195b = i2;
        this.f34196c = i3;
        if (amVar == null) {
            throw new NullPointerException("Null parent");
        }
        this.f34197d = amVar;
    }

    public final int mo5810a() {
        return this.f34194a;
    }

    public final int mo5811b() {
        return this.f34195b;
    }

    public final int mo5812c() {
        return this.f34196c;
    }

    public final am mo5813d() {
        return this.f34197d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        if (this.f34194a == anVar.mo5810a() && this.f34195b == anVar.mo5811b() && this.f34196c == anVar.mo5812c() && this.f34197d.equals(anVar.mo5813d())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f34194a ^ 1000003) * 1000003) ^ this.f34195b) * 1000003) ^ this.f34196c) * 1000003) ^ this.f34197d.hashCode();
    }
}
