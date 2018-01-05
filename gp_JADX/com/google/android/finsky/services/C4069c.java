package com.google.android.finsky.services;

import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.bx;

final class C4069c implements C0660x {
    public final /* synthetic */ GmsCoreUpdateService f20435a;

    C4069c(GmsCoreUpdateService gmsCoreUpdateService) {
        this.f20435a = gmsCoreUpdateService;
    }

    public final /* synthetic */ void b_(Object obj) {
        bx bxVar = (bx) obj;
        if (bxVar.a == null || bxVar.a.length == 0) {
            FinskyLog.m21665c("Expected non empty response for package: com.google.android.gms", new Object[0]);
            return;
        }
        C3300k o = C1473m.f7980a.mo2256o();
        o.mo3455i("com.google.android.gms");
        o.mo3440a("com.google.android.gms", true, false, true);
        C2441n c2441n = bxVar.a[0].b.f12112s.f12048a;
        o.mo3432a("com.google.android.gms", c2441n.f13163c, null, bxVar.a[0].b.f12100g, 1, c2441n.f13153B, this.f20435a.f20417a.m13184a("gms_core_update_service"));
        this.f20435a.stopSelf();
    }
}
