package com.google.android.finsky.billing.p130b;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;

final class C1771k implements C0657w {
    public boolean f9170a;
    public final /* synthetic */ C1769i f9171b;

    C1771k(C1769i c1769i) {
        this.f9171b = c1769i;
    }

    public final void mo1062a(VolleyError volleyError) {
        if (!this.f9170a) {
            this.f9171b.m9714a(volleyError);
            this.f9171b.f9153l.release();
        }
    }
}
