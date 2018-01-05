package com.google.android.finsky.setup;

import com.google.android.finsky.utils.bb;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.ef;

final class df implements dp {
    public final /* synthetic */ VpaService f21064a;

    df(VpaService vpaService) {
        this.f21064a = vpaService;
    }

    public final void mo3935a(String str, ee[] eeVarArr, ef[] efVarArr) {
        if (eeVarArr != null) {
            this.f21064a.m19150a(str, this.f21064a.f20703d.m19495a(eeVarArr).f21091c);
        }
        VpaService vpaService = this.f21064a;
        bb.m21791a();
        if (vpaService.f20719t == 0 && !vpaService.f20720u && VpaService.f20697b == 0) {
            vpaService.stopForeground(true);
            vpaService.m19149a(1);
            vpaService.stopSelf(vpaService.f20718s);
        }
    }
}
