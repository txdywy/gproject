package com.google.android.finsky.activities.p114a;

import android.os.Bundle;
import android.support.v4.p028a.p029a.C0206f;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.adapters.ad;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.headerlistlayout.C3167i;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.base.view.C4297g;
import com.google.android.finsky.stream.p248a.C4234b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C1046a extends C1045b {
    public String f6430a;
    public boolean ag;
    public Bundle ah = new Bundle();
    public ac ai;
    public long aj;
    public ce ak = C2482j.m13283a(5);
    public boolean al;
    public C2974a am;
    public C2730u an;
    public PlayRecyclerView f6431c;
    public ad f6432e;
    public C4279n f6433f;
    public C4234b f6434g;
    public C2720j f6435h;
    public C2206c u_;

    public C1046a() {
        C1473m.f7980a.aO();
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        this.u_ = C1473m.f7980a.ah();
        this.am = C1473m.f7980a.bd();
        this.al = C1473m.f7980a.dj().mo2294a(12610398);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContentFrame contentFrame = (ContentFrame) super.mo970a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.bt;
        finskyHeaderListLayout.a(new C1048b(finskyHeaderListLayout.getContext()));
        return contentFrame;
    }

    public final void mo139d(Bundle bundle) {
        boolean z;
        super.mo139d(bundle);
        this.f6430a = this.bn.getString(C7582R.string.menu_wishlist);
        this.f6431c = (PlayRecyclerView) this.bt.findViewById(C7582R.id.tab_recycler_view);
        this.f6431c.setVisibility(0);
        this.f6431c.setSaveEnabled(false);
        if (this.al) {
            View findViewById = this.bt.findViewById(C7582R.id.no_results_view);
            findViewById.setBackgroundColor(C0206f.m1066b(m605i(), C7582R.color.play_white, null));
            this.f6431c.setEmptyView(findViewById);
            this.f6431c.setLoadingView(this.bt.findViewById(C7582R.id.loading_indicator));
        } else {
            this.f6431c.setLayoutManager(new LinearLayoutManager());
        }
        this.f6431c.setAdapter(new C3984a());
        int a = C1473m.f7980a.av().m9275a(this.bn.getResources());
        this.f6431c.m278a(new C4297g(a, a));
        ac();
        if (this.aj < this.am.f15638g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aj();
            if (this.al) {
                this.ai = null;
                this.an = null;
            } else {
                this.ah.clear();
            }
        }
        if (this.f6435h == null) {
            z = false;
        } else {
            z = this.f6435h.mo2861a();
        }
        if (z) {
            if (!(this.f6435h == null || this.al)) {
                this.f6435h.m11918a((C1031w) this);
                this.f6435h.m11917a((C0657w) this);
            }
            ao();
        } else {
            aa();
            if (this.al) {
                O_();
            } else {
                au();
            }
        }
        this.bq.mo1259a();
    }

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        return new C3167i(contentFrame, this, (byte) 0);
    }

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    protected final void aa() {
        boolean z = false;
        aj();
        String a = this.bo.mo1616a(0, "u-wl", 7, this.u_.mo2811a(C1473m.f7980a.cY()).mo2791f("u-wl"));
        C1254c c1254c = this.bo;
        if (!C1473m.f7980a.dj().mo2294a(12610398)) {
            z = true;
        }
        this.f6435h = C2721l.m14733a(c1254c, a, true, z);
        this.f6435h.m11918a((C1031w) this);
        this.f6435h.m11917a((C0657w) this);
        this.f6435h.m14699n();
        this.aj = System.currentTimeMillis();
    }

    private final void aj() {
        if (this.f6435h != null) {
            this.f6435h.m11922b((C1031w) this);
            this.f6435h.m11921b((C0657w) this);
            this.f6435h = null;
        }
    }

    public final void m_() {
        super.m_();
        ao();
    }

    public final void ac() {
        this.bm.mo1241c(this.f6430a);
        this.bm.mo1237a(0, true);
        this.bm.mo1246z();
    }

    private final void ao() {
        if (this.f6431c == null) {
            FinskyLog.m21665c("Recycler view null, ignoring.", new Object[0]);
            return;
        }
        boolean z;
        Bundle bundle = this.ah;
        if (bundle == null || !bundle.containsKey("CardRecyclerViewAdapter.itemEntriesList")) {
            z = false;
        } else {
            z = true;
        }
        if (this.f6432e == null && this.f6433f == null) {
            C2482j.m13285a(this.ak, this.f6435h.f14908a.f14885a.f12087D);
            C4808a h = C1473m.f7980a.mo2246h(C1473m.f7980a.cZ());
            if (this.al) {
                this.f6433f = new C4279n();
                if (this.an == null) {
                    this.an = C2721l.m14735a(this.f6435h);
                }
                this.f6434g = C1473m.f7980a.co().m19665a(this.an, this.f6433f, this.f6431c, this.bn, this.bp, this, this.bw, 2, null, null, null, false, null, false, false, null, null, false);
                this.f6435h.m11922b((C1031w) this);
                this.f6435h.m11921b((C0657w) this);
                if (this.ai != null) {
                    this.f6433f.m19845a(this.ai);
                }
            } else {
                this.f6432e = new ad(this.bn, this.bp, this.bD, h, C2721l.m14735a(this.f6435h), this, z, this.bw);
                this.am.m15399a(this.f6432e);
            }
        }
        if (!this.al) {
            if (this.ag) {
                this.f6432e.mo1449a(this.f6435h);
                return;
            }
            this.ag = true;
            this.f6431c.setAdapter(this.f6432e);
            if (z) {
                this.f6432e.mo1451b(this.f6431c, this.ah);
                this.ah.clear();
            }
            this.f6431c.setEmptyView(this.bt.findViewById(C7582R.id.no_results_view));
        }
    }

    public final void mo138d() {
        if (!(this.f6431c == null || this.f6431c.getVisibility() != 0 || this.f6432e == null)) {
            this.f6432e.mo1450a(this.f6431c, this.ah);
        }
        if (this.f6433f != null) {
            this.ai = new ac();
            this.f6433f.m19859b(this.ai);
            this.f6433f = null;
        }
        if (this.f6434g != null) {
            this.f6434g.m19660d();
            this.f6434g = null;
        }
        this.f6431c = null;
        if (this.f6432e != null) {
            this.f6432e.mo1453h();
            this.am.m15404b(this.f6432e);
            this.f6432e = null;
            this.ag = false;
        }
        if (this.bt instanceof PlayHeaderListLayout) {
            ((PlayHeaderListLayout) this.bt).f();
        }
        if (this.f6435h != null) {
            this.f6435h.m11922b((C1031w) this);
            this.f6435h.m11921b((C0657w) this);
        }
        C2711x.m14674a(this.f6435h);
        super.mo138d();
    }

    protected final int ak() {
        return 3;
    }

    public final int ab() {
        return 0;
    }

    protected final void cg_() {
    }

    public final ce getPlayStoreUiElement() {
        return this.ak;
    }
}
