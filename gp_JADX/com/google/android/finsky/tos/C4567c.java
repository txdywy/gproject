package com.google.android.finsky.tos;

import com.google.android.finsky.instantapps.metrics.C3533f;
import com.google.android.finsky.instantapps.p220f.C3491p;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;

final /* synthetic */ class C4567c implements C1643x {
    public final C4566b f23353a;

    C4567c(C4566b c4566b) {
        this.f23353a = c4566b;
    }

    public final void mo2367a(C4980w c4980w) {
        C4566b c4566b = this.f23353a;
        if (((Status) c4980w).m23271a()) {
            C3491p.m17061a(c4566b.f23351d, "PHONESKY_TOS_INSTANT_APPS_OPT_IN_SUCCESS");
            c4566b.f23352e.m13367a(new C2474c(3306));
            C3533f.m17116a(c4566b.f23351d, 2207);
            return;
        }
        c4566b.f23352e.m13367a(new C2474c(3307));
        C3533f.m17116a(c4566b.f23351d, 2208);
    }
}
