package com.google.android.finsky.wear;

import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.wearable.C5614b;

final class C4802w implements C1643x {
    public final /* synthetic */ String f25062a;
    public final /* synthetic */ String f25063b;
    public final /* synthetic */ C3647b f25064c;
    public final /* synthetic */ C4796q f25065d;

    C4802w(C4796q c4796q, String str, String str2, C3647b c3647b) {
        this.f25065d = c4796q;
        this.f25062a = str;
        this.f25063b = str2;
        this.f25064c = c3647b;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        if (!((C5614b) c4980w).mo4505b().m23271a()) {
            FinskyLog.m21667d("Writing %s failed with error %d", this.f25062a, Integer.valueOf(((C5614b) c4980w).mo4505b().f25631g));
            C4796q c4796q = this.f25065d;
            String str = this.f25063b;
            C4790k c4790k = c4796q.f25042k;
            String str2 = c4796q.f25034c;
            String str3 = c4796q.f25035d;
            C4789j a = new C4789j(111, c4796q.f25048q).m22537b(c4796q.f25034c).m22533a(993).m22539d(null).m22534a(c4796q.f25038g);
            a.f24996b = c4796q.f25035d;
            c4790k.m22545a(str2, str3, a.m22535a(str).m22536a());
            this.f25065d.m22566a(this.f25064c);
        }
    }
}
