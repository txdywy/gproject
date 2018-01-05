package com.google.android.finsky.wear;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.wearable.C5614b;
import com.google.android.gms.wearable.C5651m;

final class bp implements C1643x {
    public final /* synthetic */ C5651m f24888a;
    public final /* synthetic */ String f24889b;
    public final /* synthetic */ String f24890c;
    public final /* synthetic */ String f24891d;
    public final /* synthetic */ WearSupportService f24892e;

    bp(WearSupportService wearSupportService, C5651m c5651m, String str, String str2, String str3) {
        this.f24892e = wearSupportService;
        this.f24888a = c5651m;
        this.f24889b = str;
        this.f24890c = str2;
        this.f24891d = str3;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        if (!((C5614b) c4980w).mo4505b().m23271a()) {
            FinskyLog.m21667d("Writing %s failed with error %d", this.f24888a, Integer.valueOf(((C5614b) c4980w).mo4505b().f25631g));
            C4789j a = new C4789j(114, this.f24892e.f24758e).m22537b(this.f24889b).m22533a(993);
            a.f24996b = this.f24890c;
            C1473m.f7980a.dc().m13319a(a.m22535a(this.f24891d).m22536a(), null);
        }
    }
}
