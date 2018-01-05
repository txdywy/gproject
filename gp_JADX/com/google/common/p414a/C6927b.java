package com.google.common.p414a;

public final class C6927b {
    public static String m31615a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (C6927b.m31616a(str.charAt(i))) {
                char[] toCharArray = str.toCharArray();
                while (i < length) {
                    char c = toCharArray[i];
                    if (C6927b.m31616a(c)) {
                        toCharArray[i] = (char) (c ^ 32);
                    }
                    i++;
                }
                return String.valueOf(toCharArray);
            }
            i++;
        }
        return str;
    }

    private static boolean m31616a(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
