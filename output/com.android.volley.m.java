package com.android.volley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;
import java.util.TreeMap;

private static class com.android.volley.m
{

    public final int a;
    public final byte[] b;
    public final Map c;
    public final List d;
    public final boolean e;
    public final long f;

    m(int p0, byte[] p1, Map p2, List p3, boolean p4, long p5) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        if (p3 == 0)
            this.d = 0;
        else
            this.d = Collections.unmodifiableList(p3);
        this.e = p4;
        this.f = p5;
    }

    m(int p0, byte[] p1, Map p2, boolean p3) {
        com.android.volley.m(p0, p1, p2, p3, 0);
    }

    m(int p0, byte[] p1, Map p2, boolean p3, long p4) {
        com.android.volley.m(p0, p1, p2, com.android.volley.m.a(p2), p3, p4);
    }

    m(int p0, byte[] p1, boolean p2, long p3, List p5) {
        com.android.volley.m(p0, p1, com.android.volley.m.a(p5), p5, p2, p3);
    }

    m(byte[] p0) {
        com.android.volley.m(200, p0, 0, 0, Collections.emptyList());
    }

    m(byte[] p0, Map p1) {
        com.android.volley.m(200, p0, p1, 0, 0);
    }

    private static List a(Map p0) {
        if (p0 == 0)
            v0 = 0;
        else if (p0.isEmpty())
            v0 = Collections.emptyList();
        else {
            v2 = new ArrayList(p0.size());
            v3 = p0.entrySet().iterator();
            while (v3.hasNext()) {
                v0 = (Map$Entry)v3.next();
                v2.add(new com.android.volley.j((String)v0.getKey(), (String)v0.getValue()));
            }
            v0 = v2;
        }
        return v0;
    }

    private static Map a(List p0) {
        if (p0 == 0)
            v0 = 0;
        else if (p0.isEmpty())
            v0 = Collections.emptyMap();
        else {
            v1 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            v2 = p0.iterator();
            while (v2.hasNext()) {
                v0 = (com.android.volley.j)v2.next();
                v1.put(v0.a, v0.b);
            }
            v0 = v1;
        }
        return v0;
    }

}
