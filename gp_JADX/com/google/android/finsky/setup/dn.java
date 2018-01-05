package com.google.android.finsky.setup;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.deviceconfig.C1050j;

final class dn implements C1050j {
    public final /* synthetic */ C1254c f21079a;
    public final /* synthetic */ String f21080b;
    public final /* synthetic */ VpaService f21081c;

    dn(VpaService vpaService, C1254c c1254c, String str) {
        this.f21081c = vpaService;
        this.f21079a = c1254c;
        this.f21080b = str;
    }

    public final void mo1306a() {
        VpaService vpaService = this.f21081c;
        C1254c c1254c = this.f21079a;
        String str = this.f21080b;
        String c = c1254c.mo1636c();
        c1254c.mo1656i(str, new C4171do(vpaService, c), new dd(vpaService, c));
    }

    public final void mo1307a(VolleyError volleyError) {
        VpaService vpaService = this.f21081c;
        C1254c c1254c = this.f21079a;
        String str = this.f21080b;
        String c = c1254c.mo1636c();
        c1254c.mo1656i(str, new C4171do(vpaService, c), new dd(vpaService, c));
    }
}
