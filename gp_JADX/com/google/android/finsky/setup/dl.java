package com.google.android.finsky.setup;

import android.content.Intent;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;

final class dl implements Runnable {
    public final /* synthetic */ Intent f21074a;
    public final /* synthetic */ VpaService f21075b;

    dl(VpaService vpaService, Intent intent) {
        this.f21075b = vpaService;
        this.f21074a = intent;
    }

    public final void run() {
        VpaService vpaService = this.f21075b;
        vpaService.f20719t--;
        String authority = this.f21074a.getData().getAuthority();
        int i = -1;
        switch (authority.hashCode()) {
            case -1513055716:
                if (authority.equals("installrequiredfornewaccount")) {
                    boolean z = true;
                    break;
                }
                break;
            case -54583035:
                if (authority.equals("startvpafordeferredsetupnotification")) {
                    i = 3;
                    break;
                }
                break;
            case 1039760992:
                if (authority.equals("acquirepreloads")) {
                    i = 4;
                    break;
                }
                break;
            case 1484274758:
                if (authority.equals("installdefault")) {
                    i = 2;
                    break;
                }
                break;
            case 2025424442:
                if (authority.equals("installrequired")) {
                    i = 0;
                    break;
                }
                break;
        }
        switch (i) {
            case 0:
            case 1:
                if (((Boolean) C0954a.be.m5760a()).booleanValue()) {
                    FinskyLog.m21665c("Already installed required PAIs", new Object[0]);
                    vpaService = this.f21075b;
                    bb.m21791a();
                    if (vpaService.f20719t == 0 && !vpaService.f20720u && VpaService.f20697b == 0) {
                        vpaService.stopForeground(true);
                        vpaService.m19149a(1);
                        vpaService.stopSelf(vpaService.f20718s);
                        return;
                    }
                    return;
                }
                m19490a(this.f21075b.f20725z);
                return;
            case 2:
                m19490a(this.f21075b.f20699A);
                return;
            case 3:
                m19490a(this.f21075b.f20700B);
                return;
            case 4:
                m19490a(this.f21075b.f20701C);
                return;
            default:
                FinskyLog.m21669e("Unexpected URI: %s", this.f21074a.getData());
                return;
        }
    }

    private final void m19490a(dp dpVar) {
        if (!this.f21075b.m19153a(dpVar, this.f21075b.f20707h.mo2015a())) {
            VpaService vpaService = this.f21075b;
            bb.m21791a();
            if (vpaService.f20719t == 0 && !vpaService.f20720u && VpaService.f20697b == 0) {
                vpaService.stopForeground(true);
                vpaService.m19149a(1);
                vpaService.stopSelf(vpaService.f20718s);
            }
        }
    }
}
