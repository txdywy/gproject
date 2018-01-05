package com.google.android.p103d;

import java.io.EOFException;
import java.io.InputStream;

public final class C0937b {
    public static void m5677a(InputStream inputStream, byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            if (inputStream == null) {
                throw new NullPointerException("in == null");
            } else if (bArr == null) {
                throw new NullPointerException("dst == null");
            } else {
                int length = bArr.length;
                if ((i2 | 0) < 0 || length < 0 || length + 0 < i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                while (i2 > 0) {
                    length = inputStream.read(bArr, i, i2);
                    if (length < 0) {
                        throw new EOFException();
                    }
                    i += length;
                    i2 -= length;
                }
            }
        }
    }

    public static void m5676a(InputStream inputStream, int i) {
        if (i != 0) {
            while (i > 0) {
                long skip = inputStream.skip((long) i);
                if (skip < 0) {
                    throw new EOFException();
                }
                i = (int) (((long) i) - skip);
            }
        }
    }
}
