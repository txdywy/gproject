package com.google.p169b.p170a.p171a.p172a.p173a;

final class C6899e extends ak {
    public Integer f34191a;
    public al f34192b;
    public Integer f34193c;

    C6899e() {
    }

    final ak mo5807a(int i) {
        this.f34191a = Integer.valueOf(i);
        return this;
    }

    final ak mo5808a(al alVar) {
        if (alVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f34192b = alVar;
        return this;
    }

    final ak mo5809b(int i) {
        this.f34193c = Integer.valueOf(i);
        return this;
    }

    final aj mo5806a() {
        String str = "";
        if (this.f34191a == null) {
            str = String.valueOf(str).concat(" size");
        }
        if (this.f34192b == null) {
            str = String.valueOf(str).concat(" type");
        }
        if (this.f34193c == null) {
            str = String.valueOf(str).concat(" data");
        }
        if (str.isEmpty()) {
            return new C6898d(this.f34191a.intValue(), this.f34192b, this.f34193c.intValue());
        }
        String str2 = "Missing required properties:";
        str = String.valueOf(str);
        throw new IllegalStateException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }
}
