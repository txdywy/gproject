package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p416c.C6972g;
import java.io.DataOutput;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class C6907o {
    static Map m31544a(DataOutput dataOutput, Collection collection, int i, boolean z) {
        if (z) {
            dataOutput.writeInt(collection.size());
        }
        Map hashMap = new HashMap();
        int i2 = 0;
        for (C6894k c6894k : collection) {
            byte[] a = c6894k.m31290a(i);
            dataOutput.write(a);
            C6894k.m31283a(dataOutput, a.length);
            hashMap.put(c6894k, Integer.valueOf(i2));
            i2++;
        }
        return hashMap;
    }

    static void m31545a(InputStream inputStream, int i) {
        while (true) {
            long skip = inputStream.skip((long) i);
            if (skip != ((long) i)) {
                i = (int) (((long) i) - skip);
            } else {
                return;
            }
        }
    }

    static ByteBuffer m31542a(C6972g c6972g) {
        return ByteBuffer.wrap(C6907o.m31546a(c6972g, true)).order(ByteOrder.LITTLE_ENDIAN);
    }

    static byte[] m31546a(C6972g c6972g, boolean z) {
        int i;
        byte[] bArr = new byte[(z ? 6 : 8)];
        c6972g.readFully(bArr);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        for (i = 0; i < bArr.length - 4; i++) {
            order.get();
        }
        int i2 = order.getInt();
        if (z) {
            i = i2 - 2;
        } else {
            i = i2;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i);
        c6972g.readFully(copyOf, bArr.length, i2 - 8);
        return copyOf;
    }

    static ByteBuffer m31547b(C6972g c6972g) {
        byte[] bArr = new byte[6];
        c6972g.readFully(bArr);
        short s = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort();
        bArr = Arrays.copyOf(bArr, s);
        c6972g.readFully(bArr, 6, (s - 6) - 2);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
    }

    static ByteBuffer m31543a(C6972g c6972g, int i) {
        byte[] bArr = new byte[i];
        c6972g.readFully(bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
    }
}
