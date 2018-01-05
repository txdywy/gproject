package com.google.android.finsky.stream.controllers.assist.security;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import java.util.LinkedHashSet;
import java.util.Set;

public final class C4323d {
    public static C4323d f21798a;
    public Set f21799b = new LinkedHashSet();
    public C4317u f21800c;
    public C2495w f21801d;
    public ad f21802e;

    static C4323d m20084a() {
        if (f21798a == null) {
            f21798a = new C4323d(C1473m.f7980a.cp());
        }
        return f21798a;
    }

    private C4323d(ad adVar) {
        m20085a(adVar.m20066a());
    }

    final void m20085a(C4317u c4317u) {
        this.f21800c = c4317u;
        this.f21800c.mo4115a();
        for (C4320e c : this.f21799b) {
            c.mo4123c();
        }
    }
}
