package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.Map;

public final class C1714i {
    public final Map f8963a;

    public C1714i(Map map) {
        az.m9577a((Object) "Cannot construct StandardNodeData with null map");
        this.f8963a = map;
    }

    public final boolean m9590a(C1708c c1708c) {
        return this.f8963a.containsKey(c1708c);
    }

    public final String m9591b(C1708c c1708c) {
        return (String) this.f8963a.get(c1708c);
    }
}
