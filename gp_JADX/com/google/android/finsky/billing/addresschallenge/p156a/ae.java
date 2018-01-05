package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public final class ae {
    public final EnumSet f8819a = EnumSet.noneOf(C1709d.class);
    public final EnumSet f8820b = EnumSet.noneOf(C1709d.class);
    public final EnumSet f8821c = EnumSet.noneOf(C1709d.class);
    public final EnumMap f8822d = new EnumMap(C1709d.class);
    public final Map f8823e = new HashMap();
    public final EnumMap f8824f = new EnumMap(C1709d.class);

    public ae() {
        C1723r c1723r = new C1723r();
    }

    public final ae m9536a(C1709d c1709d) {
        if (c1709d == null) {
            throw new RuntimeException("AddressField field cannot be null.");
        }
        this.f8820b.add(c1709d);
        this.f8819a.remove(c1709d);
        return this;
    }

    public final ad m9535a() {
        return new ad(this);
    }
}
