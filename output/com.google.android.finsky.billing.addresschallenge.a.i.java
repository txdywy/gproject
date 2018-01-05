package com.google.android.finsky.billing.addresschallenge.a;

import java.util.Map;

public final class com.google.android.finsky.billing.addresschallenge.a.i
{

    public final Map a;

    i(Map p0) {
        com.google.android.finsky.billing.addresschallenge.a.az.a("Cannot construct StandardNodeData with null map");
        this.a = p0;
    }

    public final boolean a(com.google.android.finsky.billing.addresschallenge.a.c p0) {
        return this.a.containsKey(p0);
    }

    public final String b(com.google.android.finsky.billing.addresschallenge.a.c p0) {
        return (String)this.a.get(p0);
    }

}
