package com.google.android.finsky.instantappstossupport;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.instantapps.C5265d;

final class C3621c implements C1643x {
    public final /* synthetic */ C3620b f17977a;

    C3621c(C3620b c3620b) {
        this.f17977a = c3620b;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        C5265d c5265d = (C5265d) c4980w;
        if (c5265d.mo4505b().m23271a()) {
            String str = c5265d.mo4691a().f26426b;
            FinskyLog.m21662b(new StringBuilder(String.valueOf(str).length() + 45).append("GetOptInStateJob state: ").append(c5265d.mo4691a().f26425a).append(" account: ").append(str).toString(), new Object[0]);
            if (!(str == null || "".equals(str))) {
                C0954a.bz.m5777b(str).m5763a(Integer.valueOf(c5265d.mo4691a().f26425a));
            }
        }
        this.f17977a.f17976b.m5802b(null);
    }
}
