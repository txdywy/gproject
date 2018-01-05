package com.google.android.finsky.billing.addresschallenge.a;

import java.util.HashMap;
import java.util.Map;

public final class com.google.android.finsky.billing.addresschallenge.a.b
{

    public final Map a;
    public String b;

    b() {
        this.b = 0;
        this.a = new HashMap();
    }

    b(com.google.android.finsky.billing.addresschallenge.a.a p0) {
        this.b = 0;
        this.a = new HashMap();
        this.a(p0);
    }

    private final com.google.android.finsky.billing.addresschallenge.a.b a(com.google.android.finsky.billing.addresschallenge.a.a p0) {
        this.a.clear();
        v1 = com.google.android.finsky.billing.addresschallenge.a.d.values();
        v0 = 0;
        while (v0 < v1.length) {
            if (v1[v0] != com.google.android.finsky.billing.addresschallenge.a.d.j)
                this.a(v1[v0], p0.a(v1[v0]));
            v0 = v0 + 1;
        }
        this.b();
        this.b = p0.k;
        return this;
    }

    private final void b() {
        v0 = (String)this.a.get(com.google.android.finsky.billing.addresschallenge.a.d.e);
        v1 = (String)this.a.get(com.google.android.finsky.billing.addresschallenge.a.d.f);
        if (v0 == 0 || v0.trim().length() == 0)
            v0 = 0;
        else {
            v5 = v1;
            v1 = v0;
            v0 = v5;
        }
        if (v1 != 0) {
            v2 = v1.split("\n");
            if (v2.length > 1) {
                v1 = v2[0];
                v0 = v2[1];
            }
        }
        this.a.put(com.google.android.finsky.billing.addresschallenge.a.d.e, v1);
        this.a.put(com.google.android.finsky.billing.addresschallenge.a.d.f, v0);
    }

    public final com.google.android.finsky.billing.addresschallenge.a.a a() {
        return new com.google.android.finsky.billing.addresschallenge.a.a(this);
    }

    public final com.google.android.finsky.billing.addresschallenge.a.b a(com.google.android.finsky.billing.addresschallenge.a.d p0, String p1) {
        if (p1 == 0 || p1.length() == 0)
            this.a.remove(p0);
        else
            this.a.put(p0, p1.trim());
        this.b();
        return this;
    }

    public final com.google.android.finsky.billing.addresschallenge.a.b a(String p0) {
        return this.a(com.google.android.finsky.billing.addresschallenge.a.d.k, p0);
    }

}
