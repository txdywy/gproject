package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.wearable.C5614b;

final class C4804y implements C1643x {
    public final /* synthetic */ String f25071a;
    public final /* synthetic */ C4803x f25072b;

    C4804y(C4803x c4803x, String str) {
        this.f25072b = c4803x;
        this.f25071a = str;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        if (!((C5614b) c4980w).mo4505b().m23271a()) {
            FinskyLog.m21667d("Writing %s failed with error %d", this.f25071a, Integer.valueOf(((C5614b) c4980w).mo4505b().f25631g));
            C4796q c4796q = this.f25072b.f25070e;
            String str = this.f25072b.f25066a;
            C4790k c4790k = c4796q.f25042k;
            String str2 = c4796q.f25034c;
            String str3 = c4796q.f25035d;
            C4789j a = new C4789j(111, c4796q.f25048q).m22537b(c4796q.f25034c).m22533a(993).m22539d(null).m22534a(c4796q.f25038g);
            a.f24996b = c4796q.f25035d;
            c4790k.m22545a(str2, str3, a.m22535a(str).m22536a());
            this.f25072b.f25070e.m22566a(this.f25072b.f25067b);
        }
    }
}
