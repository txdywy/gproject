package com.google.android.finsky.billing.profile;

import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.aq;

public final class com.google.android.finsky.billing.profile.u implements com.android.volley.x
{

    public final String a;

    u(String p0) {
        this.a = p0;
    }

    public final void b_(Object p0) {
        com.google.android.finsky.aa.a.P.b(this.a).a(Boolean.valueOf(((com.google.wireless.android.finsky.dfe.nano.aq)p0).b));
        com.google.android.finsky.aa.a.Q.b(this.a).a(Long.valueOf(System.currentTimeMillis()));
        v3 = new Object[2];
        v3[0] = Boolean.valueOf(((com.google.wireless.android.finsky.dfe.nano.aq)p0).b);
        v3[1] = FinskyLog.a(this.a);
        FinskyLog.a("has_fop cache updated to: %b (account=%s)", v3);
    }

}
