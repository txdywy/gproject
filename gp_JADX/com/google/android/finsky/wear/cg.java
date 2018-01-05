package com.google.android.finsky.wear;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class cg implements C0657w {
    public final /* synthetic */ ce f24947a;

    cg(ce ceVar) {
        this.f24947a = ceVar;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21665c("Update check for node %s failed: %s", this.f24947a.f24945e.f24932e, volleyError);
        this.f24947a.f24945e.f24930c.run();
        cd.m22508a(this.f24947a.f24943c, false);
    }
}
