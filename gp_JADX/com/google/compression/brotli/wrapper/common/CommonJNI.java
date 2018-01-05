package com.google.compression.brotli.wrapper.common;

import java.nio.ByteBuffer;

class CommonJNI {
    CommonJNI() {
    }

    static native boolean nativeSetDictionaryData(ByteBuffer byteBuffer);
}
