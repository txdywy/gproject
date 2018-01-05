package com.google.compression.brotli.dec;

final class C7082e {
    public static final boolean f34615a;

    static {
        boolean z = true;
        try {
            Class.forName(String.valueOf(Dictionary.class.getPackage().getName()).concat(".DictionaryData"));
        } catch (Throwable th) {
            z = false;
        }
        f34615a = z;
    }
}
