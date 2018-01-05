package com.google.android.gms.common.util;

import com.squareup.haha.perflib.HprofParser;

public final class C5149d {
    public static final char[] f26088a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String m23879a(byte[] bArr) {
        int i = 0;
        if (bArr.length == 0) {
            return new String();
        }
        int i2;
        char[] cArr = new char[((bArr.length * 3) - 1)];
        int i3 = 0;
        while (i < bArr.length - 1) {
            i2 = bArr[i] & HprofParser.ROOT_UNKNOWN;
            int i4 = i3 + 1;
            cArr[i3] = f26088a[i2 >>> 4];
            int i5 = i4 + 1;
            cArr[i4] = f26088a[i2 & 15];
            i3 = i5 + 1;
            cArr[i5] = ':';
            i++;
        }
        i = bArr[bArr.length - 1] & HprofParser.ROOT_UNKNOWN;
        i2 = i3 + 1;
        cArr[i3] = f26088a[i >>> 4];
        cArr[i2] = f26088a[i & 15];
        return new String(cArr);
    }
}
