package com.google.common.flogger.backend;

import java.io.IOException;

public final class C7041k {
    public static final String f34547a = C7041k.m32085a();

    private static String m32085a() {
        String str = "\n";
        try {
            String property = System.getProperty("line.separator");
            if (property.matches("\\n|\\r(?:\\n)?")) {
                return property;
            }
        } catch (SecurityException e) {
        }
        return str;
    }

    public static StringBuilder m32086a(StringBuilder stringBuilder, String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            try {
                if (str.charAt(i) == '%') {
                    if (i4 == i2) {
                        break;
                    }
                    char charAt = str.charAt(i4);
                    if (charAt == '%') {
                        stringBuilder.append(str, i3, i4);
                    } else if (charAt == 'n') {
                        stringBuilder.append(str, i3, i4 - 1);
                        stringBuilder.append(f34547a);
                    }
                    i = i4 + 1;
                    i3 = i;
                }
                i = i4;
            } catch (IOException e) {
                throw new AssertionError();
            }
        }
        if (i3 < i2) {
            stringBuilder.append(str, i3, i2);
        }
        return stringBuilder;
    }

    public static StringBuilder m32087b(StringBuilder stringBuilder, String str, int i, int i2) {
        Object obj = null;
        int i3 = i;
        int i4 = i;
        while (i3 < i2) {
            int i5 = i3 + 1;
            try {
                char charAt = str.charAt(i3);
                if (charAt == '\\' || charAt == '\'') {
                    int i6 = i5 - 1;
                    if (charAt == '\\') {
                        i3 = i5 + 1;
                        if (str.charAt(i5) != '\'') {
                            continue;
                        }
                    } else {
                        i3 = i5;
                    }
                    stringBuilder.append(str, i4, i6);
                    if (i3 == i2) {
                        break;
                    } else if (obj != null) {
                        obj = null;
                        i4 = i3;
                    } else if (str.charAt(i3) != '\'') {
                        obj = 1;
                        i4 = i3;
                    } else {
                        i4 = i3;
                        i3++;
                    }
                } else {
                    i3 = i5;
                }
            } catch (IOException e) {
                throw new AssertionError();
            }
        }
        i3 = i4;
        if (i3 < i2) {
            stringBuilder.append(str, i3, i2);
        }
        return stringBuilder;
    }
}
