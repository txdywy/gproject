package com.google.p169b.p170a.p171a.p172a.p173a;

final class C6904j extends au {
    public final int f34213a;
    public final int f34214b;
    public final int f34215c;
    public final aj f34216d;
    public final bb f34217e;

    C6904j(int i, int i2, int i3, aj ajVar, bb bbVar) {
        this.f34213a = i;
        this.f34214b = i2;
        this.f34215c = i3;
        if (ajVar == null) {
            throw new NullPointerException("Null typedValue");
        }
        this.f34216d = ajVar;
        if (bbVar == null) {
            throw new NullPointerException("Null parent");
        }
        this.f34217e = bbVar;
    }

    public final int mo5830a() {
        return this.f34213a;
    }

    public final int mo5831b() {
        return this.f34214b;
    }

    public final int mo5832c() {
        return this.f34215c;
    }

    public final aj mo5833d() {
        return this.f34216d;
    }

    public final bb mo5834e() {
        return this.f34217e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        if (this.f34213a == auVar.mo5830a() && this.f34214b == auVar.mo5831b() && this.f34215c == auVar.mo5832c() && this.f34216d.equals(auVar.mo5833d()) && this.f34217e.equals(auVar.mo5834e())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f34213a ^ 1000003) * 1000003) ^ this.f34214b) * 1000003) ^ this.f34215c) * 1000003) ^ this.f34216d.hashCode()) * 1000003) ^ this.f34217e.hashCode();
    }
}
