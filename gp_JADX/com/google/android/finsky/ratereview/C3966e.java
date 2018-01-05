package com.google.android.finsky.ratereview;

import android.support.v4.app.C0254u;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C3966e implements C0657w {
    public final /* synthetic */ C0254u f20014a;
    public final /* synthetic */ C2651l f20015b;

    C3966e(C0254u c0254u, C2651l c2651l) {
        this.f20014a = c0254u;
        this.f20015b = c2651l;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Error getting G+ profile: %s", volleyError.toString());
        C3964c.m18675a(this.f20014a, null);
        this.f20015b.mo3090a();
    }
}
