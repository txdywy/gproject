package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import com.android.volley.VolleyError;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.iab.g implements com.android.volley.w
{

    public final Bundle a;
    public final boolean b;
    public final String c;
    public final String d;
    public final Semaphore e;
    public final com.google.android.finsky.billing.iab.e f;

    g(com.google.android.finsky.billing.iab.e p0, Bundle p1, boolean p2, String p3, String p4, Semaphore p5) {
        this.f = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
    }

    public final void a(VolleyError p0) {
        this.a.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.g.l);
        if (this.b != 0)
            this.f.a(this.a, this.c, p0, com.google.android.finsky.billing.iab.e.a(p0), this.d);
        this.e.release();
    }

}
