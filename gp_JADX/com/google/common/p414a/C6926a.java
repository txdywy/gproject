package com.google.common.p414a;

public final class C6926a extends C6925j {
    public static final C6926a f34255a = new C6926a();

    private C6926a() {
    }

    public final boolean mo5846a() {
        return false;
    }

    public final Object mo5847b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final Object mo5845a(Object obj) {
        return C6937m.m31624a(obj, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }

    public final Object mo5848c() {
        return null;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
