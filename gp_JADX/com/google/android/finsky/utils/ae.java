package com.google.android.finsky.utils;

public final class ae {
    public static boolean m21693a(String str, String str2) {
        if (str2.isEmpty()) {
            return false;
        }
        char charAt = str2.charAt(0);
        String[] a = C4680k.m21818a(str2.substring(1));
        if (charAt == '-') {
            for (String equals : a) {
                if (equals.equals(str)) {
                    return false;
                }
            }
            return true;
        } else if (charAt != '+') {
            return false;
        } else {
            for (String equals2 : a) {
                if (equals2.equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }
}
