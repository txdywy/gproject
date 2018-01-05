package com.google.android.finsky.appdiscoveryservice;

import android.text.TextUtils;

final class C1342x implements C1337s {
    C1342x() {
    }

    public final int mo1691a(String str, String str2) {
        int i = 1;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("target cannot be null or empty");
        }
        String toLowerCase = str.toLowerCase();
        String toLowerCase2 = str2.toLowerCase();
        int a = C1342x.m7823a(toLowerCase, toLowerCase2, 100) - 1;
        String[] split = toLowerCase2.split("\\s+");
        if (split.length <= 1) {
            return a;
        }
        while (i < split.length) {
            a += C1342x.m7823a(toLowerCase, split[i], 10);
            i++;
        }
        return a;
    }

    private static int m7823a(String str, String str2, int i) {
        int i2;
        int i3;
        if (str2.charAt(0) == str.charAt(0)) {
            i2 = 0;
            i3 = 0;
            while (i2 < str.length()) {
                if (i2 >= str2.length() || str.charAt(i2) != str2.charAt(i2)) {
                    i3 -= i * 2;
                } else {
                    i3 += i;
                }
                i2++;
            }
            i2 = i3;
        } else {
            i2 = 0;
        }
        if (i2 <= 0) {
            return i2;
        }
        i3 = str2.length() - str.length();
        if (i3 >= 0) {
            return i2 + (i - Math.max(0, i - i3));
        }
        return i2;
    }
}
