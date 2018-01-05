package com.google.android.finsky.stream.myapps;

import com.google.android.finsky.p229o.C3827b;
import com.google.android.finsky.utils.bb;
import java.util.ArrayList;

final class C4549n {
    public final C3827b f23256a;
    public final String f23257b;
    public final C4540o f23258c;
    public final ArrayList f23259d;
    public boolean f23260e = m21162b();
    public boolean f23261f;

    C4549n(C4540o c4540o, ArrayList arrayList, C3827b c3827b, String str) {
        this.f23258c = c4540o;
        this.f23259d = arrayList;
        this.f23256a = c3827b;
        this.f23257b = str;
        int size = this.f23259d.size();
        for (int i = 0; i < size; i++) {
            ((ad) this.f23259d.get(i)).mo4258a(this);
        }
    }

    private final boolean m21162b() {
        if (this.f23261f) {
            return false;
        }
        C3827b c3827b = this.f23256a;
        String str = this.f23257b;
        bb.m21791a();
        if (c3827b.f19176c.contains(str)) {
            return false;
        }
        int size = this.f23259d.size();
        for (int i = 0; i < size; i++) {
            if (!((ad) this.f23259d.get(i)).mo4259a()) {
                return false;
            }
        }
        return true;
    }

    final void m21163a() {
        boolean z = this.f23260e;
        this.f23260e = m21162b();
        if (z && !this.f23260e) {
            this.f23258c.mo4261a(false);
        } else if (!z && this.f23260e) {
            this.f23258c.mo4261a(true);
        }
    }

    final void m21164a(boolean z) {
        this.f23261f = z;
        m21163a();
    }
}
