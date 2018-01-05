package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class bb {
    public static final Charset f35208a = Charset.forName("UTF-8");
    public static final byte[] f35209b;

    static Object m32993a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    static Object m32995a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static boolean m32997a(byte[] bArr) {
        return Utf8.f35084a.m33451a(bArr, 0, bArr.length);
    }

    public static String m32998b(byte[] bArr) {
        return new String(bArr, f35208a);
    }

    public static int m32991a(long j) {
        return (int) ((j >>> 32) ^ j);
    }

    public static int m32992a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int m32999c(byte[] bArr) {
        int length = bArr.length;
        length = m32990a(length, bArr, 0, length);
        if (length == 0) {
            return 1;
        }
        return length;
    }

    static int m32990a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static boolean m32996a() {
        return false;
    }

    static Object m32994a(Object obj, Object obj2) {
        return ((cf) obj).mo6119f().mo6122a((cf) obj2).mo6125c();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f35209b = bArr;
        ByteBuffer.wrap(bArr);
        bArr = f35209b;
        C7225s.m33629a(bArr, 0, bArr.length, false);
    }
}
