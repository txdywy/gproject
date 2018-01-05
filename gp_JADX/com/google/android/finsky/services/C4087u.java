package com.google.android.finsky.services;

import android.os.Bundle;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.p107l.C3646a;

final class C4087u extends C4076j {
    public final C2206c f20457a;
    public final C2320a f20458b;
    public final C3646a f20459c;

    public C4087u(C2206c c2206c, C2320a c2320a, C3646a c3646a) {
        this.f20457a = c2206c;
        this.f20458b = c2320a;
        this.f20459c = c3646a;
    }

    public final Bundle mo3906a(String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("Finsky.IsValid", false);
        C2322b a = this.f20458b.mo2854a(str);
        if (a == null) {
            return bundle;
        }
        this.f20459c.m17248a(null);
        this.f20457a.mo2820c();
        if (this.f20457a.mo2813a(a.f11416a, a.f11417b).isEmpty()) {
            return bundle;
        }
        if (((Boolean) C0955b.eq.m28964b()).booleanValue()) {
            this.f20459c.f18022b.m11209c();
            C2129c a2 = this.f20459c.f18022b.mo2657a(str);
            if (a2 != null) {
                int i = a2.f10824r;
                if ((i & 4) == 0) {
                    return bundle;
                }
                if ((i & 2) != 0) {
                    return bundle;
                }
            }
        }
        bundle.putBoolean("Finsky.IsValid", true);
        return bundle;
    }
}
