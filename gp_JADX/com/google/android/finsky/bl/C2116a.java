package com.google.android.finsky.bl;

import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.ab;

public final class C2116a {
    public final C1503a f10735a;
    public final C1461c f10736b;
    public final ab f10737c;

    public C2116a(C1503a c1503a, C1461c c1461c, ab abVar) {
        this.f10735a = c1503a;
        this.f10736b = c1461c;
        this.f10737c = abVar;
    }

    public final boolean m11022a(DfeToc dfeToc) {
        if (dfeToc == null) {
            dfeToc = this.f10737c.dn();
        }
        if (!this.f10736b.dj().mo2294a(12628642) || r5.f14881a.f31778u == 1) {
            return false;
        }
        return true;
    }

    public final boolean m11021a() {
        return m11022a(this.f10737c.dn());
    }

    public final int m11023b() {
        if (this.f10736b.dj().mo2294a(12628782)) {
            return 0;
        }
        return 4;
    }

    public final int m11024c() {
        if (this.f10736b.dj().mo2294a(12634245)) {
            return 1;
        }
        if (this.f10736b.dj().mo2294a(12634246)) {
            return 2;
        }
        return 0;
    }

    public final boolean m11025d() {
        return m11021a() && this.f10736b.dj().mo2294a(12637220);
    }

    public final boolean m11026e() {
        return m11021a() && this.f10736b.dj().mo2294a(12640667);
    }

    public final boolean m11027f() {
        return m11021a() && this.f10736b.dj().mo2294a(12640671);
    }

    public final boolean m11028g() {
        return this.f10736b.dj().mo2294a(12638391) && this.f10735a.f8184h;
    }

    public final boolean m11029h() {
        return m11021a() && this.f10736b.dj().mo2294a(12642395);
    }
}
