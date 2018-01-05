package com.google.android.wallet.ui.common.p402c;

import android.text.TextUtils;

public final class C6766c {
    public static int m30793a(String str, int[] iArr, boolean z) {
        if (str.length() != iArr.length) {
            throw new IllegalArgumentException("Length mismatch between digit string and multiplier array");
        } else if (TextUtils.isDigitsOnly(str)) {
            int length = str.length();
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int charAt = (str.charAt(i) - 48) * iArr[i];
                if (z) {
                    int i3 = charAt;
                    charAt = i2;
                    i2 = i3;
                    while (i2 > 0) {
                        int i4 = (i2 % 10) + charAt;
                        i2 /= 10;
                        charAt = i4;
                    }
                } else {
                    charAt += i2;
                }
                i++;
                i2 = charAt;
            }
            return i2;
        } else {
            throw new IllegalArgumentException("Non-digit char is found in string");
        }
    }

    public static char m30792a(int i, int i2, boolean z, boolean z2) {
        int i3 = i % i2;
        if (z) {
            i3 = i2 - i3;
        }
        if (!z2) {
            i3 %= 10;
        } else if (i3 > 9) {
            i3 = 0;
        }
        return (char) (i3 + 48);
    }
}
