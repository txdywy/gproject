package com.google.android.agera;

public static class com.google.android.agera.x
{

    public static Object a(Object p0) {
        if (p0 == 0)
            throw new NullPointerException();
        return p0;
    }

    public static void a(boolean p0, String p1) {
        if (p0 == 0)
            throw new IllegalStateException(p1);
    }

    public static void b(boolean p0, String p1) {
        if (p0 == 0)
            throw new IllegalArgumentException(p1);
    }

}
