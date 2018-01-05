package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.HashMap;
import java.util.Map;

public enum C1709d {
    ADMIN_AREA('S'),
    LOCALITY('C'),
    RECIPIENT('N'),
    ORGANIZATION('O'),
    ADDRESS_LINE_1('1'),
    ADDRESS_LINE_2('2'),
    DEPENDENT_LOCALITY('D', (byte) 0),
    POSTAL_CODE('Z', (byte) 0),
    SORTING_CODE('X', (byte) 0),
    STREET_ADDRESS('A', (byte) 0),
    COUNTRY('R', (byte) 0);
    
    public static final Map f8944l = null;
    public final char f8946m;

    private C1709d(char c) {
        this.f8946m = c;
    }

    private C1709d(char c, byte b) {
        this(r1, r2, c);
    }

    static C1709d m9587a(char c) {
        return (C1709d) f8944l.get(Character.valueOf(c));
    }

    static {
        f8944l = new HashMap();
        C1709d[] values = C1709d.values();
        int length = values.length;
        int i;
        while (i < length) {
            C1709d c1709d = values[i];
            f8944l.put(Character.valueOf(c1709d.f8946m), c1709d);
            i++;
        }
    }
}
