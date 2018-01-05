package com.google.android.finsky.bc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.m;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.pagesystem.b;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.bc.l extends com.google.android.finsky.bc.p
{

    public com.google.android.finsky.bc.m a;
    public boolean c;

    l() {
        com.google.android.finsky.bc.p();
    }

    public static com.google.android.finsky.bc.l a(com.google.android.finsky.bc.m p0, com.google.android.finsky.bc.u p1) {
        return com.google.android.finsky.bc.l.a(p0, p1, 0);
    }

    public static com.google.android.finsky.bc.l a(com.google.android.finsky.bc.m p0, com.google.android.finsky.bc.u p1, boolean p2) {
        v0 = new com.google.android.finsky.bc.l();
        v0.a = p0;
        v0.c = p2;
        p1.a(v0, 0);
        return v0;
    }

    protected final int Z() {
        return 0;
    }

    protected final void aa() {
        if (this.a != 0)
            this.a.c();
    }

    public final void b(VolleyError p0) {
        this.a(com.google.android.finsky.api.m.a(this.h(), p0));
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.bs.a(0, 0);
        if (this.c != 0)
            this.aa();
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return 0;
    }

}
