package com.google.p169b.p170a.p171a.p172a.p173a;

import java.util.Map;

final class C6903i extends ar {
    public Integer f34206a;
    public Integer f34207b;
    public Integer f34208c;
    public aj f34209d;
    public Map f34210e;
    public Integer f34211f;
    public ap f34212g;

    C6903i() {
    }

    final ar mo5823a(int i) {
        this.f34206a = Integer.valueOf(i);
        return this;
    }

    final ar mo5827b(int i) {
        this.f34207b = Integer.valueOf(i);
        return this;
    }

    final ar mo5828c(int i) {
        this.f34208c = Integer.valueOf(i);
        return this;
    }

    final ar mo5824a(aj ajVar) {
        this.f34209d = ajVar;
        return this;
    }

    final ar mo5826a(Map map) {
        this.f34210e = map;
        return this;
    }

    final ar mo5829d(int i) {
        this.f34211f = Integer.valueOf(i);
        return this;
    }

    final ar mo5825a(ap apVar) {
        if (apVar == null) {
            throw new NullPointerException("Null parent");
        }
        this.f34212g = apVar;
        return this;
    }

    final aq mo5822a() {
        String str = "";
        if (this.f34206a == null) {
            str = String.valueOf(str).concat(" headerSize");
        }
        if (this.f34207b == null) {
            str = String.valueOf(str).concat(" flags");
        }
        if (this.f34208c == null) {
            str = String.valueOf(str).concat(" keyIndex");
        }
        if (this.f34210e == null) {
            str = String.valueOf(str).concat(" values");
        }
        if (this.f34211f == null) {
            str = String.valueOf(str).concat(" parentEntry");
        }
        if (this.f34212g == null) {
            str = String.valueOf(str).concat(" parent");
        }
        if (str.isEmpty()) {
            return new C6902h(this.f34206a.intValue(), this.f34207b.intValue(), this.f34208c.intValue(), this.f34209d, this.f34210e, this.f34211f.intValue(), this.f34212g);
        }
        String str2 = "Missing required properties:";
        str = String.valueOf(str);
        throw new IllegalStateException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }
}
