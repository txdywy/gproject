package com.google.common.flogger.p422a;

import com.google.common.flogger.backend.C7033a;
import com.google.common.flogger.backend.C7034b;
import com.google.common.flogger.p423b.C7011b;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public final class C7008f extends C7003d {
    public static final Map f34484a;
    public final C7033a f34485b;

    private static C7008f[] m31949a(C7033a c7033a) {
        C7008f[] c7008fArr = new C7008f[10];
        for (int i = 0; i < 10; i++) {
            c7008fArr[i] = new C7008f(i, c7033a, C7034b.f34536b);
        }
        return c7008fArr;
    }

    public static C7008f m31948a(int i, C7033a c7033a, C7034b c7034b) {
        if (i >= 10 || !c7034b.m32077b()) {
            return new C7008f(i, c7033a, c7034b);
        }
        return ((C7008f[]) f34484a.get(c7033a))[i];
    }

    private C7008f(int i, C7033a c7033a, C7034b c7034b) {
        super(c7034b, i);
        this.f34485b = (C7033a) C7011b.m31954a(c7033a, "format char");
        if (c7034b.m32077b()) {
            String str = c7033a.f34534o;
            return;
        }
        char c = c7033a.f34531l;
        if (c7034b.m32078c()) {
            c = (char) (c & -33);
        }
        c7034b.m32075a(new StringBuilder("%")).append(c);
    }

    protected final void mo5956a(C7007e c7007e, Object obj) {
        c7007e.mo6001a(obj, this.f34485b, this.f34445e);
    }

    static {
        Map enumMap = new EnumMap(C7033a.class);
        for (C7033a c7033a : C7033a.values()) {
            enumMap.put(c7033a, C7008f.m31949a(c7033a));
        }
        f34484a = Collections.unmodifiableMap(enumMap);
    }
}
