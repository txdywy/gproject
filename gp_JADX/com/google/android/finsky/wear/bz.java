package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.wearable.C5614b;
import com.google.android.gms.wearable.C5620h;

final class bz implements C1643x {
    public final /* synthetic */ by f24921a;

    bz(by byVar) {
        this.f24921a = byVar;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        C5614b c5614b = (C5614b) c4980w;
        if (!c5614b.mo4505b().m23271a()) {
            FinskyLog.m21665c("Error %d getting data item %s. (%s)", Integer.valueOf(c5614b.mo4505b().f25631g), this.f24921a.f24917b.toString(), c5614b.mo4505b().f25632h);
            this.f24921a.f24920e.f24761h.mo4391c();
        } else if (C5620h.m26634a(c5614b.mo5120a().mo5124c()).m26657c("phoneskyProcessed")) {
            FinskyLog.m21659a("Skipping DataItem %s node %s, already processed", this.f24921a.f24917b, this.f24921a.f24918c);
            this.f24921a.f24920e.f24761h.mo4391c();
        } else {
            this.f24921a.f24920e.f24756c.m22454a(c5614b.mo5120a(), this.f24921a.f24918c, this.f24921a.f24919d, this.f24921a.f24920e.f24761h);
        }
    }
}
