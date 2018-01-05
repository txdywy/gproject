package com.google.p169b.p170a.p171a.p172a.p173a;

final class C6898d extends aj {
    public final int f34188a;
    public final al f34189b;
    public final int f34190c;

    C6898d(int i, al alVar, int i2) {
        this.f34188a = i;
        this.f34189b = alVar;
        this.f34190c = i2;
    }

    public final int mo5803a() {
        return this.f34188a;
    }

    public final al mo5804b() {
        return this.f34189b;
    }

    public final int mo5805c() {
        return this.f34190c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        if (this.f34188a == ajVar.mo5803a() && this.f34189b.equals(ajVar.mo5804b()) && this.f34190c == ajVar.mo5805c()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f34188a ^ 1000003) * 1000003) ^ this.f34189b.hashCode()) * 1000003) ^ this.f34190c;
    }
}
