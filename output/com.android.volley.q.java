package com.android.volley;

public static class com.android.volley.q extends Enum
{

    public static final com.android.volley.q a;
    public static final com.android.volley.q b;
    public static final com.android.volley.q c;
    public static final com.android.volley.q d;
    public static final q[] e;

    static {
        com.android.volley.q.a = new com.android.volley.q("LOW", 0);
        com.android.volley.q.b = new com.android.volley.q("NORMAL", 1);
        com.android.volley.q.c = new com.android.volley.q("HIGH", 2);
        com.android.volley.q.d = new com.android.volley.q("IMMEDIATE", 3);
        v0 = new q[4];
        v0[0] = com.android.volley.q.a;
        v0[1] = com.android.volley.q.b;
        v0[2] = com.android.volley.q.c;
        v0[3] = com.android.volley.q.d;
        com.android.volley.q.e = v0;
    }

    q(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.android.volley.q valueOf(String p0) {
        return (com.android.volley.q)Enum.valueOf(com.android.volley.q, p0);
    }

    public static q[] values() {
        return (q[])com.android.volley.q.e.clone();
    }

}
