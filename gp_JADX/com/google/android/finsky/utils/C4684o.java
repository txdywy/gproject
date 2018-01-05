package com.google.android.finsky.utils;

public final class C4684o {
    public static String m21830a(String[] strArr, char c) {
        int i = 0;
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (i < strArr.length) {
            if (i != 0) {
                stringBuilder.append(c);
            }
            stringBuilder.append(strArr[i]);
            i++;
        }
        return stringBuilder.toString();
    }
}
