package com.google.android.finsky.be;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C1595c implements C0657w {
    public final /* synthetic */ C1593a f8483a;

    C1595c(C1593a c1593a) {
        this.f8483a = c1593a;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Error pinging deeplink click: %s", volleyError);
        this.f8483a.m9177a(521, volleyError);
    }
}
