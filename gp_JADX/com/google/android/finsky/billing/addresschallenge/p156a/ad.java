package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public final class ad {
    public final EnumSet f8814a;
    public final EnumSet f8815b;
    public final EnumMap f8816c = new EnumMap(C1709d.class);
    public final Map f8817d = new HashMap();
    public final EnumMap f8818e = new EnumMap(C1709d.class);

    ad(ae aeVar) {
        this.f8814a = EnumSet.copyOf(aeVar.f8820b);
        this.f8815b = EnumSet.copyOf(aeVar.f8821c);
        EnumSet.copyOf(aeVar.f8819a);
        this.f8816c.putAll(aeVar.f8822d);
        this.f8817d.putAll(aeVar.f8823e);
        this.f8818e.putAll(aeVar.f8824f);
    }

    public final boolean m9533a(C1709d c1709d) {
        return this.f8814a.contains(c1709d);
    }

    final C1709d[] m9534a(String str) {
        if (str != null) {
            return (C1709d[]) this.f8817d.get(str);
        }
        throw new RuntimeException("regionCode cannot be null.");
    }
}
