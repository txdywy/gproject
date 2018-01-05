package com.google.android.finsky.settings;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.dc.C2556b;
import com.google.android.finsky.de.C2496e;
import com.google.wireless.android.finsky.dfe.nano.gb;

final class C4105p implements C2496e {
    public final /* synthetic */ C1254c f20529a;
    public final /* synthetic */ SettingsActivity f20530b;

    C4105p(SettingsActivity settingsActivity, C1254c c1254c) {
        this.f20530b = settingsActivity;
        this.f20529a = c1254c;
    }

    public final void mo2920a(gb gbVar) {
        C1552e dj = this.f20530b.f20475k.dj();
        C2556b a = this.f20530b.f20482r.mo2050a(dj);
        SettingsActivity.f20462b = Boolean.valueOf(a.mo2948a(a.mo2944a(gbVar), this.f20529a, dj, this.f20530b.f20471f.m13184a(null)));
        this.f20530b.m19031a(SettingsActivity.f20462b.booleanValue());
    }

    public final void mo2919a(VolleyError volleyError) {
        this.f20530b.m19031a(false);
    }
}
