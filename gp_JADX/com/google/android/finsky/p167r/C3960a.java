package com.google.android.finsky.p167r;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ba.C1461c;
import com.google.wireless.android.finsky.dfe.f.a.a;
import com.google.wireless.android.finsky.dfe.f.a.d;

public final class C3960a {
    public final C1500a f19981a;
    public final C1461c f19982b;

    public C3960a(C1500a c1500a, C1461c c1461c) {
        this.f19981a = c1500a;
        this.f19982b = c1461c;
    }

    public final boolean m18668a() {
        if (!m18666d()) {
            return ((Boolean) C0954a.f5854x.m5760a()).booleanValue();
        }
        int e = m18667e();
        if (C3960a.m18664a(e)) {
            return e != 2;
        } else {
            return ((Boolean) C0954a.f5854x.m5760a()).booleanValue();
        }
    }

    public final boolean m18669b() {
        if (!m18666d()) {
            return ((Boolean) C0954a.f5855y.m5760a()).booleanValue();
        }
        int e = m18667e();
        if (C3960a.m18664a(e)) {
            return e == 3;
        } else {
            return ((Boolean) C0954a.f5855y.m5760a()).booleanValue();
        }
    }

    public final boolean m18670c() {
        return m18666d() && C3960a.m18664a(m18667e());
    }

    public static void m18663a(boolean z) {
        C0954a.f5854x.m5763a(Boolean.valueOf(z));
    }

    public static void m18665b(boolean z) {
        C0954a.f5855y.m5763a(Boolean.valueOf(z));
    }

    private static boolean m18664a(int i) {
        return i == 4 || i == 3 || i == 2;
    }

    private final boolean m18666d() {
        return this.f19982b.dj().mo2294a(12640279);
    }

    private final int m18667e() {
        d dVar;
        C1500a c1500a = this.f19981a;
        if (c1500a.m8818a()) {
            a f = c1500a.m8826f();
            if (!(f == null || f.f == null)) {
                dVar = f.f;
                if (dVar != null) {
                    return 0;
                }
                return dVar.b;
            }
        }
        dVar = null;
        if (dVar != null) {
            return dVar.b;
        }
        return 0;
    }
}
