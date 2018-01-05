package com.google.android.finsky.hygiene;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.dp.C1096g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.gp;
import java.util.ArrayDeque;

final class C3206p implements C1096g {
    public final /* synthetic */ C1254c f16513a;
    public final /* synthetic */ ArrayDeque f16514b;
    public final /* synthetic */ C3204n f16515c;

    C3206p(C3204n c3204n, C1254c c1254c, ArrayDeque arrayDeque) {
        this.f16515c = c3204n;
        this.f16513a = c1254c;
        this.f16514b = arrayDeque;
    }

    public final void mo1427a(gp gpVar) {
        this.f16515c.m16251a(this.f16513a, this.f16514b);
    }

    public final void mo1426a(VolleyError volleyError) {
        FinskyLog.m21665c("Unable to preload experiments: %s", volleyError);
        this.f16515c.m16251a(this.f16513a, this.f16514b);
    }
}
