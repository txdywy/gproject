package com.google.android.finsky.cj;

import com.google.android.finsky.bn.C2129c;
import com.google.wireless.android.finsky.b.a;
import com.google.wireless.android.finsky.b.e;

public final class C2285b {
    public final C2129c f11302a;
    public final a f11303b;
    public C2284a f11304c = m11777a(0);
    public C2284a f11305d = m11777a(1);

    public C2285b(C2129c c2129c) {
        this.f11302a = c2129c;
        this.f11303b = c2129c.f10811e;
    }

    private final C2284a m11777a(int i) {
        boolean z = false;
        if (this.f11303b == null) {
            return null;
        }
        for (e eVar : this.f11303b.j) {
            if (eVar.c == i) {
                if (i == 1) {
                    z = true;
                }
                C2284a c2284a = new C2284a(z, this.f11302a.f10807a, eVar.d, eVar.e);
                c2284a.m11770a();
                return c2284a;
            }
        }
        return null;
    }
}
