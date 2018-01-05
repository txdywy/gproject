package com.google.android.finsky.be;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.be.c implements com.android.volley.w
{

    public final com.google.android.finsky.be.a a;

    c(com.google.android.finsky.be.a p0) {
        this.a = p0;
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.d("Error pinging deeplink click: %s", v1);
        this.a.a(521, p0);
    }

}
