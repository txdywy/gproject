package com.google.android.finsky.application;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.p229o.C3827b;
import com.google.android.finsky.stream.myapps.C4536c;
import com.google.android.finsky.stream.myapps.C4547l;
import com.google.android.finsky.stream.myapps.C4550p;
import p002a.C0002a;

final /* synthetic */ class cd implements C0002a {
    public final C1475d f7957a;

    cd(C1475d c1475d) {
        this.f7957a = c1475d;
    }

    public final Object mo1a() {
        C1473m c1473m = this.f7957a;
        if (c1473m.dP == null) {
            if (c1473m == null) {
                throw null;
            } else if (c1473m == null) {
                throw null;
            } else {
                if (c1473m.dK == null) {
                    c1473m.dK = new C4536c(c1473m.f7981b.getPackageManager());
                }
                C4536c c4536c = c1473m.dK;
                C3827b dE = c1473m.dE();
                if (c1473m.dN == null) {
                    c1473m.dN = new C4550p(c1473m.f7981b, c1473m.dE(), c1473m.bS(), c1473m.mo2265x(), c1473m.au(), c1473m.dC(), c1473m.mo2254m());
                }
                c1473m.dP = new C4547l(c1473m, c1473m, c4536c, dE, c1473m.dN);
            }
        }
        return c1473m.dP;
    }
}
