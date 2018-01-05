package com.google.android.finsky.stream.p248a;

import android.content.Context;
import android.provider.SearchRecentSuggestions;
import android.support.v4.p028a.C0216d;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.eo;
import android.support.v7.widget.ff;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.adapters.C1154a;
import com.google.android.finsky.adapters.C1170l;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bl.C2116a;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2712a;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2724o;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C1114y;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.stream.C4240a;
import com.google.android.finsky.stream.base.C1169s;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4231e;
import com.google.android.finsky.stream.base.C4232p;
import com.google.android.finsky.stream.base.C4239i;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.controllers.cj;
import com.google.android.finsky.stream.controllers.headerspacer.C4413a;
import com.google.android.finsky.stream.controllers.p250b.C4233b;
import com.google.android.finsky.stream.controllers.p250b.C4347a;
import com.google.android.finsky.stream.controllers.p252a.C4300a;
import com.google.android.finsky.stream.controllers.searchsuggestions.C4490a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.ag;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C4234b implements C0657w, C1031w, C4230c, C4231e, C4232p, C4233b {
    public List f21392A;
    public C4347a f21393B;
    public boolean f21394C;
    public boolean f21395D;
    public C1114y f21396E;
    public List f21397F = new ArrayList();
    public eo f21398G;
    public final C4236d f21399a;
    public final C2730u f21400b;
    public final C4279n f21401c;
    public final C4808a f21402d;
    public final Context f21403e;
    public final C3748a f21404f;
    public final ag[] f21405g;
    public final ff f21406h;
    public final ad f21407i;
    public final ah f21408j;
    public final int f21409k;
    public final C2724o f21410l;
    public final boolean f21411m;
    public final boolean f21412n;
    public final C2495w f21413o;
    public final C2720j f21414p;
    public final RecyclerView f21415q;
    public final C1556d f21416r;
    public final C1461c f21417s;
    public final C4227e f21418t;
    public final SearchRecentSuggestions f21419u;
    public final C2116a f21420v;
    public final C4237g f21421w;
    public C1154a f21422x;
    public List f21423y;
    public List f21424z = new ArrayList();

    public C4234b(C4808a c4808a, C4236d c4236d, C2730u c2730u, C4279n c4279n, RecyclerView recyclerView, Context context, C3748a c3748a, ad adVar, C2495w c2495w, int i, ag[] agVarArr, ah ahVar, C2724o c2724o, boolean z, C2720j c2720j, boolean z2, boolean z3, boolean z4, C1114y c1114y, ff ffVar, C4229a c4229a, C1556d c1556d, C4227e c4227e, C1461c c1461c, SearchRecentSuggestions searchRecentSuggestions, C2116a c2116a, C4237g c4237g) {
        this.f21402d = c4808a;
        this.f21399a = c4236d;
        this.f21400b = c2730u;
        this.f21401c = c4279n;
        this.f21403e = context;
        this.f21404f = c3748a;
        if (ffVar == null) {
            ffVar = new ff();
        }
        this.f21406h = ffVar;
        c4229a.m19642a(this.f21403e.getResources(), this.f21406h);
        this.f21407i = adVar;
        this.f21409k = i;
        this.f21411m = z;
        this.f21413o = c2495w;
        this.f21415q = recyclerView;
        this.f21416r = c1556d;
        this.f21418t = c4227e;
        this.f21417s = c1461c;
        this.f21419u = searchRecentSuggestions;
        this.f21420v = c2116a;
        this.f21421w = c4237g;
        this.f21405g = agVarArr;
        this.f21414p = c2720j;
        this.f21408j = ahVar;
        this.f21410l = c2724o;
        C2720j c2720j2 = (C2720j) this.f21400b.f14950a;
        this.f21412n = z2;
        this.f21394C = z3;
        this.f21395D = z4;
        this.f21396E = c1114y;
        c2720j2.m11918a((C1031w) this);
        c2720j2.m11917a((C0657w) this);
        this.f21401c.f21584h.add(this);
        if (!this.f21394C) {
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f21401c);
                C4238h.m19670a(recyclerView);
                this.f21401c.m19856b();
            } else {
                FinskyLog.m21669e("RecyclerView should not be null if not from the details page", new Object[0]);
            }
        }
        if (c2720j2.mo2861a()) {
            m19648f();
        } else {
            c2720j2.m14699n();
        }
    }

    public final void m_() {
        m19648f();
    }

    public final void mo1062a(VolleyError volleyError) {
        m19648f();
    }

    public final void mo4029a() {
        m19648f();
    }

    public final void mo4032b() {
        m19648f();
    }

    public final void mo4030a(C4250b c4250b) {
        if (this.f21396E != null) {
            this.f21397F.remove(c4250b);
            if (this.f21397F.size() == 0) {
                this.f21396E.mo1439e();
                this.f21396E = null;
            }
        }
    }

    public final void mo4031a(C1169s c1169s) {
        int indexOf = this.f21424z.indexOf(c1169s);
        if (indexOf != -1) {
            this.f21400b.m14765a(indexOf);
        }
    }

    public final void m19660d() {
        C2720j c2720j = (C2720j) this.f21400b.f14950a;
        c2720j.m11922b((C1031w) this);
        c2720j.m11921b((C0657w) this);
        this.f21401c.f21584h.remove(this);
        for (int i = 0; i < this.f21424z.size(); i++) {
            C2335k c2335k = ((C4250b) this.f21424z.get(i)).f21489g;
            int size = c2335k.f11508i.size();
            int size2 = c2335k.f11509j.size();
            if ((size + size2) + c2335k.m14700o() > 0) {
                FinskyLog.m21669e("Listeners are not be cleared from the DFE list: \nInitialURL: %s \nController: %s \nListener count: (%d, %d, %d)\n", c2335k.f14928d, r0, Integer.valueOf(size), Integer.valueOf(size2), Integer.valueOf(c2335k.m14700o()));
            }
        }
        this.f21397F.clear();
        this.f21396E = null;
        if (this.f21398G != null) {
            this.f21401c.mo5197b(this.f21398G);
        }
    }

    private final void m19648f() {
        int i;
        C2720j c2720j;
        if (this.f21394C && this.f21395D) {
            this.f21401c.m19846a(0, Arrays.asList(new C4300a[]{new C4300a()}));
        }
        if (this.f21423y != null || this.f21394C) {
            i = 0;
        } else {
            Object obj;
            int i2;
            C4237g c4237g;
            String b;
            C2730u c2730u;
            Object obj2;
            this.f21423y = new ArrayList();
            this.f21423y.add(new C4413a(this.f21408j, this.f21409k, this.f21403e));
            if (!m19653l()) {
                obj = (this.f21420v != null && this.f21420v.m11021a() && this.f21404f.mo3680a()) ? 1 : null;
                if (!(obj == null && this.f21416r.m9022a() && this.f21417s.dj().mo2294a(12617586))) {
                    obj = 1;
                    if (obj != null) {
                        this.f21423y.add(new C4300a());
                    }
                    if (this.f21410l != null) {
                        if (!TextUtils.isEmpty(this.f21410l.m14745b())) {
                            this.f21423y.add(new C4490a(this.f21410l, ((C2720j) this.f21400b.f14950a).mo3119b(), this.f21404f, this.f21413o, this.f21407i, this.f21419u, this.f21403e));
                        }
                        if (this.f21411m && ((C2720j) this.f21400b.f14950a).m14698m() > 0) {
                            this.f21423y.add(new C1170l());
                            i2 = 3;
                            c4237g = this.f21421w;
                            b = this.f21404f.mo3683b();
                            c2730u = this.f21400b;
                            obj2 = (c4237g.m19668a(b, c2730u) || c4237g.m19669a(b, c2730u, this.f21405g)) ? 1 : null;
                            if (obj2 == null) {
                                m19652j();
                                m19651i();
                            } else {
                                m19651i();
                                m19652j();
                            }
                            this.f21401c.m19855a(this.f21423y);
                            i = i2;
                        }
                    }
                    i2 = 0;
                    c4237g = this.f21421w;
                    b = this.f21404f.mo3683b();
                    c2730u = this.f21400b;
                    if (!c4237g.m19668a(b, c2730u)) {
                    }
                    if (obj2 == null) {
                        m19651i();
                        m19652j();
                    } else {
                        m19652j();
                        m19651i();
                    }
                    this.f21401c.m19855a(this.f21423y);
                    i = i2;
                }
            }
            obj = null;
            if (obj != null) {
                this.f21423y.add(new C4300a());
            }
            if (this.f21410l != null) {
                if (TextUtils.isEmpty(this.f21410l.m14745b())) {
                    this.f21423y.add(new C4490a(this.f21410l, ((C2720j) this.f21400b.f14950a).mo3119b(), this.f21404f, this.f21413o, this.f21407i, this.f21419u, this.f21403e));
                }
                this.f21423y.add(new C1170l());
                i2 = 3;
                c4237g = this.f21421w;
                b = this.f21404f.mo3683b();
                c2730u = this.f21400b;
                if (c4237g.m19668a(b, c2730u)) {
                }
                if (obj2 == null) {
                    m19652j();
                    m19651i();
                } else {
                    m19651i();
                    m19652j();
                }
                this.f21401c.m19855a(this.f21423y);
                i = i2;
            }
            i2 = 0;
            c4237g = this.f21421w;
            b = this.f21404f.mo3683b();
            c2730u = this.f21400b;
            if (c4237g.m19668a(b, c2730u)) {
            }
            if (obj2 == null) {
                m19651i();
                m19652j();
            } else {
                m19652j();
                m19651i();
            }
            this.f21401c.m19855a(this.f21423y);
            i = i2;
        }
        List arrayList = new ArrayList();
        C2720j c2720j2 = (C2720j) this.f21400b.f14950a;
        while (this.f21424z.size() < c2720j2.m14698m()) {
            C4250b a;
            int size = this.f21424z.size();
            if (size > 0) {
                C4250b c4250b = (C4250b) this.f21424z.get(size - 1);
                if (c4250b != null && c4250b.mo4058f() && c4250b.mo4059g()) {
                    break;
                }
            }
            Document document = (Document) c2720j2.m14679a(size, false);
            C4239i c4240a = new C4240a(this.f21399a);
            if (document.bD()) {
                a = this.f21418t.mo4026a(this.f21403e, this.f21406h, this.f21413o, this.f21400b, this.f21404f, this.f21407i);
            } else {
                a = this.f21418t.mo4028a(document, c4240a, this, this.f21406h, this.f21402d, this.f21403e, this.f21412n, this.f21413o, this.f21400b, this.f21404f, this.f21407i, this.f21405g);
            }
            if (a != null) {
                if (this.f21396E != null && a.mo4153i()) {
                    this.f21397F.add(a);
                    a.f21496n = this;
                }
                C2712a a2 = this.f21400b.m14766a(document.f14885a.f12096c);
                if (!a.mo4179j() || a2.f14928d.equals(((C2720j) this.f21400b.f14950a).f14928d)) {
                    C2712a c2712a = a2;
                } else {
                    c2720j = (C2720j) this.f21400b.f14950a;
                    Document document2 = a2.f14908a;
                    c2720j = C2721l.m14733a(c2720j.f14909b, c2720j.f14928d, true, true);
                    if (a instanceof cj) {
                        document2.m14645c();
                        c2720j.f14908a = document2;
                    }
                    c2720j.m14699n();
                    this.f21400b.f14951b.put(document.f14885a.f12096c, c2720j);
                }
                a.mo4050a(c2720j);
                arrayList.add(a);
            }
            this.f21424z.add(a);
        }
        if (arrayList.size() > 0) {
            if (this.f21392A != null) {
                this.f21401c.m19846a(this.f21401c.f21580d.size() - this.f21392A.size(), arrayList);
            } else {
                this.f21401c.m19855a(arrayList);
            }
        }
        if (this.f21392A == null) {
            this.f21392A = new ArrayList();
            this.f21393B = new C4347a(i, this);
            this.f21392A.add(this.f21393B);
            this.f21401c.m19855a(this.f21392A);
        }
        c2720j = (C2720j) this.f21400b.f14950a;
        C4250b h = m19650h();
        if (h != null && h.mo4058f()) {
            if (h.f21489g.mo3128h()) {
                this.f21393B.m20218b(2);
                this.f21393B.f21895c = C1290m.m7702a(h.f21487e, h.f21489g.mo3127g());
            } else if (h.mo4059g()) {
                this.f21393B.m20218b(1);
            }
            m19649g();
            m19661e();
        }
        if (c2720j.mo3128h()) {
            this.f21393B.m20218b(2);
            this.f21393B.f21895c = C1290m.m7702a(this.f21403e, c2720j.mo3127g());
        } else if (c2720j.f14901t) {
            this.f21393B.m20218b(1);
        } else {
            C4347a c4347a = this.f21393B;
            c4347a.m20218b(c4347a.f21894b);
        }
        m19649g();
        m19661e();
    }

    final void m19661e() {
        int i;
        C4279n c4279n;
        boolean z = false;
        boolean z2 = false;
        for (i = 0; i < this.f21424z.size(); i++) {
            C4250b c4250b = (C4250b) this.f21424z.get(i);
            if (c4250b.mo1508a() > 0) {
                z2 = false;
                break;
            }
            if (c4250b.mo4059g()) {
                z2 = true;
            }
        }
        this.f21401c.f21587k = z2;
        if (z2) {
            c4279n = this.f21401c;
        } else {
            C4279n c4279n2 = this.f21401c;
            if (this.f21423y != null) {
                for (i = 0; i < this.f21423y.size(); i++) {
                    if (((C1169s) this.f21423y.get(i)) instanceof C4490a) {
                        c4279n = c4279n2;
                        break;
                    }
                }
            }
            for (i = 0; i < this.f21424z.size(); i++) {
                if (((C4250b) this.f21424z.get(i)).mo1508a() > 0) {
                    c4279n = c4279n2;
                    break;
                }
            }
            z = true;
            c4279n = c4279n2;
        }
        c4279n.f21586j = z;
        if (this.f21415q instanceof PlayRecyclerView) {
            ((PlayRecyclerView) this.f21415q).mo2960y();
        }
        if (this.f21401c != null && this.f21398G == null) {
            this.f21398G = new C4235c(this);
            this.f21401c.mo5196a(this.f21398G);
        }
    }

    private final void m19649g() {
        if (this.f21415q != null && this.f21422x == null) {
            C2720j c2720j = (C2720j) this.f21400b.f14950a;
            int m = c2720j.m14698m();
            int i = 0;
            while (i != m) {
                Document document = (Document) c2720j.m14679a(i, false);
                if (document == null || !(document.bt() || document.bu() || document.bv() || document.ay() || document.az())) {
                    i++;
                } else {
                    this.f21422x = new C1154a(C0216d.m1116c(this.f21403e, C7582R.color.flat_card_cluster_light_background));
                    this.f21415q.m278a(this.f21422x);
                    return;
                }
            }
        }
    }

    public final void mo4033c() {
        C2720j c2720j = (C2720j) this.f21400b.f14950a;
        C4250b h = m19650h();
        if (h != null && h.mo4058f() && h.f21489g.mo3128h()) {
            h.f21489g.m14702q();
        } else if (c2720j.mo3128h()) {
            c2720j.m14702q();
        }
        this.f21393B.m20218b(1);
    }

    private final C4250b m19650h() {
        for (int size = this.f21424z.size() - 1; size >= 0; size--) {
            C4250b c4250b = (C4250b) this.f21424z.get(size);
            if (c4250b != null) {
                return c4250b;
            }
        }
        return null;
    }

    private final void m19651i() {
        if (m19653l()) {
            C4250b a = this.f21418t.mo4026a(this.f21403e, this.f21406h, this.f21413o, this.f21400b, this.f21404f, this.f21407i);
            a.mo4050a(this.f21414p);
            this.f21423y.add(a);
        }
    }

    private final void m19652j() {
        if (this.f21405g != null && this.f21405g.length > 0) {
            C4250b a = this.f21418t.mo4027a(this.f21403e, this.f21413o, this.f21400b, this.f21404f, this.f21407i, this.f21405g);
            a.mo4050a(null);
            this.f21423y.add(a);
        }
    }

    private final boolean m19653l() {
        return this.f21414p != null && this.f21414p.m14698m() > 0;
    }
}
