package com.google.android.finsky.wear;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5617e;
import com.google.android.gms.wearable.C5619g;
import com.google.android.gms.wearable.C5620h;
import com.google.android.gms.wearable.C5652n;
import java.util.List;

final class C4785f implements C1643x {
    public final /* synthetic */ List f24974a;
    public final /* synthetic */ C5058o f24975b;
    public final /* synthetic */ C4784e f24976c;

    C4785f(C4784e c4784e, List list, C5058o c5058o) {
        this.f24976c = c4784e;
        this.f24974a = list;
        this.f24975b = c5058o;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        C5619g c5619g = (C5619g) c4980w;
        if (c5619g.f28574d.m23271a()) {
            int c = c5619g.mo4501c();
            for (int i = 0; i < c; i++) {
                C5617e c5617e = (C5617e) c5619g.mo4502a(i);
                String b = cl.m22517b(c5617e.mo5123b());
                long e = C5620h.m26634a(c5617e.mo5124c()).m26659e("timestamp");
                if (System.currentTimeMillis() > ((Long) C0955b.eu.m28964b()).longValue() + e) {
                    FinskyLog.m21659a("Dropping node %s with timestamp %d, current time %d", b, Long.valueOf(e), Long.valueOf(System.currentTimeMillis()));
                    this.f24974a.add(b);
                }
            }
        } else {
            FinskyLog.m21665c("Error %d getting liveness data. (%s)", Integer.valueOf(c5619g.f28574d.f25631g), c5619g.f28574d.f25632h);
        }
        c5619g.mo4500a();
        C5652n.f28708a.mo5118b(this.f24975b, cl.f24957a).mo4490a(new C4786g(this));
    }
}
