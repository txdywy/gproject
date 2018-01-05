package com.google.android.finsky.setup;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.ef;

final class dc implements dp {
    public final /* synthetic */ VpaService f21060a;

    dc(VpaService vpaService) {
        this.f21060a = vpaService;
    }

    public final void mo3935a(String str, ee[] eeVarArr, ef[] efVarArr) {
        if (eeVarArr != null) {
            if (((Boolean) C0954a.be.m5760a()).booleanValue()) {
                FinskyLog.m21665c("Already installed required PAIs", new Object[0]);
                return;
            } else {
                this.f21060a.m19150a(str, this.f21060a.f20703d.m19495a(eeVarArr).f21090b);
            }
        }
        VpaService vpaService = this.f21060a;
        bb.m21791a();
        if (vpaService.f20719t == 0 && !vpaService.f20720u && VpaService.f20697b == 0) {
            vpaService.stopForeground(true);
            vpaService.m19149a(1);
            vpaService.stopSelf(vpaService.f20718s);
        }
    }
}
