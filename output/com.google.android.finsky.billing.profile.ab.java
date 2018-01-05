package com.google.android.finsky.billing.profile;

import com.android.volley.VolleyError;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.profile.ab implements com.android.volley.w
{

    public final com.google.android.finsky.billing.profile.x a;

    ab(com.google.android.finsky.billing.profile.x p0) {
        this.a = p0;
    }

    public final void a(VolleyError p0) {
        v1 = new com.google.android.finsky.d.c(308).a(com.google.android.finsky.billing.profile.x.a());
        if (p0 != 0)
            v1.a(p0).a(0);
        this.a.e.a(v1);
    }

}
