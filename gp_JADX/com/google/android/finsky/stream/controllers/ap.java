package com.google.android.finsky.stream.controllers;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.C2446s;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.playcard.InlineClusterFlatCardAppsMdpView;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;
import com.google.android.play.layout.d;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class ap extends C4250b implements ad, C1031w, C1003o {
    public boolean f21724A;
    public boolean f21725B;
    public ar f21726E;
    public final C3676f f21727a;
    public final C4808a f21728b;
    public final af f21729o;
    public final C3340g f21730p;
    public final Application f21731q;
    public final C1287h f21732r;
    public final ab f21733s;
    public final C1461c f21734t;
    public final ao f21735u;
    public final C4254d f21736v;
    public final ff f21737w;
    public ce f21738x;
    public boolean f21739y;
    public boolean f21740z;

    public ap(Context context, C3748a c3748a, C4808a c4808a, ff ffVar, C3676f c3676f, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, C3340g c3340g, Application application, C1287h c1287h, ab abVar, C1461c c1461c, ao aoVar, C4254d c4254d) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f21727a = c3676f;
        this.f21728b = c4808a;
        this.f21729o = afVar;
        this.f21730p = c3340g;
        this.f21731q = application;
        this.f21732r = c1287h;
        this.f21733s = abVar;
        this.f21734t = c1461c;
        this.f21735u = aoVar;
        this.f21736v = c4254d;
        this.f21737w = ffVar;
    }

    public final void mo4050a(C2720j c2720j) {
        int i = 0;
        super.mo4050a(c2720j);
        this.f21738x = C2482j.m13283a(432);
        C2482j.m13285a(this.f21738x, this.g.f14908a.f14885a.f12087D);
        this.k = this.d.m9278c(this.e.getResources());
        if (this.D == null) {
            this.D = new at();
        }
        ((at) this.D).f21834b = (Document) this.g.m14679a(0, true);
        if (m19997b()) {
            C2446s by = ((at) this.D).f21834b.by();
            if (by != null) {
                if ((by.f13200a & 2) != 0) {
                    i = 1;
                }
                if (i != 0) {
                    ((at) this.D).f21836d = by.f13202c;
                    ((at) this.D).f21835c = C2721l.m14733a(this.f21732r.mo2015a(), ((at) this.D).f21836d, true, true);
                    this.f21739y = true;
                    this.f21740z = true;
                }
            }
        } else if (m19998c() && ((at) this.D).f21834b != null) {
            this.f21740z = true;
            int b = this.f21730p.mo3482b(((at) this.D).f21834b.cf());
            boolean z = b == 1 || b == 2 || b == 3;
            this.f21724A = z;
        }
    }

    public final int mo1508a() {
        if (this.D == null) {
            return 0;
        }
        return ((at) this.D).f21837e ? 3 : 2;
    }

    public final int mo1509a(int i) {
        Object obj = 1;
        if ((i == 0 ? 1 : null) != null) {
            return C7582R.layout.flat_card_inline_cluster_apps_mdp;
        }
        if (!(i == 1 && mo1508a() == 3)) {
            obj = null;
        }
        if (obj != null) {
            return C7582R.layout.inline_flat_card_cluster;
        }
        return C7582R.layout.vertical_spacer;
    }

    public final void mo1510a(View view, int i) {
        Document document;
        String str;
        if (view instanceof InlineClusterFlatCardAppsMdpView) {
            d dVar = (d) view;
            document = this.g.f14908a;
            if (document != null) {
                str = document.f14885a.f12096c;
            } else {
                str = (String) this.g.m14697k().get(0);
            }
            document = document.m14641a(0);
            this.f21735u.m18516a(dVar, document, 0, str, this.f, false, null, this, true, false, document.aZ(), this.i, null);
            ((InlineClusterFlatCardAppsMdpView) dVar).setBottomSeparatorVisibility(mo1508a() == 2 ? 8 : 0);
            if (this.f21740z) {
                this.f21730p.mo3484b((C1003o) this);
                this.f21730p.mo3481a((C1003o) this);
            }
            if (this.f21739y && ((at) this.D).f21835c != null) {
                ((at) this.D).f21835c.m11922b((C1031w) this);
                ((at) this.D).f21835c.m11918a((C1031w) this);
            }
        } else if (view instanceof FlatCardClusterView) {
            aq aqVar;
            FlatCardClusterView flatCardClusterView = (FlatCardClusterView) view;
            document = ((at) this.D).f21835c.f14908a;
            Resources resources = this.e.getResources();
            bd bdVar = document.m14660o() ? document.f14885a.f12111r.f12023i : null;
            CharSequence a = C1542f.m8970a(document);
            if (document.m14660o()) {
                str = document.f14885a.f12111r.f12016b;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                aqVar = null;
            } else {
                aqVar = new aq(this, str, document);
            }
            String a2 = this.f21736v.m19769a(this.e, document, flatCardClusterView.getMaxItemsPerPage(), str, true);
            Bundle bundle = this.D != null ? ((at) this.D).f21833a : null;
            C4460n c4460n = new C4460n(document, C7582R.layout.flat_card_mini, false, ((at) this.D).f21835c, flatCardClusterView, this.e, this.f21728b, C1473m.f7980a.be(), this.f, false, null, this.i, this.f21735u);
            flatCardClusterView.m17483a(document.f14885a.f12087D, this.h);
            flatCardClusterView.m17486a(document.f14885a.f12099f, document.f14885a.f12100g, null, a2, aqVar, bdVar, a, 0, c4460n, this.f21727a.m17439a(C7582R.layout.flat_card_mini), this.d.m9284i(resources), this.k, this.f21737w, bundle, null);
        } else {
            view.getLayoutParams().height = this.e.getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
        }
    }

    public final void mo1511b(View view, int i) {
        if (view instanceof InlineClusterFlatCardAppsMdpView) {
            ((ae) view).Z_();
            if (this.f21740z) {
                this.f21730p.mo3484b((C1003o) this);
            }
            if (this.f21739y && ((at) this.D).f21835c != null) {
                ((at) this.D).f21835c.m11922b((C1031w) this);
            }
        } else if (view instanceof FlatCardClusterView) {
            FlatCardClusterView flatCardClusterView = (FlatCardClusterView) view;
            if (((at) this.D).f21833a == null) {
                ((at) this.D).f21833a = new Bundle();
            }
            ((at) this.D).f21833a.clear();
            flatCardClusterView.mo3581a(((at) this.D).f21833a);
            flatCardClusterView.Z_();
        }
    }

    public final void m_() {
        if (!((at) this.D).f21837e && ((at) this.D).f21835c.m14698m() > 0) {
            ((at) this.D).f21837e = true;
            this.C.mo4087a(this, 0, 1, false);
            this.C.mo4086a(this, 1, 1);
        }
    }

    public final synchronized void mo1205a(C3369m c3369m) {
        if (((at) this.D).f21834b != null && c3369m.m16819a().equals(((at) this.D).f21834b.cf())) {
            if (c3369m.f17273c.f17153d != 11 && c3369m.f17273c.f17153d != 0 && c3369m.f17273c.f17153d != 1 && c3369m.f17273c.f17153d != 4) {
                this.f21724A = false;
            } else if (!m19997b()) {
                Object obj = (!m19998c() || this.f21724A || this.f21725B) ? null : 1;
                if (obj != null) {
                    this.f21725B = true;
                    Document document = ((at) this.D).f21834b;
                    C2495w c2495w = this.i;
                    if (this.f.mo3700d()) {
                        this.f.mo3657a(document, c2495w);
                    } else {
                        if (this.f21726E == null) {
                            this.f21726E = new ar(this.f, document, c2495w, this.f21731q);
                        }
                        this.f21731q.registerActivityLifecycleCallbacks(this.f21726E);
                    }
                }
            } else if (!(((at) this.D).f21838f || TextUtils.isEmpty(((at) this.D).f21836d))) {
                ((at) this.D).f21838f = true;
                ((at) this.D).f21835c.m14699n();
            }
        }
    }

    private final boolean m19997b() {
        return this.f21734t.dj().mo2294a(12629585);
    }

    private final boolean m19998c() {
        return this.f21734t.dj().mo2294a(12629849);
    }

    public final ce getPlayStoreUiElement() {
        return this.f21738x;
    }

    public final ad getParentNode() {
        return this.h;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
