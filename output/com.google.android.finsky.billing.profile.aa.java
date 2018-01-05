package com.google.android.finsky.billing.profile;

import android.util.Base64;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.c.a.ae;
import com.google.wireless.android.finsky.dfe.c.a.ee;
import com.google.wireless.android.finsky.dfe.c.a.n;

public final class com.google.android.finsky.billing.profile.aa implements com.android.volley.x
{

    public final String a;
    public final com.google.android.finsky.billing.profile.x b;

    aa(com.google.android.finsky.billing.profile.x p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void b_(Object p0) {
        p0 = (com.google.wireless.android.finsky.dfe.c.a.ae)p0;
        if (p0.f != 0 && p0.f.l != 0)
            com.google.android.finsky.billing.profile.t.c(this.a);
        if (!com.google.android.finsky.billing.profile.x.b(this.a)) {
            if (p0.a & 2)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0 && p0.i != 0) {
                this.b.b.b(this.a).a(Base64.encodeToString(com.google.protobuf.nano.i.a(p0), 0));
                this.b.c.b(this.a).a(Long.valueOf(System.currentTimeMillis()));
            }
        }
        if (p0.c != 0) {
            v2 = new com.google.android.finsky.d.c(308).a(com.google.android.finsky.billing.profile.x.a());
            if (p0.c.c != 0)
                v2.a(p0.c.c);
            this.b.e.a(v2);
        }
        else
            this.b.e.a(new com.google.android.finsky.d.c(308).a(com.google.android.finsky.billing.profile.x.a()));
    }

}
