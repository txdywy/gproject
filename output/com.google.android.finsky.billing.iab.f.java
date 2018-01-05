package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import com.google.android.finsky.api.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.a.h;
import com.google.android.finsky.billing.common.i;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.dfe.nano.ge;
import com.google.wireless.android.finsky.dfe.nano.gf;
import com.google.wireless.android.finsky.dfe.nano.gg;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.iab.f implements com.android.volley.x
{

    public final Bundle a;
    public final Semaphore b;
    public final int c;
    public final String d;
    public final String e;
    public final com.google.wireless.android.finsky.dfe.nano.gf f;
    public final com.google.android.finsky.billing.iab.e g;

    f(com.google.android.finsky.billing.iab.e p0, Bundle p1, Semaphore p2, int p3, String p4, String p5, com.google.wireless.android.finsky.dfe.nano.gf p6) {
        this.g = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
    }

    public final void b_(Object p0) {
        v5 = new ArrayList(((com.google.wireless.android.finsky.dfe.nano.gg)p0).b.length);
        v0 = 0;
        while (v0 < ((com.google.wireless.android.finsky.dfe.nano.gg)p0).b.length) {
            if (((com.google.wireless.android.finsky.dfe.nano.gg)p0).b[v0].b & 1)
                v2 = 1;
            else
                v2 = 0;
            if (v2 != 0)
                v5.add(((com.google.wireless.android.finsky.dfe.nano.gg)p0).b[v0].c);
            v0 = v0 + 1;
        }
        this.a.putStringArrayList("DETAILS_LIST", v5);
        this.a.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.a.l);
        this.b.release();
        if (((com.google.wireless.android.finsky.dfe.nano.gg)p0).c != 0) {
            v6 = this.g.l.a(this.g.e, this.c, this.d, 0, "", this.e, 0, this.g.g, 0);
            if (v6 != 0)
                this.g.r.a(this.g.e, this.g.f, this.f, this.g.p.b(this.g.e, this.g.f.c()), (com.google.wireless.android.finsky.dfe.nano.gg)p0, v6, this.g.h);
            else if (this.g.g.a(12639864))
                this.g.h.a(new com.google.android.finsky.d.c(2052).g(1));
        }
    }

}
