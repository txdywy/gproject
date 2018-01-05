package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.vr.a.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.a.a.a.d;
import com.google.vr.a.a.a.e;
import com.google.vr.a.a.f;
import com.google.vr.b.a.c;
import com.google.wireless.android.a.a.a.a.ce;

public abstract class aq implements ad {
    public final c f9983p;
    public b f9984q;
    public final a f9985r;
    public final ad f9986s;
    public boolean f9987t = true;

    protected aq(c cVar, aq aqVar, ad adVar) {
        if (aqVar != null) {
            if (aqVar.f9984q != null) {
                aqVar.f9984q.b("lull::DestroyEntityEvent");
            }
            a aVar = aqVar.f9985r;
            try {
                aVar.a.a(aVar.b);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        this.f9983p = cVar;
        this.f9985r = this.f9983p.c();
        this.f9986s = adVar;
    }

    abstract int mo2562a();

    public final b m10455a(String str, b bVar, int i) {
        com.google.vr.a.a.a bVar2 = new b(this.f9983p.a(str));
        if (bVar != null) {
            bVar.a(bVar2);
        }
        bVar2.a(i);
        return bVar2;
    }

    protected final b m10454a(int i, b bVar) {
        if (i == 4) {
            return m10455a("button-movies", bVar, 3);
        }
        if (i != 3) {
            FinskyLog.m21669e("Unexpected backend: " + i, new Object[0]);
        }
        return m10455a("button-apps", bVar, 3);
    }

    public final C1985v m10453a(String str, b bVar, String str2, int i, int i2) {
        C1985v c1985v = new C1985v(this.f9983p.a(str));
        bVar.a(c1985v);
        c1985v.a(2);
        c1985v.m10495b(C1473m.f7980a.be().mo1671a(str2, i, i2, c1985v));
        return c1985v;
    }

    public final void m10459b() {
        if (this.f9984q != null) {
            this.f9984q.b("lull::ActivateAllReadyToRenderEvent");
        }
    }

    public final void m10458a(String str, d dVar) {
        this.f9987t = true;
        a aVar = this.f9985r;
        d arVar = new ar(this, dVar);
        try {
            com.google.vr.a.a.d dVar2 = aVar.a;
            String str2 = aVar.b;
            aVar.a();
            dVar2.a(str2, str, new e(arVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void m10457a(b bVar, String str, d dVar) {
        this.f9987t = true;
        d arVar = new ar(this, dVar);
        try {
            bVar.a.a(str);
            f fVar = bVar.a;
            bVar.c();
            fVar.a(str, new e(arVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public ce getPlayStoreUiElement() {
        return C2482j.m13283a(mo2562a());
    }

    public ad getParentNode() {
        return this.f9986s;
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("Not using tree impressions.", new Object[0]);
    }
}
