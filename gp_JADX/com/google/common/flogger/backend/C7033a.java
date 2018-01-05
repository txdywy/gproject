package com.google.common.flogger.backend;

public enum C7033a {
    STRING('s', C7035c.f34540a, "-#", true),
    BOOLEAN('b', C7035c.f34541b, "-", true),
    CHAR('c', C7035c.f34542c, "-", true),
    DECIMAL('d', C7035c.f34543d, "-0+ ,", false),
    OCTAL('o', C7035c.f34543d, "-#0", false),
    HEX('x', C7035c.f34543d, "-#0", true),
    FLOAT('f', C7035c.f34544e, "-#0+ ,", false),
    EXPONENT('e', C7035c.f34544e, "-#0+ ", true),
    GENERAL('g', C7035c.f34544e, "-0+ ,", true),
    EXPONENT_HEX('a', C7035c.f34544e, "-#0+ ", true);
    
    public static final C7033a[] f34529k = null;
    public final char f34531l;
    public final C7035c f34532m;
    public final int f34533n;
    public final String f34534o;

    private C7033a(char c, C7035c c7035c, String str, boolean z) {
        this.f34531l = c;
        this.f34532m = c7035c;
        this.f34533n = C7034b.m32071a(str, z);
        this.f34534o = "%" + c;
    }

    static {
        f34529k = new C7033a[26];
        for (C7033a c7033a : C7033a.values()) {
            f34529k[(c7033a.f34531l | 32) - 97] = c7033a;
        }
    }
}
