package com.google.android.finsky.activities;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.c;
import com.google.android.finsky.as.b;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.iab.v;
import com.google.android.finsky.d.a;
import com.google.android.finsky.dc.b;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.i.f;
import com.google.android.finsky.m;
import com.google.wireless.android.finsky.dfe.nano.gp;

public final class com.google.android.finsky.activities.m implements com.google.android.finsky.dp.g
{

    public final boolean[] a;
    public final com.google.android.finsky.ba.e b;
    public final com.google.android.finsky.api.c c;
    public final String d;
    public final boolean e;
    public final com.google.android.finsky.activities.b f;

    m(com.google.android.finsky.activities.b p0, boolean[] p1, com.google.android.finsky.ba.e p2, com.google.android.finsky.api.c p3, String p4, boolean p5) {
        this.f = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
    }

    public final void a(VolleyError p0) {
        this.f.u();
        this.f.a(p0);
    }

    public final void a(com.google.wireless.android.finsky.dfe.nano.gp p0) {
        if (this.a[0] == 1)
            new com.google.android.finsky.i.f(this.f.getApplicationContext(), com.google.android.finsky.m.a.z()).a(10000, new com.google.android.finsky.activities.n());
        else {
            this.a[0] = 1;
            com.google.android.finsky.m.a.a(new DfeToc(p0));
            v0 = com.google.android.finsky.m.a.a(this.b);
            v0.a(v0.a(p0), this.c, this.b, this.f.t.a(0));
            com.google.android.finsky.billing.iab.v.a(this.d, p0.o);
            com.google.android.finsky.m.a.Q().a(new com.google.android.finsky.activities.o(this.f, this.e));
        }
    }

}
