package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p414a.C6937m;
import com.google.common.p416c.C6972g;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ac {
    public static byte[] m31305a(DataInputStream dataInputStream, byte[] bArr) {
        int readInt = dataInputStream.readInt();
        List arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            Object obj = new byte[2];
            dataInputStream.readFully(obj);
            arrayList.add(obj);
        }
        int i2 = 0;
        C6916x c6916x = null;
        while (i2 < arrayList.size()) {
            C6916x c6916x2;
            if (Arrays.equals(bArr, (byte[]) arrayList.get(i2))) {
                c6916x2 = new C6916x(dataInputStream);
            } else {
                boolean z;
                if (dataInputStream.readInt() == 1296389185) {
                    z = true;
                } else {
                    z = false;
                }
                C6937m.m31635b(z);
                C6907o.m31545a((InputStream) dataInputStream, dataInputStream.readInt() - 8);
                c6916x2 = c6916x;
            }
            i2++;
            c6916x = c6916x2;
        }
        if (c6916x == null) {
            return null;
        }
        C6894k a = C6894k.m31284a(new C6972g(dataInputStream), null, c6916x);
        C6937m.m31635b(a instanceof C6906n);
        ((C6906n) a).mo5835a(false);
        return a.m31290a(0);
    }
}
