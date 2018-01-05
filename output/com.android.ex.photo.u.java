package com.android.ex.photo;

public static class com.android.ex.photo.u extends Enum
{

    public static final com.android.ex.photo.u a;
    public static final com.android.ex.photo.u b;
    public static final com.android.ex.photo.u c;
    public static final com.android.ex.photo.u d;
    public static final u[] e;

    static {
        com.android.ex.photo.u.a = new com.android.ex.photo.u("NONE", 0);
        com.android.ex.photo.u.b = new com.android.ex.photo.u("LEFT", 1);
        com.android.ex.photo.u.c = new com.android.ex.photo.u("RIGHT", 2);
        com.android.ex.photo.u.d = new com.android.ex.photo.u("BOTH", 3);
        v0 = new u[4];
        v0[0] = com.android.ex.photo.u.a;
        v0[1] = com.android.ex.photo.u.b;
        v0[2] = com.android.ex.photo.u.c;
        v0[3] = com.android.ex.photo.u.d;
        com.android.ex.photo.u.e = v0;
    }

    u(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.android.ex.photo.u valueOf(String p0) {
        return (com.android.ex.photo.u)Enum.valueOf(com.android.ex.photo.u, p0);
    }

    public static u[] values() {
        return (u[])com.android.ex.photo.u.e.clone();
    }

}
