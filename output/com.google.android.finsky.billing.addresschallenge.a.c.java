package com.google.android.finsky.billing.addresschallenge.a;

import java.util.HashMap;
import java.util.Map;

public static class com.google.android.finsky.billing.addresschallenge.a.c extends Enum
{

    public static final com.google.android.finsky.billing.addresschallenge.a.c a;
    public static final com.google.android.finsky.billing.addresschallenge.a.c b;
    public static final com.google.android.finsky.billing.addresschallenge.a.c c;
    public static final com.google.android.finsky.billing.addresschallenge.a.c d;
    public static final com.google.android.finsky.billing.addresschallenge.a.c e;
    public static final com.google.android.finsky.billing.addresschallenge.a.c f;
    public static final com.google.android.finsky.billing.addresschallenge.a.c g;
    public static final com.google.android.finsky.billing.addresschallenge.a.c h;
    public static final com.google.android.finsky.billing.addresschallenge.a.c i;
    public static final com.google.android.finsky.billing.addresschallenge.a.c j;
    public static final com.google.android.finsky.billing.addresschallenge.a.c k;
    public static final com.google.android.finsky.billing.addresschallenge.a.c l;
    public static final com.google.android.finsky.billing.addresschallenge.a.c m;
    public static final com.google.android.finsky.billing.addresschallenge.a.c n;
    public static final com.google.android.finsky.billing.addresschallenge.a.c o;
    public static final Map p;
    public static final c[] q;

    static {
        v0 = 0;
        com.google.android.finsky.billing.addresschallenge.a.c.a = new com.google.android.finsky.billing.addresschallenge.a.c("COUNTRIES", 0);
        com.google.android.finsky.billing.addresschallenge.a.c.b = new com.google.android.finsky.billing.addresschallenge.a.c("FMT", 1);
        com.google.android.finsky.billing.addresschallenge.a.c.c = new com.google.android.finsky.billing.addresschallenge.a.c("ID", 2);
        com.google.android.finsky.billing.addresschallenge.a.c.d = new com.google.android.finsky.billing.addresschallenge.a.c("KEY", 3);
        com.google.android.finsky.billing.addresschallenge.a.c.e = new com.google.android.finsky.billing.addresschallenge.a.c("LANG", 4);
        com.google.android.finsky.billing.addresschallenge.a.c.f = new com.google.android.finsky.billing.addresschallenge.a.c("LFMT", 5);
        com.google.android.finsky.billing.addresschallenge.a.c.g = new com.google.android.finsky.billing.addresschallenge.a.c("REQUIRE", 6);
        com.google.android.finsky.billing.addresschallenge.a.c.h = new com.google.android.finsky.billing.addresschallenge.a.c("STATE_NAME_TYPE", 7);
        com.google.android.finsky.billing.addresschallenge.a.c.i = new com.google.android.finsky.billing.addresschallenge.a.c("SUB_KEYS", 8);
        com.google.android.finsky.billing.addresschallenge.a.c.j = new com.google.android.finsky.billing.addresschallenge.a.c("SUB_LNAMES", 9);
        com.google.android.finsky.billing.addresschallenge.a.c.k = new com.google.android.finsky.billing.addresschallenge.a.c("SUB_MORES", 10);
        com.google.android.finsky.billing.addresschallenge.a.c.l = new com.google.android.finsky.billing.addresschallenge.a.c("SUB_NAMES", 11);
        com.google.android.finsky.billing.addresschallenge.a.c.m = new com.google.android.finsky.billing.addresschallenge.a.c("XZIP", 12);
        com.google.android.finsky.billing.addresschallenge.a.c.n = new com.google.android.finsky.billing.addresschallenge.a.c("ZIP", 13);
        com.google.android.finsky.billing.addresschallenge.a.c.o = new com.google.android.finsky.billing.addresschallenge.a.c("ZIP_NAME_TYPE", 14);
        v1 = new c[15];
        v1[0] = com.google.android.finsky.billing.addresschallenge.a.c.a;
        v1[1] = com.google.android.finsky.billing.addresschallenge.a.c.b;
        v1[2] = com.google.android.finsky.billing.addresschallenge.a.c.c;
        v1[3] = com.google.android.finsky.billing.addresschallenge.a.c.d;
        v1[4] = com.google.android.finsky.billing.addresschallenge.a.c.e;
        v1[5] = com.google.android.finsky.billing.addresschallenge.a.c.f;
        v1[6] = com.google.android.finsky.billing.addresschallenge.a.c.g;
        v1[7] = com.google.android.finsky.billing.addresschallenge.a.c.h;
        v1[8] = com.google.android.finsky.billing.addresschallenge.a.c.i;
        v1[9] = com.google.android.finsky.billing.addresschallenge.a.c.j;
        v1[10] = com.google.android.finsky.billing.addresschallenge.a.c.k;
        v1[11] = com.google.android.finsky.billing.addresschallenge.a.c.l;
        v1[12] = com.google.android.finsky.billing.addresschallenge.a.c.m;
        v1[13] = com.google.android.finsky.billing.addresschallenge.a.c.n;
        v1[14] = com.google.android.finsky.billing.addresschallenge.a.c.o;
        com.google.android.finsky.billing.addresschallenge.a.c.q = v1;
        com.google.android.finsky.billing.addresschallenge.a.c.p = new HashMap();
        v1 = com.google.android.finsky.billing.addresschallenge.a.c.values();
        while (v0 < v1.length) {
            com.google.android.finsky.billing.addresschallenge.a.c.p.put(v1[v0].toString().toLowerCase(), v1[v0]);
            v0 = v0 + 1;
        }
    }

    c(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.google.android.finsky.billing.addresschallenge.a.c valueOf(String p0) {
        return (com.google.android.finsky.billing.addresschallenge.a.c)Enum.valueOf(com.google.android.finsky.billing.addresschallenge.a.c, p0);
    }

    public static c[] values() {
        return (c[])com.google.android.finsky.billing.addresschallenge.a.c.q.clone();
    }

}
