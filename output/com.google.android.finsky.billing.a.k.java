package com.google.android.finsky.billing.a;

import android.content.Context;
import com.google.android.finsky.api.c;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.dfe.c.a.ao;
import com.google.wireless.android.finsky.dfe.c.a.ap;

public final class com.google.android.finsky.billing.a.k implements com.android.volley.x
{

    public final boolean a;
    public final boolean b;
    public final com.google.android.finsky.d.w c;
    public final Context d;
    public final com.google.android.finsky.api.c e;
    public final boolean f;
    public final com.google.wireless.android.finsky.dfe.c.a.ao g;
    public final com.google.android.finsky.billing.a.h h;

    k(com.google.android.finsky.billing.a.h p0, boolean p1, boolean p2, com.google.android.finsky.d.w p3, Context p4, com.google.android.finsky.api.c p5, boolean p6, com.google.wireless.android.finsky.dfe.c.a.ao p7) {
        this.h = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
    }

    public final void b_(Object p0) {
        if (this.a != 0 && ((com.google.wireless.android.finsky.dfe.c.a.ap)p0).b != 0 && ((com.google.wireless.android.finsky.dfe.c.a.ap)p0).b.length > 0)
            new com.google.android.finsky.billing.a.l(this, (com.google.wireless.android.finsky.dfe.c.a.ap)p0).start();
        if (this.b != 0)
            this.c.a(new com.google.android.finsky.d.c(2051).a(1).a(((com.google.wireless.android.finsky.dfe.c.a.ap)p0).d));
    }

}
