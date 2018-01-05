package com.google.common.p416c;

import com.google.common.p414a.C6937m;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;

public final class C6967b {
    private static long m31815a(InputStream inputStream, OutputStream outputStream) {
        C6937m.m31623a((Object) inputStream);
        C6937m.m31623a((Object) outputStream);
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static byte[] m31819a(InputStream inputStream) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, inputStream.available()));
        C6967b.m31815a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static C6966a m31816a(int i) {
        if (i >= 0) {
            return new C6969d((ByteArrayOutputStream) C6937m.m31623a(new ByteArrayOutputStream(i)));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", new Object[]{Integer.valueOf(i)}));
    }

    public static void m31817a(InputStream inputStream, byte[] bArr) {
        C6967b.m31818a(inputStream, bArr, 0, bArr.length);
    }

    public static void m31818a(InputStream inputStream, byte[] bArr, int i, int i2) {
        C6937m.m31623a((Object) inputStream);
        C6937m.m31623a((Object) bArr);
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        if (i3 != i2) {
            throw new EOFException("reached end of stream after reading " + i3 + " bytes; " + i2 + " bytes expected");
        }
    }

    static {
        C6968c c6968c = new C6968c();
    }
}
