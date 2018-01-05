package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class vd {
    public static final Charset f27560a = Charset.forName("UTF-8");
    public static final byte[] f27561b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f27561b = bArr;
        ByteBuffer.wrap(bArr);
        um.m25684a(f27561b);
    }

    static int m25787a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static Object m25788a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }
}
