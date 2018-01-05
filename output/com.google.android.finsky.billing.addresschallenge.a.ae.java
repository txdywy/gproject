package com.google.android.finsky.billing.addresschallenge.a;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public final class com.google.android.finsky.billing.addresschallenge.a.ae
{

    public final EnumSet a;
    public final EnumSet b;
    public final EnumSet c;
    public final EnumMap d;
    public final Map e;
    public final EnumMap f;

    ae() {
        this.a = EnumSet.noneOf(com.google.android.finsky.billing.addresschallenge.a.d);
        this.b = EnumSet.noneOf(com.google.android.finsky.billing.addresschallenge.a.d);
        this.c = EnumSet.noneOf(com.google.android.finsky.billing.addresschallenge.a.d);
        this.d = new EnumMap(com.google.android.finsky.billing.addresschallenge.a.d);
        this.e = new HashMap();
        this.f = new EnumMap(com.google.android.finsky.billing.addresschallenge.a.d);
        new com.google.android.finsky.billing.addresschallenge.a.r();
    }

    public final com.google.android.finsky.billing.addresschallenge.a.ad a() {
        return new com.google.android.finsky.billing.addresschallenge.a.ad(this);
    }

    public final com.google.android.finsky.billing.addresschallenge.a.ae a(com.google.android.finsky.billing.addresschallenge.a.d p0) {
        if (p0 == 0)
            throw new RuntimeException("AddressField field cannot be null.");
        this.b.add(p0);
        this.a.remove(p0);
        return this;
    }

}
