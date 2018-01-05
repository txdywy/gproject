package com.android.p2putils;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class SigBlockUtil {

    public class BlockNotFoundException extends Exception {
        public BlockNotFoundException(String str) {
            super(str);
        }
    }

    private static ByteBuffer m4202a(ByteBuffer byteBuffer, int i) {
        if (i < 8) {
            throw new IllegalArgumentException("end < start: " + i + " < 8");
        }
        int capacity = byteBuffer.capacity();
        if (i > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i + " > " + capacity);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i);
            byteBuffer.position(8);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    private static ByteBuffer m4203b(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("size: " + i);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = position + i;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static ByteBuffer m4201a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        ByteBuffer a = m4202a(byteBuffer, byteBuffer.capacity() - 24);
        int i = 0;
        while (a.hasRemaining()) {
            i++;
            if (a.remaining() < 8) {
                throw new BlockNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i);
            }
            long j = a.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new BlockNotFoundException("APK Signing Block entry #" + i + " size out of range: " + j);
            }
            int i2 = (int) j;
            int position = a.position() + i2;
            if (i2 > a.remaining()) {
                throw new BlockNotFoundException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + a.remaining());
            } else if (a.getInt() == 558253134) {
                return m4203b(a, i2 - 4);
            } else {
                a.position(position);
            }
        }
        throw new BlockNotFoundException("Block id not present in APK Signing Block");
    }
}
