package com.google.android.finsky.billing.a;

import com.android.volley.VolleyError;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.a.m implements com.android.volley.w
{

    public final boolean a;
    public final com.google.android.finsky.d.w b;

    m(boolean p0, com.google.android.finsky.d.w p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.c("/bulkAcquire response Error: %s", v1);
        if (this.a != 0)
            this.b.a(new com.google.android.finsky.d.c(2051).a(0).a(p0));
    }

}
