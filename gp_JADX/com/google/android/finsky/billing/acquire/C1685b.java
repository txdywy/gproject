package com.google.android.finsky.billing.acquire;

import com.google.android.finsky.billing.p153c.C1684f;
import com.google.wireless.android.finsky.dfe.c.a.y;

final class C1685b implements C1684f {
    public final /* synthetic */ y f8728a;
    public final /* synthetic */ C1683a f8729b;

    C1685b(C1683a c1683a, y yVar) {
        this.f8729b = c1683a;
        this.f8728a = yVar;
    }

    public final void mo2389a(String str) {
        boolean z = true;
        this.f8729b.f8724o.m9677a(true, this.f8728a.b, false);
        if ((this.f8728a.a & 1) == 0) {
            z = false;
        }
        if (z) {
            this.f8729b.f8721l.m14870a(this.f8728a.f, str);
        }
        this.f8729b.f8714e.mo3138a(this.f8728a.c);
    }

    public final void mo2390a(boolean z) {
        this.f8729b.f8724o.m9677a(false, this.f8728a.b, false);
        if (z) {
            this.f8729b.f8714e.mo3138a(this.f8728a.d);
        } else {
            this.f8729b.f8714e.mo3138a(this.f8728a.e);
        }
    }
}
