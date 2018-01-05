package com.google.android.finsky.billing.profile;

import android.content.Context;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.api.c;
import com.google.android.finsky.billing.common.i;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.dfe.c.a.ac;
import com.google.wireless.android.finsky.dfe.nano.aq;

public final class com.google.android.finsky.billing.profile.y implements com.android.volley.x
{

    public final com.google.android.finsky.api.c a;
    public final Context b;
    public final com.google.android.finsky.billing.profile.x c;

    y(com.google.android.finsky.billing.profile.x p0, com.google.android.finsky.api.c p1, Context p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void b_(Object p0) {
        com.google.android.finsky.aa.a.P.b(this.a.c()).a(Boolean.valueOf(((com.google.wireless.android.finsky.dfe.nano.aq)p0).b));
        if (((com.google.wireless.android.finsky.dfe.nano.aq)p0).b == 0) {
            v4 = this.a.c();
            v1 = new com.google.wireless.android.finsky.dfe.c.a.ac().a(this.c.d.a(this.b, v4));
            v1.o = 2;
            v1.a = v1.a | 64;
            this.c.e.a(new com.google.android.finsky.d.c(307).a(com.google.android.finsky.billing.profile.x.a()));
            this.a.a(v1, 0, 0, 0, 0, new com.google.android.finsky.billing.profile.aa(this.c, v4), new com.google.android.finsky.billing.profile.ab(this.c));
        }
    }

}
