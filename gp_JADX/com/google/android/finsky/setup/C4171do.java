package com.google.android.finsky.setup;

import android.support.v4.os.C0327a;
import android.text.TextUtils;
import com.android.volley.C0660x;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.eg;

final class C4171do implements C0660x {
    public final /* synthetic */ String f21082a;
    public final /* synthetic */ VpaService f21083b;

    C4171do(VpaService vpaService, String str) {
        this.f21083b = vpaService;
        this.f21082a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        boolean z = false;
        eg egVar = (eg) obj;
        FinskyLog.m21659a("Retrieved %d preloads.", Integer.valueOf(egVar.b.length));
        this.f21083b.f20720u = false;
        VpaService vpaService = this.f21083b;
        String str = this.f21082a;
        ee eeVar = egVar.a;
        if (eeVar != null) {
            eeVar.b |= 64;
            eeVar.l = 0;
            if (eeVar.n == null) {
                eeVar.n = new cv();
            }
            if (TextUtils.isEmpty(eeVar.n.f12100g)) {
                cv cvVar = eeVar.n;
                String str2 = eeVar.c.f11833b;
                if (str2 == null) {
                    throw new NullPointerException();
                }
                cvVar.f12095b |= 16;
                cvVar.f12100g = str2;
            }
            vpaService.f20715p.mo3923a(vpaService.getApplicationContext(), str, eeVar);
        }
        VpaService.f20698c = egVar.b.length > 0;
        if (!C0327a.m1722b() && C1503a.m8830a(this.f21083b.getApplicationContext())) {
            for (ee eeVar2 : egVar.b) {
                eeVar2.b |= 8;
                eeVar2.h = true;
            }
        }
        C4174g a = this.f21083b.f20703d.m19495a(egVar.b);
        VpaService vpaService2 = this.f21083b;
        if (!a.f21089a.isEmpty()) {
            z = true;
        }
        vpaService2.m19152a(z);
        this.f21083b.m19151a(this.f21082a, egVar.b, egVar.c);
        vpaService = this.f21083b;
        bb.m21791a();
        if (vpaService.f20719t == 0 && !vpaService.f20720u && VpaService.f20697b == 0) {
            vpaService.stopForeground(true);
            vpaService.m19149a(1);
            vpaService.stopSelf(vpaService.f20718s);
        }
    }
}
