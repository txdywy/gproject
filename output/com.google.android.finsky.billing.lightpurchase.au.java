package com.google.android.finsky.billing.lightpurchase;

import com.android.volley.VolleyError;
import com.android.volley.m;
import com.google.android.finsky.api.m;
import com.google.android.finsky.billing.d.e;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.notification.ab;

public final class com.google.android.finsky.billing.lightpurchase.au implements com.android.volley.w
{

    public final com.google.android.finsky.d.w a;
    public final String b;
    public final int c;
    public final boolean d;
    public final Document e;
    public final com.google.android.finsky.billing.d.e f;

    au(com.google.android.finsky.d.w p0, String p1, int p2, boolean p3, Document p4, com.google.android.finsky.billing.d.e p5) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
    }

    public final void a(VolleyError p0) {
        if (p0.b != 0)
            v0 = p0.b.a;
        else
            v0 = 0;
        this.a.a(new com.google.android.finsky.d.c(301).a(this.b).b(this.c).a(p0).a(v0).b(p0.c));
        if (this.d != 0) {
            v2 = com.google.android.finsky.api.m.a(com.google.android.finsky.m.a.b, p0);
            com.google.android.finsky.m.a.r().a(com.google.android.finsky.m.a.a(2131952119), v2, v2, this.b, this.e.a.w, this.a.a());
        }
        if (this.f != 0)
            this.f.S_();
    }

}
