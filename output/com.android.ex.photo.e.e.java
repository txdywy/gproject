package com.android.ex.photo.e;

public static class com.android.ex.photo.e.e extends Enum
{

    public static final com.android.ex.photo.e.e a;
    public static final com.android.ex.photo.e.e b;
    public static final com.android.ex.photo.e.e c;
    public static final e[] d;

    static {
        com.android.ex.photo.e.e.a = new com.android.ex.photo.e.e("EXTRA_SMALL", 0);
        com.android.ex.photo.e.e.b = new com.android.ex.photo.e.e("SMALL", 1);
        com.android.ex.photo.e.e.c = new com.android.ex.photo.e.e("NORMAL", 2);
        v0 = new e[3];
        v0[0] = com.android.ex.photo.e.e.a;
        v0[1] = com.android.ex.photo.e.e.b;
        v0[2] = com.android.ex.photo.e.e.c;
        com.android.ex.photo.e.e.d = v0;
    }

    e(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.android.ex.photo.e.e valueOf(String p0) {
        return (com.android.ex.photo.e.e)Enum.valueOf(com.android.ex.photo.e.e, p0);
    }

    public static e[] values() {
        return (e[])com.android.ex.photo.e.e.d.clone();
    }

}
