package com.google.android.finsky.de;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.deviceconfig.C1050j;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.utils.FinskyLog;

final class C2571d implements C1050j {
    public final /* synthetic */ boolean f13693a;
    public final /* synthetic */ C1254c f13694b;
    public final /* synthetic */ C2693e f13695c;
    public final /* synthetic */ C2496e f13696d;
    public final /* synthetic */ C2568a f13697e;

    C2571d(C2568a c2568a, boolean z, C1254c c1254c, C2693e c2693e, C2496e c2496e) {
        this.f13697e = c2568a;
        this.f13693a = z;
        this.f13694b = c1254c;
        this.f13695c = c2693e;
        this.f13696d = c2496e;
    }

    public final void mo1306a() {
        this.f13697e.m13572a(this.f13693a, this.f13694b, this.f13695c, this.f13696d);
    }

    public final void mo1307a(VolleyError volleyError) {
        FinskyLog.m21665c("Upload device configuration failed - try selfupdate anyway", new Object[0]);
        this.f13697e.m13572a(this.f13693a, this.f13694b, this.f13695c, this.f13696d);
    }
}
