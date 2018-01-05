package com.google.android.finsky.wear;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.volley.DisplayMessageError;

final class C4799t implements C0657w {
    public final /* synthetic */ String f25053a;
    public final /* synthetic */ C4796q f25054b;

    C4799t(C4796q c4796q, String str) {
        this.f25054b = c4796q;
        this.f25053a = str;
    }

    public final void mo1062a(VolleyError volleyError) {
        String str;
        C1473m.f7980a.mo2257p();
        int a = C3322j.m16692a(volleyError);
        if (volleyError instanceof DisplayMessageError) {
            str = ((DisplayMessageError) volleyError).a;
        } else {
            str = null;
        }
        FinskyLog.m21659a("Received VolleyError %d (%s)", Integer.valueOf(a), str);
        this.f25054b.m22574e();
        this.f25054b.m22567a(this.f25053a, a);
    }
}
