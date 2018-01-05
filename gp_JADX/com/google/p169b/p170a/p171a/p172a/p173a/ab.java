package com.google.p169b.p170a.p171a.p172a.p173a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class ab {
    public static String m31303a(ByteBuffer byteBuffer, int i) {
        byte[] array = byteBuffer.array();
        int i2 = i;
        while (i2 < array.length && i2 < i + 256) {
            if (array[i2] == (byte) 0 && array[i2 + 1] == (byte) 0) {
                i2 -= i;
                break;
            }
            i2 += 2;
        }
        i2 = 0;
        String str = new String(array, i, i2, Charset.forName("UTF-16LE"));
        byteBuffer.position(i + 256);
        return str;
    }

    public static void m31304a(ByteBuffer byteBuffer, String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-16LE"));
        byteBuffer.put(bytes, 0, Math.min(bytes.length, 256));
        if (bytes.length < 256) {
            byteBuffer.put(new byte[(256 - bytes.length)]);
        }
    }
}
