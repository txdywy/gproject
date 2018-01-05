package com.google.android.finsky.setup;

import com.google.android.finsky.setup.p242d.C4137g;
import com.google.android.finsky.utils.FinskyLog;

final class bl implements C4137g {
    public String f20872a = null;
    public bx f20873b;
    public final /* synthetic */ RestoreServiceV2 f20874c;

    bl(RestoreServiceV2 restoreServiceV2) {
        this.f20874c = restoreServiceV2;
    }

    public final void mo3938a(String str) {
        m19280a(str, true, false);
    }

    public final void mo3939a(String str, boolean z) {
        m19280a(str, false, z);
    }

    public final void mo3937a() {
    }

    public final void mo3940b() {
    }

    final void m19282a(int i, String str) {
        if (this.f20873b != null) {
            this.f20873b.mo3913a(i, str);
            if (i == 1) {
                this.f20873b = null;
            }
        }
    }

    final boolean m19286c() {
        if (this.f20874c.f20605q.mo3969b()) {
            FinskyLog.m21659a("Final hold waiting for account setup", new Object[0]);
            return true;
        }
        for (PackageSetupStatus packageSetupStatus : this.f20874c.f20606r.mo3984c()) {
            if (packageSetupStatus.f20546a.f20893g == 1) {
                FinskyLog.m21659a("Final hold waiting for %s", ((PackageSetupStatus) r3.next()).m19066a());
                return true;
            }
        }
        return false;
    }

    private final void m19280a(String str, boolean z, boolean z2) {
        this.f20872a = z ? str : null;
        if (z) {
            PackageSetupStatus b = this.f20874c.f20606r.mo3981b(str);
            if (b != null && b.f20546a.f20893g == 1) {
                int i;
                if (b.f20546a.f20895i) {
                    i = 3;
                } else {
                    i = 2;
                }
                m19282a(i, str);
            }
        } else if (z2) {
            m19282a(2, str);
        } else if (!m19286c()) {
            m19282a(1, str);
        }
    }
}
