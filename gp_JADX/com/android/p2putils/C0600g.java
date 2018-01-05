package com.android.p2putils;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class C0600g {
    public static Pair m4212a(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair a = C0600g.m4213a(randomAccessFile, 0);
        return a == null ? C0600g.m4213a(randomAccessFile, 65535) : a;
    }

    private static Pair m4213a(RandomAccessFile randomAccessFile, int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("maxCommentSize: " + i);
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i, length - 22)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        length -= (long) allocate.capacity();
        randomAccessFile.seek(length);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        int d = C0600g.m4217d(allocate);
        if (d == -1) {
            return null;
        }
        allocate.position(d);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(length + ((long) d)));
    }

    private static int m4217d(ByteBuffer byteBuffer) {
        C0600g.m4216c(byteBuffer);
        int capacity = byteBuffer.capacity();
        if (capacity < 22) {
            return -1;
        }
        int min = Math.min(capacity - 22, 65535);
        int i = capacity - 22;
        int i2 = 0;
        while (i2 < min) {
            capacity = i - i2;
            if (byteBuffer.getInt(capacity) == 101010256 && (byteBuffer.getShort(capacity + 20) & 65535) == i2) {
                return capacity;
            }
            i2++;
        }
        return -1;
    }

    public static final boolean m4214a(RandomAccessFile randomAccessFile, long j) {
        long j2 = j - 20;
        if (j2 < 0) {
            return false;
        }
        randomAccessFile.seek(j2);
        if (randomAccessFile.readInt() == 1347094023) {
            return true;
        }
        return false;
    }

    public static long m4210a(ByteBuffer byteBuffer) {
        C0600g.m4216c(byteBuffer);
        return C0600g.m4211a(byteBuffer, byteBuffer.position() + 16);
    }

    public static long m4215b(ByteBuffer byteBuffer) {
        C0600g.m4216c(byteBuffer);
        return C0600g.m4211a(byteBuffer, byteBuffer.position() + 12);
    }

    static void m4216c(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static long m4211a(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }
}
