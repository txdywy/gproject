package com.google.android.gms.clearcut.internal;

import com.squareup.haha.perflib.HprofParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class C5030f {
    private static int m23243a(byte[] bArr, int i) {
        return (((bArr[i] & HprofParser.ROOT_UNKNOWN) | ((bArr[i + 1] & HprofParser.ROOT_UNKNOWN) << 8)) | ((bArr[i + 2] & HprofParser.ROOT_UNKNOWN) << 16)) | ((bArr[i + 3] & HprofParser.ROOT_UNKNOWN) << 24);
    }

    private static long m23244a(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        j4 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j4 ^ (j4 >>> 47)) * j3;
    }

    public static long m23245a(byte[] bArr) {
        int length = bArr.length;
        if (length < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException("Out of bound index with offput: 0 and length: " + length);
        } else if (length <= 32) {
            if (length > 16) {
                r6 = -7286425919675154353L + ((long) (length << 1));
                r4 = -5435081209227447693L * C5030f.m23248b(bArr, 0);
                r10 = C5030f.m23248b(bArr, 8);
                r12 = C5030f.m23248b(bArr, (length + 0) - 8) * r6;
                return C5030f.m23244a((C5030f.m23248b(bArr, (length + 0) - 16) * -7286425919675154353L) + (Long.rotateRight(r4 + r10, 43) + Long.rotateRight(r12, 30)), (r4 + Long.rotateRight(-7286425919675154353L + r10, 18)) + r12, r6);
            } else if (length >= 8) {
                r6 = -7286425919675154353L + ((long) (length << 1));
                r4 = -7286425919675154353L + C5030f.m23248b(bArr, 0);
                long b = C5030f.m23248b(bArr, (length + 0) - 8);
                return C5030f.m23244a((Long.rotateRight(b, 37) * r6) + r4, (Long.rotateRight(r4, 25) + b) * r6, r6);
            } else if (length >= 4) {
                return C5030f.m23244a(((((long) C5030f.m23243a(bArr, 0)) & 4294967295L) << 3) + ((long) length), ((long) C5030f.m23243a(bArr, (length + 0) - 4)) & 4294967295L, -7286425919675154353L + ((long) (length << 1)));
            } else if (length <= 0) {
                return -7286425919675154353L;
            } else {
                int i = (bArr[0] & HprofParser.ROOT_UNKNOWN) + ((bArr[(length >> 1) + 0] & HprofParser.ROOT_UNKNOWN) << 8);
                r2 = (((long) (((bArr[(length - 1) + 0] & HprofParser.ROOT_UNKNOWN) << 2) + length)) * -4348849565147123417L) ^ (((long) i) * -7286425919675154353L);
                return (r2 ^ (r2 >>> 47)) * -7286425919675154353L;
            }
        } else if (length > 64) {
            return C5030f.m23246a(bArr, 0, length);
        } else {
            r6 = -7286425919675154353L + ((long) (length << 1));
            r10 = C5030f.m23248b(bArr, 0) * -7286425919675154353L;
            r4 = C5030f.m23248b(bArr, 8);
            r12 = C5030f.m23248b(bArr, (length + 0) - 8) * r6;
            r2 = (C5030f.m23248b(bArr, (length + 0) - 16) * -7286425919675154353L) + (Long.rotateRight(r10 + r4, 43) + Long.rotateRight(r12, 30));
            r4 = C5030f.m23244a(r2, (Long.rotateRight(r4 - 7286425919675154353L, 18) + r10) + r12, r6);
            r12 = C5030f.m23248b(bArr, 16) * r6;
            long b2 = C5030f.m23248b(bArr, 24);
            long b3 = (r2 + C5030f.m23248b(bArr, (length + 0) - 32)) * r6;
            return C5030f.m23244a(((C5030f.m23248b(bArr, (length + 0) - 24) + r4) * r6) + (Long.rotateRight(r12 + b2, 43) + Long.rotateRight(b3, 30)), (Long.rotateRight(b2 + r10, 18) + r12) + b3, r6);
        }
    }

    private static long m23246a(byte[] bArr, int i, int i2) {
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        int i3 = (((i2 - 1) / 64) << 6) + 0;
        int i4 = (((i2 - 1) & 63) + i3) - 63;
        long j = 2480279821605975764L;
        long j2 = 1390051526045402406L;
        long b = 95310865018149119L + C5030f.m23248b(bArr, 0);
        int i5 = i;
        while (true) {
            b = Long.rotateRight(((b + j) + jArr[0]) + C5030f.m23248b(bArr, i5 + 8), 37) * -5435081209227447693L;
            long j3 = b ^ jArr2[1];
            long rotateRight = (Long.rotateRight((j + jArr[1]) + C5030f.m23248b(bArr, i5 + 48), 42) * -5435081209227447693L) + (jArr[0] + C5030f.m23248b(bArr, i5 + 40));
            long rotateRight2 = Long.rotateRight(jArr2[0] + j2, 33) * -5435081209227447693L;
            C5030f.m23247a(bArr, i5, jArr[1] * -5435081209227447693L, jArr2[0] + j3, jArr);
            byte[] bArr2 = bArr;
            C5030f.m23247a(bArr2, i5 + 32, rotateRight2 + jArr2[1], rotateRight + C5030f.m23248b(bArr, i5 + 16), jArr2);
            i5 += 64;
            if (i5 == i3) {
                long j4 = -5435081209227447693L + ((255 & j3) << 1);
                jArr2[0] = jArr2[0] + ((long) ((i2 - 1) & 63));
                jArr[0] = jArr[0] + jArr2[0];
                jArr2[0] = jArr2[0] + jArr[0];
                long rotateRight3 = Long.rotateRight(((rotateRight2 + rotateRight) + jArr[0]) + C5030f.m23248b(bArr, i4 + 8), 37) * j4;
                rotateRight2 = rotateRight3 ^ (jArr2[1] * 9);
                rotateRight = (Long.rotateRight((jArr[1] + rotateRight) + C5030f.m23248b(bArr, i4 + 48), 42) * j4) + ((jArr[0] * 9) + C5030f.m23248b(bArr, i4 + 40));
                j3 = Long.rotateRight(jArr2[0] + j3, 33) * j4;
                C5030f.m23247a(bArr, i4, jArr[1] * j4, rotateRight2 + jArr2[0], jArr);
                bArr2 = bArr;
                C5030f.m23247a(bArr2, i4 + 32, j3 + jArr2[1], rotateRight + C5030f.m23248b(bArr, i4 + 16), jArr2);
                return C5030f.m23244a((C5030f.m23244a(jArr[0], jArr2[0], j4) + (((rotateRight >>> 47) ^ rotateRight) * -4348849565147123417L)) + rotateRight2, C5030f.m23244a(jArr[1], jArr2[1], j4) + j3, j4);
            }
            b = rotateRight2;
            j2 = j3;
            j = rotateRight;
        }
    }

    private static void m23247a(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = C5030f.m23248b(bArr, i);
        long b2 = C5030f.m23248b(bArr, i + 8);
        long b3 = C5030f.m23248b(bArr, i + 16);
        long b4 = C5030f.m23248b(bArr, i + 24);
        b += j;
        b2 = (b2 + b) + b3;
        b3 = Long.rotateRight(b2, 44) + Long.rotateRight((j2 + b) + b4, 21);
        jArr[0] = b2 + b4;
        jArr[1] = b + b3;
    }

    private static long m23248b(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}
