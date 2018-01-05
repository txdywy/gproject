package com.google.android.wallet.nfc.p398a;

import com.google.android.wallet.common.util.C6593e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public final class C6688i {
    public static C6687h m30316a(C6685f c6685f) {
        return c6685f.f32991c.length == 0 ? null : (C6687h) C6688i.m30318b(c6685f.f32991c, 0).get(0);
    }

    private static List m30318b(byte[] bArr, int i) {
        if (i >= bArr.length) {
            return new LinkedList();
        }
        byte b = bArr[i];
        int i2 = (b & 32) != 0 ? 1 : 0;
        int i3 = ((b + 1) & 31) == 0 ? i + 2 : i + 1;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i3);
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        if (b2 == (byte) -127) {
            i4 = i3 + 2;
        } else if (b2 == (byte) -126) {
            i4 = i3 + 3;
        }
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i3, i4);
        if (copyOfRange2.length == 1) {
            i3 = C6593e.m29917a(copyOfRange2[0]);
        } else if (copyOfRange2.length == 2) {
            i3 = C6593e.m29917a(copyOfRange2[1]);
        } else {
            i3 = C6593e.m29917a(copyOfRange2[2]) | (C6593e.m29917a(copyOfRange2[1]) << 8);
        }
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr, i4, i4 + i3);
        List b3 = C6688i.m30318b(bArr, i3 + i4);
        b3.add(0, new C6687h(copyOfRange, copyOfRange3, i2 != 0 ? C6688i.m30318b(copyOfRange3, 0) : new ArrayList()));
        return b3;
    }

    static List m30317a(byte[] bArr, int i) {
        if (i >= bArr.length) {
            return new LinkedList();
        }
        int i2 = ((bArr[i] + 1) & 31) == 0 ? i + 2 : i + 1;
        Arrays.copyOfRange(bArr, i, i2);
        byte b = bArr[i2];
        List a = C6688i.m30317a(bArr, i2 + 1);
        a.add(0, new C6686g(b));
        return a;
    }
}
