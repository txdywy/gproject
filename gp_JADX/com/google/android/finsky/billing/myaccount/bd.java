package com.google.android.finsky.billing.myaccount;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;

final class bd implements C0657w {
    public final /* synthetic */ C0657w f10244a;
    public final /* synthetic */ bb f10245b;

    bd(bb bbVar, C0657w c0657w) {
        this.f10245b = bbVar;
        this.f10244a = c0657w;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f10245b.f10241a.ah.mo1062a(volleyError);
        if (this.f10244a != null) {
            this.f10244a.mo1062a(volleyError);
        }
    }
}
