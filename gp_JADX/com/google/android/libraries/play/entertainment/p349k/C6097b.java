package com.google.android.libraries.play.entertainment.p349k;

import com.google.android.agera.C0892a;
import com.google.android.agera.C0915v;
import com.google.android.agera.aa;
import com.google.android.agera.ac;
import com.google.android.agera.ak;
import com.google.android.agera.am;
import com.google.android.agera.an;
import com.google.android.libraries.play.entertainment.p192l.C6113c;
import com.google.android.libraries.play.entertainment.p192l.p350a.C6103c;
import com.google.android.libraries.play.entertainment.p192l.p350a.C6104d;
import com.google.android.libraries.play.entertainment.p192l.p350a.C6107g;
import com.google.android.libraries.play.entertainment.p192l.p350a.C6108h;
import com.google.android.libraries.play.entertainment.p344d.C6048p;
import com.google.android.libraries.play.entertainment.p344d.C6049s;
import com.google.android.libraries.play.entertainment.p344d.C6056i;
import com.google.android.libraries.play.entertainment.p344d.C6057c;
import com.google.android.libraries.play.entertainment.p344d.C6058e;
import com.google.android.libraries.play.entertainment.p344d.C6070w;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.protobuf.nano.C0757i;

public final class C6097b extends C6049s implements C0892a, ac, am {
    public final C6104d f30250a;
    public final ac f30251b;
    public final C6070w f30252c;
    public final an f30253d;
    public final Object f30254e;
    public ak f30255f;

    public C6097b(C6104d c6104d, C6103c c6103c) {
        this(c6104d, aa.m5566a(ak.m5593a((Object) c6103c)));
    }

    private C6097b(C6104d c6104d, ac acVar) {
        C6116b.m28102a();
        this.f30250a = (C6104d) C6116b.m28100a((Object) c6104d);
        this.f30251b = (ac) C6116b.m28100a((Object) acVar);
        this.f30252c = C6070w.m27988a();
        this.f30253d = new C0915v(this);
        this.f30254e = this.f30252c;
        this.f30255f = ak.f5662a;
    }

    public final void mo1144a(am amVar) {
        this.f30253d.mo1144a(amVar);
    }

    public final void mo1145b(am amVar) {
        this.f30253d.mo1145b(amVar);
    }

    public final void mo5289a() {
        this.f30252c.m27992c();
        this.f30251b.mo1144a(this);
        ad_();
    }

    public final void ad_() {
        if (this.f30252c.m27991b()) {
            ak akVar = (ak) this.f30251b.i_();
            if (akVar.m5595a()) {
                C6056i a;
                if ((((ak) i_()).f5665d == null ? 1 : null) != null) {
                    m28061a(ak.f5662a);
                }
                C6104d c6104d = this.f30250a;
                C6103c c6103c = (C6103c) akVar.m5596b();
                Object obj = c6103c.f30261a;
                C6107g c6107g = (C6107g) c6104d.f30267d.m1692a(obj);
                if (c6107g != null) {
                    a = C6057c.m27970a(c6107g.f30272a);
                } else {
                    a = c6104d.f30265b.mo3213a(new C6113c(obj, c6103c.f30262b)).m27964a(c6104d.f30266c, c6104d.m28078a(obj.mo5320d())).m27964a(C6058e.f30187a, new C6108h(c6104d, obj));
                }
                a.m27965a(this.f30252c, C6058e.f30187a, (C6048p) this);
                return;
            }
            mo5268a(akVar.m5598d());
        }
    }

    private final void m28061a(ak akVar) {
        synchronized (this.f30254e) {
            this.f30255f = akVar;
        }
        this.f30253d.ad_();
    }

    public final void mo5290b() {
        this.f30252c.m27993d();
        this.f30251b.mo1145b(this);
    }

    public final void mo5268a(Throwable th) {
        m28061a(ak.m5594a(th));
    }

    private final ak m28062e() {
        ak akVar;
        synchronized (this.f30254e) {
            akVar = this.f30255f;
        }
        return akVar;
    }

    public final /* synthetic */ void mo5267a(Object obj) {
        m28061a(ak.m5593a((C0757i) obj));
    }

    public final /* synthetic */ Object i_() {
        return m28062e();
    }
}
