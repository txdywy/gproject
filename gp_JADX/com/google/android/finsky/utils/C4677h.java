package com.google.android.finsky.utils;

import java.nio.charset.Charset;

public final class C4677h {
    public static final Charset f24059a = Charset.forName("UTF-8");

    public static boolean m21811a(CharSequence charSequence) {
        if (!(charSequence == null || charSequence.length() == 0)) {
            if (charSequence == null) {
                charSequence = null;
            } else {
                int length = charSequence.length() - 1;
                int i = 0;
                while (i <= length && charSequence.charAt(i) <= ' ') {
                    i++;
                }
                int i2 = length;
                while (i2 >= i && charSequence.charAt(i2) <= ' ') {
                    i2--;
                }
                if (!(i == 0 && i2 == length)) {
                    charSequence = charSequence.subSequence(i, i2 + 1);
                }
            }
            if (charSequence.length() != 0) {
                return false;
            }
        }
        return true;
    }
}
