package com.google.compression.brotli.dec;

import android.support.v7.widget.eq;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

final class C7078a {
    static void m32179a(C7084g c7084g) {
        if (c7084g.f34658q <= 1015) {
            return;
        }
        if (c7084g.f34660s == 0) {
            int i = c7084g.f34658q << 2;
            int i2 = 4096 - i;
            C7086i.m32209a(c7084g.f34647f, 0, i, (int) eq.FLAG_APPEARED_IN_PRE_LAYOUT);
            c7084g.f34658q = 0;
            while (i2 < eq.FLAG_APPEARED_IN_PRE_LAYOUT) {
                i = C7086i.m32208a(c7084g.ag, c7084g.f34647f, i2, 4096 - i2);
                if (i <= 0) {
                    c7084g.f34660s = 1;
                    c7084g.f34659r = i2;
                    i2 += 3;
                    break;
                }
                i2 += i;
            }
            byte[] bArr = c7084g.f34647f;
            int i3 = i2 >> 2;
            int[] iArr = c7084g.f34648g;
            for (i2 = 0; i2 < i3; i2++) {
                iArr[i2] = (((bArr[i2 * 4] & HprofParser.ROOT_UNKNOWN) | ((bArr[(i2 * 4) + 1] & HprofParser.ROOT_UNKNOWN) << 8)) | ((bArr[(i2 * 4) + 2] & HprofParser.ROOT_UNKNOWN) << 16)) | ((bArr[(i2 * 4) + 3] & HprofParser.ROOT_UNKNOWN) << 24);
            }
        } else if (C7078a.m32187g(c7084g) < -2) {
            throw new BrotliRuntimeException("No more input");
        }
    }

    static void m32180a(C7084g c7084g, int i) {
        if (c7084g.f34660s != 0) {
            int i2 = ((c7084g.f34658q << 2) + ((c7084g.f34657p + 7) >> 3)) - 8;
            if (i2 > c7084g.f34659r) {
                throw new BrotliRuntimeException("Read after end");
            } else if (i != 0 && i2 != c7084g.f34659r) {
                throw new BrotliRuntimeException("Unused bytes after end");
            }
        }
    }

    static void m32182b(C7084g c7084g) {
        if (c7084g.f34657p >= 32) {
            int[] iArr = c7084g.f34648g;
            int i = c7084g.f34658q;
            c7084g.f34658q = i + 1;
            c7084g.f34654m = (((long) iArr[i]) << 32) | (c7084g.f34654m >>> 32);
            c7084g.f34657p -= 32;
        }
    }

    private static void m32188h(C7084g c7084g) {
        int[] iArr = c7084g.f34648g;
        int i = c7084g.f34658q;
        c7084g.f34658q = i + 1;
        c7084g.f34654m = (((long) iArr[i]) << 32) | (c7084g.f34654m >>> 32);
        c7084g.f34657p -= 32;
    }

    static int m32183c(C7084g c7084g) {
        return (int) (c7084g.f34654m >>> c7084g.f34657p);
    }

    static int m32181b(C7084g c7084g, int i) {
        int c = C7078a.m32183c(c7084g) & ((1 << i) - 1);
        c7084g.f34657p += i;
        return c;
    }

    static void m32184d(C7084g c7084g) {
        C7078a.m32179a(c7084g);
        C7078a.m32180a(c7084g, 0);
        C7078a.m32188h(c7084g);
        C7078a.m32188h(c7084g);
    }

    static void m32185e(C7084g c7084g) {
        if (c7084g.f34657p == 64) {
            C7078a.m32184d(c7084g);
        }
    }

    static void m32186f(C7084g c7084g) {
        int i = (64 - c7084g.f34657p) & 7;
        if (i != 0 && C7078a.m32181b(c7084g, i) != 0) {
            throw new BrotliRuntimeException("Corrupted padding bits");
        }
    }

    static int m32187g(C7084g c7084g) {
        int i = MemoryMappedFileBuffer.DEFAULT_PADDING;
        if (c7084g.f34660s != 0) {
            i = (c7084g.f34659r + 3) >> 2;
        }
        return i - c7084g.f34658q;
    }
}
