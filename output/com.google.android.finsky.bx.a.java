package com.google.android.finsky.bx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class com.google.android.finsky.bx.a extends Enum implements com.google.b.a.a.a.a.a.a
{

    public static final com.google.android.finsky.bx.a a;
    public static final a[] c;
    public final Set b;

    static {
        com.google.android.finsky.bx.a.a = new com.google.android.finsky.bx.a("INSTANCE");
        v0 = new a[1];
        v0[0] = com.google.android.finsky.bx.a.a;
        com.google.android.finsky.bx.a.c = v0;
    }

    a(String p0) {
        Enum(p0, 0);
        this.b = new HashSet();
    }

    public static com.google.android.finsky.bx.a valueOf(String p0) {
        return (com.google.android.finsky.bx.a)Enum.valueOf(com.google.android.finsky.bx.a, p0);
    }

    public static a[] values() {
        return (a[])com.google.android.finsky.bx.a.c.clone();
    }

    public final void a(long p0) {
        v1 = this.b.iterator();
        while (v1.hasNext())
            ((com.google.android.finsky.bx.b)v1.next()).a(p0);
    }

    public final void a(long p0, String p2) {
        v1 = this.b.iterator();
        while (v1.hasNext())
            ((com.google.android.finsky.bx.b)v1.next()).a(p0, p2);
    }

}
