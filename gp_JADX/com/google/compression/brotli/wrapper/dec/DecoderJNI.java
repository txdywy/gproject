package com.google.compression.brotli.wrapper.dec;

import java.nio.ByteBuffer;

public class DecoderJNI {
    private static native boolean nativeAttachDictionary(long[] jArr, ByteBuffer byteBuffer);

    private static native ByteBuffer nativeCreate(long[] jArr);

    private static native void nativeDestroy(long[] jArr);

    private static native ByteBuffer nativePull(long[] jArr);

    private static native void nativePush(long[] jArr, int i);
}
