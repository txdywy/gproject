package com.google.android.finsky.billing.profile;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0956c;
import com.google.android.finsky.aa.C0963m;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.common.C1793i;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.a.a.a.a.r;

public final class C2067x {
    public final C0956c f10601a = new C0956c("instant_fop_options");
    public final C0963m f10602b = this.f10601a.m5758b("fop_options", null);
    public final C0963m f10603c = this.f10601a.m5757b("fop_options_cached_time", Long.valueOf(0));
    public final C1793i f10604d;
    public final C2495w f10605e;
    public final C1461c f10606f;

    public C2067x(C1793i c1793i, C2471a c2471a, C1461c c1461c) {
        this.f10604d = c1793i;
        this.f10605e = c2471a.m13184a(null);
        this.f10606f = c1461c;
    }

    static r m10829a() {
        r rVar = new r();
        rVar.a |= 1;
        rVar.b = 2;
        return rVar;
    }

    public final boolean m10831a(String str) {
        return this.f10606f.mo2249j(str).mo2294a(12632323);
    }

    public static boolean m10830b(String str) {
        Boolean bool = (Boolean) C0954a.f5820P.m5777b(str).m5760a();
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
