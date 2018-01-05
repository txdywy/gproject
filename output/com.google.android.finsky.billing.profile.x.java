package com.google.android.finsky.billing.profile;

import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.c;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.common.i;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.wireless.android.a.a.a.a.r;

public final class com.google.android.finsky.billing.profile.x
{

    public final com.google.android.finsky.aa.c a;
    public final com.google.android.finsky.aa.m b;
    public final com.google.android.finsky.aa.m c;
    public final com.google.android.finsky.billing.common.i d;
    public final com.google.android.finsky.d.w e;
    public final com.google.android.finsky.ba.c f;

    x(com.google.android.finsky.billing.common.i p0, com.google.android.finsky.d.a p1, com.google.android.finsky.ba.c p2) {
        this.a = new com.google.android.finsky.aa.c("instant_fop_options");
        this.b = this.a.b("fop_options", 0);
        this.c = this.a.b("fop_options_cached_time", Long.valueOf(0));
        this.d = p0;
        this.e = p1.a(0);
        this.f = p2;
    }

    static com.google.wireless.android.a.a.a.a.r a() {
        v0 = new com.google.wireless.android.a.a.a.a.r();
        v0.a = v0.a | 1;
        v0.b = 2;
        return v0;
    }

    public static boolean b(String p0) {
        v0 = (Boolean)com.google.android.finsky.aa.a.P.b(p0).a();
        if (v0 != 0 && v0.booleanValue())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean a(String p0) {
        return this.f.j(p0).a(12632323);
    }

}
