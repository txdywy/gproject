package com.google.android.wallet.common.util;

import com.squareup.haha.perflib.HprofParser;

public final class C6593e {
    public static final char[] f32729a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static byte[] m29919a(String str) {
        int i = 0;
        int length = str.length();
        if (length % 2 != 0) {
            str = String.format("0%s", new Object[]{str});
            length++;
        }
        byte[] bArr = new byte[(length / 2)];
        while (i < length) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) | Character.digit(str.charAt(i + 1), 16));
            i += 2;
        }
        return bArr;
    }

    public static String m29918a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[((length + 0) * 2)];
        for (int i = 0; i < length + 0; i++) {
            int i2 = bArr[i + 0] & HprofParser.ROOT_UNKNOWN;
            cArr[i * 2] = f32729a[i2 >> 4];
            cArr[(i * 2) + 1] = f32729a[i2 & 15];
        }
        return new String(cArr);
    }

    public static int m29917a(byte b) {
        return b & HprofParser.ROOT_UNKNOWN;
    }

    public static String m29920b(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bArr) {
            stringBuilder.append((char) (b & HprofParser.ROOT_UNKNOWN));
        }
        return stringBuilder.toString();
    }
}
