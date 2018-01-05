package com.google.android.finsky.detailspage;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.C0455e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.bx;
import android.support.v7.widget.em;
import android.support.v7.widget.ew;
import android.support.v7.widget.fe;
import android.support.v7.widget.ff;
import android.transition.Fade;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Toast;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.bp;
import com.google.android.finsky.af.C1184a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailscomponents.C2577b;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailscomponents.C2586l;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.detailsmodules.C2602a;
import com.google.android.finsky.detailsmodules.C2603b;
import com.google.android.finsky.detailsmodules.p183a.C2597a;
import com.google.android.finsky.detailsmodules.p183a.C2598b;
import com.google.android.finsky.detailsmodules.p183a.C2599c;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.fastscroll.C3118n;
import com.google.android.finsky.fastscroll.ScrubberView;
import com.google.android.finsky.frameworkviews.C3144j;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p106a.C0948a;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p110p.C3837c;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ag;
import com.google.android.finsky.pagesystem.C1037e;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.ratereview.C1068o;
import com.google.android.finsky.ratereview.C3973p;
import com.google.android.finsky.stream.base.view.C4297g;
import com.google.android.finsky.stream.p248a.C4238h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.libraries.performance.primes.cm;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.p179a.C6232r;
import com.google.android.play.p179a.p352a.ao;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aq extends bp implements C0998m, C2599c, db, C1003o, C1068o {
    public boolean aA;
    public int aB;
    public int aC;
    public int aD;
    public int aE;
    public boolean aF = true;
    public FinskyHeaderListLayout aG;
    public C0948a aH;
    public HeroGraphicView aI;
    public RecyclerView aJ;
    public C2602a aK;
    public ScrubberView aL;
    public boolean aM;
    public boolean aN;
    public int aO;
    public HeroGraphicView aP;
    public String aQ;
    public boolean aR;
    public boolean aS;
    public fe aT;
    public final au aU = new au(this);
    public ag aV;
    public ff aW;
    public C3676f aX;
    public bh aY;
    public FifeImageView aZ;
    public C2581g ag;
    public C4238h ah;
    public C1611k ai;
    public C3837c aj;
    public C1612l ak;
    public be al;
    public cx am;
    public boolean an;
    public C1254c ao;
    public C2719i ap;
    public av aq;
    public List ar;
    public List as = new ArrayList();
    public boolean at;
    public List au;
    public List av;
    public int[] aw;
    public Set ax = new HashSet();
    public Set az;
    public C2577b ba;
    public C1184a bb;
    public boolean bc;
    public ak bd;
    public C1461c n_;

    public static aq m13882a(Document document, String str, String str2, String str3, boolean z, boolean z2, C2495w c2495w) {
        C1473m c1473m = C1473m.f7980a;
        C1045b aqVar = new aq();
        aqVar.m6259c(str3);
        aqVar.m6319a(c1473m.dn(), str);
        aqVar.m6254a("finsky.DetailsDataBasedFragment.document", (Parcelable) document);
        aqVar.m6258b("finsky.DetailsFragment.continueUrl", str2);
        aqVar.m6262d("finsky.DetailsFragment.acquisitionOverride", z);
        aqVar.m6262d("finsky.DetailsFragment.useBrandedActionBar", z2);
        aqVar.mo2580a(c2495w);
        return aqVar;
    }

    public final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    public final void mo136b(Bundle bundle) {
        boolean z = true;
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1809a(this);
        super.mo136b(bundle);
        m6264i(2);
        this.f740L = true;
        this.n_ = C1473m.f7980a.aN();
        C1184a c1184a = this.bb;
        boolean z2 = c1184a.m7137a(this.f6511a) && c1184a.f7259a.dj().mo2294a(12644088);
        this.bc = z2;
        if (this.bc) {
            this.bd = new ak();
        }
        this.am = new cx(this.al, this.bd);
        if (!(this.n_.dj().mo2294a(12638373) && C1473m.f7980a.mo2036P().f8184h)) {
            z = false;
        }
        this.aM = z;
    }

    public View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context c0455e;
        boolean z;
        int a;
        Document document = this.f6511a;
        Context context = layoutInflater.getContext();
        if (this.bb.m7137a(document)) {
            c0455e = new C0455e(context, (int) C7582R.style.MainActivityTheme.D30DetailsPageXsellClusterDecoration);
            layoutInflater = LayoutInflater.from(c0455e);
        } else {
            c0455e = context;
        }
        View a2 = super.mo970a(layoutInflater, viewGroup, bundle);
        Resources resources = c0455e.getResources();
        C1552e dj = this.n_.dj();
        if (dj.mo2294a(12636865)) {
            z = resources.getBoolean(C7582R.bool.use_combined_title_in_details_v2);
        } else {
            z = resources.getBoolean(C7582R.bool.use_combined_title_in_details);
        }
        if (z) {
            this.ax.add(Integer.valueOf(7));
        }
        int i = document.f14885a.f12099f;
        z = !aj() && this.ag.m13640b(document, this.e_);
        this.aN = z;
        if (aj()) {
            a = FinskyHeaderListLayout.m16068a(c0455e, 2, 0);
        } else {
            a = this.ag.m13639a(c0455e, document, this.e_);
        }
        this.aO = a;
        this.aG = (FinskyHeaderListLayout) this.bt;
        this.aG.a(new at(this, c0455e, this.aN, this.aO, i));
        this.aG.setFloatingControlsBackground(new ColorDrawable(C1608h.m9243a(m603h(), i)));
        C0950c l = ((C1037e) m603h()).mo1243l();
        if (this.aN) {
            l.mo1269d();
        } else {
            l.mo1270e();
        }
        if (VERSION.SDK_INT >= 22) {
            if (C2586l.m13643b(document)) {
                l.mo1274i().setAccessibilityTraversalBefore(C7582R.id.play_icon);
            } else {
                l.mo1274i().setAccessibilityTraversalBefore(C7582R.id.recycler_view);
            }
        }
        this.aH = new C0948a(m603h().getWindow(), this.aG);
        this.aG.setOnLayoutChangedListener(this.aH);
        this.aH.m5719b();
        this.aI = (HeroGraphicView) this.aG.findViewById(C7582R.id.hero_promo);
        if (this.aI != null && dj.mo2294a(12636865)) {
            HeroGraphicView heroGraphicView = this.aI;
            z = resources.getBoolean(C7582R.bool.use_wide_layout) && !this.ai.m9285j(resources);
            heroGraphicView.setFullScreenMode(z);
            this.aI.setUseDetailsPageWidth(this.ai.m9285j(resources));
        }
        this.aJ = (RecyclerView) this.aG.findViewById(C7582R.id.recycler_view);
        this.aJ.setSaveEnabled(false);
        this.aJ.setItemAnimator(new bx());
        if (this.ai.m9285j(resources)) {
            LayoutParams layoutParams = (LayoutParams) this.aG.findViewById(C7582R.id.background_container).getLayoutParams();
            layoutParams.width = c0455e.getResources().getDimensionPixelSize(C7582R.dimen.width_for_fixed_width_pages);
            layoutParams.gravity = 1;
            this.aZ = (FifeImageView) this.aG.findViewById(C7582R.id.blurred_backdrop_image);
            this.aZ.setBitmapTransformation(C1473m.f7980a.cE());
            this.aZ.setOnClickListener(new ar(this));
        }
        if (this.aY == null && C1473m.f7980a.aP().m13357b()) {
            this.aY = new bh(this.aJ, this);
        }
        this.aG.setBackgroundViewForTouchPassthrough(this.aI);
        if (this.aS) {
            aq();
        }
        C1473m.f7980a.bw().mo3481a((C1003o) this);
        if (this.aM) {
            this.aL = (ScrubberView) this.aG.findViewById(C7582R.id.scrubber_view);
            C3118n configurator = this.aL.getConfigurator();
            configurator.f16075d = this.aJ;
            configurator.f16076e = this.aG;
            configurator.f16077f = this.aN;
            configurator.m15964a();
        }
        if (this.bb.m7137a(document)) {
            a = 0;
        } else {
            a = this.ai.m9275a(m605i());
        }
        this.aJ.m278a(new C4297g(a, a));
        return a2;
    }

    public final void mo139d(Bundle bundle) {
        if (this.ap != null) {
            this.ap.m11918a((C1031w) this);
            this.aq = new av(this);
            this.ap.m11917a(this.aq);
        }
        super.mo139d(bundle);
    }

    public final void mo980v() {
        super.mo980v();
        if (this.n_.dj().mo2294a(12633045) && this.aj != null) {
            this.aj.m18302a();
        }
        if (this.aY != null) {
            this.aY.m13942a();
        }
    }

    protected final void aa() {
        String str;
        mo1294k(1718);
        super.aa();
        boolean z = this.f760q.getBoolean("finsky.DetailsFragment.acquisitionOverride");
        Document document = this.f6511a;
        if (z) {
            String str2 = "mAcquisitionOverride true for docId=%s - I hope it came from deep link!";
            Object[] objArr = new Object[1];
            if (document != null) {
                str = document.f14885a.f12096c;
            } else {
                str = null;
            }
            objArr[0] = str;
            FinskyLog.m21665c(str2, objArr);
        }
        if (document.f14885a.f12099f == 3) {
            z = true;
        } else {
            z = false;
        }
        this.an = false;
        if (z) {
            str = this.bo.mo1636c();
            str2 = C1473m.f7980a.cZ();
            if (!str.equals(str2)) {
                FinskyLog.m21659a("Using current account %s to fetch social details for %s", FinskyLog.m21655a(str2), document.f14885a.f12096c);
                this.an = true;
                if (this.ap != null) {
                    this.ap.m11922b((C1031w) this);
                    this.ap.m11921b(this.aq);
                }
                this.ap = new C2719i(C1473m.f7980a.mo2112b(str2), this.bF, true, null);
                this.ap.m11918a((C1031w) this);
                this.aq = new av(this);
                this.ap.m11917a(this.aq);
            }
            C2474c a = new C2474c(509).m13236a(this.f6511a.f14885a.f12096c).m13239a(this.an);
            C2482j f = C1473m.f7980a.mo2242f(str2);
            if (this.n_.mo2249j(str2).mo2294a(12637351)) {
                ao b = C6232r.m28732a().m28734b();
                b.f30842e = new int[]{60};
                f.m13319a(a.f13342a, b);
            } else {
                f.m13319a(a.f13342a, null);
            }
        }
        this.ao = this.an ? C1473m.f7980a.ap() : this.bo;
    }

    protected boolean mo3044b(C2598b c2598b) {
        return c2598b.mo2979f();
    }

    protected final void j_() {
        Document document = this.f6511a;
        if (document != null) {
            Document b;
            boolean z;
            int i;
            int intValue;
            if (this.n_.dj().mo2294a(12622972)) {
                Account b2 = this.bo.mo1620b();
                if (l_() && !b2.equals(C1473m.f7980a.cY())) {
                    if (!C1473m.f7980a.mo2045Y().m11649a(document, this.k_, C1473m.f7980a.ah().mo2811a(b2))) {
                        this.bp.mo3658a(document, this.bF, this.f760q.getString("finsky.DetailsFragment.continueUrl"), C1473m.f7980a.cZ(), this.bw);
                        return;
                    }
                }
            }
            C2719i c2719i = this.a_;
            C2719i c2719i2 = this.an ? this.ap : c2719i;
            if (this.an) {
                b = this.ap.m14722b();
            } else {
                b = document;
            }
            boolean l_ = this.an ? l_() && this.ap.mo2861a() : l_();
            if (l_) {
                mo1294k(1719);
            }
            if (this.aK == null) {
                List a;
                aq aqVar;
                if (this.aK != null) {
                    FinskyLog.m21669e("Modules system is already set up", new Object[0]);
                }
                this.aJ.getContext();
                ew linearLayoutManager = new LinearLayoutManager();
                this.aJ.setLayoutManager(linearLayoutManager);
                if (this.n_.dj().mo2294a(12636865)) {
                    z = this.bn.getResources().getBoolean(C7582R.bool.use_full_width_for_details_page_v2);
                } else {
                    z = this.bn.getResources().getBoolean(C7582R.bool.use_full_width_for_details_page);
                }
                this.aJ.m278a(this.ba.m13626a(this.bn.getResources(), z));
                this.aJ.m278a(new C3144j(this.bn));
                this.aJ.m278a(new ao(this.bn));
                this.aJ.m278a(new cl());
                C4238h.m19670a(this.aJ);
                if (this.az != null) {
                    cx cxVar = this.am;
                    List list = this.au;
                    List list2 = this.av;
                    Set set = this.az;
                    Set set2 = this.ax;
                    boolean a2 = cx.m14083a(set);
                    boolean a3 = cx.m14083a(set2);
                    if (a2 != a3) {
                        a = cxVar.m14085a(document, a3 ? set : set2);
                        if (!a3) {
                            set2 = set;
                        }
                        List a4 = cxVar.m14085a(document, set2);
                        int indexOf = a.indexOf(go.class);
                        int indexOf2 = a.indexOf(gy.class);
                        int indexOf3 = a.indexOf(bk.class);
                        int indexOf4 = a.indexOf(gq.class);
                        int indexOf5 = a4.indexOf(ad.class);
                        if (!a2 && a3) {
                            ae aeVar = new ae();
                            aeVar.f14232a = (gp) list2.get(indexOf);
                            aeVar.f14234c = (hd) list2.get(indexOf2);
                            aeVar.f14233b = (bl) list2.get(indexOf3);
                            aeVar.f14235d = (gr) list2.get(indexOf4);
                            List arrayList = new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(indexOf), Integer.valueOf(indexOf2), Integer.valueOf(indexOf4), Integer.valueOf(indexOf3)}));
                            Collections.sort(arrayList);
                            Collections.reverse(arrayList);
                            for (i = 0; i < arrayList.size(); i++) {
                                intValue = ((Integer) arrayList.get(i)).intValue();
                                list.remove(intValue);
                                list2.remove(intValue);
                            }
                            list2.add(indexOf5, aeVar);
                            list.add(indexOf5, ad.class);
                        }
                        if (a2 && !a3) {
                            ae aeVar2 = (ae) list2.get(indexOf5);
                            if (aeVar2 == null) {
                                aeVar2 = new ae();
                            }
                            list.remove(indexOf5);
                            list2.remove(indexOf5);
                            Map hashMap = new HashMap();
                            Map hashMap2 = new HashMap();
                            hashMap.put(Integer.valueOf(indexOf), go.class);
                            hashMap.put(Integer.valueOf(indexOf2), gy.class);
                            hashMap.put(Integer.valueOf(indexOf4), gq.class);
                            hashMap.put(Integer.valueOf(indexOf3), bk.class);
                            hashMap2.put(Integer.valueOf(indexOf), aeVar2.f14232a);
                            hashMap2.put(Integer.valueOf(indexOf2), aeVar2.f14234c);
                            hashMap2.put(Integer.valueOf(indexOf4), aeVar2.f14235d);
                            hashMap2.put(Integer.valueOf(indexOf3), aeVar2.f14233b);
                            List arrayList2 = new ArrayList(hashMap2.keySet());
                            Collections.sort(arrayList2);
                            for (i = 0; i < arrayList2.size(); i++) {
                                indexOf2 = ((Integer) arrayList2.get(i)).intValue();
                                list.add(indexOf2, (Class) hashMap.get(Integer.valueOf(indexOf2)));
                                list2.add(indexOf2, (C2600d) hashMap2.get(Integer.valueOf(indexOf2)));
                            }
                        }
                    }
                }
                C1254c ap = this.an ? C1473m.f7980a.ap() : this.bo;
                Context context = this.aJ.getContext();
                this.aW = new ff();
                this.aX = new C3676f(context);
                String str = ai() ? this.aQ : null;
                if (this.au != null) {
                    a = this.am.m14087a(this.au, context, this.bu, this, this.bw, this.bp, this);
                    aqVar = this;
                } else {
                    cx cxVar2 = this.am;
                    Set set3 = this.ax;
                    String str2 = this.bu;
                    C2495w c2495w = this.bw;
                    C3748a c3748a = this.bp;
                    if (cxVar2.f14381f != null) {
                        ak akVar = cxVar2.f14381f;
                        a = ak.m13855a(context, document, set3, cxVar2.f14380e, str2, this, c2495w, c3748a, this);
                        aqVar = this;
                    } else {
                        a = cxVar2.m14087a(cxVar2.m14085a(document, set3), context, str2, this, c2495w, c3748a, this);
                        aqVar = this;
                    }
                }
                aqVar.ar = a;
                for (int i2 = 0; i2 < this.ar.size(); i2++) {
                    C2598b c2598b = (C2598b) this.ar.get(i2);
                    if (c2598b instanceof bn) {
                        ((bn) c2598b).m13963a(context, this, this.k_, this.bo, ap, this.bD, this.bp, this, this.bF, this.f760q.getString("finsky.DetailsFragment.continueUrl"), this.f6513f, this.e_, str, this.aR, this.aW, this, this.bw, this.aX);
                    } else if (c2598b instanceof eh) {
                        ((eh) c2598b).m14115a(context, this, this.k_, this.bo, ap, this.bD, this.bp, this, this.bF, this.f760q.getString("finsky.DetailsFragment.continueUrl"), this.f6513f, this.e_, str, this.aR, this.aW, this, this.bw, this.aX);
                    } else if (c2598b instanceof ck) {
                        ((ck) c2598b).mo3029a(context, this, this.k_, this.bo, ap, this.bD, this.bp, this, this.bF, this.f760q.getString("finsky.DetailsFragment.continueUrl"), this.f6513f, this.e_, str, this.aR, this.aW, this, this.bw);
                    }
                    c2598b.mo2973a(this.av != null ? (C2600d) this.av.get(i2) : null);
                    if (this.aw != null) {
                        c2598b.f13822c = this.aw[i2];
                    }
                    if (mo3044b(c2598b)) {
                        this.as.add(c2598b);
                    }
                }
                this.aK = new C2602a(this.as);
                this.aJ.setAdapter(this.aK);
                this.aJ.setScrollingTouchSlop(1);
                if (C1473m.f7980a.ay().m9025d()) {
                    if (this.aV == null) {
                        this.aV = new ag(cm.f29878b, C1473m.f7980a.cv(), this.bw, 2);
                    }
                    this.aJ.mo2951a(this.aV);
                }
                if (this.aA) {
                    if (this.aB == 0) {
                        linearLayoutManager.m3094a(0, Math.min(this.aD + this.aE, this.aG.getHeaderHeight()) - this.aG.getHeaderHeight());
                    } else {
                        linearLayoutManager.m3094a(this.as.indexOf(this.ar.get(this.am.m14084a(this.aB, document, this.az, this.ax))) + this.aC, this.aD);
                    }
                }
            }
            if (l_ && !this.at) {
                this.at = true;
                List a5 = this.am.m14086a(document, this.ax, this.ar);
                String str3 = ai() ? this.aQ : null;
                for (intValue = 0; intValue < a5.size(); intValue++) {
                    ((bn) a5.get(intValue)).m13963a(m603h(), this, this.k_, this.bo, this.ao, this.bD, this.bp, this, this.bF, this.f760q.getString("finsky.DetailsFragment.continueUrl"), this.f6513f, this.e_, str3, this.aR, this.aW, this, this.bw, this.aX);
                }
            }
            for (intValue = 0; intValue < this.ar.size(); intValue++) {
                C2598b c2598b2 = (C2598b) this.ar.get(intValue);
                c2598b2.mo2974a(l_, document, c2719i, b, c2719i2);
                if (mo3044b(c2598b2) && !this.as.contains(c2598b2)) {
                    m13898c(c2598b2);
                }
            }
            if (this.aI != null) {
                z = !aj() && this.ag.m13640b(document, this.e_);
                this.aN = z;
                intValue = this.aO;
                this.aO = this.ag.m13639a(this.bn, document, this.e_);
                if (!(this.aO == intValue || this.aG == null)) {
                    this.aG.b(2, this.aO);
                }
                this.aI.m13593a(document, this.e_, (ad) this);
                intValue = document.f14885a.f12098e;
                Object obj = (intValue == 2 || intValue == 25 || intValue == 24) ? 1 : null;
                obj = (!this.aF || this.e_ || obj == null) ? null : 1;
                if (obj != null) {
                    i = this.aG.getHeaderHeight() - m605i().getDimensionPixelSize(C7582R.dimen.hero_image_height);
                    if (i > 0) {
                        ((LinearLayoutManager) this.aJ.getLayoutManager()).m3094a(0, -i);
                    }
                }
                this.aF = false;
            }
            if (this.ai.m9285j(m605i())) {
                bd a6 = m13881a(document);
                if (a6 != null) {
                    this.ak.m9288a(this.aZ, a6.f11860f, a6.f11863i);
                }
            }
        }
    }

    protected boolean ai() {
        return false;
    }

    public final void ac() {
        if (aj()) {
            this.bq.mo1267c();
            this.bq.mo1270e();
            this.bq.mo1275j();
        }
        this.bq.mo1259a();
        this.bm.mo1236a(this.f6511a.f14885a.f12099f, this.f6511a.m14648e(), true);
        this.bm.mo1241c(this.f6511a.f14885a.f12100g);
        this.bm.mo1246z();
    }

    final boolean aj() {
        return this.f760q.getBoolean("finsky.DetailsFragment.useBrandedActionBar");
    }

    public final void mo3033a(C2598b c2598b, boolean z) {
        if (this.aK != null) {
            if (!this.ar.contains(c2598b)) {
                FinskyLog.m21669e("FinskyModule does not belong to this page", new Object[0]);
            } else if (!c2598b.mo2979f()) {
                FinskyLog.m21669e("FinskyModule that is not ready for display asked for refresh", new Object[0]);
            } else if (!mo3044b(c2598b)) {
            } else {
                if (this.as.contains(c2598b)) {
                    int indexOf = this.as.indexOf(c2598b);
                    if (z) {
                        em emVar = this.aK;
                        emVar.m3631c(emVar.m13685f(indexOf) + 0);
                        return;
                    }
                    C2602a c2602a = this.aK;
                    c2602a.f13826e.post(new C2603b((C2597a) c2602a.f13824c.get(indexOf)));
                    return;
                }
                m13898c(c2598b);
            }
        }
    }

    public final void mo3032a(C2598b c2598b) {
        if (this.aK != null && this.as.contains(c2598b)) {
            em emVar = this.aK;
            int indexOf = this.as.indexOf(c2598b);
            C2597a c2597a = (C2597a) emVar.f13824c.get(indexOf);
            int e = c2597a.mo2978e();
            c2597a.f13820a.clear();
            int f = emVar.m13685f(indexOf);
            emVar.f13824c.remove(indexOf);
            emVar.m3634d(f, e);
            this.as.remove(c2598b);
        }
    }

    private static bd m13881a(Document document) {
        int[] iArr = new int[]{2, 14, 22, 0, 4};
        bd bdVar = null;
        for (int i = 0; i < 5; i++) {
            bdVar = document.m14642b(iArr[i]);
            if (bdVar != null) {
                break;
            }
        }
        if (bdVar == null) {
            return null;
        }
        return bdVar;
    }

    public final void mo3036b(String str, Object obj) {
        for (int i = 0; i < this.ar.size(); i++) {
            ((C2598b) this.ar.get(i)).mo3034a(str, obj);
        }
    }

    public final void mo3031a(C2597a c2597a, int i, int i2) {
        if (this.aK != null && this.as.contains(c2597a)) {
            em emVar = this.aK;
            emVar.m3619a(emVar.m13678a(c2597a, i), i2);
        }
    }

    public final void mo3035b(C2597a c2597a, int i, int i2) {
        if (this.aK != null && this.as.contains(c2597a)) {
            em emVar = this.aK;
            emVar.m3632c(emVar.m13678a(c2597a, i), i2);
        }
    }

    public final void mo3038c(C2597a c2597a, int i, int i2) {
        if (this.aK != null && this.as.contains(c2597a)) {
            em emVar = this.aK;
            emVar.m3634d(emVar.m13678a(c2597a, i), i2);
        }
    }

    protected final void m13898c(C2598b c2598b) {
        int i = 0;
        if (this.as.contains(c2598b)) {
            FinskyLog.m21669e("Trying to add a module that is already added", new Object[0]);
        } else if (mo3044b(c2598b)) {
            int i2 = 0;
            while (i < this.ar.size() && i2 != this.as.size() && this.ar.get(i) != c2598b) {
                if (this.ar.get(i) == this.as.get(i2)) {
                    i2++;
                }
                i++;
            }
            this.as.add(i2, c2598b);
            em emVar = this.aK;
            emVar.f13824c.add(i2, c2598b);
            emVar.m3632c(emVar.m13685f(i2), c2598b.mo2978e());
        } else {
            FinskyLog.m21669e("Trying to add a module that is not ready for display", new Object[0]);
        }
    }

    public void mo138d() {
        int i = 0;
        if (this.aM) {
            this.aL.getConfigurator().m15967b();
            this.aL = null;
        }
        int j = ((LinearLayoutManager) this.aJ.getLayoutManager()).m3124j();
        View childAt = this.aJ.getChildAt(0);
        if (childAt != null) {
            int e;
            this.aA = true;
            List list = this.ar;
            List list2 = this.as;
            List list3 = this.as;
            int i2 = 0;
            int i3 = j;
            while (i2 < list3.size()) {
                e = ((C2597a) list3.get(i2)).mo2978e();
                if (i3 < e) {
                    break;
                }
                i3 -= e;
                i2++;
            }
            FinskyLog.m21669e("Should never reach here", new Object[0]);
            i2 = -1;
            this.aB = list.indexOf(list2.get(i2));
            List list4 = this.as;
            for (i2 = 0; i2 < list4.size(); i2++) {
                e = ((C2597a) list4.get(i2)).mo2978e();
                if (j < e) {
                    break;
                }
                j -= e;
            }
            FinskyLog.m21669e("Should never reach here", new Object[0]);
            j = -1;
            this.aC = j;
            this.aD = childAt.getTop();
            this.aE = childAt.getHeight();
        }
        this.az = this.ax;
        this.aK.m13682b();
        this.au = new ArrayList();
        this.av = new ArrayList();
        this.aw = new int[this.ar.size()];
        while (i < this.ar.size()) {
            C2598b c2598b = (C2598b) this.ar.get(i);
            this.au.add(c2598b.getClass());
            this.av.add(c2598b.mo3039g());
            this.aw[i] = c2598b.f13822c;
            c2598b.mo2980h();
            i++;
        }
        if (this.ap != null) {
            this.ap.m11922b((C1031w) this);
            this.ap.m11921b(this.aq);
        }
        if (this.aG != null) {
            this.aG.f();
        }
        if (this.aH != null) {
            this.aH.m5722e();
        }
        C1473m.f7980a.bw().mo3484b((C1003o) this);
        if (this.aV != null) {
            this.aJ.mo2952b(this.aV);
            this.aV = null;
        }
        this.bm.mo1234A().m21845a();
        this.aJ.mo2952b(this.aT);
        this.aJ.removeCallbacks(this.aU);
        this.aT = null;
        this.aG = null;
        this.aH = null;
        this.aI = null;
        this.aP = null;
        this.aJ = null;
        this.aW = null;
        this.aX = null;
        this.aK = null;
        this.ar.clear();
        this.as.clear();
        if (this.aY != null) {
            this.aY.m13942a();
        }
        this.aL = null;
        this.aZ = null;
        super.mo138d();
    }

    public final void mo1205a(C3369m c3369m) {
        Document document = this.f6511a;
        if (document != null && document.f14885a.f12098e == 1 && c3369m.m16819a().equals(document.m14625N().f13171k)) {
            if (c3369m.f17273c.f17153d == 3 && c3369m.m16820b() == 944) {
                this.bp.mo3658a(document, this.bF, this.f760q.getString("finsky.DetailsFragment.continueUrl"), this.bo.mo1636c(), this.bw);
            } else {
                ac();
            }
            if (c3369m.f17273c.f17153d == 6 && document.bW()) {
                Toast.makeText(C1473m.f7980a.f7981b, this.bn.getResources().getString(C7582R.string.early_access_app_installed), 1).show();
            }
        }
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        for (int i3 = 0; i3 < this.ar.size(); i3++) {
            ((C2598b) this.ar.get(i3)).mo3073a(i, i2, intent);
        }
    }

    public final void mo1202a(int i, Bundle bundle) {
        super.mo1202a(i, bundle);
        for (int i2 = 0; i2 < this.ar.size(); i2++) {
            ((C2598b) this.ar.get(i2)).mo1202a(i, bundle);
        }
    }

    public final void mo1211b(int i, Bundle bundle) {
        super.mo1211b(i, bundle);
        for (int i2 = 0; i2 < this.ar.size(); i2++) {
            this.ar.get(i2);
        }
    }

    public final void mo1364a(String str, String str2, C3973p c3973p) {
        for (int i = 0; i < this.ar.size(); i++) {
            ((C2598b) this.ar.get(i)).mo1364a(str, str2, c3973p);
        }
    }

    protected final int k_() {
        return 2;
    }

    @TargetApi(22)
    protected final Transition ae() {
        return new Fade().setDuration(400);
    }

    public final int af() {
        return C1608h.m9243a(this.bn, this.f6511a.f14885a.f12099f);
    }

    public final void ao() {
        int j = ((LinearLayoutManager) this.aJ.getLayoutManager()).m3124j();
        if (this.f6511a.f14885a.f12099f == 3 && j >= 0 && j < ap()) {
            this.aJ.post(this.aU);
        }
    }

    final int ap() {
        int i = 0;
        while (i < this.aK.m13683c()) {
            C2597a e = this.aK.m13684e(i);
            if ((this.ax.contains(Integer.valueOf(7)) && (e instanceof ad)) || (e instanceof go)) {
                return i;
            }
            i++;
        }
        return 0;
    }

    final void aq() {
        if (this.aT == null) {
            this.aT = new as(this);
        }
        this.aJ.mo2951a(this.aT);
        this.aG.setForceShowToolbar(true);
    }

    public final void p_() {
        this.aH.m5718a(true);
    }

    public final void q_() {
        this.aH.m5718a(false);
    }
}
