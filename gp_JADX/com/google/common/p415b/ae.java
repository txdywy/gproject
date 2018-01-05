package com.google.common.p415b;

final class ae {
    static int m31700a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 40).append(str).append(" cannot be negative but was: ").append(i).toString());
    }
}
