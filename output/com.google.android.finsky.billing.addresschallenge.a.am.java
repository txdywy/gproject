package com.google.android.finsky.billing.addresschallenge.a;

import java.util.EnumMap;
import java.util.Map;

public final class com.google.android.finsky.billing.addresschallenge.a.am
{

    public com.google.android.finsky.billing.addresschallenge.a.an a;
    public com.google.android.finsky.billing.addresschallenge.a.ao b;
    public Map c;
    public String d;

    am(com.google.android.finsky.billing.addresschallenge.a.al p0) {
        this.b = com.google.android.finsky.billing.addresschallenge.a.ao.b;
        this.c = new EnumMap(com.google.android.finsky.billing.addresschallenge.a.d);
        this.a = p0.b;
        this.b = p0.c;
        this.d = p0.f;
        v1 = 0;
        while (v1 < com.google.android.finsky.billing.addresschallenge.a.al.a.length && p0.d.containsKey(com.google.android.finsky.billing.addresschallenge.a.al.a[v1])) {
            this.c.put(com.google.android.finsky.billing.addresschallenge.a.al.a[v1], (String)p0.d.get(com.google.android.finsky.billing.addresschallenge.a.al.a[v1]));
            v1 = v1 + 1;
        }
    }

    am(com.google.android.finsky.billing.addresschallenge.a.an p0) {
        this.b = com.google.android.finsky.billing.addresschallenge.a.ao.b;
        this.c = new EnumMap(com.google.android.finsky.billing.addresschallenge.a.d);
        this.a = p0;
    }

    am(String p0) {
        this.b = com.google.android.finsky.billing.addresschallenge.a.ao.b;
        this.c = new EnumMap(com.google.android.finsky.billing.addresschallenge.a.d);
        v2 = p0.split("/");
        if (!v2[0].equals(com.google.android.finsky.billing.addresschallenge.a.an.a.name().toLowerCase()) && !v2[0].equals(com.google.android.finsky.billing.addresschallenge.a.an.b.name().toLowerCase())) {
            v0 = String.valueOf(v2[0]);
            if (v0.length() != 0)
                v0 = "Wrong key type: ".concat(v0);
            else
                v0 = new String("Wrong key type: ");
            throw new RuntimeException(v0);
        }
        if (v2.length > com.google.android.finsky.billing.addresschallenge.a.al.a.length + 1)
            throw new RuntimeException((String.valueOf(p0).length() + 44) + "input key '" + p0 + "' deeper than supported hierarchy");
        if (!v2[0].equals("data")) {
            if (!v2[0].equals("examples"))
                return;
            this.a = com.google.android.finsky.billing.addresschallenge.a.an.b;
            if (v2.length > 1)
                this.c.put(com.google.android.finsky.billing.addresschallenge.a.d.k, v2[1]);
            if (v2.length <= 2) {
                if (v2.length > 3 && !v2[3].equals("_default"))
                    this.d = v2[3];
                return;
            }
            if (v2[2].equals("local"))
                this.b = com.google.android.finsky.billing.addresschallenge.a.ao.b;
            else {
                if (!v2[2].equals("latin"))
                    throw new RuntimeException("Script type has to be either latin or local.");
                this.b = com.google.android.finsky.billing.addresschallenge.a.ao.a;
            }
            if (v2.length > 3 && !v2[3].equals("_default"))
                this.d = v2[3];
            return;
        }
        this.a = com.google.android.finsky.billing.addresschallenge.a.an.a;
        if (v2.length > 1) {
            v0 = com.google.android.finsky.billing.addresschallenge.a.az.c(v2[1]);
            if (v0.contains("--")) {
                v3 = v0.split("--");
                if (v3.length != 2)
                    throw new RuntimeException("Wrong format: Substring should be country code--language code");
                v0 = v3[0];
                this.d = v3[1];
            }
            this.c.put(com.google.android.finsky.billing.addresschallenge.a.al.a[0], v0);
        }
        if (v2.length > 2) {
            v0 = 2;
            while (v0 < v2.length) {
                v1 = com.google.android.finsky.billing.addresschallenge.a.az.c(v2[v0]);
                if (v1 == 0)
                    break;
                this.c.put(com.google.android.finsky.billing.addresschallenge.a.al.a[v0 - 1], v1);
                v0 = v0 + 1;
            }
        }
        return;
        if (!v2[0].equals("examples"))
            return;
        this.a = com.google.android.finsky.billing.addresschallenge.a.an.b;
        if (v2.length > 1)
            this.c.put(com.google.android.finsky.billing.addresschallenge.a.d.k, v2[1]);
        if (v2.length <= 2) {
            if (v2.length > 3 && !v2[3].equals("_default"))
                this.d = v2[3];
            return;
        }
        if (v2[2].equals("local"))
            this.b = com.google.android.finsky.billing.addresschallenge.a.ao.b;
        else {
            if (!v2[2].equals("latin"))
                throw new RuntimeException("Script type has to be either latin or local.");
            this.b = com.google.android.finsky.billing.addresschallenge.a.ao.a;
        }
        if (v2.length > 3 && !v2[3].equals("_default"))
            this.d = v2[3];
    }

    public final com.google.android.finsky.billing.addresschallenge.a.al a() {
        return new com.google.android.finsky.billing.addresschallenge.a.al(this);
    }

    public final com.google.android.finsky.billing.addresschallenge.a.am a(com.google.android.finsky.billing.addresschallenge.a.a p0) {
        this.d = p0.k;
        if (this.d != 0 && com.google.android.finsky.billing.addresschallenge.a.az.a(this.d))
            this.b = com.google.android.finsky.billing.addresschallenge.a.ao.a;
        if (p0.a != 0) {
            this.c.put(com.google.android.finsky.billing.addresschallenge.a.d.k, p0.a);
            if (p0.d != 0) {
                this.c.put(com.google.android.finsky.billing.addresschallenge.a.d.a, p0.d);
                if (p0.e != 0) {
                    this.c.put(com.google.android.finsky.billing.addresschallenge.a.d.b, p0.e);
                    if (p0.f != 0)
                        this.c.put(com.google.android.finsky.billing.addresschallenge.a.d.g, p0.f);
                }
            }
        }
        return this;
    }

}
