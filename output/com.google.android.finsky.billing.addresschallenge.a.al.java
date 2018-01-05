package com.google.android.finsky.billing.addresschallenge.a;

import java.util.Map;

public final class com.google.android.finsky.billing.addresschallenge.a.al
{

    public static final d[] a;
    public final com.google.android.finsky.billing.addresschallenge.a.an b;
    public final com.google.android.finsky.billing.addresschallenge.a.ao c;
    public final Map d;
    public final String e;
    public final String f;

    static {
        v0 = new d[4];
        v0[0] = com.google.android.finsky.billing.addresschallenge.a.d.k;
        v0[1] = com.google.android.finsky.billing.addresschallenge.a.d.a;
        v0[2] = com.google.android.finsky.billing.addresschallenge.a.d.b;
        v0[3] = com.google.android.finsky.billing.addresschallenge.a.d.g;
        com.google.android.finsky.billing.addresschallenge.a.al.a = v0;
    }

    al(com.google.android.finsky.billing.addresschallenge.a.am p0) {
        this.b = p0.a;
        this.c = p0.b;
        this.d = p0.c;
        this.f = p0.d;
        this.e = this.a();
    }

    private final String a() {
        v2 = new StringBuilder(this.b.name().toLowerCase());
        if (this.b != com.google.android.finsky.billing.addresschallenge.a.an.a) {
            if (this.d.containsKey(com.google.android.finsky.billing.addresschallenge.a.d.k))
                v2.append("/").append((String)this.d.get(com.google.android.finsky.billing.addresschallenge.a.d.k)).append("/").append(this.c.name().toLowerCase()).append("/_default");
            return v2.toString();
        }
        v1 = 0;
        while (v1 < com.google.android.finsky.billing.addresschallenge.a.al.a.length && this.d.containsKey(com.google.android.finsky.billing.addresschallenge.a.al.a[v1])) {
            if (com.google.android.finsky.billing.addresschallenge.a.al.a[v1] == com.google.android.finsky.billing.addresschallenge.a.d.k && this.f != 0)
                v2.append("/").append((String)this.d.get(com.google.android.finsky.billing.addresschallenge.a.al.a[v1])).append("--").append(this.f);
            else
                v2.append("/").append((String)this.d.get(com.google.android.finsky.billing.addresschallenge.a.al.a[v1]));
            v1 = v1 + 1;
        }
        return v2.toString();
        if (this.d.containsKey(com.google.android.finsky.billing.addresschallenge.a.d.k))
            v2.append("/").append((String)this.d.get(com.google.android.finsky.billing.addresschallenge.a.d.k)).append("/").append(this.c.name().toLowerCase()).append("/_default");
        return v2.toString();
    }

    static boolean a(String p0) {
        v0 = 0;
        v2 = com.google.android.finsky.billing.addresschallenge.a.an.values();
        v1 = 0;
        while (true) {
            if (v1 >= v2.length)
                return v0;
            if (p0.startsWith(v2[v1].name().toLowerCase()))
                break;
            v1 = v1 + 1;
        }
        v0 = 1;
        return v0;
    }

    final com.google.android.finsky.billing.addresschallenge.a.al a(com.google.android.finsky.billing.addresschallenge.a.d p0) {
        v0 = 0;
        if (this.b != com.google.android.finsky.billing.addresschallenge.a.an.a)
            throw new RuntimeException("Only support getting parent keys for the data key type.");
        v5 = new com.google.android.finsky.billing.addresschallenge.a.am(this);
        v4 = 0;
        v2 = 0;
        while (v4 < com.google.android.finsky.billing.addresschallenge.a.al.a.length) {
            if (v2 != 0 && v5.c.containsKey(com.google.android.finsky.billing.addresschallenge.a.al.a[v4]))
                v5.c.remove(com.google.android.finsky.billing.addresschallenge.a.al.a[v4]);
            if (com.google.android.finsky.billing.addresschallenge.a.al.a[v4] == p0) {
                if (!v5.c.containsKey(com.google.android.finsky.billing.addresschallenge.a.al.a[v4])) {
                    v0 = 0;
                    return v0;
                }
                v0 = 1;
                v2 = 1;
            }
            v4 = v4 + 1;
        }
        if (v0 == 0)
            v0 = 0;
        else {
            v5.d = this.f;
            v5.b = this.c;
            v0 = v5.a();
        }
        return v0;
    }

    public final boolean equals(Object p0) {
        if (this == p0)
            v0 = 1;
        else if (p0 == 0 || p0.getClass() != this.getClass())
            v0 = 0;
        else
            v0 = ((com.google.android.finsky.billing.addresschallenge.a.al)p0).toString().equals(this.e);
        return v0;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e;
    }

}
