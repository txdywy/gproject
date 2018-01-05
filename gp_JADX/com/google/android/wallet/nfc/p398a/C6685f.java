package com.google.android.wallet.nfc.p398a;

import java.util.Arrays;

public final class C6685f {
    public static final byte[] f32989a = new byte[]{(byte) 9, (byte) 0, (byte) 0, (byte) 0};
    public static final byte[] f32990b = new byte[]{(byte) 6, (byte) 12};
    public final byte[] f32991c;
    public final byte f32992d;
    public final byte f32993e;

    public C6685f(byte[] bArr) {
        this.f32991c = Arrays.copyOfRange(bArr, 0, bArr.length - 2);
        this.f32992d = bArr[bArr.length - 2];
        this.f32993e = bArr[bArr.length - 1];
    }
}
