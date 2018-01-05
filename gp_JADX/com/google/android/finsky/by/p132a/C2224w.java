package com.google.android.finsky.by.p132a;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.cv;
import java.util.HashMap;
import java.util.Map;

final class C2224w implements C0657w, C0660x {
    public final Map f11095a = new HashMap();
    public final /* synthetic */ C2219r f11096b;

    public C2224w(C2219r c2219r) {
        this.f11096b = c2219r;
        for (String str : C2229h.f11126g) {
            this.f11095a.put(str, c2219r.f11077g.mo2791f(str));
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21665c("Library replication failed: %s", volleyError);
        if (this.f11096b.f11081k) {
            this.f11096b.m11621a(3, null, volleyError, null);
        }
        this.f11096b.f11075e.post(new C2226y(this));
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f11096b.f11075e.post(new C2225x(this, (cv) obj));
    }
}
