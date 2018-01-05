package com.google.android.finsky.billing.lightpurchase;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2495w;

final class C1955n implements C0657w {
    public final C2495w f9955a;
    public final /* synthetic */ C1950i f9956b;

    public C1955n(C1950i c1950i, C2495w c2495w) {
        this.f9956b = c1950i;
        this.f9955a = c2495w;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f9956b.ar = volleyError;
        this.f9956b.m10382a(this.f9955a, 303, volleyError, this.f9956b.m10389Y(), this.f9956b.m10388X());
        this.f9956b.m6758b(3, 3);
    }
}
