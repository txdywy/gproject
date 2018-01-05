package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import com.android.volley.VolleyError;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.iab.l implements com.android.volley.w
{

    public final Bundle a;
    public final Semaphore b;

    l(Bundle p0, Semaphore p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void a(VolleyError p0) {
        this.a.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.g.l);
        this.b.release();
    }

}
