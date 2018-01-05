package com.google.android.finsky.activities;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.transition.Fade;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.adapters.CardRecyclerViewAdapter;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1060p;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2712a;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2724o;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.fastscroll.C3118n;
import com.google.android.finsky.fastscroll.ScrubberView;
import com.google.android.finsky.headerlistlayout.C3167i;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layout.actionbar.C3658a;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ag;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.pagesystem.C1037e;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.search.C4058d;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.base.view.C4297g;
import com.google.android.finsky.stream.p248a.C4234b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.libraries.performance.primes.cm;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.wireless.android.a.a.a.a.cb;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class ge extends C1045b {
    public C2724o f6840a;
    public String ag;
    public String ah;
    public int ai;
    public int aj;
    public int ak;
    public boolean al;
    public boolean am = false;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public ScrubberView aq;
    public Button ar;
    public ad as;
    public Bundle at = new Bundle();
    public ac au;
    public ce av = C2482j.m13283a(3);
    public C1060p aw;
    public ag ax;
    public PlayRecyclerView f6841c;
    public CardRecyclerViewAdapter f6842e;
    public C4279n f6843f;
    public C4234b f6844g;
    public C4808a f6845h;
    public C1461c n_;
    public C2720j q_;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        C1473m c1473m = C1473m.f7980a;
        Bundle bundle2 = this.f760q;
        m6264i(4);
        this.n_ = c1473m.aN();
        boolean z = this.n_.dj().mo2294a(12638373) && C1473m.f7980a.mo2036P().f8184h;
        this.ap = z;
        this.al = this.n_.dj().mo2294a(12607553);
        this.f6845h = c1473m.mo2246h(c1473m.cZ());
        this.ao = this.f6845h.f25088e;
        this.ag = bundle2.getString("SearchFragment.query");
        this.ah = m6585a(bundle2.getString("SearchFragment.searchUrl"));
        this.ai = bundle2.getInt("SearchFragment.searchTrigger");
        this.aj = bundle2.getInt("SearchFragment.backendId");
        this.ak = bundle2.getInt("SearchFragment.searchBehaviorId");
        C1473m.f7980a.mo2028H().m12119a(m603h(), null);
        this.f740L = true;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int b;
        ContentFrame contentFrame = (ContentFrame) super.mo970a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.bt;
        finskyHeaderListLayout.a(new gf(this, finskyHeaderListLayout.getContext()));
        this.f6841c = (PlayRecyclerView) this.bt.findViewById(C7582R.id.search_results_list);
        if (this.ap) {
            this.aq = (ScrubberView) this.bt.findViewById(C7582R.id.search_scrubber_view);
            C3118n configurator = this.aq.getConfigurator();
            configurator.f16075d = this.f6841c;
            configurator.f16076e = finskyHeaderListLayout;
            configurator.m15964a();
        }
        C1611k av = C1473m.f7980a.av();
        if (m605i().getBoolean(C7582R.bool.use_fixed_width_pages) && this.n_.dj().mo2294a(12638742)) {
            b = C1611k.m9269b(m605i());
        } else {
            b = av.m9275a(m605i());
        }
        this.f6841c.m278a(new C4297g(b, b));
        return contentFrame;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        if (this.q_ != null && this.q_.m14707c()) {
            int i;
            C1037e c1037e = this.bm;
            C2712a c2712a = this.q_;
            if (c2712a.m14707c()) {
                i = c2712a.f14908a.f14885a.f12099f;
            } else {
                i = 0;
            }
            c1037e.mo1236a(i, this.q_.mo3121d(), true);
        }
        this.f6841c.setVisibility(0);
        this.f6841c.setSaveEnabled(false);
        this.f6841c.setLayoutManager(new LinearLayoutManager());
        if (C1473m.f7980a.ay().m9025d()) {
            if (this.ax == null) {
                this.ax = new ag(cm.f29878b, C1473m.f7980a.cv(), this.bw, 4);
            }
            this.f6841c.mo2951a(this.ax);
        }
        ac();
        TextView textView = (TextView) this.bt.findViewById(C7582R.id.no_results_textview);
        if (this.ao) {
            textView.setText(m605i().getString(C7582R.string.no_family_safe_results_for_query, new Object[]{this.ag}));
        } else {
            textView.setText(m605i().getString(C7582R.string.no_results_for_query, new Object[]{this.ag}));
        }
        if (ap()) {
            aj();
            ao();
        } else {
            au();
            aa();
            ac();
        }
        this.bq.mo1259a();
        this.ar = (Button) this.bt.findViewById(C7582R.id.clear_family_search_filter);
        this.ar.setOnClickListener(new gh(this));
        if (this.ao) {
            this.f6845h.f25088e = this.ao;
        }
        if (this.ar == null) {
            return;
        }
        if (this.ao) {
            this.ar.setVisibility(0);
            if (this.as == null) {
                this.as = new C2473o(298, this);
                this.bw.m13370a(new C2488p().m13345b(this.as));
                return;
            }
            return;
        }
        this.ar.setVisibility(8);
    }

    private final void aj() {
        if (this.f6840a != null) {
            this.f6840a.m11918a((C1031w) this);
            this.f6840a.m11917a((C0657w) this);
        }
        if (this.q_ != null) {
            this.q_.m11918a((C1031w) this);
            this.f6840a.m11917a((C0657w) this);
        }
    }

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        return new C3167i(contentFrame, this, (byte) 0);
    }

    private final void ao() {
        if (ap()) {
            if (this.f6842e == null && this.f6843f == null) {
                byte[] bArr;
                C2724o c2724o = this.f6840a;
                if (c2724o.f14944d == null || c2724o.f14944d.e.length == 0) {
                    bArr = null;
                } else {
                    bArr = c2724o.f14944d.e;
                }
                C2482j.m13285a(this.av, bArr);
                if (this.q_.f14908a != null) {
                    bArr = this.q_.f14908a.f14885a.f12087D;
                } else {
                    bArr = null;
                }
                ad c2473o = new C2473o(408, bArr, this);
                mo1219a(c2473o);
                C1473m.f7980a.aO();
                C2730u a = C2721l.m14735a(this.q_);
                this.f6843f = new C4279n();
                this.f6844g = C1473m.f7980a.co().m19665a(a, this.f6843f, this.f6841c, this.bn, this.bp, c2473o, this.bw, 2, null, null, this.f6840a, this.ao, null, false, false, null, null, false);
                this.q_.m11922b((C1031w) this);
                this.q_.m11921b((C0657w) this);
                if (this.au != null) {
                    if (this.ap) {
                        this.aq.getConfigurator().m15968b(this.au);
                    }
                    this.f6843f.m19845a(this.au);
                }
            }
            this.f6841c.setEmptyView(this.bt.findViewById(C7582R.id.no_results_view));
            return;
        }
        FinskyLog.m21669e("RecyclerView null, ignoring.", new Object[0]);
    }

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    public final void m_() {
        if (ap()) {
            if (this.q_.f14908a == null || this.q_.f14908a.m14638a() == 0) {
                if (!(this.am || this.al)) {
                    String a = m6585a(C1289l.m7695a(this.ag, 0, 0));
                    if (!a.equals(this.ah)) {
                        int i;
                        C2712a c2712a = this.q_;
                        if (c2712a.m14707c()) {
                            i = c2712a.f14908a.f14885a.f12099f;
                        } else {
                            i = 0;
                        }
                        Resources i2 = m605i();
                        switch (i) {
                            case 1:
                                i = C7582R.string.no_results_for_query_books;
                                break;
                            case 2:
                                i = C7582R.string.no_results_for_query_music;
                                break;
                            case 3:
                                i = C7582R.string.no_results_for_query_apps;
                                break;
                            case 4:
                                i = C7582R.string.no_results_for_query_movies;
                                break;
                            case 6:
                                i = C7582R.string.no_results_for_query_newsstand;
                                break;
                            default:
                                i = C7582R.string.no_results_for_query;
                                break;
                        }
                        C1601a.m9199a(this.bn, i2.getString(i, new Object[]{this.ag}), this.f6841c, false);
                        this.am = true;
                        this.ah = a;
                        this.f6840a.m11922b((C1031w) this);
                        this.f6840a.m11921b((C0657w) this);
                        this.f6840a = null;
                        this.q_.m11922b((C1031w) this);
                        this.q_.m11921b((C0657w) this);
                        this.q_ = null;
                        this.an = false;
                        aa();
                        return;
                    }
                }
                C1601a.m9199a(this.bn, m605i().getString(C7582R.string.no_results_for_query, new Object[]{this.ag}), this.f6841c, false);
            }
            this.bw.m13367a(new C2474c(523));
            super.m_();
            return;
        }
        aa();
    }

    public final void mo1062a(VolleyError volleyError) {
        C4058d.m18979a(523, volleyError, this.bw);
        super.mo1062a(volleyError);
    }

    protected final void cg_() {
        ao();
        if (ap()) {
            mo1294k(1719);
            if (this.aw == null && C1473m.f7980a.aP().m13357b()) {
                this.aw = new gg(this, this.f6841c);
            }
        }
        ac();
    }

    public final void ac() {
        C3658a c3658a = ((MainActivity) this.bm).f6375U;
        int ab = ab();
        if (ab == 3 && this.ag.startsWith("pub:")) {
            this.bm.mo1241c(this.bn.getResources().getString(C7582R.string.apps_by, new Object[]{this.ag.replaceFirst("pub:", "")}));
        } else {
            int i;
            Resources i2 = m605i();
            if (i2.getBoolean(C7582R.bool.use_wide_layout)) {
                i = C7582R.string.search_result_title_long;
            } else {
                i = C7582R.string.search_result_title;
            }
            this.bm.mo1241c(i2.getString(i, new Object[]{this.ag}));
        }
        this.bm.mo1236a(ab, ad(), true);
        this.bm.mo1240c(2);
        c3658a.m17391b(this.ag);
    }

    public final int ab() {
        if (this.q_ == null || !this.q_.m14707c()) {
            return this.aj;
        }
        C2712a c2712a = this.q_;
        if (c2712a.m14707c()) {
            return c2712a.f14908a.f14885a.f12099f;
        }
        return 0;
    }

    public final int ad() {
        if (this.q_ == null || !this.q_.mo3122e()) {
            return this.ak;
        }
        return this.q_.mo3121d();
    }

    protected final void aa() {
        if (this.f6840a == null) {
            this.f6840a = new C2724o(this.bo, this.ag, this.ah);
            if (!this.an) {
                if (this.n_.dj().mo2294a(12634278)) {
                    C2474c c2474c = new C2474c(550);
                    c2474c.m13237a(this.ag, this.ah, this.ai, this.aj);
                    this.bw.m13371a(c2474c.f13342a, null);
                } else {
                    String str;
                    cb h = C2482j.m13313h();
                    if (this.ag != null) {
                        str = this.ag;
                        if (str == null) {
                            throw new NullPointerException();
                        }
                        h.a |= 1;
                        h.b = str;
                    }
                    if (this.ah != null) {
                        str = this.ah;
                        if (str == null) {
                            throw new NullPointerException();
                        }
                        h.a |= 2;
                        h.c = str;
                    }
                    this.bw.m13374a(h);
                }
                this.an = true;
            }
        }
        if (this.f6840a.mo2861a()) {
            if (this.q_ == null) {
                C1473m.f7980a.aO();
                this.q_ = C2721l.m14731a(this.bo, this.f6840a.f14944d.b);
            }
            this.q_.m14699n();
            aj();
            return;
        }
        aj();
        C0660x c0660x = this.f6840a;
        c0660x.f14941a.mo1623b(c0660x.f14943c, c0660x, (C0657w) c0660x);
        mo1294k(1718);
    }

    public final void mo138d() {
        if (!(this.f6842e == null || this.f6841c == null || this.f6841c.getVisibility() != 0)) {
            this.f6842e.mo1450a(this.f6841c, this.at);
        }
        if (this.ap || this.f6843f != null) {
            this.au = new ac();
            if (this.ap) {
                this.aq.getConfigurator().m15963a(this.au).m15967b();
                this.aq = null;
            }
            if (this.f6843f != null) {
                this.f6843f.m19859b(this.au);
                this.f6843f = null;
            }
        }
        if (this.f6844g != null) {
            this.f6844g.m19660d();
            this.f6844g = null;
        }
        if (this.ax != null) {
            this.f6841c.mo2952b(this.ax);
            this.ax = null;
        }
        if (this.f6841c != null) {
            this.f6841c.setRecyclerListener(null);
            this.f6841c = null;
        }
        if (this.f6842e != null) {
            this.f6842e.mo1453h();
            this.f6842e = null;
        }
        this.ar = null;
        ((MainActivity) this.bm).f6375U.m17391b("");
        if (this.bt instanceof PlayHeaderListLayout) {
            ((PlayHeaderListLayout) this.bt).f();
        }
        if (this.f6840a != null) {
            this.f6840a.m11922b((C1031w) this);
            this.f6840a.m11921b((C0657w) this);
        }
        if (this.q_ != null) {
            this.q_.m11922b((C1031w) this);
            this.q_.m11921b((C0657w) this);
        }
        C2711x.m14674a(this.q_);
        super.mo138d();
    }

    private final boolean ap() {
        return this.f6840a != null && this.f6840a.mo2861a() && this.q_ != null && this.q_.mo2861a();
    }

    @TargetApi(22)
    protected final Transition ae() {
        return new Fade().setDuration(400);
    }

    public final int af() {
        return m605i().getColor(C7582R.color.play_transparent);
    }

    public final ce getPlayStoreUiElement() {
        return this.av;
    }

    public final void p_() {
    }

    public final void q_() {
    }

    private final String m6585a(String str) {
        if (!this.ao) {
            return str;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("fss", Boolean.toString(this.ao));
        return buildUpon.build().toString();
    }
}
