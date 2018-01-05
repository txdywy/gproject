package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.p438f.p439a.C7121a;
import java.io.InputStream;
import java.util.BitSet;

final class C6908p {
    static BitSet m31548a(InputStream inputStream) {
        BitSet bitSet = new BitSet();
        int a = C7121a.m32342a(inputStream);
        int i = 0;
        int i2 = 0;
        Object obj = null;
        while (i < a) {
            Object obj2;
            int a2 = C7121a.m32342a(inputStream);
            if (!(a2 == 0 || obj == null)) {
                bitSet.set(i2, i2 + a2);
            }
            a2 += i2;
            if (obj == null) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            i++;
            obj = obj2;
            i2 = a2;
        }
        return bitSet;
    }
}
