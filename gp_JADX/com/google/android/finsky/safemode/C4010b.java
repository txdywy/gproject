package com.google.android.finsky.safemode;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.dc.C2556b;
import com.google.android.finsky.de.C2496e;
import com.google.wireless.android.finsky.dfe.nano.gb;

final class C4010b implements C2496e {
    public final /* synthetic */ boolean f20128a;
    public final /* synthetic */ C1254c f20129b;
    public final /* synthetic */ SafeModeService f20130c;

    C4010b(SafeModeService safeModeService, boolean z, C1254c c1254c) {
        this.f20130c = safeModeService;
        this.f20128a = z;
        this.f20129b = c1254c;
    }

    public final void mo2920a(gb gbVar) {
        C1552e dj = this.f20128a ? this.f20130c.f20126e.dj() : this.f20130c.f20126e.mo2249j(null);
        C2556b a = this.f20130c.f20125d.mo2050a(dj);
        if (!a.mo2948a(a.mo2944a(gbVar), this.f20129b, dj, this.f20130c.f20127f.m13184a(null))) {
            this.f20130c.m18754a();
        }
    }

    public final void mo2919a(VolleyError volleyError) {
        this.f20130c.m18754a();
    }
}
