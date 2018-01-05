package com.squareup.leakcanary;

final class Preconditions {
    static Object checkNotNull(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(str).concat(" must not be null"));
    }

    private Preconditions() {
        throw new AssertionError();
    }
}
