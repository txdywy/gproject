package com.google.android.finsky.wear;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class ci implements C0657w {
    public final /* synthetic */ String f24954a;
    public final /* synthetic */ cj f24955b;
    public final /* synthetic */ cd f24956c;

    ci(cd cdVar, String str, cj cjVar) {
        this.f24956c = cdVar;
        this.f24954a = str;
        this.f24955b = cjVar;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21665c("Check update for node %s package %s failed: %s", this.f24956c.f24932e, this.f24954a, volleyError);
        cd.m22508a(this.f24955b, false);
    }
}
