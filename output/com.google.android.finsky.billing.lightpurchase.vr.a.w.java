package com.google.android.finsky.billing.lightpurchase.vr.a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.billing.lightpurchase.vr.VrPurchaseActivity;
import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.a.i;
import com.google.vr.b.a.c;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.w
{

    public static final Handler a;
    public final com.google.vr.b.a.a.i b;
    public final VrPurchaseActivity c;
    public final com.google.android.finsky.billing.lightpurchase.vr.a.ap d;
    public com.google.vr.b.a.c e;
    public com.google.android.finsky.billing.lightpurchase.vr.a.aq f;
    public int g;

    static {
        com.google.android.finsky.billing.lightpurchase.vr.a.w.a = new Handler(Looper.getMainLooper());
    }

    w(VrPurchaseActivity p0, com.google.android.finsky.billing.lightpurchase.vr.a.ap p1) {
        this.b = new com.google.android.finsky.billing.lightpurchase.vr.a.x(this);
        this.c = p0;
        this.d = p1;
    }

    public final void a(com.google.android.finsky.billing.lightpurchase.vr.a.aq p0, com.google.vr.a.a.a.b p1, int p2) {
        p0.a(p1, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.ab(this, p0, p2));
    }

    public final void a(String p0, String p1, String p2) {
        v0 = com.google.android.finsky.billing.lightpurchase.vr.a.u.a(this.e, this.f, this.c, 770, this.g);
        this.f = v0;
        v0.c.a(p0);
        v0.d.a(p1);
        v0.f.a(p2);
        v0.a(v0.e, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.aj(this, v0, new com.google.android.finsky.billing.lightpurchase.vr.a.ag(this), new com.google.android.finsky.billing.lightpurchase.vr.a.ai(this)));
        v0.a(this.c, this.d);
        v0.b();
        this.c.b(v0);
    }

    public final void a(String p0, String p1, String p2, boolean p3, int p4, int p5) {
        v0 = com.google.android.finsky.billing.lightpurchase.vr.a.u.a(this.e, this.f, this.c, p4, this.g);
        this.f = v0;
        v0.c.a(p0);
        v0.d.a(p1);
        if (p2 == 0)
            v0.e.b("lull::DisableEvent");
        else {
            v0.f.a(p2);
            this.a(v0, v0.e, p5);
        }
        if (p3 == 0)
            v0.a(this.c, this.d);
        v0.b();
        this.c.b(v0);
    }

    public final void b(String p0, String p1, String p2) {
        v0 = com.google.android.finsky.billing.lightpurchase.vr.a.u.a(this.e, this.f, this.c, 770, this.g);
        this.f = v0;
        v0.c.a(p0);
        v0.d.a(p1);
        v0.f.a(p2);
        v0.a(v0.e, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.y(this, v0, new com.google.android.finsky.billing.lightpurchase.vr.a.am(this), new com.google.android.finsky.billing.lightpurchase.vr.a.ao(this, p0, p1, p2)));
        v0.a(this.c, this.d);
        v0.b();
        this.c.b(v0);
    }

}
