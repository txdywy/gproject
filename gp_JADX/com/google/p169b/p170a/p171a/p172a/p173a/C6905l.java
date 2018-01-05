package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p414a.C6937m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum C6905l {
    NULL(0),
    STRING_POOL(1),
    TABLE(2),
    XML(3),
    XML_START_NAMESPACE(256),
    XML_END_NAMESPACE(257),
    XML_START_ELEMENT(258),
    XML_END_ELEMENT(259),
    XML_CDATA(260),
    XML_RESOURCE_MAP(384),
    TABLE_PACKAGE(512),
    TABLE_TYPE(513),
    TABLE_TYPE_SPEC(514),
    TABLE_LIBRARY(515);
    
    public static final Map f34232p = null;
    public final short f34234o;

    private C6905l(int i) {
        long j = (long) i;
        short s = (short) ((int) j);
        C6937m.m31633a(((long) s) == j, "Out of range: %s", j);
        this.f34234o = s;
    }

    public static C6905l m31540a(short s) {
        return (C6905l) C6937m.m31625a((C6905l) f34232p.get(Short.valueOf(s)), "Unknown chunk type: %s", (int) s);
    }

    static {
        Map hashMap = new HashMap();
        C6905l[] values = C6905l.values();
        int length = values.length;
        int i;
        while (i < length) {
            C6905l c6905l = values[i];
            hashMap.put(Short.valueOf(c6905l.f34234o), c6905l);
            i++;
        }
        f34232p = Collections.unmodifiableMap(hashMap);
    }
}
