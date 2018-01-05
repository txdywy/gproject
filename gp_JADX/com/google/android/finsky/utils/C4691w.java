package com.google.android.finsky.utils;

public final class C4691w {
    public static String m21842a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            stringBuilder.append("0123456789abcdef".charAt((b & 240) >> 4));
            stringBuilder.append("0123456789abcdef".charAt(b & 15));
        }
        return stringBuilder.toString();
    }
}
