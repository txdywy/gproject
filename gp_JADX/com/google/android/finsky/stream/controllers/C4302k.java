package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.view.View;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.google.android.finsky.stream.base.playcluster.C4290m;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;
import com.google.android.play.layout.d;

public abstract class C4302k extends C4250b implements ab, C4290m {
    public final af f21673a;
    public final C4808a f21674b;
    public final ao f21675o;
    public final ac f21676p;
    public final ff f21677q;
    public final C3676f f21678r;
    public final C4254d f21679s;

    public C4302k(Context context, C3748a c3748a, C4808a c4808a, ff ffVar, C3676f c3676f, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, ao aoVar, C4254d c4254d, boolean z, ac acVar) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, z);
        this.f21678r = c3676f;
        this.f21674b = c4808a;
        this.f21673a = afVar;
        this.f21675o = aoVar;
        this.f21679s = c4254d;
        this.f21676p = acVar;
        this.f21677q = ffVar;
    }

    protected abstract int mo4099b();

    public void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.k = this.d.m9278c(this.e.getResources());
    }

    public final int mo1508a() {
        return 1;
    }

    public void mo1510a(View view, int i) {
        Document document = this.g.f14908a;
        FlatCardClusterView flatCardClusterView = (FlatCardClusterView) view;
        this.g.m11918a((C1031w) flatCardClusterView);
        this.g.m11917a((C0657w) flatCardClusterView);
        boolean d = mo4101d();
        int e = d ? 1 : mo4102e();
        C4460n c4460n = new C4460n(document, mo4099b(), d, this.g, flatCardClusterView, this.e, this.f21674b, C1473m.f7980a.be(), this.f, mo4100b(this.g), this, this.i, this.f21675o);
        Bundle bundle = this.D != null ? ((C4470o) this.D).f22725a : null;
        flatCardClusterView.m17483a(document.f14885a.f12087D, this.h);
        C4440m a = mo4104a(document, flatCardClusterView);
        flatCardClusterView.m17486a(document.f14885a.f12099f, document.f14885a.f12100g, document.f14885a.f12101h, a.f22548a, a.f22549b, mo4103a(document), C1542f.m8970a(document), e, c4460n, mo4105c(), this.l, this.k, this.f21677q, bundle, this);
    }

    protected bd mo4103a(Document document) {
        if (document.m14660o()) {
            return document.f14885a.f12111r.f12023i;
        }
        return null;
    }

    protected C4440m mo4104a(Document document, FlatCardClusterView flatCardClusterView) {
        return new C4440m(this.f21679s.m19769a(this.e, document, document.m14638a(), null, false), this.f.mo3625a(new C4439l(this, document, flatCardClusterView), document));
    }

    protected boolean mo4100b(C2720j c2720j) {
        return false;
    }

    protected C1164b mo4105c() {
        return this.f21678r.m17439a(mo4099b());
    }

    public final void mo1511b(View view, int i) {
        C0657w c0657w = (FlatCardClusterView) view;
        this.g.m11922b((C1031w) c0657w);
        this.g.m11921b(c0657w);
        mo4229k();
        ((C4470o) this.D).f22725a.clear();
        c0657w.mo3581a(((C4470o) this.D).f22725a);
        c0657w.Z_();
    }

    public final void mo1448a(Document document, d dVar) {
        this.f21674b.m22589b(document.f14885a.f12096c);
        this.C.mo4087a(this, 0, 1, true);
    }

    public final void mo4098b(int i) {
        mo4229k();
        ((C4470o) this.D).f22725a.putInt("PlayClusterViewContentV2.recyclerViewScrollPosition", i);
    }

    protected boolean mo4101d() {
        return false;
    }

    private final void mo4229k() {
        if (this.D == null) {
            this.D = new C4470o();
            ((C4470o) this.D).f22725a = new Bundle();
        }
    }

    protected int mo4102e() {
        return 0;
    }
}
