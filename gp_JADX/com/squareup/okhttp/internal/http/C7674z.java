package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C7691x;

public final class C7674z {
    public static String m36993a(C7691x c7691x) {
        int indexOf = c7691x.f39803i.indexOf(47, c7691x.f39796b.length() + 3);
        String substring = c7691x.f39803i.substring(indexOf, C7691x.m37028a(c7691x.f39803i, indexOf, c7691x.f39803i.length(), "?#"));
        String f = c7691x.m37043f();
        return f != null ? substring + '?' + f : substring;
    }
}
