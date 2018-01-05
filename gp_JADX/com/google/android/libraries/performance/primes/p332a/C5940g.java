package com.google.android.libraries.performance.primes.p332a;

import com.google.protobuf.nano.C0757i;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public abstract class C5940g {
    public final C0757i[] f29595b;

    C5940g(Class cls) {
        this.f29595b = (C0757i[]) Array.newInstance(cls, 0);
    }

    abstract C0757i mo5213a(C0757i c0757i, C0757i c0757i2);

    abstract C0757i mo5214a(String str, Object obj);

    abstract String mo5215a(C0757i c0757i);

    private final C0757i m27556a(C0757i[] c0757iArr, String str) {
        for (C0757i c0757i : c0757iArr) {
            if (str.equals(mo5215a(c0757i))) {
                return c0757i;
            }
        }
        return null;
    }

    public final C0757i[] m27561a(C0757i[] c0757iArr, C0757i[] c0757iArr2) {
        if (c0757iArr == null || c0757iArr2 == null) {
            return c0757iArr;
        }
        ArrayList arrayList = new ArrayList();
        for (C0757i c0757i : c0757iArr) {
            C0757i c0757i2 = mo5213a(c0757i2, m27556a(c0757iArr2, mo5215a(c0757i2)));
            if (c0757i2 != null) {
                arrayList.add(c0757i2);
            }
        }
        return arrayList.isEmpty() ? null : (C0757i[]) arrayList.toArray(this.f29595b);
    }

    public final C0757i[] m27560a(Map map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                C0757i a = mo5214a((String) entry.getKey(), entry.getValue());
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList.isEmpty() ? null : (C0757i[]) arrayList.toArray(this.f29595b);
    }
}
