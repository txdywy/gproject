package com.google.android.finsky.billing.addresschallenge.p156a;

import com.google.android.finsky.utils.be;

final class ai {
    ai() {
    }

    static String m9548a(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char c = '\u0000';
            int i2 = i;
            while (i2 < length) {
                c = str.charAt(i2);
                if (c == ':' || c == '/') {
                    break;
                }
                i2++;
            }
            if (i2 == length) {
                stringBuilder.append(be.m21800a(str.substring(i)));
                break;
            }
            if (i2 > i) {
                stringBuilder.append(be.m21800a(str.substring(i, i2)));
                stringBuilder.append(c);
            } else {
                stringBuilder.append(c);
                i2 = i;
            }
            i = i2 + 1;
        }
        return stringBuilder.toString();
    }
}
