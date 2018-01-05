package org.chromium.net.impl;

import java.nio.ByteBuffer;

public final class bt {
    static void m38104a(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    static void m38105b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
    }
}
