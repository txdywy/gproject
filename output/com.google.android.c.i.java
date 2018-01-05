package com.google.android.c;

import android.content.ContentResolver;

public abstract class com.google.android.c.i
{

    public static ContentResolver a;
    public final String b;
    public final Object c;

    static {
        com.google.android.c.i.a = 0;
    }

    i(String p0, Object p1) {
        this.b = p0;
        this.c = p1;
    }

    public static com.google.android.c.i a(String p0, Integer p1) {
        return new com.google.android.c.l(p0, p1);
    }

    public static com.google.android.c.i a(String p0, Long p1) {
        return new com.google.android.c.k(p0, p1);
    }

    public static com.google.android.c.i a(String p0, String p1) {
        return new com.google.android.c.m(p0, p1);
    }

    public static com.google.android.c.i a(String p0, boolean p1) {
        return new com.google.android.c.j(p0, Boolean.valueOf(p1));
    }

    public abstract Object a();

}
