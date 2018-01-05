package com.google.android.finsky.p148b;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;

final class C1539c implements C0657w {
    public final /* synthetic */ C1537a f8283a;

    C1539c(C1537a c1537a) {
        this.f8283a = c1537a;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Error pinging ad click: %s", volleyError.toString());
        C2474c c2474c = new C2474c(520);
        c2474c.m13238a((Throwable) volleyError);
        this.f8283a.f8276c.dc().m13327a(c2474c.f13342a);
    }
}
