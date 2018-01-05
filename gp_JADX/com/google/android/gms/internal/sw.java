package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class sw implements oh {
    public final tg f27482a;
    public final qx f27483b;

    public sw(tg tgVar, qx qxVar) {
        this.f27482a = tgVar;
        this.f27483b = qxVar;
    }

    public final byte[] mo4862a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.f27482a.mo4864a(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(8 * ((long) bArr2.length)).array(), 8);
        copyOf = this.f27483b.mo4866a(tj.m25583a(bArr2, a, copyOf));
        return tj.m25583a(a, copyOf);
    }
}
