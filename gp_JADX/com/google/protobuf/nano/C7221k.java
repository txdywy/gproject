package com.google.protobuf.nano;

import java.util.Arrays;

public final class C7221k {
    public final int f35466a;
    public final byte[] f35467b;

    public C7221k(int i, byte[] bArr) {
        this.f35466a = i;
        this.f35467b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7221k)) {
            return false;
        }
        C7221k c7221k = (C7221k) obj;
        if (this.f35466a == c7221k.f35466a && Arrays.equals(this.f35467b, c7221k.f35467b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f35466a + 527) * 31) + Arrays.hashCode(this.f35467b);
    }
}
