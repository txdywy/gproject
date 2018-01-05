package com.google.common.p414a;

final class C6938n extends C6925j {
    public final Object f34267a;

    C6938n(Object obj) {
        this.f34267a = obj;
    }

    public final boolean mo5846a() {
        return true;
    }

    public final Object mo5847b() {
        return this.f34267a;
    }

    public final Object mo5845a(Object obj) {
        C6937m.m31624a(obj, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.f34267a;
    }

    public final Object mo5848c() {
        return this.f34267a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6938n)) {
            return false;
        }
        return this.f34267a.equals(((C6938n) obj).f34267a);
    }

    public final int hashCode() {
        return 1502476572 + this.f34267a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f34267a);
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append("Optional.of(").append(valueOf).append(")").toString();
    }
}
