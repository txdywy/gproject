package com.google.android.gms.internal;

import java.nio.ByteBuffer;

final class sd implements oh {
    public static final byte[] f27448a = new byte[0];
    public final rg f27449b;
    public final oh f27450c;

    sd(rg rgVar, oh ohVar) {
        this.f27449b = rgVar;
        this.f27450c = ohVar;
    }

    public final byte[] mo4862a(byte[] bArr, byte[] bArr2) {
        byte[] f = rb.f27387a.m25441a(this.f27449b).mo4846f();
        byte[] a = this.f27450c.mo4862a(f, f27448a);
        f = ((oh) rb.f27387a.m25443a(this.f27449b.f27404a, ud.m25653a(f))).mo4862a(bArr, bArr2);
        return ByteBuffer.allocate((a.length + 4) + f.length).putInt(a.length).put(a).put(f).array();
    }
}
