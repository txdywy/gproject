package com.google.android.finsky.wear;

import android.net.Uri;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.wearable.C5617e;
import com.google.android.gms.wearable.C5619g;
import com.google.android.gms.wearable.C5620h;

final class bi implements C1643x {
    public final /* synthetic */ C4780a f24877a;
    public final /* synthetic */ cc f24878b;
    public final /* synthetic */ ar f24879c;

    bi(ar arVar, C4780a c4780a, cc ccVar) {
        this.f24879c = arVar;
        this.f24877a = c4780a;
        this.f24878b = ccVar;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        C5619g c5619g = (C5619g) c4980w;
        this.f24877a.mo4388d();
        if (c5619g.f28574d.m23271a()) {
            int c = c5619g.mo4501c();
            for (int i = 0; i < c; i++) {
                C5617e c5617e = (C5617e) c5619g.mo4502a(i);
                Uri b = c5617e.mo5123b();
                String b2 = cl.m22517b(b);
                String str = (String) b.getPathSegments().get(1);
                if (C5620h.m26634a(c5617e.mo5124c()).m26657c("phoneskyProcessed")) {
                    FinskyLog.m21659a("Skipping DataItem %s node %s, already processed", b, b2);
                } else {
                    this.f24877a.mo4387c();
                    this.f24879c.f24823g.m22454a(c5617e, b2, str, this.f24878b);
                }
            }
        } else {
            FinskyLog.m21665c("Error %d getting zapp requests. (%s)", Integer.valueOf(c5619g.f28574d.f25631g), c5619g.f28574d.f25632h);
        }
        c5619g.mo4500a();
        this.f24878b.mo4390b();
    }
}
