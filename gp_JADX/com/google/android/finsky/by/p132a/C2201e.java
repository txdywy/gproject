package com.google.android.finsky.by.p132a;

import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2227g;

public abstract class C2201e implements C2196e {
    public final C2203m f11022f;

    public C2201e(C2203m c2203m) {
        this.f11022f = c2203m;
    }

    public abstract void mo2803a(String str, String str2);

    public void mo2804d(C2227g c2227g) {
        if (!mo2782a(c2227g)) {
            this.f11022f.mo2807a(c2227g.f11107n);
        }
    }

    public void mo2788c(C2227g c2227g) {
        C2227g b = mo2784b(c2227g);
        if (b != null) {
            this.f11022f.mo2809b(b.f11107n);
        }
    }

    public final long mo2794h() {
        return this.f11022f.mo2806a();
    }

    public void mo2802a() {
        this.f11022f.mo2808b();
    }
}
