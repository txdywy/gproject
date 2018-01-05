package com.google.android.finsky.activities;

import com.android.volley.VolleyError;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.activities.dk implements com.android.volley.w
{

    dk() {
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.c("flag content failed with error %s", v1);
        v0 = new com.google.android.finsky.d.c(533);
        if (p0 != 0)
            v0.a(p0);
        com.google.android.finsky.m.a.dc().a(v0.a, 0);
    }

}
