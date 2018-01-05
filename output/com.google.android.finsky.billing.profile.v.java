package com.google.android.finsky.billing.profile;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.profile.v implements com.android.volley.w
{

    v() {
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.d("Error while checking for offers: %s", v1);
    }

}
