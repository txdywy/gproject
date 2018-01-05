package com.google.android.finsky.setup;

import android.text.TextUtils;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.util.concurrent.ExecutionException;

final class dm implements C0978f {
    public final /* synthetic */ String f21076a;
    public final /* synthetic */ C1254c f21077b;
    public final /* synthetic */ VpaService f21078c;

    dm(VpaService vpaService, String str, C1254c c1254c) {
        this.f21078c = vpaService;
        this.f21076a = str;
        this.f21077b = c1254c;
    }

    public final void mo1172a(C4809e c4809e) {
        String str;
        Throwable e;
        VpaService vpaService;
        VpaService vpaService2;
        C1254c c1254c;
        String c;
        try {
            str = (String) c4809e.get();
        } catch (InterruptedException e2) {
            e = e2;
            FinskyLog.m21660a(e, "Could not resolve PAI config", new Object[0]);
            str = null;
            if (!TextUtils.isEmpty(str)) {
                FinskyLog.m21659a("No VPA stub found - stopping service", new Object[0]);
                this.f21078c.f20720u = false;
                this.f21078c.m19148a();
                this.f21078c.m19151a(this.f21076a, null, null);
                vpaService = this.f21078c;
                bb.m21791a();
                if (vpaService.f20719t == 0) {
                    return;
                }
                return;
            } else if (this.f21077b == null) {
                vpaService2 = this.f21078c;
                c1254c = this.f21077b;
                C2693e.m14552a().m14562a(c1254c, new dn(vpaService2, c1254c, str), true, false);
            } else {
                vpaService2 = this.f21078c;
                c1254c = this.f21078c.f20707h.mo2017b();
                c = c1254c.mo1636c();
                c1254c.mo1656i(str, new C4171do(vpaService2, c), new dd(vpaService2, c));
            }
        } catch (ExecutionException e3) {
            e = e3;
            FinskyLog.m21660a(e, "Could not resolve PAI config", new Object[0]);
            str = null;
            if (!TextUtils.isEmpty(str)) {
                FinskyLog.m21659a("No VPA stub found - stopping service", new Object[0]);
                this.f21078c.f20720u = false;
                this.f21078c.m19148a();
                this.f21078c.m19151a(this.f21076a, null, null);
                vpaService = this.f21078c;
                bb.m21791a();
                if (vpaService.f20719t == 0) {
                    return;
                }
                return;
            } else if (this.f21077b == null) {
                vpaService2 = this.f21078c;
                c1254c = this.f21078c.f20707h.mo2017b();
                c = c1254c.mo1636c();
                c1254c.mo1656i(str, new C4171do(vpaService2, c), new dd(vpaService2, c));
            } else {
                vpaService2 = this.f21078c;
                c1254c = this.f21077b;
                C2693e.m14552a().m14562a(c1254c, new dn(vpaService2, c1254c, str), true, false);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            FinskyLog.m21659a("No VPA stub found - stopping service", new Object[0]);
            this.f21078c.f20720u = false;
            this.f21078c.m19148a();
            this.f21078c.m19151a(this.f21076a, null, null);
            vpaService = this.f21078c;
            bb.m21791a();
            if (vpaService.f20719t == 0 && !vpaService.f20720u && VpaService.f20697b == 0) {
                vpaService.stopForeground(true);
                vpaService.m19149a(1);
                vpaService.stopSelf(vpaService.f20718s);
            }
        } else if (this.f21077b == null) {
            vpaService2 = this.f21078c;
            c1254c = this.f21078c.f20707h.mo2017b();
            c = c1254c.mo1636c();
            c1254c.mo1656i(str, new C4171do(vpaService2, c), new dd(vpaService2, c));
        } else {
            vpaService2 = this.f21078c;
            c1254c = this.f21077b;
            C2693e.m14552a().m14562a(c1254c, new dn(vpaService2, c1254c, str), true, false);
        }
    }
}
