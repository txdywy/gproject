package com.google.android.finsky.wear;

import android.net.Uri;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5617e;
import com.google.android.gms.wearable.C5619g;
import com.google.android.gms.wearable.C5620h;
import com.google.android.gms.wearable.C5652n;

final class bu implements C1643x {
    public final /* synthetic */ C5058o f24906a;
    public final /* synthetic */ WearSupportService f24907b;

    bu(WearSupportService wearSupportService, C5058o c5058o) {
        this.f24907b = wearSupportService;
        this.f24906a = c5058o;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        C5619g c5619g = (C5619g) c4980w;
        if (c5619g.f28574d.m23271a()) {
            int c = c5619g.mo4501c();
            for (int i = 0; i < c; i++) {
                int i2;
                C5617e c5617e = (C5617e) c5619g.mo4502a(i);
                WearSupportService wearSupportService = this.f24907b;
                C5620h a = C5620h.m26634a(c5617e.mo5124c());
                int d = a.m26658d("eventType");
                if (d <= 0 || d >= 100) {
                    FinskyLog.m21665c("Invalid Wearsky event type %d", Integer.valueOf(d));
                    i2 = 0;
                } else {
                    i2 = d + 1500;
                }
                if (i2 != 0) {
                    Uri b = c5617e.mo5123b();
                    String host = b.getHost();
                    String str = (String) b.getPathSegments().get(1);
                    String f = a.m26660f("requestType");
                    String f2 = a.m26660f("packageName");
                    C4789j a2 = new C4789j(i2, wearSupportService.f24758e).m22537b(f2).m22538c(f).m22533a(a.m26658d("status"));
                    a2.f24996b = host;
                    C1473m.f7980a.dc().m13319a(a2.m22535a(str).m22536a(), null);
                }
                C5652n.f28708a.mo5119c(this.f24906a, c5617e.mo5123b());
            }
        } else {
            FinskyLog.m21665c("Error %d getting logging data. (%s)", Integer.valueOf(c5619g.f28574d.f25631g), c5619g.f28574d.f25632h);
        }
        c5619g.mo4500a();
        this.f24907b.f24760g = this.f24907b.f24760g - 1;
        this.f24907b.m22419a();
    }
}
