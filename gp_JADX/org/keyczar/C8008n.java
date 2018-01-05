package org.keyczar;

import org.keyczar.p572d.C7996b;

final class C8008n {
    public byte[] f41042a;

    C8008n(byte[] bArr) {
        if (bArr.length != 4) {
            throw new IllegalArgumentException();
        }
        this.f41042a = bArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8008n) && obj.hashCode() == hashCode();
    }

    public final int hashCode() {
        return C7996b.m38197b(this.f41042a);
    }
}
