package com.google.android.finsky.activities;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v4.view.p039b.C0344b;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.adapters.C1167j;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.be.C1598g;
import com.google.android.finsky.be.C1599f;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2712a;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.fastscroll.ScrubberView;
import com.google.android.finsky.frameworkviews.C3141d;
import com.google.android.finsky.frameworkviews.SpacerHeightAwareFrameLayout;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.C3117g;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layoutswitcher.C1043h;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.nestedrecyclerviews.NestedParentRecyclerView;
import com.google.android.finsky.nestedrecyclerviews.p115a.C1062m;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ag;
import com.google.android.finsky.p111d.ai;
import com.google.android.finsky.p111d.al;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.pagesystem.C1041g;
import com.google.android.finsky.pagesystem.C1044f;
import com.google.android.finsky.playcard.C3909l;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.base.view.C4297g;
import com.google.android.finsky.utils.C4685p;
import com.google.android.finsky.utils.ac;
import com.google.android.libraries.performance.primes.cm;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class ek implements C0657w, gt, ad, C1031w, C1043h, C1062m {
    public static final boolean f6720a = (VERSION.SDK_INT >= 16);
    public boolean f6721A;
    public final int f6722B;
    public final gm f6723C;
    public eo f6724D;
    public boolean f6725E;
    public final boolean f6726F;
    public C1044f f6727G;
    public ag f6728H;
    public boolean f6729I;
    public final FinskyHeaderListLayout f6730J;
    public ScrubberView f6731K;
    public byte[] f6732L;
    public al f6733M;
    public final boolean f6734N;
    public final boolean f6735O;
    public final ff f6736P;
    public final int f6737b;
    public final C2730u f6738c;
    public final LayoutInflater f6739d;
    public final ah f6740e;
    public final C1461c f6741f;
    public final C2495w f6742g;
    public final C2492t f6743h = C1473m.f7980a.aP();
    public C1599f f6744i;
    public ViewGroup f6745j;
    public C3166e f6746k;
    public ac f6747l;
    public boolean f6748m = false;
    public Document f6749n;
    public boolean f6750o;
    public C2720j f6751p;
    public final DfeToc f6752q;
    public final C1254c f6753r;
    public final C3748a f6754s;
    public final C1041g f6755t;
    public final C4808a f6756u;
    public final C2581g f6757v;
    public final com.google.wireless.android.finsky.dfe.nano.ag[] f6758w;
    public final int f6759x;
    public ce f6760y = C2482j.m13283a(408);
    public ai f6761z;

    public ek(Context context, C1461c c1461c, C1611k c1611k, C3748a c3748a, C1294w c1294w, C1254c c1254c, LayoutInflater layoutInflater, gl glVar, DfeToc dfeToc, C4808a c4808a, C2581g c2581g, boolean z, int i, gm gmVar, ah ahVar, C2495w c2495w, C2720j c2720j, boolean z2, C1044f c1044f, ff ffVar, FinskyHeaderListLayout finskyHeaderListLayout, boolean z3, C1041g c1041g, eo eoVar, al alVar) {
        Resources resources = context.getResources();
        this.f6739d = layoutInflater;
        this.f6741f = c1461c;
        this.f6738c = glVar.f6886b;
        this.f6758w = glVar.f6885a.e;
        this.f6761z = glVar.f6890f;
        this.f6742g = c2495w;
        this.f6737b = resources.getInteger(C7582R.integer.layout_slide_in_animation_duration_ms);
        this.f6726F = z2;
        this.f6727G = c1044f;
        this.f6755t = c1041g;
        this.f6730J = finskyHeaderListLayout;
        this.f6732L = glVar.f6885a.d;
        this.f6733M = alVar;
        this.f6734N = this.f6741f.dj().mo2294a(12637322);
        this.f6735O = this.f6741f.dj().mo2294a(12644322);
        this.f6736P = ffVar;
        C2712a c2712a = this.f6738c.f14950a;
        c2712a.m11918a((C1031w) this);
        c2712a.m11917a((C0657w) this);
        this.f6721A = z;
        this.f6725E = c3748a.mo3705g() == 1;
        m6523a(c2712a);
        this.f6752q = dfeToc;
        this.f6754s = c3748a;
        this.f6753r = c1254c;
        this.f6756u = c4808a;
        this.f6757v = c2581g;
        this.f6722B = i;
        this.f6723C = gmVar;
        this.f6740e = ahVar;
        this.f6751p = c2720j;
        if (this.f6751p != null) {
            this.f6751p.m14699n();
            this.f6751p.m11918a((C1031w) this);
            this.f6751p.m11917a((C0657w) this);
        }
        this.f6724D = eoVar;
        this.f6744i = new C1599f(this.f6756u, this.f6757v, this.f6742g, ffVar);
        C1598g c1598g = this.f6744i;
        C3748a c3748a2 = this.f6754s;
        if (c1598g.f8490l != context) {
            c1598g.f8490l = context;
            c1598g.f8491m = c3748a2;
            c1598g.f8492n = c1294w;
            c1598g.f8493o = null;
        }
        this.f6729I = z3;
        this.f6759x = c1611k.m9275a(resources);
    }

    public final void m6535c() {
        this.f6721A = false;
        m6526e();
    }

    private final void m6525b(int i) {
        ((SpacerHeightAwareFrameLayout) this.f6745j.findViewById(i)).setSpacerHeightProvider(this.f6740e);
    }

    public final View mo1309a() {
        if (this.f6745j == null) {
            if (this.f6741f.dj().mo2294a(12633494)) {
                this.f6745j = (ViewGroup) this.f6739d.inflate(C7582R.layout.recycler_tab_wrapper, null);
            } else {
                int i;
                LayoutInflater layoutInflater = this.f6739d;
                if (!this.f6729I) {
                    i = C7582R.layout.nested_parent_recycler_tab_wrapper;
                } else if (C1473m.f7980a.dj().mo2294a(12638391)) {
                    i = C7582R.layout.nested_parent_recycler_tab_wrapper_with_scrubber_v2;
                } else {
                    i = C7582R.layout.nested_parent_recycler_tab_wrapper_with_scrubber;
                }
                this.f6745j = (ViewGroup) layoutInflater.inflate(i, null);
            }
            m6525b(C7582R.id.lists_loading_indicator);
            m6525b(C7582R.id.page_error_indicator);
            m6525b(C7582R.id.page_error_indicator_with_notifier);
            this.f6746k = new C3166e(this.f6745j, C7582R.id.data_view, C7582R.id.lists_loading_indicator, this, 0);
            PlayRecyclerView playRecyclerView = (PlayRecyclerView) this.f6745j.findViewById(C7582R.id.tab_recycler_view);
            playRecyclerView.getContext();
            playRecyclerView.setLayoutManager(new LinearLayoutManager());
            playRecyclerView.setAdapter(new C3984a());
            if (this.f6741f.dj().mo2294a(12642058)) {
                playRecyclerView.setRecycledViewPool(this.f6736P);
            }
            playRecyclerView.m278a(new C4297g(this.f6759x, this.f6759x));
            if (C1473m.f7980a.ay().m9025d() && this.f6725E) {
                if (this.f6728H == null) {
                    this.f6728H = new ag(cm.f29878b, C1473m.f7980a.cv(), this.f6742g, 1);
                }
                playRecyclerView.mo2951a(this.f6728H);
            }
            if (this.f6729I) {
                this.f6731K = (ScrubberView) this.f6745j.findViewById(C7582R.id.scrubber_view);
                C3117g configurator = this.f6731K.getConfigurator();
                configurator.f16075d = playRecyclerView;
                configurator.f16076e = this.f6730J;
                configurator.m15964a();
                this.f6730J.m16073a(configurator);
                if (this.f6747l != null) {
                    configurator.m15968b(this.f6747l);
                }
                if (playRecyclerView instanceof NestedParentRecyclerView) {
                    ((NestedParentRecyclerView) playRecyclerView).m17909a((C1062m) this);
                }
            }
            m6526e();
        }
        return this.f6745j;
    }

    public final void m_() {
        C2335k c2335k = this.f6738c.f14950a;
        Object obj = (!c2335k.mo3128h() && c2335k.mo2861a() && (this.f6751p == null || this.f6751p.mo2861a())) ? 1 : null;
        if (this.f6734N && obj != null) {
            this.f6733M.mo1384a(1742, this.f6732L, null);
        }
        if (this.f6741f.dj().mo2294a(12636210) && obj != null) {
            m6528a(1719);
        }
        m6526e();
    }

    public final ac mo1312b() {
        ac acVar;
        if (this.f6745j != null) {
            PlayRecyclerView playRecyclerView = (PlayRecyclerView) this.f6745j.findViewById(C7582R.id.tab_recycler_view);
            ac acVar2 = new ac();
            if (this.f6729I) {
                C3117g configurator = this.f6731K.getConfigurator();
                this.f6730J.m16076b(configurator);
                if (playRecyclerView instanceof NestedParentRecyclerView) {
                    ((NestedParentRecyclerView) playRecyclerView).m17910b(this);
                }
                configurator.m15963a(acVar2).m15967b();
                this.f6731K = null;
                this.f6731K = null;
            }
            if (this.f6728H != null) {
                playRecyclerView.mo2952b(this.f6728H);
                this.f6728H = null;
            }
            C1599f c1599f = this.f6744i;
            if (c1599f.f8495b != null) {
                c1599f.f8495b.mo1450a(playRecyclerView, acVar2.f24033c);
                c1599f.f8495b.mo1453h();
                c1599f.f8495b = null;
            }
            if (c1599f.f8496c != null) {
                c1599f.f8496c.m19859b(acVar2);
                c1599f.f8496c = null;
            }
            if (c1599f.f8497d != null) {
                c1599f.f8497d.m19660d();
                c1599f.f8497d = null;
            }
            c1599f.m9194a();
            c1599f.f8498e = null;
            acVar = acVar2;
        } else {
            acVar = null;
        }
        C2335k c2335k = this.f6738c.f14950a;
        c2335k.m11922b((C1031w) this);
        c2335k.m11921b((C0657w) this);
        this.f6745j = null;
        this.f6748m = false;
        if (this.f6751p != null) {
            this.f6751p.m11922b((C1031w) this);
            this.f6751p.m11921b((C0657w) this);
        }
        return acVar;
    }

    public final void mo1310a(ac acVar) {
        if (acVar != null) {
            this.f6747l = acVar;
        }
    }

    private final void m6526e() {
        if (this.f6745j != null) {
            C2335k c2335k = this.f6738c.f14950a;
            if (c2335k.mo3128h()) {
                if (this.f6741f.dj().mo2294a(12636210)) {
                    m6528a(1705);
                }
                if (!this.f6748m) {
                    this.f6746k.m16127a(1, C1290m.m7702a(C1473m.f7980a.f7981b, c2335k.mo3127g()));
                }
            } else if (!this.f6721A && c2335k.mo2861a() && (this.f6751p == null || this.f6751p.mo2861a())) {
                if (this.f6749n == null) {
                    this.f6749n = c2335k.f14908a;
                }
                if (this.f6749n != null) {
                    C2482j.m13285a(this.f6760y, this.f6749n.f14885a.f12087D);
                }
                this.f6746k.mo3397a();
                if (!this.f6748m) {
                    this.f6744i.m9196a(this.f6738c);
                    C1599f c1599f = this.f6744i;
                    ViewGroup viewGroup = this.f6745j;
                    Document document = this.f6749n;
                    com.google.wireless.android.finsky.dfe.nano.ag[] agVarArr = this.f6758w;
                    int i = this.f6722B;
                    ac acVar = this.f6747l;
                    gm gmVar = this.f6723C;
                    ah ahVar = this.f6740e;
                    C2495w c2495w = this.f6742g;
                    C2720j c2720j = this.f6751p;
                    c1599f.f8494a = viewGroup;
                    c1599f.f8504k = gmVar;
                    c1599f.f8498e = (PlayRecyclerView) viewGroup.findViewById(C7582R.id.tab_recycler_view);
                    c1599f.f8498e.setLayoutManager(new LinearLayoutManager());
                    if (document == null || (document.m14638a() == 0 && ((agVarArr == null || agVarArr.length == 0) && (c1599f.o == null || ((C2720j) ((C2730u) c1599f.o).f14950a).m14698m() == 0)))) {
                        View findViewById = c1599f.f8494a.findViewById(C7582R.id.no_results_view);
                        if (findViewById != null) {
                            FifeImageView fifeImageView = (FifeImageView) findViewById.findViewById(C7582R.id.empty_list_image);
                            if (document == null || !document.m14647d(4)) {
                                fifeImageView.setVisibility(8);
                            } else {
                                bd bdVar = (bd) document.m14644c(4).get(0);
                                C1473m.f7980a.ar().m9288a(fifeImageView, bdVar.f11860f, bdVar.f11863i);
                                fifeImageView.setVisibility(0);
                            }
                            if (document != null && document.aS()) {
                                Object obj = document.bg().f12932k.f12139b;
                                if (!TextUtils.isEmpty(obj)) {
                                    ((TextView) findViewById.findViewById(C7582R.id.no_results_textview)).setText(C4685p.m21831a(obj));
                                }
                            }
                            c1599f.f8498e.setEmptyView(findViewById);
                        }
                    } else {
                        if (c1599f.f8499f) {
                            c1599f.f8498e.setEmptyView(null);
                        } else {
                            c1599f.f8498e.setEmptyView(c1599f.f8494a.findViewById(C7582R.id.no_results_view));
                        }
                        C1552e dj = C1473m.f7980a.dj();
                        Object obj2 = (document.m14638a() <= 0 || !document.m14641a(0).aC()) ? null : 1;
                        obj2 = (obj2 == null || dj.mo2294a(12637756)) ? 1 : null;
                        if (obj2 != null) {
                            c1599f.f8496c = new C4279n();
                            c1599f.f8497d = C1473m.f7980a.co().m19665a((C2730u) c1599f.o, c1599f.f8496c, c1599f.f8498e, c1599f.l, c1599f.m, this, c1599f.f8502i, i, agVarArr, ahVar, null, false, c2720j, false, false, null, c1599f.f8503j, false);
                            c1599f.f8498e.setAdapter(c1599f.f8496c);
                            if (c1599f.f8504k != null) {
                                c1599f.f8504k.mo1386a(null);
                            }
                            if (acVar != null) {
                                c1599f.f8496c.m19845a(acVar);
                            }
                        } else {
                            Document a = document.m14641a(0);
                            C2712a a2 = ((C2730u) c1599f.o).m14766a(((C2730u) c1599f.o).m14765a(0).f14885a.f12096c);
                            C1473m.f7980a.aO();
                            c1599f.m9196a(C2721l.m14735a(a2));
                            RecyclerView recyclerView = c1599f.f8498e;
                            recyclerView.getRecycledViewPool().mo2355a(6, 20);
                            recyclerView.setScrollingTouchSlop(1);
                            recyclerView.m278a(new C3141d(recyclerView.getContext(), C7582R.color.play_card_light_background));
                            recyclerView.m278a(new C3909l());
                            if (c1599f.f8495b != null) {
                                c1599f.f8495b.mo1453h();
                            }
                            c1599f.f8495b = new C1167j(c1599f.l, c1599f.m, c1599f.n, c1599f.f8500g, a, (C2730u) c1599f.o, acVar != null, this, c2495w, c1599f.f8501h);
                            c1599f.f8498e.setAdapter(c1599f.f8495b);
                            if (c1599f.f8504k != null) {
                                c1599f.f8504k.mo1386a(c1599f.f8495b);
                            }
                            if (acVar != null) {
                                c1599f.f8495b.mo1451b(c1599f.f8498e, acVar.f24033c);
                            }
                        }
                    }
                    PlayRecyclerView playRecyclerView = (PlayRecyclerView) this.f6745j.findViewById(C7582R.id.tab_recycler_view);
                    if (this.f6747l == null) {
                        if (f6720a && ((!this.f6735O || this.f6750o) && !C1473m.f7980a.mo2033M().m8818a())) {
                            Animation loadAnimation = AnimationUtils.loadAnimation(playRecyclerView.getContext(), C7582R.anim.slide_in_bottom);
                            loadAnimation.setInterpolator(new C0344b());
                            loadAnimation.setDuration((long) this.f6737b);
                            LayoutAnimationController layoutAnimationController = new LayoutAnimationController(loadAnimation);
                            layoutAnimationController.setDelay(0.1f);
                            playRecyclerView.setLayoutAnimation(layoutAnimationController);
                            if (this.f6750o && this.f6725E) {
                                loadAnimation.setAnimationListener(new em(this));
                            }
                        } else if (this.f6735O || this.f6750o) {
                            m6524a(playRecyclerView, true);
                        }
                    } else if (this.f6750o) {
                        m6524a(playRecyclerView, this.f6741f.dj().mo2294a(12641817));
                    }
                    this.f6747l = null;
                    this.f6748m = true;
                }
                if (this.f6741f.dj().mo2294a(12632600) && !this.f6741f.dj().mo2294a(12641966)) {
                    this.f6745j.post(new el(this));
                }
            } else {
                this.f6746k.m16127a(0, null);
            }
        }
    }

    public final void n_() {
        C2712a c2712a = this.f6738c.f14950a;
        c2712a.ac_();
        c2712a.f14893l = null;
        m6523a(c2712a);
        m6526e();
    }

    private final void m6524a(PlayRecyclerView playRecyclerView, boolean z) {
        if (this.f6725E) {
            en enVar = new en(this, playRecyclerView, z);
        }
    }

    final void m6528a(int i) {
        if (!this.f6743h.m13357b() || !this.f6726F) {
            return;
        }
        if (i == 1719) {
            this.f6727G.mo1294k(i);
        } else {
            this.f6727G.mo1293j(i);
        }
    }

    private final void m6523a(C2712a c2712a) {
        if (this.f6734N) {
            this.f6733M.mo1384a(1741, this.f6732L, null);
        }
        c2712a.m14699n();
    }

    public final void mo1062a(VolleyError volleyError) {
        if (this.f6751p != null && this.f6751p.mo3128h()) {
            this.f6751p.m11922b((C1031w) this);
            this.f6751p.m11921b((C0657w) this);
            this.f6751p = null;
        }
        m6526e();
    }

    public final void mo1311a(boolean z) {
        if (z != this.f6750o) {
            if (z) {
                C2712a c2712a = this.f6738c.f14950a;
                if (!(c2712a.mo2861a() || c2712a.m14703r())) {
                    m6523a(c2712a);
                }
                C2482j.m13305c(this.f6761z);
                this.f6761z.m13206a(true);
                if (this.f6761z.getPlayStoreUiElement().f.length == 0) {
                    C2482j.m13290a(this.f6745j);
                }
            } else {
                this.f6761z.m13206a(false);
            }
            this.f6750o = z;
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f6760y;
    }

    public final ad getParentNode() {
        return this.f6761z;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void mo1356a(RecyclerView recyclerView) {
        if (this.f6731K != null) {
            this.f6731K.getConfigurator().m15965a(recyclerView);
        }
    }
}
