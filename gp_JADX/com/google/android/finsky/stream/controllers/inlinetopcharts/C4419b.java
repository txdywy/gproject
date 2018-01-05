package com.google.android.finsky.stream.controllers.inlinetopcharts;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.p028a.C0216d;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.er;
import com.google.android.finsky.cv.p177a.jj;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2732y;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layoutswitcher.C1043h;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ai;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.C4255t;
import com.google.android.finsky.stream.controllers.inlinetopcharts.view.C4418b;
import com.google.android.finsky.stream.controllers.inlinetopcharts.view.C4423c;
import com.google.android.finsky.stream.controllers.inlinetopcharts.view.C4426e;
import com.google.android.finsky.stream.controllers.inlinetopcharts.view.C4427g;
import com.google.android.finsky.stream.controllers.inlinetopcharts.view.C4428h;
import com.google.android.finsky.stream.controllers.inlinetopcharts.view.InlineTopChartsClusterContentView;
import com.google.android.finsky.stream.controllers.inlinetopcharts.view.InlineTopChartsClusterHeaderView;
import com.google.android.finsky.stream.controllers.view.ap;
import com.google.android.libraries.bind.p117b.C5872c;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.cr;
import com.google.wireless.android.finsky.dfe.nano.cs;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C4419b extends C4250b implements C0657w, C0660x, ad, C2732y, C1043h, C4418b, ap {
    public boolean f22433A;
    public int f22434B;
    public int f22435E;
    public String f22436F;
    public final C3028c f22437a;
    public final C1461c f22438b;
    public er f22439o;
    public boolean f22440p;
    public C1254c f22441q;
    public VolleyError f22442r;
    public boolean f22443s;
    public Document f22444t;
    public ce f22445u;
    public jj f22446v;
    public jj f22447w;
    public boolean f22448x;
    public boolean f22449y;
    public boolean f22450z;

    public C4419b(Context context, C1461c c1461c, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, C3028c c3028c) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f22437a = c3028c;
        this.f22438b = c1461c;
    }

    public final void mo4050a(C2720j c2720j) {
        jj jjVar;
        boolean z;
        jj jjVar2 = null;
        boolean z2 = false;
        super.mo4050a(c2720j);
        this.f22444t = c2720j.f14908a;
        this.f22439o = c2720j.f14908a.ca();
        this.f22441q = this.g.f14909b;
        this.f22435E = C1608h.m9243a(this.e, this.f22444t.f14885a.f12099f);
        if (this.f22444t == null || !this.f22444t.bZ()) {
            jjVar = null;
        } else {
            jjVar = this.f22444t.ca().f12306c;
        }
        this.f22446v = jjVar;
        if (this.f22446v == null || this.f22446v.f12788a.length <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f22450z = z;
        if (this.f22444t != null && this.f22444t.bZ()) {
            jjVar2 = this.f22444t.ca().f12308e;
        }
        this.f22447w = jjVar2;
        if (this.f22447w == null || this.f22447w.f12788a.length <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f22449y = z;
        if (this.f22444t == null || this.f22444t.f14885a.f12099f != 3) {
            z = false;
        } else {
            z = true;
        }
        this.f22433A = z;
        if (this.f22450z || this.f22433A || this.f22449y) {
            z = true;
        } else {
            z = false;
        }
        this.f22448x = z;
        this.f22434B = this.e.getResources().getDimensionPixelSize(C7582R.dimen.flat_top_charts_header_edge_padding);
        this.f22440p = false;
        this.f22445u = C2482j.m13283a(468);
        C2482j.m13285a(this.f22445u, this.f22444t.f14885a.f12087D);
        this.D = new C4420c();
        C4420c c4420c = (C4420c) this.D;
        if (!(this.f22433A && this.f22438b.dj().mo2294a(12613101))) {
            z2 = true;
        }
        c4420c.f22451a = z2;
        ((C4420c) this.D).f22456f = C4419b.m20679a(this.f22446v);
        ((C4420c) this.D).f22457g = C4419b.m20679a(this.f22447w);
    }

    public final int mo1508a() {
        return this.f22448x ? 2 : 1;
    }

    public final int mo1509a(int i) {
        if (m20684e(i)) {
            return C7582R.layout.inline_top_charts_cluster_header;
        }
        return C7582R.layout.inline_top_charts_cluster_content;
    }

    public final void mo1510a(View view, int i) {
        if (m20684e(i)) {
            ((InlineTopChartsClusterHeaderView) view).m20714a(this.f22449y, ((C4420c) this.D).f22457g, this.f22450z, ((C4420c) this.D).f22456f, this.f22446v, this.f22433A, !((C4420c) this.D).f22451a, this.f22444t, this, this.f22434B, this.h, this.i);
            return;
        }
        int i2;
        if (!this.f22440p) {
            m20682c();
        }
        if (this.f22443s) {
            ((C4420c) this.D).f22453c = null;
        }
        if (this.f22442r != null) {
            i2 = 1;
        } else if (((C4420c) this.D).f22454d == null) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        if (i2 == 2) {
            this.f22443s = true;
        }
        InlineTopChartsClusterContentView inlineTopChartsClusterContentView = (InlineTopChartsClusterContentView) view;
        C3748a c3748a = this.f;
        C2495w c2495w = this.i;
        VolleyError volleyError = this.f22442r;
        int i3 = ((C4420c) this.D).f22452b;
        List list = ((C4420c) this.D).f22453c;
        cr[] crVarArr = ((C4420c) this.D).f22455e;
        List list2 = ((C4420c) this.D).f22454d;
        int i4 = this.f22435E;
        inlineTopChartsClusterContentView.f22462e = c3748a;
        inlineTopChartsClusterContentView.f22463f = this;
        inlineTopChartsClusterContentView.f22464g = this;
        inlineTopChartsClusterContentView.f22472o = crVarArr;
        inlineTopChartsClusterContentView.f22469l.m15371a(inlineTopChartsClusterContentView.f22466i, inlineTopChartsClusterContentView.f22468k);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) inlineTopChartsClusterContentView.getLayoutParams();
        if (crVarArr != null) {
            if (crVarArr.length > 1) {
                inlineTopChartsClusterContentView.f22467j.setVisibility(0);
                inlineTopChartsClusterContentView.f22467j.setSelectedTabIndicatorColor(i4);
                inlineTopChartsClusterContentView.f22467j.m526a(C0216d.m1116c(inlineTopChartsClusterContentView.f22461d, C7582R.color.play_fg_secondary), i4);
                inlineTopChartsClusterContentView.f22470m.setVisibility(0);
            } else {
                inlineTopChartsClusterContentView.f22467j.setVisibility(8);
                inlineTopChartsClusterContentView.f22470m.setVisibility(8);
                marginLayoutParams.topMargin = 0;
            }
        }
        if (i2 == 1) {
            inlineTopChartsClusterContentView.f22465h.m16127a(1, C1290m.m7702a(inlineTopChartsClusterContentView.f22461d, volleyError));
        } else if (i2 == 0) {
            inlineTopChartsClusterContentView.f22465h.m16127a(0, null);
        } else {
            int i5;
            inlineTopChartsClusterContentView.f22465h.mo3397a();
            C4426e c4426e = (C4426e) inlineTopChartsClusterContentView.f22466i.getAdapter();
            ao aoVar = inlineTopChartsClusterContentView.f22460c;
            c4426e.f22493f = c3748a;
            c4426e.f22494g = c2495w;
            c4426e.f22495h = aoVar;
            c4426e.f22491d = this;
            i4 = c4426e.f22497j.size();
            int length = crVarArr.length;
            List arrayList = new ArrayList(length);
            int i6 = 0;
            while (i6 < length) {
                C4427g c4427g;
                if (i6 < i4) {
                    c4427g = (C4427g) c4426e.f22497j.get(i6);
                } else {
                    c4427g = new C4427g();
                }
                c4427g.f22501a = crVarArr[i6];
                c4427g.f22502b = (C2720j) list2.get(i6);
                c4427g.f22504d = new ai(469, crVarArr[i6].d, c4426e.f22491d);
                if (list == null || list.size() <= i6) {
                    c4427g.f22505e = null;
                } else {
                    c4427g.f22505e = (Parcelable) list.get(i6);
                }
                arrayList.add(c4427g);
                i6++;
            }
            for (i5 = length; i5 < i4; i5++) {
                C4428h c4428h = ((C4427g) c4426e.f22497j.get(i5)).f22503c;
                if (c4428h != null) {
                    c4428h.mo1312b();
                }
            }
            c4426e.f22497j = arrayList;
            for (i5 = 0; i5 < length; i5++) {
                C4427g c4427g2 = (C4427g) c4426e.f22497j.get(i5);
                if (c4427g2.f22503c != null) {
                    C4428h c4428h2 = c4427g2.f22503c;
                    if (c4428h2.f22517l != null) {
                        c4428h2.f22516k = new C4423c(c4428h2.f22506a, c4428h2.f22507b, c4428h2.f22508c, c4428h2.f22509d);
                        c4428h2.f22517l.setAdapter(c4428h2.f22516k);
                    }
                    c4427g2.f22503c.m20737a(c4427g2.f22502b);
                }
            }
            c4426e.f22492e = i3;
            c4426e.M_();
            i2 = C5872c.m27302b(c4426e, i3);
            if (i2 != inlineTopChartsClusterContentView.f22466i.getCurrentItem()) {
                inlineTopChartsClusterContentView.f22466i.setCurrentItem(i2);
            } else {
                c4426e.m20730c(i2);
            }
        }
    }

    public final boolean mo4058f() {
        return false;
    }

    public final void mo1511b(View view, int i) {
        if (!m20684e(i)) {
            List list;
            InlineTopChartsClusterContentView inlineTopChartsClusterContentView = (InlineTopChartsClusterContentView) view;
            C4420c c4420c = (C4420c) this.D;
            if (inlineTopChartsClusterContentView.f22469l != null) {
                inlineTopChartsClusterContentView.f22469l.m15369a();
            }
            if (inlineTopChartsClusterContentView.f22468k != null) {
                C4426e c4426e = inlineTopChartsClusterContentView.f22468k;
                if (c4426e.f22497j != null) {
                    List arrayList = new ArrayList();
                    for (int i2 = 0; i2 < c4426e.f22497j.size(); i2++) {
                        C4427g c4427g = (C4427g) c4426e.f22497j.get(i2);
                        if (c4427g.f22503c != null) {
                            c4427g.f22505e = c4427g.f22503c.m20742c();
                        }
                        arrayList.add(c4427g.f22505e);
                    }
                    list = arrayList;
                    c4420c.f22453c = list;
                }
            }
            list = null;
            c4420c.f22453c = list;
        }
    }

    public final void mo4061q() {
        super.mo4061q();
        if (this.D != null && ((C4420c) this.D).f22454d != null) {
            for (int i = 0; i < ((C4420c) this.D).f22454d.size(); i++) {
                C2720j c2720j = (C2720j) ((C4420c) this.D).f22454d.get(i);
                if (c2720j.f14904w != null) {
                    if (c2720j.f14906y == 1) {
                        c2720j.m14689b(0);
                    }
                    c2720j.f14904w = null;
                }
            }
        }
    }

    public final void mo4197b(int i) {
        if (i != ((C4420c) this.D).f22452b) {
            ((C4420c) this.D).f22452b = i;
            m20686k();
        }
    }

    public final void mo4196b() {
        m20686k();
    }

    public final void n_() {
        m20682c();
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f22442r = volleyError;
        m20683e();
    }

    public final ce getPlayStoreUiElement() {
        return this.f22445u;
    }

    public final ad getParentNode() {
        return this.h;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void mo4168c(int i) {
        if (i != ((C4420c) this.D).f22457g) {
            String str;
            m20687l();
            ((C4420c) this.D).f22457g = i;
            int i2 = ((C4420c) this.D).f22457g;
            if (this.f22447w == null || i2 >= this.f22447w.f12788a.length || !this.f22447w.f12788a[i2].m12870d()) {
                str = null;
            } else {
                str = this.f22447w.f12788a[i2].by_().f12782c;
            }
            this.f22436F = str;
            m20683e();
        }
    }

    public final void mo4169d(int i) {
        if (i != ((C4420c) this.D).f22456f) {
            String str;
            m20687l();
            ((C4420c) this.D).f22456f = i;
            int i2 = ((C4420c) this.D).f22456f;
            if (this.f22446v == null || i2 >= this.f22446v.f12788a.length || !this.f22446v.f12788a[i2].m12870d()) {
                str = null;
            } else {
                str = this.f22446v.f12788a[i2].by_().f12782c;
            }
            this.f22436F = str;
            m20683e();
        }
    }

    public final void mo4164a(boolean z) {
        m20680b(z);
    }

    private final boolean m20684e(int i) {
        return this.f22448x && i == 0;
    }

    private final void m20682c() {
        String str;
        this.f22440p = true;
        C1254c c1254c = this.f22441q;
        if (TextUtils.isEmpty(this.f22436F)) {
            str = this.f22439o.f12305b;
        } else {
            str = this.f22436F;
        }
        c1254c.mo1662o(str, this, this);
    }

    private static int m20679a(jj jjVar) {
        if (jjVar == null || jjVar.f12788a == null) {
            return 0;
        }
        int i = 0;
        while (i < jjVar.f12788a.length) {
            if (jjVar.f12788a[i].m12870d() && jjVar.f12788a[i].by_().f12783d) {
                return i;
            }
            i++;
        }
        return 0;
    }

    private final void m20683e() {
        this.C.mo4087a(this, 0, mo1508a(), false);
    }

    private final void m20680b(boolean z) {
        ((C4420c) this.D).f22451a = z;
        List list = ((C4420c) this.D).f22454d;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C2720j c2720j = (C2720j) list.get(i);
                if (!C4419b.m20681b(c2720j)) {
                    if (((C4420c) this.D).f22451a) {
                        c2720j.m14689b(0);
                    } else {
                        c2720j.m14701p();
                    }
                }
            }
        }
    }

    private final void m20686k() {
        if (((C4420c) this.D).f22454d != null) {
            m20685f(((C4420c) this.D).f22452b);
            int max = Math.max(0, ((C4420c) this.D).f22452b - 1);
            int min = Math.min(((C4420c) this.D).f22454d.size() - 1, ((C4420c) this.D).f22452b + 1);
            int i = ((C4420c) this.D).f22452b - 1;
            int i2 = ((C4420c) this.D).f22452b + 1;
            while (true) {
                if (i >= max || i2 <= min) {
                    int i3 = i - 1;
                    m20685f(i);
                    i = i2 + 1;
                    m20685f(i2);
                    i2 = i;
                    i = i3;
                } else {
                    return;
                }
            }
        }
    }

    private final void m20685f(int i) {
        if (i >= 0 && i <= ((C4420c) this.D).f22454d.size() - 1) {
            C2720j c2720j = (C2720j) ((C4420c) this.D).f22454d.get(i);
            if (C4419b.m20681b(c2720j)) {
                c2720j.m14699n();
                if (((C4420c) this.D).f22451a) {
                    c2720j.m14689b(0);
                } else {
                    c2720j.m14701p();
                }
            }
        }
    }

    private static boolean m20681b(C2720j c2720j) {
        return !c2720j.m14703r() && (!c2720j.mo2861a() || c2720j.m14698m() == 0);
    }

    private final void m20687l() {
        this.f22440p = false;
        ((C4420c) this.D).f22453c = null;
        ((C4420c) this.D).f22452b = 0;
        ((C4420c) this.D).f22455e = null;
        ((C4420c) this.D).f22454d = null;
    }

    public final /* synthetic */ void mo4052a(C4255t c4255t) {
        super.mo4052a((C4255t) (C4420c) c4255t);
        if (((C4420c) this.D).f22455e == null || ((C4420c) this.D).f22454d == null) {
            m20682c();
            return;
        }
        this.f22440p = true;
        for (int i = 0; i < ((C4420c) this.D).f22454d.size(); i++) {
            ((C2720j) ((C4420c) this.D).f22454d.get(i)).m14681a((C2732y) this);
        }
        m20680b(((C4420c) this.D).f22451a);
    }

    public final /* synthetic */ boolean mo4145b(Object obj) {
        return this.f22437a.m15634a((Document) obj);
    }

    public final /* synthetic */ void b_(Object obj) {
        cs csVar = (cs) obj;
        ((C4420c) this.D).f22455e = csVar.b;
        C4420c c4420c = (C4420c) this.D;
        List arrayList = new ArrayList(r2);
        for (cr crVar : csVar.b) {
            C2711x a = C2721l.m14733a(this.f22441q, crVar.e, true, true);
            a.m14681a((C2732y) this);
            arrayList.add(a);
        }
        c4420c.f22454d = arrayList;
        int i = csVar.d;
        if (((C4420c) this.D).f22455e != null && i >= 0 && i < ((C4420c) this.D).f22455e.length) {
            ((C4420c) this.D).f22452b = i;
        }
        m20686k();
        m20683e();
    }
}
