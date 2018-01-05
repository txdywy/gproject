package com.google.android.finsky.bk;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;

final class C2112f implements C1643x {
    public final /* synthetic */ C2110d f10725a;

    C2112f(C2110d c2110d) {
        this.f10725a = c2110d;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        if (!((Status) c4980w).m23271a()) {
            FinskyLog.m21667d("herrevad logNetworkQualityData failed: %s", (Status) c4980w);
        }
        this.f10725a.f10723h.mo4559g();
    }
}
