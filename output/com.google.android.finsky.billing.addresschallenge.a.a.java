package com.google.android.finsky.billing.addresschallenge.a;

import java.util.Map;

public final class com.google.android.finsky.billing.addresschallenge.a.a implements Serializable
{

    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    a(com.google.android.finsky.billing.addresschallenge.a.b p0) {
        this.a = (String)p0.a.get(com.google.android.finsky.billing.addresschallenge.a.d.k);
        this.d = (String)p0.a.get(com.google.android.finsky.billing.addresschallenge.a.d.a);
        this.e = (String)p0.a.get(com.google.android.finsky.billing.addresschallenge.a.d.b);
        this.f = (String)p0.a.get(com.google.android.finsky.billing.addresschallenge.a.d.g);
        this.g = (String)p0.a.get(com.google.android.finsky.billing.addresschallenge.a.d.h);
        this.h = (String)p0.a.get(com.google.android.finsky.billing.addresschallenge.a.d.i);
        this.i = (String)p0.a.get(com.google.android.finsky.billing.addresschallenge.a.d.d);
        this.j = (String)p0.a.get(com.google.android.finsky.billing.addresschallenge.a.d.c);
        this.b = (String)p0.a.get(com.google.android.finsky.billing.addresschallenge.a.d.e);
        this.c = (String)p0.a.get(com.google.android.finsky.billing.addresschallenge.a.d.f);
        this.k = p0.b;
    }

    public final String a(com.google.android.finsky.billing.addresschallenge.a.d p0) {
        switch (p0.ordinal()) {
            case 0:
                v0 = this.d;
                break;
            case 1:
                v0 = this.e;
                break;
            case 2:
                v0 = this.j;
                break;
            case 3:
                v0 = this.i;
                break;
            case 4:
                v0 = this.b;
                break;
            case 5:
                v0 = this.c;
                break;
            case 6:
                v0 = this.f;
                break;
            case 7:
                v0 = this.g;
                break;
            case 8:
                v0 = this.h;
                break;
            case 9:
                v1 = String.valueOf(p0);
                throw new IllegalArgumentException((String.valueOf(v1).length() + 18) + "unrecognized key: " + v1);
            case 10:
                v0 = this.a;
                break;
            default:
                v1 = String.valueOf(p0);
                throw new IllegalArgumentException((String.valueOf(v1).length() + 18) + "unrecognized key: " + v1);
        }
        return v0;
    }

}
