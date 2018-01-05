package com.google.android.wallet.common.p376a;

import android.text.TextUtils;
import java.util.Locale;

public final class C6563p {
    public static int m29792a(String str) {
        if (str.length() != 2) {
            throw new IllegalArgumentException("CountryCode must have length of 2!");
        }
        if (str.equals("UK")) {
            str = "GB";
        }
        return (((Character.toUpperCase(str.charAt(0)) - 65) + 1) << 5) | ((Character.toUpperCase(str.charAt(1)) - 65) + 1);
    }

    public static String m29793a(int i) {
        if (i == 0 || (i & -1024) != 0) {
            return "ZZ";
        }
        char c = (char) ((((i & 992) >> 5) + 65) - 1);
        char c2 = (char) (((i & 31) + 65) - 1);
        return String.format(Locale.US, "%c%c", new Object[]{Character.valueOf(c), Character.valueOf(c2)});
    }

    public static int m29794b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return C6563p.m29792a(str);
        } catch (IllegalArgumentException e) {
            return 858;
        }
    }
}
