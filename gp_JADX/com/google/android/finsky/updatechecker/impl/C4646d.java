package com.google.android.finsky.updatechecker.impl;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C4646d implements C0657w {
    public final /* synthetic */ C4644b f23945a;

    C4646d(C4644b c4644b) {
        this.f23945a = c4644b;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21665c("Update check failed: %s", volleyError);
        C4643a.m21605a(this.f23945a.f23941c, false);
    }
}
