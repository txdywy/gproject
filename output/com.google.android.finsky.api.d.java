package com.google.android.finsky.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public static class com.google.android.finsky.api.d
{

    public static final Comparator a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Long e;
    public final String[] f;
    public final Boolean g;
    public final boolean h;

    static {
        com.google.android.finsky.api.d.a = new com.google.android.finsky.api.e();
    }

    d(String p0) {
        this.b = p0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    d(String p0, int p1, Integer p2, Long p3, String[] p4, boolean p5, Boolean p6) {
        this.b = p0;
        this.c = Integer.valueOf(p1);
        this.d = p2;
        this.e = p3;
        this.f = p4;
        this.h = p5;
        this.g = p6;
    }

    public static List a(Collection p0) {
        v1 = new ArrayList(p0.size());
        v2 = p0.iterator();
        while (v2.hasNext())
            v1.add(new com.google.android.finsky.api.d((String)v2.next()));
        return v1;
    }

}
