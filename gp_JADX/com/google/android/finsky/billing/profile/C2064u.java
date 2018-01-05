package com.google.android.finsky.billing.profile;

import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.aq;

public final class C2064u implements C0660x {
    public final /* synthetic */ String f10592a;

    public C2064u(String str) {
        this.f10592a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        aq aqVar = (aq) obj;
        String str = this.f10592a;
        C0954a.f5820P.m5777b(str).m5763a(Boolean.valueOf(aqVar.b));
        C0954a.f5821Q.m5777b(str).m5763a(Long.valueOf(System.currentTimeMillis()));
        FinskyLog.m21659a("has_fop cache updated to: %b (account=%s)", Boolean.valueOf(r1), FinskyLog.m21655a(str));
    }
}
