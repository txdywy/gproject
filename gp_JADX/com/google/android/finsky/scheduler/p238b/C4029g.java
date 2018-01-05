package com.google.android.finsky.scheduler.p238b;

import com.google.android.finsky.scheduler.p236a.p237a.C4018g;

public final class C4029g {
    public final C4018g f20252a;

    public C4029g() {
        this.f20252a = new C4018g();
    }

    C4029g(C4018g c4018g) {
        this();
        m18874a(c4018g.f20186c);
        m18875a(c4018g.f20187d);
        m18878b(c4018g.f20188e);
        m18877b(c4018g.f20190g);
        boolean z = c4018g.f20189f;
        C4018g c4018g2 = this.f20252a;
        c4018g2.f20185b |= 8;
        c4018g2.f20189f = z;
    }

    public final C4029g m18874a(long j) {
        C4018g c4018g = this.f20252a;
        c4018g.f20185b |= 1;
        c4018g.f20186c = j;
        return this;
    }

    public final C4029g m18877b(long j) {
        C4018g c4018g = this.f20252a;
        c4018g.f20185b |= 16;
        c4018g.f20190g = j;
        return this;
    }

    public final C4029g m18875a(boolean z) {
        C4018g c4018g = this.f20252a;
        c4018g.f20185b |= 2;
        c4018g.f20187d = z;
        return this;
    }

    public final C4029g m18878b(boolean z) {
        C4018g c4018g = this.f20252a;
        c4018g.f20185b |= 4;
        c4018g.f20188e = z;
        return this;
    }

    public final C4028f m18873a() {
        return new C4029g(this.f20252a).m18876b();
    }

    final C4028f m18876b() {
        return new C4028f(this.f20252a);
    }
}
