package com.google.android.finsky.dc;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.aj;
import com.google.android.finsky.utils.FinskyLog;

final class C2563i implements C0657w {
    public final /* synthetic */ C2561g f13675a;

    C2563i(C2561g c2561g) {
        this.f13675a = c2561g;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f13675a.f13662e = false;
        FinskyLog.m21665c("SelfUpdate error - %s", volleyError);
        C2474c b = this.f13675a.m13558b(104);
        aj.m13208a(b, volleyError, false);
        this.f13675a.f13668l.m13367a(b);
    }
}
