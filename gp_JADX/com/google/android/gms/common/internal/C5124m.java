package com.google.android.gms.common.internal;

public final class C5124m {
    private C5124m(String str) {
        am.m23734a((Object) str, (Object) "log tag cannot be null");
        am.m23744b(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
    }

    public C5124m(String str, byte b) {
        this(str);
    }
}
