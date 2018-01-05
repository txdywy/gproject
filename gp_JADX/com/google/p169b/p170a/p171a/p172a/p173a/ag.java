package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p416c.C6966a;
import com.squareup.haha.perflib.HprofParser;
import java.nio.ByteBuffer;

public final class ag {
    static void m31367a(C6966a c6966a, int i, ah ahVar) {
        if (i < 0) {
            c6966a.write(0);
        } else if (ahVar == ah.UTF8) {
            if (i > 127) {
                c6966a.write(((i & 32512) >> 8) | 128);
            }
            c6966a.write(i & HprofParser.ROOT_UNKNOWN);
        } else {
            int i2;
            if (i > 32767) {
                i2 = ((2147418112 & i) >> 16) | 32768;
                c6966a.write(i2 & HprofParser.ROOT_UNKNOWN);
                c6966a.write((i2 & 65280) >> 8);
            }
            i2 = 65535 & i;
            c6966a.write(i2 & HprofParser.ROOT_UNKNOWN);
            c6966a.write((i2 & 65280) >> 8);
        }
    }

    static int m31365a(int i, ah ahVar) {
        int i2 = 2;
        int i3 = ahVar == ah.UTF8 ? 1 : 2;
        if (i < (ahVar == ah.UTF8 ? 128 : 32768)) {
            i2 = 1;
        }
        return i3 * i2;
    }

    static int m31366a(ByteBuffer byteBuffer, int i, ah ahVar) {
        int i2;
        if (ahVar == ah.UTF8) {
            i2 = byteBuffer.get(i) & HprofParser.ROOT_UNKNOWN;
            if ((i2 & 128) != 0) {
                return ((i2 & 127) << 8) | (byteBuffer.get(i + 1) & HprofParser.ROOT_UNKNOWN);
            }
            return i2;
        }
        i2 = byteBuffer.getShort(i) & 65535;
        if ((32768 & i2) != 0) {
            return ((i2 & 32767) << 16) | (byteBuffer.getShort(i + 2) & 65535);
        }
        return i2;
    }
}
