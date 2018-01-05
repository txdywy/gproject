package com.google.android.finsky.activities;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.utils.FinskyLog;

final class dg implements C1031w {
    public final /* synthetic */ de f6665a;

    dg(de deVar) {
        this.f6665a = deVar;
    }

    public final void m_() {
        if (this.f6665a.f6658a == null) {
            this.f6665a.m6456a(this.f6665a.f6660d.m14722b());
        } else {
            FinskyLog.m21659a("Ignoring soft TTL refresh.", new Object[0]);
        }
    }
}
