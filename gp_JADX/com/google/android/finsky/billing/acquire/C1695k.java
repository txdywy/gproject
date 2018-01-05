package com.google.android.finsky.billing.acquire;

import com.google.android.finsky.as.C1124c;
import com.google.android.finsky.billing.p153c.C1780b;

final class C1695k implements C1124c {
    public final /* synthetic */ C1664i f8746a;

    C1695k(C1664i c1664i) {
        this.f8746a = c1664i;
    }

    public final void mo1442a(boolean z) {
        if (z) {
            this.f8746a.startActivity(this.f8746a.f8640F.mo2764d(this.f8746a));
            this.f8746a.finish();
            return;
        }
        C1664i c1664i = this.f8746a;
        C1780b c1780b = c1664i.f8646L;
        Runnable c1696l = new C1696l(c1664i);
        boolean z2 = c1664i.aa != null && c1664i.aa.f9299o;
        c1780b.m9732a(c1696l, z2);
    }
}
