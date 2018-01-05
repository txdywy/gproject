package com.android.p2putils;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

private static class SigBlockUtil
{

    public static ByteBuffer a(ByteBuffer p0) {
        if (p0.order() != ByteOrder.LITTLE_ENDIAN)
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        v1 = SigBlockUtil.a(p0, p0.capacity() - 24);
        v0 = 0;
        while (v1.hasRemaining()) {
            v0 = v0 + 1;
            if (v1.remaining() < 8)
                throw new Exception(70 + "Insufficient data to read size of APK Signing Block entry #" + v0) {
                };
            v2 = v1.getLong();
            if (v2 < 4 || v2 > 2147483647)
                throw new Exception(76 + "APK Signing Block entry #" + v0 + " size out of range: " + v2) {
                };
            if ((int)v2 > v1.remaining())
                throw new Exception(91 + "APK Signing Block entry #" + v0 + " size out of range: " + (int)v2 + ", available: " + v1.remaining()) {
                };
            if (v1.getInt() == 558253134)
                return SigBlockUtil.b(v1, (int)v2 - 4);
            v1.position(v1.position() + (int)v2);
        }
        throw new Exception("Block id not present in APK Signing Block") {
        };
    }

    private static ByteBuffer a(ByteBuffer p0, int p1) {
        if (p1 < 8)
            throw new IllegalArgumentException(38 + "end < start: " + p1 + " < 8");
        if (p1 > p0.capacity())
            throw new IllegalArgumentException(41 + "end > capacity: " + p1 + " > " + p0.capacity());
        v1 = p0.limit();
        v2 = p0.position();
        try {
            p0.position(0);
            p0.limit(p1);
            p0.position(8);
            v0 = p0.slice();
            v0.order(p0.order());
        }
        catch (Throwable ex) {
            p0.position(0);
            p0.limit(v1);
            p0.position(v2);
            throw ex;
        }
        p0.position(0);
        p0.limit(v1);
        p0.position(v2);
        return v0;
    }

    private static ByteBuffer b(ByteBuffer p0, int p1) {
        if (p1 < 0)
            throw new IllegalArgumentException(17 + "size: " + p1);
        v1 = p0.limit();
        v0 = p0.position();
        v2 = v0 + p1;
        if (v2 < v0 || v2 > v1)
            throw new BufferUnderflowException();
        p0.limit(v2);
        try {
            v0 = p0.slice();
            v0.order(p0.order());
            p0.position(v2);
        }
        catch (Throwable ex) {
            p0.limit(v1);
            throw ex;
        }
        p0.limit(v1);
        return v0;
    }

}
