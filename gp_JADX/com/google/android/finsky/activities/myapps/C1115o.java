package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.gt;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.bg.C1060p;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.fastscroll.C3118n;
import com.google.android.finsky.fastscroll.ScrubberView;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layoutswitcher.C3733a;
import com.google.android.finsky.layoutswitcher.ErrorIndicatorWithNotifyLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C1114y;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ag;
import com.google.android.finsky.p111d.ai;
import com.google.android.finsky.pagesystem.C1044f;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.stream.base.C1169s;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.base.view.C4297g;
import com.google.android.finsky.stream.p248a.C4234b;
import com.google.android.finsky.stream.p248a.C4236d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.libraries.performance.primes.cm;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C1115o implements OnClickListener, C0657w, gt, C1114y, C1031w {
    public final Context f7025a;
    public final LayoutInflater f7026b;
    public final C1254c f7027c;
    public final DfeToc f7028d;
    public final ah f7029e;
    public final C3748a f7030f;
    public final C2495w f7031g;
    public final ai f7032h;
    public final C2471a f7033i = C1473m.f7980a.aR();
    public boolean f7034j;
    public FinskyHeaderListLayout f7035k;
    public PlayRecyclerView f7036l;
    public ScrubberView f7037m;
    public C4279n f7038n;
    public ViewGroup f7039o;
    public ac f7040p;
    public C2720j f7041q;
    public C2730u f7042r;
    public VolleyError f7043s;
    public C4234b f7044t;
    public String f7045u;
    public C1044f f7046v;
    public ag f7047w;
    public C1060p f7048x;
    public boolean f7049y;
    public final boolean f7050z;

    public C1115o(Context context, String str, C1254c c1254c, C2730u c2730u, DfeToc dfeToc, C3748a c3748a, ah ahVar, FinskyHeaderListLayout finskyHeaderListLayout, boolean z, ai aiVar, C2495w c2495w, C1044f c1044f) {
        C1473m.f7980a.aO();
        this.f7034j = false;
        this.f7040p = null;
        this.f7025a = context;
        this.f7026b = LayoutInflater.from(context);
        this.f7027c = c1254c;
        this.f7028d = dfeToc;
        this.f7029e = ahVar;
        this.f7030f = c3748a;
        this.f7031g = c2495w;
        this.f7045u = str;
        this.f7032h = aiVar;
        this.f7046v = c1044f;
        this.f7042r = c2730u;
        if (this.f7042r != null) {
            this.f7041q = (C2720j) this.f7042r.f14950a;
        }
        this.f7035k = finskyHeaderListLayout;
        this.f7050z = z;
    }

    final void m6824c() {
        m6816f();
        if (m6817g()) {
            m_();
        }
    }

    public final View mo1309a() {
        if (this.f7039o == null) {
            int i;
            LayoutInflater layoutInflater = this.f7026b;
            if (this.f7050z) {
                i = C7582R.layout.my_apps_tab_v2_with_scrubber;
            } else {
                i = C7582R.layout.my_apps_tab_v2;
            }
            this.f7039o = (ViewGroup) layoutInflater.inflate(i, null);
            this.f7036l = (PlayRecyclerView) this.f7039o.findViewById(C7582R.id.my_apps_recycler_view);
            android.support.v4.view.ai.m1823a(this.f7036l, 0, this.f7036l.getPaddingTop(), 0, this.f7036l.getPaddingBottom());
            this.f7036l.setSaveEnabled(false);
            this.f7036l.setAdapter(new C3984a());
            i = C1473m.f7980a.av().m9275a(this.f7025a.getResources());
            this.f7036l.m278a(new C4297g(i, i));
            if (C1473m.f7980a.ay().m9025d()) {
                if (this.f7047w == null) {
                    this.f7047w = new ag(cm.f29878b, C1473m.f7980a.cv(), this.f7031g, 3);
                }
                this.f7036l.mo2951a(this.f7047w);
            }
            if (this.f7050z) {
                this.f7037m = (ScrubberView) this.f7039o.findViewById(C7582R.id.scrubber_view);
                C3118n configurator = this.f7037m.getConfigurator();
                configurator.f16075d = this.f7036l;
                configurator.f16076e = this.f7035k;
                configurator.m15964a();
            }
        }
        return this.f7039o;
    }

    private final void m6816f() {
        if (this.f7041q == null) {
            this.f7041q = C2721l.m14731a(this.f7027c, this.f7045u);
            this.f7042r = C2721l.m14735a(this.f7041q);
        }
        this.f7041q.m11918a((C1031w) this);
        this.f7041q.m11917a((C0657w) this);
        this.f7041q.m14699n();
    }

    public final void m_() {
        if (this.f7041q.mo2861a()) {
            this.f7043s = null;
            if (this.f7036l == null) {
                FinskyLog.m21665c("Recycler view null, ignoring.", new Object[0]);
            } else {
                if (this.f7038n == null) {
                    C1114y c1114y;
                    this.f7038n = new C4279n();
                    C1473m.f7980a.mo2246h(C1473m.f7980a.cZ());
                    C4236d co = C1473m.f7980a.co();
                    C2730u c2730u = this.f7042r;
                    C4279n c4279n = this.f7038n;
                    RecyclerView recyclerView = this.f7036l;
                    Context context = this.f7025a;
                    C3748a c3748a = this.f7030f;
                    ad adVar = this.f7032h;
                    C2495w c2495w = this.f7031g;
                    ah ahVar = this.f7029e;
                    if (this.f7046v == null) {
                        c1114y = null;
                    } else {
                        Object obj = this;
                    }
                    this.f7044t = co.m19665a(c2730u, c4279n, recyclerView, context, c3748a, adVar, c2495w, 0, null, ahVar, null, false, null, false, false, c1114y, null, false);
                    this.f7041q.m11922b((C1031w) this);
                    this.f7041q.m11921b((C0657w) this);
                    if (this.f7040p != null) {
                        this.f7038n.m19845a(this.f7040p);
                    }
                }
                if (C1473m.f7980a.mo2033M().m8818a()) {
                    m6815a((int) C7582R.string.work_empty_myapps_description_all);
                } else {
                    m6815a((int) C7582R.string.empty_myapps_description_all);
                }
            }
            m6818h();
            Document document = this.f7041q.f14908a;
            if (document != null) {
                C2482j.m13285a(this.f7032h.getPlayStoreUiElement(), document.f14885a.f12087D);
            }
            if (this.f7049y) {
                m6825d();
            }
        }
    }

    public final void mo1310a(ac acVar) {
        this.f7040p = acVar;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f7043s = volleyError;
        m6818h();
    }

    public final void onClick(View view) {
        if (this.f7041q == null || !this.f7041q.mo3128h()) {
            if (this.f7041q != null) {
                this.f7041q.m11922b((C1031w) this);
                this.f7041q.m11921b((C0657w) this);
                this.f7041q = null;
            }
            m6816f();
            return;
        }
        this.f7043s = null;
        this.f7041q.ac_();
        this.f7041q.m14702q();
    }

    private final boolean m6817g() {
        return this.f7041q != null && this.f7041q.mo2861a();
    }

    public final ac mo1312b() {
        if (this.f7050z) {
            this.f7037m.getConfigurator().m15967b();
            this.f7037m = null;
        }
        ac acVar = new ac();
        if (this.f7038n != null && this.f7038n.mo1039a() > 0) {
            this.f7038n.m19859b(acVar);
            this.f7038n = null;
        }
        if (this.f7044t != null) {
            this.f7044t.m19660d();
            this.f7044t = null;
        }
        if (this.f7047w != null) {
            this.f7036l.mo2952b(this.f7047w);
            this.f7047w = null;
        }
        this.f7036l = null;
        if (this.f7039o instanceof PlayHeaderListLayout) {
            ((PlayHeaderListLayout) this.f7039o).f();
        }
        if (this.f7041q != null) {
            this.f7041q.m11922b((C1031w) this);
            this.f7041q.m11921b((C0657w) this);
        }
        C2711x.m14674a(this.f7041q);
        return acVar;
    }

    private final void m6818h() {
        View a = mo1309a();
        View findViewById = a.findViewById(C7582R.id.lists_loading_indicator);
        View findViewById2 = a.findViewById(C7582R.id.page_error_indicator);
        ErrorIndicatorWithNotifyLayout errorIndicatorWithNotifyLayout = (ErrorIndicatorWithNotifyLayout) a.findViewById(C7582R.id.page_error_indicator_with_notifier);
        PlayRecyclerView playRecyclerView = (PlayRecyclerView) a.findViewById(C7582R.id.my_apps_recycler_view);
        if (this.f7043s != null) {
            C3733a.m17614a(findViewById2, errorIndicatorWithNotifyLayout, this, C1473m.f7980a.mo2262u().m17616a(), C1290m.m7702a(C1473m.f7980a.f7981b, this.f7043s));
            findViewById.setVisibility(8);
            playRecyclerView.setVisibility(8);
        } else if (m6817g()) {
            playRecyclerView.setVisibility(0);
            findViewById2.setVisibility(8);
            errorIndicatorWithNotifyLayout.setVisibility(8);
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            errorIndicatorWithNotifyLayout.setVisibility(8);
            playRecyclerView.setVisibility(8);
        }
    }

    private final void m6815a(int i) {
        MyAppsEmptyView myAppsEmptyView = (MyAppsEmptyView) mo1309a().findViewById(C7582R.id.no_results_view);
        if (myAppsEmptyView != null) {
            myAppsEmptyView.m6773a(this.f7028d, this.f7030f, true, i, this.f7033i.m13184a(null));
            PlayRecyclerView playRecyclerView = (PlayRecyclerView) this.f7039o.findViewById(C7582R.id.my_apps_recycler_view);
            if (playRecyclerView != null) {
                playRecyclerView.setEmptyView(myAppsEmptyView);
            }
        }
    }

    public final void mo1311a(boolean z) {
        this.f7034j = z;
        this.f7032h.m13206a(true);
    }

    public final void m6825d() {
        if (!m6817g() || this.f7038n == null) {
            this.f7049y = true;
            return;
        }
        FinskyLog.m21662b("Attempting to trigger UpdateAll on MyApps tab %d", Integer.valueOf(this.f7032h.getPlayStoreUiElement().c));
        List list = this.f7038n.f21580d;
        for (int i = 0; i < list.size(); i++) {
            C1169s c1169s = (C1169s) list.get(i);
            if (c1169s instanceof C1117q) {
                ((C1117q) c1169s).cb_();
                this.f7049y = false;
                return;
            }
        }
        FinskyLog.m21662b("Couldn't find MyAppsUpdatesClusterController on MyApps tab %d", Integer.valueOf(this.f7032h.getPlayStoreUiElement().c));
    }

    public final void mo1439e() {
        if (this.f7046v == null) {
            return;
        }
        if (this.f7034j) {
            this.f7046v.mo1294k(1719);
            if (this.f7048x == null && this.f7036l != null && C1473m.f7980a.aP().m13357b()) {
                this.f7048x = new C1116p(this, this.f7036l);
                return;
            }
            return;
        }
        this.f7046v.mo1293j(1706);
        this.f7046v = null;
    }
}
