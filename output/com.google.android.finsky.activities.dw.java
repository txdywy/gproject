package com.google.android.finsky.activities;

import com.android.volley.VolleyError;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.activities.dw implements com.android.volley.w
{

    dw() {
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0.toString();
        FinskyLog.d("Error pinging inline app: %s", v1);
        v0 = new com.google.android.finsky.d.c(522);
        v0.a(p0);
        com.google.android.finsky.m.a.dc().a(v0.a);
    }

}
