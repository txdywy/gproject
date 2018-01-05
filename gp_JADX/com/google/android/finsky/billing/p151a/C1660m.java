package com.google.android.finsky.billing.p151a;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;

final class C1660m implements C0657w {
    public final /* synthetic */ boolean f8631a;
    public final /* synthetic */ C2495w f8632b;

    C1660m(boolean z, C2495w c2495w) {
        this.f8631a = z;
        this.f8632b = c2495w;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21665c("/bulkAcquire response Error: %s", volleyError);
        if (this.f8631a) {
            this.f8632b.m13367a(new C2474c(2051).m13239a(false).m13238a((Throwable) volleyError));
        }
    }
}
