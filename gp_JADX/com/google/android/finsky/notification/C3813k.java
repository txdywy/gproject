package com.google.android.finsky.notification;

import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.aj;
import java.util.HashSet;
import java.util.Set;

public final class C3813k {
    public final aa f19134a;
    public final C0988c f19135b;
    public final Set f19136c = new HashSet();

    public C3813k(C0988c c0988c, aa aaVar) {
        ((C1404t) C3947d.m18649a(C1404t.class)).mo2003f();
        this.f19135b = c0988c;
        this.f19134a = (aa) aj.m21700a(aaVar);
    }

    public final void m18250a(C2281m c2281m) {
        this.f19136c.add(c2281m);
    }

    public final void m18251b(C2281m c2281m) {
        this.f19136c.remove(c2281m);
    }
}
