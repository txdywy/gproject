package com.google.android.finsky.ratereview;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C3979v implements C0657w {
    C3979v() {
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21665c("Connectivity error deserializing reviews: %s", volleyError.toString());
    }
}
