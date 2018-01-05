package com.google.android.finsky.p229o;

import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.bb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class C3827b {
    public final C1287h f19174a;
    public final Map f19175b;
    public final Set f19176c;

    public C3827b(C1287h c1287h) {
        this(c1287h, new HashMap());
    }

    private C3827b(C1287h c1287h, Map map) {
        this.f19176c = new HashSet();
        this.f19174a = c1287h;
        this.f19175b = map;
    }

    public final void m18280a(String str, String str2, String str3) {
        bb.m21791a();
        this.f19176c.add(str2);
        C3832g c3832g = (C3832g) this.f19175b.get(str);
        if (c3832g == null) {
            c3832g = new C3832g(this.f19174a.mo2016a(str));
            this.f19175b.put(str, c3832g);
        }
        bb.m21791a();
        c3832g.f19189b.add(new C3833h(C4678i.m21812a(), str3));
        c3832g.m18290a();
        c3832g.m18292b();
    }
}
