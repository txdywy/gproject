package com.google.android.finsky.setup;

import com.android.volley.C0657w;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.a.a.a.a.ck;

final class dd implements C0657w {
    public final /* synthetic */ String f21061a;
    public final /* synthetic */ VpaService f21062b;

    dd(VpaService vpaService, String str) {
        this.f21062b = vpaService;
        this.f21061a = str;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21665c("Failed to retrieve preloads: %s", volleyError);
        this.f21062b.f20720u = false;
        this.f21062b.f20714o.mo2242f(this.f21061a).m13319a(new C2474c(130).m13239a(false).m13238a((Throwable) volleyError).m13226a(new ck().a(VpaService.m19143b())).f13342a, null);
        if (volleyError instanceof ServerError) {
            this.f21062b.m19148a();
        }
        this.f21062b.m19151a(this.f21061a, null, null);
        VpaService vpaService = this.f21062b;
        bb.m21791a();
        if (vpaService.f20719t == 0 && !vpaService.f20720u && VpaService.f20697b == 0) {
            vpaService.stopForeground(true);
            vpaService.m19149a(1);
            vpaService.stopSelf(vpaService.f20718s);
        }
    }
}
