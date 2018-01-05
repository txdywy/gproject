package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p419e.C6976b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum al {
    NULL(0),
    REFERENCE(1),
    ATTRIBUTE(2),
    STRING(3),
    FLOAT(4),
    DIMENSION(5),
    FRACTION(6),
    DYNAMIC_REFERENCE(7),
    DYNAMIC_ATTRIBUTE(8),
    INT_DEC(16),
    INT_HEX(17),
    INT_BOOLEAN(18),
    INT_COLOR_ARGB8(28),
    INT_COLOR_RGB8(29),
    INT_COLOR_ARGB4(30),
    INT_COLOR_RGB4(31);
    
    public static final Map f34099r = null;
    public final byte f34101q;

    private al(int i) {
        this.f34101q = C6976b.m31830a((long) i);
    }

    static {
        Map hashMap = new HashMap();
        al[] values = al.values();
        int length = values.length;
        int i;
        while (i < length) {
            al alVar = values[i];
            hashMap.put(Byte.valueOf(alVar.f34101q), alVar);
            i++;
        }
        f34099r = Collections.unmodifiableMap(hashMap);
    }
}
