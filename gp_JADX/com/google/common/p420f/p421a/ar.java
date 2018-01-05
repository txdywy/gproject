package com.google.common.p420f.p421a;

final class ar extends ap {
    public static final ar f34395b = new ar(null);
    public final Object f34396c;

    ar(Object obj) {
        this.f34396c = obj;
    }

    public final Object get() {
        return this.f34396c;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f34396c);
        return new StringBuilder((String.valueOf(obj).length() + 27) + String.valueOf(valueOf).length()).append(obj).append("[status=SUCCESS, result=[").append(valueOf).append("]]").toString();
    }
}
