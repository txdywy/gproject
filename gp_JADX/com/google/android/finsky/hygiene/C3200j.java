package com.google.android.finsky.hygiene;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.dfemodel.C2717g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.y;

final class C3200j extends C2717g {
    public final /* synthetic */ DailyHygiene f16502b;

    C3200j(DailyHygiene dailyHygiene, C1254c c1254c, String str) {
        this.f16502b = dailyHygiene;
        super(c1254c, str);
    }

    public final void mo3374a(y yVar) {
        super.mo3374a(yVar);
        this.f16502b.f16442n.m13367a(new C2474c(556));
    }

    public final void mo1062a(VolleyError volleyError) {
        super.mo1062a(volleyError);
        FinskyLog.m21662b("Unable to sync home page: %s. Using BrowseDataSyncScheduler instead.", volleyError);
        this.f16502b.f16442n.m13367a(new C2474c(557).m13210a(C2482j.m13280a(volleyError)));
        this.f16502b.m16190a();
    }

    public final /* synthetic */ void b_(Object obj) {
        mo3374a((y) obj);
    }
}
