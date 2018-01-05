package com.android.p2putils;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

private static class com.android.p2putils.g
{

    public static long a(ByteBuffer p0) {
        com.android.p2putils.g.c(p0);
        return com.android.p2putils.g.a(p0, p0.position() + 16);
    }

    private static long a(ByteBuffer p0, int p1) {
        return (long)p0.getInt(p1) & 4294967295;
    }

    public static Pair a(RandomAccessFile p0) {
        if (p0.length() < 22)
            v0 = 0;
        else {
            v0 = com.android.p2putils.g.a(p0, 0);
            if (v0 == 0)
                v0 = com.android.p2putils.g.a(p0, 65535);
        }
        return v0;
    }

    private static Pair a(RandomAccessFile p0, int p1) {
        v0 = 0;
        if (p1 < 0 || p1 > 65535)
            throw new IllegalArgumentException(27 + "maxCommentSize: " + p1);
        v2 = p0.length();
        if (v2 >= 22) {
            v1 = ByteBuffer.allocate((int)Math.min((long)p1, v2 - 22) + 22);
            v1.order(ByteOrder.LITTLE_ENDIAN);
            v2 = v2 - (long)v1.capacity();
            p0.seek(v2);
            p0.readFully(v1.array(), v1.arrayOffset(), v1.capacity());
            v4 = com.android.p2putils.g.d(v1);
            if (v4 != -1) {
                v1.position(v4);
                v0 = v1.slice();
                v0.order(ByteOrder.LITTLE_ENDIAN);
                v0 = Pair.create(v0, Long.valueOf(v2 + (long)v4));
            }
        }
        return v0;
    }

    public static final boolean a(RandomAccessFile p0, long p1) {
        v0 = 0;
        if (p1 - 20 >= 0) {
            p0.seek(p1 - 20);
            if (p0.readInt() == 1347094023)
                v0 = 1;
        }
        return v0;
    }

    public static long b(ByteBuffer p0) {
        com.android.p2putils.g.c(p0);
        return com.android.p2putils.g.a(p0, p0.position() + 12);
    }

    static void c(ByteBuffer p0) {
        if (p0.order() != ByteOrder.LITTLE_ENDIAN)
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    private static int d(ByteBuffer p0) {
  3:    v0 = -1;
  4:    com.android.p2putils.g.c(p0);
  7:    v1 = p0.capacity();
 13:    if (v1 < 22)
 15:        return v0;
 25:    v2 = 0;
 26:    while (true) {
 26:        if (v2 >= Math.min(v1 - 22, 65535))
 15:            return v0;
 28:        v1 = v1 - 22 - v2;
 37:        if (p0.getInt(v1) == 101010256)
 37:            break;
 52:        v2 = v2 + 1;
        }
 46:    if ((p0.getShort(v1 + 20) & 65535) != v2) goto 50;
 48:    v0 = v1;
 49:    return v0;
    }

}
