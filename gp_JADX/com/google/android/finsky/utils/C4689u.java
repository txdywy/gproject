package com.google.android.finsky.utils;

import android.util.Base64;

public final class C4689u {
    public final long f24071a;
    public final byte[] f24072b;
    public final String f24073c;
    public final String f24074d;

    C4689u(byte[] bArr, long j, String str) {
        this(bArr, j, str, (byte) 0);
    }

    C4689u(byte[] bArr, long j, String str, byte b) {
        this.f24072b = bArr;
        this.f24073c = Base64.encodeToString(bArr, 11);
        this.f24074d = str;
        this.f24071a = j;
    }
}
