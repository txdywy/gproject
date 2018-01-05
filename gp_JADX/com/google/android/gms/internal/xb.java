package com.google.android.gms.internal;

import java.util.Arrays;

final class xb {
    public final int f27653a;
    public final byte[] f27654b;

    xb(int i, byte[] bArr) {
        this.f27653a = i;
        this.f27654b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xb)) {
            return false;
        }
        xb xbVar = (xb) obj;
        return this.f27653a == xbVar.f27653a && Arrays.equals(this.f27654b, xbVar.f27654b);
    }

    public final int hashCode() {
        return ((this.f27653a + 527) * 31) + Arrays.hashCode(this.f27654b);
    }
}
