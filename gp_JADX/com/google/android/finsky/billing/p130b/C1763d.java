package com.google.android.finsky.billing.p130b;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.p151a.C1651d;
import com.google.android.finsky.dialogbuilder.C1762d;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.wallet.common.util.a;
import com.google.wireless.android.a.a.a.a.cf;
import com.google.wireless.android.a.a.a.a.z;
import com.google.wireless.android.finsky.dfe.c.a.co;
import com.google.wireless.android.finsky.dfe.c.a.cp;
import com.google.wireless.android.finsky.dfe.c.a.ea;
import com.google.wireless.android.finsky.dfe.c.a.ee;

public final class C1763d extends C1762d implements C1651d {
    public final PurchaseParams f9091a;
    public final boolean f9092b;
    public final Activity f9093c;

    public C1763d(C2495w c2495w, PurchaseParams purchaseParams, int i, boolean z, Activity activity) {
        byte[] bArr = (!z || purchaseParams == null) ? null : purchaseParams.f9305u;
        super(c2495w, i, bArr);
        this.f9091a = purchaseParams;
        this.f9092b = z;
        this.f9093c = activity;
    }

    public final void m9674a(co coVar) {
        if (coVar != null) {
            C2474c a = m9670a(coVar.b, coVar.e);
            if (coVar.d()) {
                a.m13248d(coVar.d);
            }
            this.f.m13371a(a.f13342a, null);
        }
    }

    public final void m9675a(co coVar, ee eeVar, long j, long j2) {
        if (coVar != null) {
            C2474c b = m9670a(coVar.c, coVar.e).m13240a(eeVar.c).m13210a(eeVar.b).m13212a(j).m13242b(j2);
            if (coVar.d()) {
                b.m13248d(coVar.d);
            }
            if (coVar.f) {
                String a = a.a(this.f9093c);
                if (!TextUtils.isEmpty(a)) {
                    b.m13247c(a);
                }
            }
            this.f.m13371a(b.f13342a, null);
        }
    }

    public final void m9677a(boolean z, ea eaVar, boolean z2) {
        int i;
        if (z2) {
            i = 3;
        } else if (eaVar == null || !eaVar.c) {
            i = 1;
        } else {
            i = 2;
        }
        z zVar = new z();
        zVar.a(i);
        if (eaVar != null && eaVar.d()) {
            zVar.d();
        }
        this.f.m13371a(mo2437d(508).m13239a(z).m13234a(zVar).f13342a, null);
    }

    protected final C2474c mo2437d(int i) {
        C2474c c2474c = new C2474c(i);
        if (this.f9091a != null) {
            c2474c.m13236a(this.f9091a.f9286b).m13213a(this.f9091a.f9285a).m13241b(this.f9091a.f9288d);
        }
        return c2474c;
    }

    protected final C2474c m9670a(int i, cp cpVar) {
        C2474c d = mo2437d(i);
        if (cpVar != null) {
            if (cpVar.b != null) {
                d.m13213a(cpVar.b);
            }
            if (cpVar.d()) {
                d.m13236a(cpVar.c);
            }
            if (cpVar.e()) {
                d.m13241b(cpVar.d);
            }
        }
        return d;
    }

    protected final void mo2431a(ad adVar, cp cpVar) {
        if (adVar.getPlayStoreUiElement().e == null) {
            adVar.getPlayStoreUiElement().e = new cf();
        }
        if (this.f9091a != null) {
            if (this.f9091a.f9286b != null) {
                adVar.getPlayStoreUiElement().e.a(this.f9091a.f9286b);
            }
            if (this.f9091a.m9748a()) {
                adVar.getPlayStoreUiElement().e.a(this.f9091a.f9288d);
            }
            if (this.f9092b) {
                ((C2473o) adVar).m13203a(this.f9091a.f9305u);
            }
        }
        if (cpVar != null) {
            if (cpVar.d()) {
                adVar.getPlayStoreUiElement().e.a(cpVar.c);
            }
            if (cpVar.e()) {
                adVar.getPlayStoreUiElement().e.a(cpVar.d);
            }
            if (this.f9092b) {
                if (((cpVar.a & 4) != 0 ? 1 : null) != null) {
                    ((C2473o) adVar).m13203a(cpVar.e);
                }
            }
        }
    }

    public final void mo2429a() {
        this.f.m13371a(mo2437d(2030).f13342a, null);
    }

    public final void mo2434b(int i) {
        m9669a(2031, false, i, null);
    }

    public final void mo2436c(int i) {
        m9669a(2036, false, i, null);
    }

    public final void mo2432a(String str) {
        m9669a(2031, false, 6, str);
    }

    public final void mo2435c() {
        m9669a(2031, true, 0, null);
    }

    public final void mo2438d() {
        m9669a(2036, true, 0, null);
    }

    public final void mo2433b() {
        m9669a(2035, true, 0, null);
    }

    public final void mo2430a(int i) {
        m9669a(2035, false, i, null);
    }

    public final void mo2439e() {
        this.f.m13371a(mo2437d(2033).f13342a, null);
    }

    public final void mo2440f() {
        this.f.m13371a(mo2437d(2034).f13342a, null);
    }

    private final void m9669a(int i, boolean z, int i2, String str) {
        C2474c a = mo2437d(i).m13239a(z).m13210a(i2);
        if (!TextUtils.isEmpty(str)) {
            a.m13244b(str);
        }
        this.f.m13371a(a.f13342a, null);
    }
}
