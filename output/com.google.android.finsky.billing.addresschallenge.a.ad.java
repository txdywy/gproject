package com.google.android.finsky.billing.addresschallenge.a;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

final class com.google.android.finsky.billing.addresschallenge.a.ad
{

    public final EnumSet a;
    public final EnumSet b;
    public final EnumMap c;
    public final Map d;
    public final EnumMap e;

    ad(com.google.android.finsky.billing.addresschallenge.a.ae p0) {
        this.c = new EnumMap(com.google.android.finsky.billing.addresschallenge.a.d);
        this.d = new HashMap();
        this.e = new EnumMap(com.google.android.finsky.billing.addresschallenge.a.d);
        this.a = EnumSet.copyOf(p0.b);
        this.b = EnumSet.copyOf(p0.c);
        EnumSet.copyOf(p0.a);
        this.c.putAll(p0.d);
        this.d.putAll(p0.e);
        this.e.putAll(p0.f);
    }

    public final boolean a(com.google.android.finsky.billing.addresschallenge.a.d p0) {
        return this.a.contains(p0);
    }

    final d[] a(String p0) {
        if (p0 == 0)
            throw new RuntimeException("regionCode cannot be null.");
        return (d[])this.d.get(p0);
    }

}
