package com.google.android.finsky.cs.p135a.p136a;

import android.content.Context;
import com.google.android.gms.phenotype.core.C5530i;
import com.google.android.gms.phenotype.core.p304a.C5505c;
import com.google.android.gms.phenotype.core.service.operations.C5546m;
import java.util.Map;
import java.util.Map.Entry;

public final class C2388l {
    public final C5505c f11670a;
    public final Context f11671b;
    public final String f11672c;
    public final C5530i[] f11673d;
    public final String f11674e;

    public C2388l(C5505c c5505c, Context context, String str, Map map, String str2) {
        this.f11670a = c5505c;
        this.f11671b = context;
        this.f11672c = str;
        this.f11673d = C2388l.m12077a(map);
        this.f11674e = str2;
    }

    public final void m12078a() {
        new C5546m(this.f11672c, this.f11674e, this.f11673d).m26512a(this.f11671b, this.f11670a);
    }

    private static C5530i[] m12077a(Map map) {
        C5530i[] c5530iArr = new C5530i[map.size()];
        int i = 0;
        for (Entry entry : map.entrySet()) {
            C5530i c5530i;
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                c5530i = new C5530i(str, (String) value, 0);
            } else if (value instanceof Long) {
                c5530i = new C5530i(str, ((Long) value).longValue(), 0);
            } else if (value instanceof Integer) {
                c5530i = new C5530i(str, ((Integer) value).longValue(), 0);
            } else if (value instanceof Double) {
                c5530i = new C5530i(str, ((Double) value).doubleValue(), 0);
            } else if (value instanceof Boolean) {
                c5530i = new C5530i(str, ((Boolean) value).booleanValue(), 0);
            } else if (value instanceof byte[]) {
                c5530i = new C5530i(str, (byte[]) value, 0);
            } else {
                c5530i = null;
            }
            int i2 = i + 1;
            c5530iArr[i] = c5530i;
            i = i2;
        }
        return c5530iArr;
    }
}
