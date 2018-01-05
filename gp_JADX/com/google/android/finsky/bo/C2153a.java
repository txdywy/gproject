package com.google.android.finsky.bo;

import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.bn.C2131e;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;

public final class C2153a {
    public final C2127b f10897a;
    public final C1463g f10898b;
    public final C2471a f10899c;
    public final C1461c f10900d;

    public C2153a(C2127b c2127b, C1463g c1463g, C2471a c2471a, C1461c c1461c) {
        this.f10897a = c2127b;
        this.f10898b = c1463g;
        this.f10899c = c2471a;
        this.f10900d = c1461c;
    }

    public final synchronized long m11221a(String str, bo boVar) {
        C2495w a;
        long j;
        C2129c a2 = this.f10897a.mo2657a(str);
        if (a2 != null) {
            a = this.f10899c.m13183a(a2.m11120d());
        } else {
            a = this.f10899c.m13184a(null);
        }
        if (a2 != null) {
            j = a2.f10795B;
        } else {
            j = -1;
        }
        return m11220a(str, a, j, boVar);
    }

    public final synchronized long m11220a(String str, C2495w c2495w, long j, bo boVar) {
        long b;
        if (this.f10900d.dj().mo2294a(12619996)) {
            c2495w.m13371a(boVar, null);
            this.f10897a.mo2660a(new C2131e(str).m11161a(c2495w.m13381c()));
            b = c2495w.m13378b();
        } else {
            b = this.f10898b.dc().m13320a(boVar, null, j);
            this.f10897a.mo2679e(str, b);
        }
        return b;
    }
}
