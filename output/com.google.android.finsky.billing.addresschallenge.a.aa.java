package com.google.android.finsky.billing.addresschallenge.a;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public final class com.google.android.finsky.billing.addresschallenge.a.aa
{

    public String a;
    public com.google.android.finsky.billing.addresschallenge.a.z b;
    public Set c;
    public Set d;
    public Map e;
    public String[] f;
    public String[] g;
    public String[] h;
    public Pattern i;
    public Pattern j;

    aa(com.google.android.finsky.billing.addresschallenge.a.aa p0, com.google.android.finsky.billing.addresschallenge.a.i p1) {
        this.c = p0.c;
        this.d = p0.d;
        this.b = p0.b;
        this.i = p0.i;
        this.j = p0.j;
        if (p1 != 0) {
            if (p1.a(com.google.android.finsky.billing.addresschallenge.a.c.c))
                this.a = p1.b(com.google.android.finsky.billing.addresschallenge.a.c.c);
            if (p1.a(com.google.android.finsky.billing.addresschallenge.a.c.i))
                this.f = p1.b(com.google.android.finsky.billing.addresschallenge.a.c.i).split("~");
            if (p1.a(com.google.android.finsky.billing.addresschallenge.a.c.j))
                this.g = p1.b(com.google.android.finsky.billing.addresschallenge.a.c.j).split("~");
            if (p1.a(com.google.android.finsky.billing.addresschallenge.a.c.l))
                this.h = p1.b(com.google.android.finsky.billing.addresschallenge.a.c.l).split("~");
            if (p1.a(com.google.android.finsky.billing.addresschallenge.a.c.b))
                this.c = com.google.android.finsky.billing.addresschallenge.a.aa.b(p1.b(com.google.android.finsky.billing.addresschallenge.a.c.b));
            if (p1.a(com.google.android.finsky.billing.addresschallenge.a.c.g))
                this.d = com.google.android.finsky.billing.addresschallenge.a.aa.c(p1.b(com.google.android.finsky.billing.addresschallenge.a.c.g));
            if (p1.a(com.google.android.finsky.billing.addresschallenge.a.c.m))
                this.i = Pattern.compile(p1.b(com.google.android.finsky.billing.addresschallenge.a.c.m), 2);
            if (p1.a(com.google.android.finsky.billing.addresschallenge.a.c.n)) {
                com.google.android.finsky.billing.addresschallenge.a.az.a(this.a, "Cannot use null as key");
                if (this.a.split("/").length == 2)
                    this.i = Pattern.compile(p1.b(com.google.android.finsky.billing.addresschallenge.a.c.n), 2);
                else
                    this.j = Pattern.compile(p1.b(com.google.android.finsky.billing.addresschallenge.a.c.n), 2);
            }
            if (this.f != 0 && this.h == 0 && this.g != 0 && this.f.length == this.g.length)
                this.h = this.f;
        }
        this.e = com.google.android.finsky.billing.addresschallenge.a.az.a(this.f, this.h, this.g);
    }

    aa(com.google.android.finsky.billing.addresschallenge.a.z p0) {
        this.b = p0;
        this.a = "data";
        v0 = this.b.b("data");
        if (v0.a(com.google.android.finsky.billing.addresschallenge.a.c.a))
            this.f = v0.b(com.google.android.finsky.billing.addresschallenge.a.c.a).split("~");
        this.e = com.google.android.finsky.billing.addresschallenge.a.az.a(this.f, 0, 0);
        v0 = this.b.b("data/ZZ");
        this.c = new HashSet();
        if (v0.a(com.google.android.finsky.billing.addresschallenge.a.c.b))
            this.c = com.google.android.finsky.billing.addresschallenge.a.aa.b(v0.b(com.google.android.finsky.billing.addresschallenge.a.c.b));
        this.d = new HashSet();
        if (v0.a(com.google.android.finsky.billing.addresschallenge.a.c.g))
            this.d = com.google.android.finsky.billing.addresschallenge.a.aa.c(v0.b(com.google.android.finsky.billing.addresschallenge.a.c.g));
    }

    private static Set b(String p0) {
        v3 = EnumSet.of(com.google.android.finsky.billing.addresschallenge.a.d.k);
        v4 = p0.toCharArray();
        v2 = 0;
        v0 = 0;
        while (v2 < v4.length) {
            if (v0 != 0) {
                if (v4[v2] != 110) {
                    v0 = com.google.android.finsky.billing.addresschallenge.a.d.a(v4[v2]);
                    if (v0 == 0)
                        throw new RuntimeException((String.valueOf(p0).length() + 46) + "Unrecognized character '" + v4[v2] + "' in format pattern: " + p0);
                    v3.add(v0);
                    v0 = 0;
                }
                else
                    v0 = 0;
            }
            else if (v4[v2] == 37)
                v0 = 1;
            v2 = v2 + 1;
        }
        v3.remove(com.google.android.finsky.billing.addresschallenge.a.d.e);
        v3.remove(com.google.android.finsky.billing.addresschallenge.a.d.f);
        return v3;
    }

    private static Set c(String p0) {
        v1 = EnumSet.of(com.google.android.finsky.billing.addresschallenge.a.d.k);
        v2 = p0.toCharArray();
        v0 = 0;
        while (v0 < v2.length) {
            v5 = com.google.android.finsky.billing.addresschallenge.a.d.a(v2[v0]);
            if (v5 == 0)
                throw new RuntimeException((String.valueOf(p0).length() + 47) + "Unrecognized character '" + v2[v0] + "' in require pattern: " + p0);
            v1.add(v5);
            v0 = v0 + 1;
        }
        v1.remove(com.google.android.finsky.billing.addresschallenge.a.d.e);
        v1.remove(com.google.android.finsky.billing.addresschallenge.a.d.f);
        return v1;
    }

    final com.google.android.finsky.billing.addresschallenge.a.aa a(String p0) {
        if (com.google.android.finsky.billing.addresschallenge.a.az.c(p0) == 0)
            v0 = new com.google.android.finsky.billing.addresschallenge.a.aa(this, 0);
        else {
            v1 = this.b.a((String.valueOf(this.a).length() + 1 + String.valueOf(p0).length()) + this.a + "/" + p0);
            if (v1 != 0) {
                v0 = new com.google.android.finsky.billing.addresschallenge.a.aa(this, v1);
                return v0;
            }
            if (this.g == 0) {
                v0 = new com.google.android.finsky.billing.addresschallenge.a.aa(this, 0);
                return v0;
            }
            v0 = 0;
            while (v0 < this.g.length) {
                if (this.g[v0].equalsIgnoreCase(p0)) {
                    v1 = this.b.a((String.valueOf(this.a).length() + 1 + String.valueOf(this.h[v0]).length()) + this.a + "/" + this.h[v0]);
                    if (v1 != 0) {
                        v0 = new com.google.android.finsky.billing.addresschallenge.a.aa(this, v1);
                        return v0;
                    }
                }
                v0 = v0 + 1;
            }
            v0 = new com.google.android.finsky.billing.addresschallenge.a.aa(this, 0);
        }
        return v0;
    }

    public final String toString() {
        return this.a;
    }

}
