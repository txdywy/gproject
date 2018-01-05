package com.google.android.libraries.performance.primes.p340g;

import java.util.Arrays;

public final class C6001a {
    public final int f30063a;
    public final String f30064b;

    public C6001a(int i, String str) {
        this.f30063a = i;
        this.f30064b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6001a)) {
            return false;
        }
        C6001a c6001a = (C6001a) obj;
        if (this.f30063a == c6001a.f30063a && this.f30064b.equals(c6001a.f30064b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30063a), this.f30064b});
    }
}
