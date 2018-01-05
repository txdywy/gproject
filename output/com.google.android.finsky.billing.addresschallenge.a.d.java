package com.google.android.finsky.billing.addresschallenge.a;

import java.util.HashMap;
import java.util.Map;

public static class com.google.android.finsky.billing.addresschallenge.a.d extends Enum
{

    public static final com.google.android.finsky.billing.addresschallenge.a.d a;
    public static final com.google.android.finsky.billing.addresschallenge.a.d b;
    public static final com.google.android.finsky.billing.addresschallenge.a.d c;
    public static final com.google.android.finsky.billing.addresschallenge.a.d d;
    public static final com.google.android.finsky.billing.addresschallenge.a.d e;
    public static final com.google.android.finsky.billing.addresschallenge.a.d f;
    public static final com.google.android.finsky.billing.addresschallenge.a.d g;
    public static final com.google.android.finsky.billing.addresschallenge.a.d h;
    public static final com.google.android.finsky.billing.addresschallenge.a.d i;
    public static final com.google.android.finsky.billing.addresschallenge.a.d j;
    public static final com.google.android.finsky.billing.addresschallenge.a.d k;
    public static final Map l;
    public static final d[] n;
    public final char m;

    static {
        v0 = 0;
        com.google.android.finsky.billing.addresschallenge.a.d.a = new com.google.android.finsky.billing.addresschallenge.a.d("ADMIN_AREA", 0, 83);
        com.google.android.finsky.billing.addresschallenge.a.d.b = new com.google.android.finsky.billing.addresschallenge.a.d("LOCALITY", 1, 67);
        com.google.android.finsky.billing.addresschallenge.a.d.c = new com.google.android.finsky.billing.addresschallenge.a.d("RECIPIENT", 2, 78);
        com.google.android.finsky.billing.addresschallenge.a.d.d = new com.google.android.finsky.billing.addresschallenge.a.d("ORGANIZATION", 3, 79);
        com.google.android.finsky.billing.addresschallenge.a.d.e = new com.google.android.finsky.billing.addresschallenge.a.d("ADDRESS_LINE_1", 4, 49);
        com.google.android.finsky.billing.addresschallenge.a.d.f = new com.google.android.finsky.billing.addresschallenge.a.d("ADDRESS_LINE_2", 5, 50);
        com.google.android.finsky.billing.addresschallenge.a.d.g = new com.google.android.finsky.billing.addresschallenge.a.d("DEPENDENT_LOCALITY", 6, 68, 0);
        com.google.android.finsky.billing.addresschallenge.a.d.h = new com.google.android.finsky.billing.addresschallenge.a.d("POSTAL_CODE", 7, 90, 0);
        com.google.android.finsky.billing.addresschallenge.a.d.i = new com.google.android.finsky.billing.addresschallenge.a.d("SORTING_CODE", 8, 88, 0);
        com.google.android.finsky.billing.addresschallenge.a.d.j = new com.google.android.finsky.billing.addresschallenge.a.d("STREET_ADDRESS", 9, 65, 0);
        com.google.android.finsky.billing.addresschallenge.a.d.k = new com.google.android.finsky.billing.addresschallenge.a.d("COUNTRY", 10, 82, 0);
        v1 = new d[11];
        v1[0] = com.google.android.finsky.billing.addresschallenge.a.d.a;
        v1[1] = com.google.android.finsky.billing.addresschallenge.a.d.b;
        v1[2] = com.google.android.finsky.billing.addresschallenge.a.d.c;
        v1[3] = com.google.android.finsky.billing.addresschallenge.a.d.d;
        v1[4] = com.google.android.finsky.billing.addresschallenge.a.d.e;
        v1[5] = com.google.android.finsky.billing.addresschallenge.a.d.f;
        v1[6] = com.google.android.finsky.billing.addresschallenge.a.d.g;
        v1[7] = com.google.android.finsky.billing.addresschallenge.a.d.h;
        v1[8] = com.google.android.finsky.billing.addresschallenge.a.d.i;
        v1[9] = com.google.android.finsky.billing.addresschallenge.a.d.j;
        v1[10] = com.google.android.finsky.billing.addresschallenge.a.d.k;
        com.google.android.finsky.billing.addresschallenge.a.d.n = v1;
        com.google.android.finsky.billing.addresschallenge.a.d.l = new HashMap();
        v1 = com.google.android.finsky.billing.addresschallenge.a.d.values();
        while (v0 < v1.length) {
            com.google.android.finsky.billing.addresschallenge.a.d.l.put(Character.valueOf(v1[v0].m), v1[v0]);
            v0 = v0 + 1;
        }
    }

    d(String p0, int p1, char p2) {
        Enum(p0, p1);
        this.m = p2;
    }

    d(String p0, int p1, char p2, byte p3) {
        com.google.android.finsky.billing.addresschallenge.a.d(p0, p1, p2);
    }

    static com.google.android.finsky.billing.addresschallenge.a.d a(char p0) {
        return (com.google.android.finsky.billing.addresschallenge.a.d)com.google.android.finsky.billing.addresschallenge.a.d.l.get(Character.valueOf(p0));
    }

    public static com.google.android.finsky.billing.addresschallenge.a.d valueOf(String p0) {
        return (com.google.android.finsky.billing.addresschallenge.a.d)Enum.valueOf(com.google.android.finsky.billing.addresschallenge.a.d, p0);
    }

    public static d[] values() {
        return (d[])com.google.android.finsky.billing.addresschallenge.a.d.n.clone();
    }

}
