package io.reactivex.internal.p559e.p562b;

import io.reactivex.C7754h;
import io.reactivex.C7771f;
import io.reactivex.C7789g;
import io.reactivex.internal.p564g.ab;

public final class C7825d extends C7822a {
    public final C7754h f40342b;
    public final boolean f40343c = false;
    public final int f40344d;

    public C7825d(C7771f c7771f, C7754h c7754h, int i) {
        super(c7771f);
        this.f40342b = c7754h;
        this.f40344d = i;
    }

    protected final void mo6558b(C7789g c7789g) {
        if (this.f40342b instanceof ab) {
            this.a.mo6535a(c7789g);
            return;
        }
        this.a.mo6535a(new C7826e(c7789g, this.f40342b.mo6528a(), this.f40343c, this.f40344d));
    }
}
