package com.google.android.finsky.billing.lightpurchase.vr.a;

import android.os.RemoteException;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.w;
import com.google.vr.a.a.a;
import com.google.vr.a.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.a.a.a.d;
import com.google.vr.a.a.a.e;
import com.google.vr.a.a.d;
import com.google.vr.a.a.f;
import com.google.vr.b.a.c;
import com.google.wireless.android.a.a.a.a.ce;

public class com.google.android.finsky.billing.lightpurchase.vr.a.aq implements com.google.android.finsky.d.ad
{

    public final com.google.vr.b.a.c p;
    public com.google.vr.a.a.a.b q;
    public final com.google.vr.a.a.a.a r;
    public final com.google.android.finsky.d.ad s;
    public boolean t;

    aq(com.google.vr.b.a.c p0, com.google.android.finsky.billing.lightpurchase.vr.a.aq p1, com.google.android.finsky.d.ad p2) {
        this.t = 1;
        if (p1 != 0) {
            if (p1.q != 0)
                p1.q.b("lull::DestroyEntityEvent");
            try {
                p1.r.a.a(p1.r.b);
            }
            catch (RemoteException ex) {
                throw new RuntimeException(ex);
            }
        }
        this.p = p0;
        this.r = this.p.c();
        this.s = p2;
    }

    abstract int a();

    public final com.google.android.finsky.billing.lightpurchase.vr.a.v a(String p0, com.google.vr.a.a.a.b p1, String p2, int p3, int p4) {
        v0 = new com.google.android.finsky.billing.lightpurchase.vr.a.v(this.p.a(p0));
        p1.a(v0);
        v0.a(2);
        v0.b(com.google.android.finsky.m.a.be().a(p2, p3, p4, v0));
        return v0;
    }

    protected final com.google.vr.a.a.a.b a(int p0, com.google.vr.a.a.a.b p1) {
        if (p0 == 4)
            v0 = this.a("button-movies", p1, 3);
        else {
            if (p0 != 3)
                FinskyLog.e(31 + "Unexpected backend: " + p0, new Object[0]);
            v0 = this.a("button-apps", p1, 3);
        }
        return v0;
    }

    public final com.google.vr.a.a.a.b a(String p0, com.google.vr.a.a.a.b p1, int p2) {
        v1 = new com.google.vr.a.a.a.b(this.p.a(p0));
        if (p1 != 0)
            p1.a(v1);
        v1.a(p2);
        return v1;
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    public final void a(com.google.vr.a.a.a.b p0, String p1, com.google.vr.a.a.a.d p2) {
        this.t = 1;
        try {
            p0.a.a(p1);
            p0.c();
            p0.a.a(p1, new com.google.vr.a.a.a.e(new com.google.android.finsky.billing.lightpurchase.vr.a.ar(this, p2)));
        }
        catch (RemoteException ex) {
            throw new RuntimeException(ex);
        }
    }

    public final void a(String p0, com.google.vr.a.a.a.d p1) {
        this.t = 1;
        try {
            this.r.a();
            this.r.a.a(this.r.b, p0, new com.google.vr.a.a.a.e(new com.google.android.finsky.billing.lightpurchase.vr.a.ar(this, p1)));
        }
        catch (RemoteException ex) {
            throw new RuntimeException(ex);
        }
    }

    public final void b() {
        if (this.q != 0)
            this.q.b("lull::ActivateAllReadyToRenderEvent");
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return this.s;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return com.google.android.finsky.d.j.a(this.a());
    }

}
