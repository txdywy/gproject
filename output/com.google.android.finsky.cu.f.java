package com.google.android.finsky.cu;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.cu.f implements com.android.volley.w
{

    public final com.google.android.finsky.cu.d a;

    f(com.google.android.finsky.cu.d p0) {
        this.a = p0;
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0.getCause();
        FinskyLog.d("Unable to load JSON: %s", v1);
        this.a.g = 0;
        this.a.a.g();
        this.a.e = 0;
        this.a.c();
    }

}
