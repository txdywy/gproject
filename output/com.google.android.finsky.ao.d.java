package com.google.android.finsky.ao;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.ao.d implements com.android.volley.w
{

    public final com.google.android.finsky.ao.a a;
    public final com.google.android.finsky.ao.g b;

    d(com.google.android.finsky.ao.a p0, com.google.android.finsky.ao.g p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void a(VolleyError p0) {
        v3 = new Object[1];
        v3[0] = p0;
        FinskyLog.d("Could not retrieve docs: %s", v3);
        v2 = new com.google.android.finsky.ao.l();
        v2.b = 2200;
        this.a.a(this.b, v2.a());
    }

}
