package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.HashMap;
import java.util.Map;

public final class C1707b {
    public final Map f8914a = new HashMap();
    public String f8915b = null;

    public C1707b(C1704a c1704a) {
        m9582a(c1704a);
    }

    public final C1707b m9586a(String str) {
        return m9585a(C1709d.COUNTRY, str);
    }

    private final C1707b m9582a(C1704a c1704a) {
        this.f8914a.clear();
        for (C1709d c1709d : C1709d.values()) {
            if (c1709d != C1709d.STREET_ADDRESS) {
                m9585a(c1709d, c1704a.m9517a(c1709d));
            }
        }
        m9583b();
        this.f8915b = c1704a.f8794k;
        return this;
    }

    public final C1707b m9585a(C1709d c1709d, String str) {
        if (str == null || str.length() == 0) {
            this.f8914a.remove(c1709d);
        } else {
            this.f8914a.put(c1709d, str.trim());
        }
        m9583b();
        return this;
    }

    public final C1704a m9584a() {
        return new C1704a(this);
    }

    private final void m9583b() {
        Object obj;
        String str = (String) this.f8914a.get(C1709d.ADDRESS_LINE_1);
        Object obj2 = (String) this.f8914a.get(C1709d.ADDRESS_LINE_2);
        if (str == null || str.trim().length() == 0) {
            obj = null;
        } else {
            Object obj3 = obj2;
            String str2 = str;
            obj = obj3;
        }
        if (obj2 != null) {
            String[] split = obj2.split("\n");
            if (split.length > 1) {
                obj2 = split[0];
                obj = split[1];
            }
        }
        this.f8914a.put(C1709d.ADDRESS_LINE_1, obj2);
        this.f8914a.put(C1709d.ADDRESS_LINE_2, obj);
    }
}
