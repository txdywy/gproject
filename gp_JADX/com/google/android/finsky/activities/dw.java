package com.google.android.finsky.activities;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;

final class dw implements C0657w {
    dw() {
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Error pinging inline app: %s", volleyError.toString());
        C2474c c2474c = new C2474c(522);
        c2474c.m13238a((Throwable) volleyError);
        C1473m.f7980a.dc().m13327a(c2474c.f13342a);
    }
}
