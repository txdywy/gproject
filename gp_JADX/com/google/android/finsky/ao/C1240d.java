package com.google.android.finsky.ao;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class C1240d implements C0657w {
    public final C1237a f7396a;
    public final C1243g f7397b;

    C1240d(C1237a c1237a, C1243g c1243g) {
        this.f7396a = c1237a;
        this.f7397b = c1243g;
    }

    public final void mo1062a(VolleyError volleyError) {
        C1237a c1237a = this.f7396a;
        C1243g c1243g = this.f7397b;
        FinskyLog.m21667d("Could not retrieve docs: %s", volleyError);
        C1248l c1248l = new C1248l();
        c1248l.f7413b = 2200;
        c1237a.m7243a(c1243g, c1248l.m7249a());
    }
}
