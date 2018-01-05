package com.google.android.finsky.bc;

import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;
import com.google.wireless.android.a.a.a.a.ce;

public final class C1582l extends C1573p {
    public C1569m f8399a;
    public boolean f8400c;

    public static C1582l m9130a(C1569m c1569m, C1588u c1588u, boolean z) {
        C1573p c1582l = new C1582l();
        c1582l.f8399a = c1569m;
        c1582l.f8400c = z;
        c1588u.m9155a(c1582l, false);
        return c1582l;
    }

    public static C1582l m9129a(C1569m c1569m, C1588u c1588u) {
        return C1582l.m9130a(c1569m, c1588u, false);
    }

    protected final int mo1298Z() {
        return 0;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        this.bs.m16127a(0, null);
        if (this.f8400c) {
            aa();
        }
    }

    protected final void aa() {
        if (this.f8399a != null) {
            this.f8399a.mo2338c();
        }
    }

    public final ce getPlayStoreUiElement() {
        return null;
    }

    public final void m9132b(VolleyError volleyError) {
        mo1345a(C1290m.m7702a(m603h(), volleyError));
    }
}
