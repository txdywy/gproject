package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.support.v4.view.af;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.ff;
import com.google.android.finsky.cv.p177a.jj;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2732y;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3758b;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ai;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.C4255t;
import com.google.android.finsky.stream.base.playcluster.C4283e;
import com.google.android.finsky.stream.controllers.minitopcharts.C4349c;
import com.google.android.finsky.stream.controllers.minitopcharts.C4452a;
import com.google.android.finsky.stream.controllers.minitopcharts.C4453b;
import com.google.android.finsky.stream.controllers.minitopcharts.C4454d;
import com.google.android.finsky.stream.controllers.minitopcharts.C4455e;
import com.google.android.finsky.stream.controllers.minitopcharts.C4456f;
import com.google.android.finsky.stream.controllers.view.C4350k;
import com.google.android.finsky.stream.controllers.view.C4351l;
import com.google.android.finsky.stream.controllers.view.C4507f;
import com.google.android.finsky.stream.controllers.view.C4508g;
import com.google.android.finsky.stream.controllers.view.JpkrFlatMiniTopChartsClusterView;
import com.google.android.finsky.stream.controllers.view.TopChartsCategorySpinner;
import com.google.android.finsky.stream.controllers.view.ak;
import com.google.android.finsky.stream.controllers.view.ao;
import com.google.android.finsky.stream.p251b.C4241a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.dm;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class bc extends C4250b implements C0657w, C0660x, C1031w, C2732y, C4349c, ak, ao, C4350k {
    public final C4283e f21903a;
    public final C3027b f21904b;
    public final C4241a f21905o;
    public final ab f21906p;
    public C1254c f21907q;
    public DfeToc f21908r;
    public Document f21909s;
    public ff f21910t;
    public int f21911u;
    public VolleyError f21912v;
    public boolean f21913w;
    public C4351l f21914x;
    public int f21915y;

    public bc(Context context, C3748a c3748a, ad adVar, C4283e c4283e, C1611k c1611k, C1556d c1556d, C2495w c2495w, ab abVar, C4241a c4241a, C3027b c3027b) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f21913w = false;
        this.D = new be();
        this.f21906p = abVar;
        this.f21905o = c4241a;
        this.f21903a = c4283e;
        this.f21904b = c3027b;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f21909s = this.g.f14908a;
        this.f21910t = this.f21909s.cb();
        this.f21907q = this.g.f14909b;
        this.f21908r = this.f21906p.dn();
        this.f21911u = this.f21909s.cb().f12361c;
        if (this.f21911u == 0) {
            this.f21911u = 3;
        }
        ((be) this.D).f21916a = 0;
        ((be) this.D).f21917b = 0;
        ((be) this.D).f21919d = null;
        ((be) this.D).f21918c = false;
        if (this.f21905o.m19702d() == null) {
            this.f21905o.m19699a(((be) this.D).f21918c);
        }
        C1611k c1611k = this.d;
        Resources resources = this.e.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_listing_thumbnail_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.flat_listing_inner_margin);
        if (c1611k.f8528b.dj().mo2294a(12630160) && resources.getBoolean(C7582R.bool.flat_use_extended_margin_listing)) {
            dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.flat_listing_extended_inner_margin);
        }
        if (c1611k.f8528b.dj().mo2294a(12631771)) {
            dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_listing_thumbnail_size_large);
            dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.flat_listing_inner_margin_large);
        }
        this.f21915y = (dimensionPixelSize2 * 2) + dimensionPixelSize;
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.jpkr_flat_mini_top_charts_cluster;
    }

    public final void mo1510a(View view, int i) {
        int i2;
        Object obj;
        String str;
        bd bdVar;
        CharSequence a;
        JpkrFlatMiniTopChartsClusterView jpkrFlatMiniTopChartsClusterView;
        int b;
        LayoutInflater layoutInflater;
        C3748a c3748a;
        C2495w c2495w;
        C4283e c4283e;
        ad adVar;
        Document document;
        int i3;
        C4456f c4456f;
        int i4;
        boolean z;
        int i5;
        jj jjVar;
        C4351l c4351l;
        int i6;
        ViewPager viewPager;
        if (!this.f21913w) {
            m20243a(this.f21910t.f12360b);
            this.f21913w = true;
        }
        if (this.f21912v != null) {
            i2 = 1;
        } else if (((be) this.D).f21919d == null) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        m20244b();
        C4456f c4456f2 = ((be) this.D).f21919d;
        if (c4456f2 != null) {
            Object obj2 = (c4456f2.f22652b == null || c4456f2.f22652b.length <= 0 || c4456f2.f22652b[0] == null || !c4456f2.f22652b[0].mo2861a()) ? null : 1;
            if (!(obj2 == null || ((Boolean) C0954a.aN.m5760a()).booleanValue())) {
                obj = 1;
                if (obj != null && this.f21914x == null) {
                    this.f21914x = new bd();
                }
                if (((be) this.D).f21919d != null || TextUtils.isEmpty(((be) this.D).f21919d.f22653c)) {
                    str = this.f21909s.f14885a.f12100g;
                } else {
                    str = ((be) this.D).f21919d.f22653c;
                }
                if (this.f21909s.m14660o()) {
                    bdVar = null;
                } else {
                    bdVar = this.f21909s.f14885a.f12111r.f12023i;
                }
                a = C1542f.m8970a(this.f21909s);
                jpkrFlatMiniTopChartsClusterView = (JpkrFlatMiniTopChartsClusterView) view;
                b = this.g.mo3119b();
                layoutInflater = this.m;
                c3748a = this.f;
                c2495w = this.i;
                c4283e = this.f21903a;
                adVar = this.h;
                document = this.f21909s;
                i3 = this.f21911u;
                c4456f = ((be) this.D).f21919d;
                i4 = ((be) this.D).f21916a;
                z = ((be) this.D).f21918c;
                i5 = ((be) this.D).f21917b;
                jjVar = this.f21910t.f12362d;
                c4351l = this.f21914x;
                i6 = this.f21915y;
                jpkrFlatMiniTopChartsClusterView.m17480a(b, str, null, null, null, bdVar, a, 0);
                jpkrFlatMiniTopChartsClusterView.f22910c = layoutInflater;
                jpkrFlatMiniTopChartsClusterView.f22911j = c3748a;
                jpkrFlatMiniTopChartsClusterView.f22912k = c2495w;
                jpkrFlatMiniTopChartsClusterView.f22926y = c4351l;
                jpkrFlatMiniTopChartsClusterView.f22922u = c4456f;
                jpkrFlatMiniTopChartsClusterView.f22923v = this;
                jpkrFlatMiniTopChartsClusterView.f22924w = this;
                jpkrFlatMiniTopChartsClusterView.f22907A = i6;
                jpkrFlatMiniTopChartsClusterView.f22915n = document;
                jpkrFlatMiniTopChartsClusterView.f22913l = adVar;
                C2482j.m13285a(jpkrFlatMiniTopChartsClusterView.f22914m, jpkrFlatMiniTopChartsClusterView.f22915n.f14885a.f12087D);
                jpkrFlatMiniTopChartsClusterView.f22916o = i3;
                jpkrFlatMiniTopChartsClusterView.m21012a(c4456f, i4, (C4349c) this);
                viewPager = jpkrFlatMiniTopChartsClusterView.f22917p;
                if (viewPager.getLayoutParams().height == -2) {
                    viewPager.getLayoutParams().height = jpkrFlatMiniTopChartsClusterView.f22909b.getResources().getDimensionPixelSize(C7582R.dimen.jpkr_mini_top_charts_tab_strip_height) + ((jpkrFlatMiniTopChartsClusterView.f22909b.getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_card_to_card_vpadding) + jpkrFlatMiniTopChartsClusterView.f22907A) * jpkrFlatMiniTopChartsClusterView.f22916o);
                }
                jpkrFlatMiniTopChartsClusterView.f22918q.m21057a(z, this, jpkrFlatMiniTopChartsClusterView.f22919r, jpkrFlatMiniTopChartsClusterView, jpkrFlatMiniTopChartsClusterView.f22912k);
                if (jjVar != null || jjVar.f12788a.length == 0) {
                    jpkrFlatMiniTopChartsClusterView.f22920s.setVisibility(8);
                } else {
                    TopChartsCategorySpinner topChartsCategorySpinner = jpkrFlatMiniTopChartsClusterView.f22920s;
                    Object obj3 = (topChartsCategorySpinner.getAdapter() == null || topChartsCategorySpinner.f23065p != i5) ? 1 : null;
                    if (obj3 != null) {
                        jpkrFlatMiniTopChartsClusterView.f22920s.m21062a(C4452a.m20810a(jpkrFlatMiniTopChartsClusterView.f22909b, jjVar, b, C7582R.layout.jpkr_flat_mini_top_charts_spinner_label), i5, this, jpkrFlatMiniTopChartsClusterView, jpkrFlatMiniTopChartsClusterView.f22912k);
                    }
                }
                if (i2 != 1 && i2 != 0) {
                    af afVar;
                    int i7;
                    C4455e c4455e;
                    af afVar2 = (C4454d) jpkrFlatMiniTopChartsClusterView.f22917p.getAdapter();
                    if (afVar2 == null) {
                        afVar2 = new C4454d(jpkrFlatMiniTopChartsClusterView.f22909b, jpkrFlatMiniTopChartsClusterView.f22910c, jpkrFlatMiniTopChartsClusterView.f22911j, jpkrFlatMiniTopChartsClusterView.f22912k, c4283e.f21639a, jpkrFlatMiniTopChartsClusterView, jpkrFlatMiniTopChartsClusterView.f22916o, jpkrFlatMiniTopChartsClusterView.f22908a);
                        jpkrFlatMiniTopChartsClusterView.f22917p.setAdapter(afVar2);
                        jpkrFlatMiniTopChartsClusterView.f22917p.m1758a(new C4507f(afVar2));
                        afVar = afVar2;
                    } else {
                        afVar = afVar2;
                    }
                    List list = afVar.f22642i;
                    int size = list.size();
                    int length = c4456f.f22651a.length;
                    List arrayList = new ArrayList(length);
                    for (i7 = 0; i7 < length; i7++) {
                        if (i7 < size) {
                            c4455e = (C4455e) list.get(i7);
                        } else {
                            c4455e = new C4455e();
                        }
                        c4455e.f22647a = c4456f.f22651a[i7];
                        c4455e.f22648b = c4456f.f22652b[i7];
                        c4455e.f22650d = new ai(454, c4456f.f22651a[i7].d, afVar.f22643j);
                        arrayList.add(c4455e);
                    }
                    for (i7 = length; i7 < size; i7++) {
                        C4453b c4453b = ((C4455e) list.get(i7)).f22649c;
                        if (c4453b != null) {
                            c4453b.mo1312b();
                        }
                    }
                    afVar.f22642i = arrayList;
                    for (i7 = 0; i7 < length; i7++) {
                        c4455e = (C4455e) afVar.f22642i.get(i7);
                        if (c4455e.f22649c != null) {
                            c4455e.f22649c.m20813a(c4455e.f22648b, c4455e.f22650d);
                        }
                    }
                    afVar.M_();
                    if (i4 == jpkrFlatMiniTopChartsClusterView.f22917p.getCurrentItem()) {
                        afVar.m20824c(i4);
                    } else {
                        jpkrFlatMiniTopChartsClusterView.f22917p.setCurrentItem(i4);
                    }
                    if (obj != null && !jpkrFlatMiniTopChartsClusterView.f22925x) {
                        jpkrFlatMiniTopChartsClusterView.f22925x = true;
                        if (jpkrFlatMiniTopChartsClusterView.f22927z.getWidth() > 0) {
                            jpkrFlatMiniTopChartsClusterView.m21013b();
                            return;
                        } else {
                            jpkrFlatMiniTopChartsClusterView.getViewTreeObserver().addOnGlobalLayoutListener(new C4508g(jpkrFlatMiniTopChartsClusterView));
                            return;
                        }
                    }
                    return;
                }
            }
        }
        obj = null;
        this.f21914x = new bd();
        if (((be) this.D).f21919d != null) {
        }
        str = this.f21909s.f14885a.f12100g;
        if (this.f21909s.m14660o()) {
            bdVar = null;
        } else {
            bdVar = this.f21909s.f14885a.f12111r.f12023i;
        }
        a = C1542f.m8970a(this.f21909s);
        jpkrFlatMiniTopChartsClusterView = (JpkrFlatMiniTopChartsClusterView) view;
        b = this.g.mo3119b();
        layoutInflater = this.m;
        c3748a = this.f;
        c2495w = this.i;
        c4283e = this.f21903a;
        adVar = this.h;
        document = this.f21909s;
        i3 = this.f21911u;
        c4456f = ((be) this.D).f21919d;
        i4 = ((be) this.D).f21916a;
        z = ((be) this.D).f21918c;
        i5 = ((be) this.D).f21917b;
        jjVar = this.f21910t.f12362d;
        c4351l = this.f21914x;
        i6 = this.f21915y;
        jpkrFlatMiniTopChartsClusterView.m17480a(b, str, null, null, null, bdVar, a, 0);
        jpkrFlatMiniTopChartsClusterView.f22910c = layoutInflater;
        jpkrFlatMiniTopChartsClusterView.f22911j = c3748a;
        jpkrFlatMiniTopChartsClusterView.f22912k = c2495w;
        jpkrFlatMiniTopChartsClusterView.f22926y = c4351l;
        jpkrFlatMiniTopChartsClusterView.f22922u = c4456f;
        jpkrFlatMiniTopChartsClusterView.f22923v = this;
        jpkrFlatMiniTopChartsClusterView.f22924w = this;
        jpkrFlatMiniTopChartsClusterView.f22907A = i6;
        jpkrFlatMiniTopChartsClusterView.f22915n = document;
        jpkrFlatMiniTopChartsClusterView.f22913l = adVar;
        C2482j.m13285a(jpkrFlatMiniTopChartsClusterView.f22914m, jpkrFlatMiniTopChartsClusterView.f22915n.f14885a.f12087D);
        jpkrFlatMiniTopChartsClusterView.f22916o = i3;
        jpkrFlatMiniTopChartsClusterView.m21012a(c4456f, i4, (C4349c) this);
        viewPager = jpkrFlatMiniTopChartsClusterView.f22917p;
        if (viewPager.getLayoutParams().height == -2) {
            viewPager.getLayoutParams().height = jpkrFlatMiniTopChartsClusterView.f22909b.getResources().getDimensionPixelSize(C7582R.dimen.jpkr_mini_top_charts_tab_strip_height) + ((jpkrFlatMiniTopChartsClusterView.f22909b.getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_card_to_card_vpadding) + jpkrFlatMiniTopChartsClusterView.f22907A) * jpkrFlatMiniTopChartsClusterView.f22916o);
        }
        jpkrFlatMiniTopChartsClusterView.f22918q.m21057a(z, this, jpkrFlatMiniTopChartsClusterView.f22919r, jpkrFlatMiniTopChartsClusterView, jpkrFlatMiniTopChartsClusterView.f22912k);
        if (jjVar != null) {
        }
        jpkrFlatMiniTopChartsClusterView.f22920s.setVisibility(8);
        if (i2 != 1) {
        }
    }

    public final void mo1511b(View view, int i) {
        ((JpkrFlatMiniTopChartsClusterView) view).Z_();
    }

    private final void m20243a(String str) {
        this.f21907q.mo1661n(str, this, this);
    }

    private final void m20242a(C4456f c4456f) {
        if (c4456f != null) {
            for (int i = 0; i < c4456f.f22651a.length; i++) {
                c4456f.f22652b[i].m11922b((C1031w) this);
            }
        }
    }

    private final void m20245b(C4456f c4456f) {
        for (int i = 0; i < c4456f.f22651a.length; i++) {
            c4456f.f22652b[i].m11918a((C1031w) this);
        }
    }

    private final void m20244b() {
        if (((be) this.D).f21919d != null) {
            int i = 0;
            while (i < ((be) this.D).f21919d.f22651a.length) {
                if (i >= 0 && i < ((be) this.D).f21919d.f22651a.length) {
                    C2335k c2335k = ((be) this.D).f21919d.f22652b[i];
                    if (!(c2335k.mo2861a() || c2335k.m14703r())) {
                        c2335k.m14699n();
                    }
                }
                i++;
            }
        }
    }

    private final void m20246c() {
        this.C.mo4087a(this, 0, 1, false);
    }

    public final void mo4143a(boolean z) {
        ((be) this.D).f21918c = z;
        this.f21905o.m19699a(((be) this.D).f21918c);
        if (((be) this.D).f21919d != null) {
            for (C2711x c2711x : ((be) this.D).f21919d.f22652b) {
                if (((be) this.D).f21918c) {
                    c2711x.m14689b(0);
                } else {
                    c2711x.m14701p();
                }
            }
        }
        m20246c();
    }

    public final void mo4144b(int i) {
        String str;
        ((be) this.D).f21917b = i;
        if (this.f21910t.f12362d.f12788a[i].m12870d()) {
            str = this.f21910t.f12362d.f12788a[i].by_().f12782c;
        } else {
            FinskyLog.m21669e("mContainerTemplate.categorySelection.option[position].item should not be null", new Object[0]);
            str = null;
        }
        m20243a(str);
    }

    public final void mo4146c(int i) {
        ((be) this.D).f21916a = i;
        m20244b();
    }

    public final void mo4142a(ad adVar) {
        this.f21905o.m19703e();
        C3758b c3758b = this.f21905o;
        C3748a c3748a = this.f;
        if (!(c3758b.f21465d == null || c3758b.f21465d == c3748a)) {
            c3758b.m19704f();
        }
        c3758b.f21465d = c3748a;
        c3758b.f21465d.mo3661a(c3758b);
        this.f.mo3673a(((be) this.D).f21919d.f22651a[((be) this.D).f21916a].f, null, this.f21909s.f14885a.f12099f, this.f21909s.m14648e(), this.f21908r, adVar, this.i);
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f21912v = volleyError;
        m20246c();
    }

    public final void m_() {
        m20246c();
    }

    public final /* synthetic */ C4255t mo4062s() {
        m20242a(((be) this.D).f21919d);
        return (be) super.mo4062s();
    }

    public final /* synthetic */ void mo4052a(C4255t c4255t) {
        super.mo4052a((C4255t) (be) c4255t);
        this.f21913w = true;
        if (((be) this.D).f21919d == null) {
            m20243a(this.f21910t.f12360b);
        } else {
            m20245b(((be) this.D).f21919d);
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        int i = 0;
        dm dmVar = (dm) obj;
        this.f21912v = null;
        if (((be) this.D).f21919d != null) {
            m20242a(((be) this.D).f21919d);
        }
        ((be) this.D).f21916a = 0;
        int length = dmVar.c.length;
        C2720j[] c2720jArr = new C2720j[length];
        while (i < length) {
            c2720jArr[i] = C2721l.m14733a(this.f21907q, dmVar.c[i].e, true, true);
            c2720jArr[i].m14681a((C2732y) this);
            if (!((be) this.D).f21918c) {
                c2720jArr[i].m14701p();
            }
            i++;
        }
        ((be) this.D).f21919d = new C4456f(dmVar, c2720jArr);
        m20245b(((be) this.D).f21919d);
        m20246c();
    }

    public final /* synthetic */ boolean mo4145b(Object obj) {
        return this.f21904b.m15626a(((Document) obj).m14625N().f13171k).f15821i;
    }
}
