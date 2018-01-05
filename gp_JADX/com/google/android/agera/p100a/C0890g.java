package com.google.android.agera.p100a;

import android.support.v7.widget.fr;
import com.google.android.agera.C0917x;
import com.google.android.agera.ac;
import com.google.android.agera.am;

final class C0890g extends C0889f implements am {
    public final ac f5636a;
    public final C0891h f5637b;
    public Object f5638c;
    public C0884a f5639d;
    public int f5640e;

    C0890g(ac acVar, C0891h c0891h) {
        this.f5636a = acVar;
        this.f5637b = c0891h;
        this.f5638c = acVar.i_();
    }

    final int mo1135a() {
        this.f5638c = this.f5636a.i_();
        return this.f5637b.mo5307a(this.f5638c);
    }

    final long mo1137a(int i, long j) {
        return this.f5637b.mo5308a(this.f5638c, i) + j;
    }

    final int mo1136a(int i) {
        return this.f5637b.mo5311b(this.f5638c, i);
    }

    final void mo1138a(int i, fr frVar) {
        this.f5637b.mo5310a(this.f5638c, i, frVar);
    }

    final void mo1141b() {
    }

    final void mo1139a(C0884a c0884a, int i) {
        this.f5639d = c0884a;
        this.f5640e = i;
    }

    final void mo1142c() {
        this.f5636a.mo1144a(this);
        ad_();
    }

    final void mo1143e() {
        this.f5636a.mo1145b(this);
    }

    public final void ad_() {
        int i = 0;
        C0884a c0884a = this.f5639d;
        int i2 = this.f5640e;
        boolean z = i2 < c0884a.f5615c && this == c0884a.f5617e[i2];
        C0917x.m5640a(z, "Wrong RA-part connection");
        if (!c0884a.f5621i) {
            if (i2 != 0) {
                i = c0884a.f5620h[i2 - 1];
            }
            int i3 = c0884a.f5620h[i2];
            if (c0884a.f3433a.m3637a()) {
                C0888e a = C0888e.m5533a(i);
                a.f5635e = i3 - i;
                if (mo1140a(true)) {
                    int a2 = a.m5535a();
                    c0884a.f5620h[i2] = a2;
                    c0884a.m5531e(i2 + 1, a2 - i3);
                    a.m5538a(c0884a);
                    return;
                }
                c0884a.f5621i = true;
                c0884a.f3433a.m3638b();
                a.m5539b();
                return;
            }
            c0884a.m5531e(i2, mo1135a() - (i3 - i));
        }
    }

    final boolean mo1140a(boolean z) {
        if (z) {
            this.f5636a.i_();
        }
        return false;
    }
}
