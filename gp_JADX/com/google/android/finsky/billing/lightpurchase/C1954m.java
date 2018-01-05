package com.google.android.finsky.billing.lightpurchase;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2495w;

final class C1954m implements C0657w {
    public final C2495w f9953a;
    public final /* synthetic */ C1950i f9954b;

    public C1954m(C1950i c1950i, C2495w c2495w) {
        this.f9954b = c1950i;
        this.f9953a = c2495w;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f9954b.ar = volleyError;
        this.f9954b.m10382a(this.f9953a, 305, volleyError, this.f9954b.aa(), this.f9954b.m10390Z());
        this.f9954b.m6758b(3, 3);
    }
}
