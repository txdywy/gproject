package com.google.android.finsky.billing.iab;

import com.google.android.finsky.api.c;
import com.google.android.finsky.by.l;
import com.google.wireless.android.finsky.dfe.nano.ax;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.iab.h implements com.android.volley.x
{

    public final x[] a;
    public final String b;
    public final Semaphore c;
    public final com.google.android.finsky.billing.iab.e d;

    h(com.google.android.finsky.billing.iab.e p0, x[] p1, String p2, Semaphore p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void b_(Object p0) {
        v4 = new w[1];
        v4[0] = ((com.google.wireless.android.finsky.dfe.nano.ax)p0).b;
        this.d.n.a(this.d.f.b(), "consumePurchase", new com.google.android.finsky.billing.iab.i(this, (com.google.wireless.android.finsky.dfe.nano.ax)p0), v4);
    }

}
