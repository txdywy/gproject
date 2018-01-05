package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.billing.lightpurchase.vr.VrPurchaseActivity;
import com.google.android.finsky.p111d.ad;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.a.i;
import com.google.vr.b.a.c;

public final class C1986w {
    public static final Handler f10097a = new Handler(Looper.getMainLooper());
    public final i f10098b = new C1987x(this);
    public final VrPurchaseActivity f10099c;
    public final ap f10100d;
    public c f10101e;
    public aq f10102f;
    public int f10103g;

    public C1986w(VrPurchaseActivity vrPurchaseActivity, ap apVar) {
        this.f10099c = vrPurchaseActivity;
        this.f10100d = apVar;
    }

    public final void m10497a(String str, String str2, String str3) {
        ad a = C1984u.m10492a(this.f10101e, this.f10102f, this.f10099c, 770, this.f10103g);
        this.f10102f = a;
        a.f10092c.a(str);
        a.f10093d.a(str2);
        a.f10095f.a(str3);
        a.m10457a(a.f10094e, "lull::ClickEvent", new aj(this, a, new ag(this), new ai(this)));
        a.m10460a(this.f10099c, this.f10100d);
        a.m10459b();
        this.f10099c.m10439b(a);
    }

    public final void m10498a(String str, String str2, String str3, boolean z, int i, int i2) {
        aq a = C1984u.m10492a(this.f10101e, this.f10102f, this.f10099c, i, this.f10103g);
        this.f10102f = a;
        a.f10092c.a(str);
        a.f10093d.a(str2);
        if (str3 == null) {
            a.f10094e.b("lull::DisableEvent");
        } else {
            a.f10095f.a(str3);
            m10496a(a, a.f10094e, i2);
        }
        if (!z) {
            a.m10460a(this.f10099c, this.f10100d);
        }
        a.m10459b();
        this.f10099c.m10439b((ad) a);
    }

    public final void m10499b(String str, String str2, String str3) {
        ad a = C1984u.m10492a(this.f10101e, this.f10102f, this.f10099c, 770, this.f10103g);
        this.f10102f = a;
        a.f10092c.a(str);
        a.f10093d.a(str2);
        a.f10095f.a(str3);
        a.m10457a(a.f10094e, "lull::ClickEvent", new C1988y(this, a, new am(this), new ao(this, str, str2, str3)));
        a.m10460a(this.f10099c, this.f10100d);
        a.m10459b();
        this.f10099c.m10439b(a);
    }

    public final void m10496a(aq aqVar, b bVar, int i) {
        aqVar.m10457a(bVar, "lull::ClickEvent", new ab(this, aqVar, i));
    }
}
