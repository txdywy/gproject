package com.google.android.finsky.dialogbuilder;

import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.p179a.C6232r;
import com.google.android.play.p179a.p352a.ao;
import com.google.wireless.android.finsky.dfe.c.a.cp;
import com.google.wireless.android.finsky.dfe.c.a.cr;
import com.google.wireless.android.finsky.dfe.c.a.dm;

public abstract class C1762d {
    public static final ad f9083d = new C2473o(213);
    public static final ad f9084e = new C2473o(603);
    public C2495w f9085f;
    public ad f9086g;
    public ad f9087h;
    public ad f9088i;
    public int f9089j;
    public boolean f9090k;

    private C1762d(C2495w c2495w, int i) {
        this.f9085f = c2495w;
        this.f9089j = i;
    }

    public abstract void mo2431a(ad adVar, cp cpVar);

    public abstract C2474c mo2437d(int i);

    public C1762d(C2495w c2495w, int i, byte[] bArr) {
        this(c2495w, i);
        if (bArr != null) {
            m9665b(null);
            ((C2473o) this.f9086g).m13203a(bArr);
        }
    }

    public final void m9662a(ad adVar) {
        if (!this.f9090k && adVar != null) {
            this.f9088i.mo1219a(adVar);
            m9668g();
        }
    }

    public final void m9668g() {
        if (!this.f9090k) {
            ad parentNode = this.f9088i.getParentNode();
            if (parentNode == null) {
                parentNode = this.f9088i;
            }
            this.f9085f.m13373a(new C2488p().m13342a(parentNode).m13344a(), null);
            this.f9088i = this.f9087h;
        }
    }

    public final ad m9661a(cr crVar, dm dmVar) {
        if (this.f9090k || crVar == null || !crVar.d()) {
            return null;
        }
        ad c2473o = new C2473o(crVar.b, crVar.c, null);
        if (dmVar != null && dmVar.n.length != 0) {
            return c2473o;
        }
        this.f9088i.mo1219a(c2473o);
        m9668g();
        return c2473o;
    }

    public final void m9664a(cr crVar) {
        if (crVar.d()) {
            ad adVar;
            if (crVar.e) {
                adVar = this.f9086g;
            } else {
                adVar = this.f9088i;
            }
            this.f9085f.m13372a(new C2475d(adVar).m13256a(crVar.b).m13258a(crVar.c).m13259a(), C1762d.m9659c(crVar));
        }
    }

    public final void m9666b(cr crVar) {
        Object obj = 1;
        if (crVar != null) {
            if (((crVar.a & 16) != 0 ? 1 : null) != null && crVar.d()) {
                switch (crVar.f) {
                    case 1:
                        C2474c d = mo2437d(crVar.b);
                        if (((crVar.a & 2) != 0 ? 1 : null) != null) {
                            d.m13240a(crVar.c);
                        }
                        if ((crVar.a & 32) == 0) {
                            obj = null;
                        }
                        if (obj != null) {
                            d.m13248d(crVar.g);
                        }
                        this.f9085f.m13371a(d.f13342a, C1762d.m9659c(crVar));
                        return;
                    case 2:
                        ad c2473o = new C2473o(this.f9089j);
                        c2473o.mo1219a(new C2473o(crVar.b));
                        this.f9085f.m13373a(new C2488p().m13342a(c2473o).m13344a(), C1762d.m9659c(crVar));
                        return;
                    case 3:
                        m9664a(crVar);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    final ad m9660a(cp cpVar) {
        if (this.f9086g == null) {
            this.f9086g = m9665b(cpVar);
        }
        return this.f9086g;
    }

    final ad m9665b(cp cpVar) {
        this.f9086g = new C2473o(this.f9089j);
        mo2431a(this.f9086g, cpVar);
        return this.f9086g;
    }

    private static ao m9659c(cr crVar) {
        if (crVar.h == null || crVar.h.length == 0) {
            return null;
        }
        ao b = C6232r.m28732a().m28734b();
        b.f30842e = crVar.h;
        return b;
    }
}
