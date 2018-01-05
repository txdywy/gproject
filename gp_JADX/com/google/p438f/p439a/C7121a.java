package com.google.p438f.p439a;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class C7121a {
    public static int m32343a(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        if (b >= (byte) 0) {
            return b;
        }
        int i = b & 127;
        byte b2 = byteBuffer.get();
        if (b2 >= (byte) 0) {
            return i | (b2 << 7);
        }
        i |= (b2 & 127) << 7;
        b2 = byteBuffer.get();
        if (b2 >= (byte) 0) {
            return i | (b2 << 14);
        }
        i |= (b2 & 127) << 14;
        b2 = byteBuffer.get();
        if (b2 >= (byte) 0) {
            return i | (b2 << 21);
        }
        i |= (b2 & 127) << 21;
        b2 = byteBuffer.get();
        i |= b2 << 28;
        while (b2 < (byte) 0) {
            b2 = byteBuffer.get();
        }
        return i;
    }

    public static int m32342a(InputStream inputStream) {
        int i = 0;
        int i2 = 0;
        while (i < 32) {
            int read = inputStream.read();
            i2 |= (read & 127) << i;
            i += 7;
            if ((read & 128) == 0) {
                return i2;
            }
        }
        throw new IndexOutOfBoundsException("varint too long");
    }

    public static void m32344a(int i, OutputStream outputStream) {
        int i2 = 0;
        int i3 = i;
        do {
            i2++;
            i3 >>>= 7;
        } while (i3 != 0);
        byte[] bArr = new byte[i2];
        i3 = 0;
        while (true) {
            int i4 = i & 127;
            i >>>= 7;
            if (i != 0) {
                i2 = 128;
            } else {
                i2 = 0;
            }
            byte b = (byte) (i2 + i4);
            i2 = i3 + 1;
            bArr[i3] = b;
            if (i == 0) {
                outputStream.write(bArr);
                return;
            }
            i3 = i2;
        }
    }
}
