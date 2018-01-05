package com.google.android.finsky.b;

import com.android.volley.VolleyError;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.b.c implements com.android.volley.w
{

    public final com.google.android.finsky.b.a a;

    c(com.google.android.finsky.b.a p0) {
        this.a = p0;
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0.toString();
        FinskyLog.d("Error pinging ad click: %s", v1);
        v0 = new com.google.android.finsky.d.c(520);
        v0.a(p0);
        this.a.c.dc().a(v0.a);
    }

}
