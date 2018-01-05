package com.google.compression.brotli.dec;

import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.InputStream;

final class C7086i {
    public static final byte[] f34671a = new byte[MemoryMappedFileBuffer.DEFAULT_PADDING];
    public static final int[] f34672b = new int[MemoryMappedFileBuffer.DEFAULT_PADDING];

    static void m32209a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(bArr, i2, bArr, i, i3 - i2);
    }

    static int m32208a(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (Throwable e) {
            throw new BrotliRuntimeException("Failed to read input", e);
        }
    }
}
