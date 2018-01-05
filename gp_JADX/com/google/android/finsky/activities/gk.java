package com.google.android.finsky.activities;

import android.content.Context;
import android.support.v4.view.af;
import android.support.v7.widget.ff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bl.C2116a;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.ea.C1069e;
import com.google.android.finsky.ea.C2964d;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.ia2.C1070e;
import com.google.android.finsky.ia2.C3226c;
import com.google.android.finsky.ia2.C3228d;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ai;
import com.google.android.finsky.p111d.al;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.pagesystem.C1041g;
import com.google.android.finsky.pagesystem.C1044f;
import com.google.android.finsky.utils.ac;
import com.google.android.libraries.bind.p117b.C1071a;
import com.google.android.libraries.bind.p117b.C5872c;
import com.google.android.play.image.C1294w;
import com.google.android.play.utils.k;
import com.google.wireless.android.finsky.dfe.nano.ab;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class gk extends af implements eo, gj, C1069e, C1070e, C1041g, C1071a {
    public boolean f6856A;
    public boolean f6857B;
    public C1044f f6858C;
    public al f6859D;
    public C2964d f6860E;
    public final int f6861c;
    public final Context f6862d;
    public final LayoutInflater f6863e;
    public final C1611k f6864f;
    public final C3748a f6865g;
    public final C1041g f6866h;
    public final DfeToc f6867i;
    public final C1254c f6868j;
    public final C1294w f6869k;
    public final C4808a f6870l;
    public final C2581g f6871m;
    public final gm f6872n;
    public final ah f6873o;
    public final C2495w f6874p;
    public final FinskyHeaderListLayout f6875q;
    public final C2116a f6876r;
    public final ff f6877s;
    public final int f6878t;
    public List f6879u = new ArrayList();
    public final ad f6880v;
    public final gi f6881w;
    public final boolean f6882x;
    public int f6883y;
    public int f6884z;

    public gk(Context context, LayoutInflater layoutInflater, C1611k c1611k, C3748a c3748a, DfeToc dfeToc, C1254c c1254c, C4808a c4808a, C2581g c2581g, C1294w c1294w, ab[] abVarArr, int i, ac acVar, ad adVar, gm gmVar, ah ahVar, FinskyHeaderListLayout finskyHeaderListLayout, int i2, C2495w c2495w, C2720j[] c2720jArr, C1044f c1044f, ff ffVar, C1041g c1041g, al alVar) {
        int i3;
        C1473m.f7980a.aO();
        this.f6862d = context;
        this.f6863e = layoutInflater;
        this.f6864f = c1611k;
        this.f6865g = c3748a;
        this.f6867i = dfeToc;
        this.f6868j = c1254c;
        this.f6870l = c4808a;
        this.f6871m = c2581g;
        this.f6869k = c1294w;
        this.f6873o = ahVar;
        this.f6858C = c1044f;
        this.f6875q = finskyHeaderListLayout;
        this.f6861c = i;
        this.f6880v = adVar;
        this.f6883y = -1;
        this.f6872n = gmVar;
        this.f6877s = ffVar;
        this.f6866h = c1041g;
        this.f6878t = i2;
        this.f6859D = alVar;
        m6605a(abVarArr, acVar, c2720jArr);
        this.f6856A = !k.b(this.f6862d);
        this.f6857B = false;
        this.f6874p = c2495w;
        this.f6876r = C1473m.f7980a.bT();
        boolean z = C1473m.f7980a.dj().mo2294a(12641966) && !m6606k();
        this.f6882x = z;
        if (this.f6882x) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.f6881w = new gi(i3, this);
    }

    public final void mo1373a(ViewGroup viewGroup, int i, Object obj) {
        if (!this.f6857B) {
            int a = C5872c.m27301a(this, i);
            viewGroup.removeView(((gt) obj).mo1309a());
            gl glVar = (gl) this.f6879u.get(a);
            glVar.f6888d = glVar.f6887c.mo1312b();
            glVar.f6887c = null;
            if (this.f6860E != null) {
                this.f6860E.m15374d(i);
            }
        }
    }

    final ArrayList m6621f() {
        if (this.f6879u == null || this.f6879u.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (gl glVar : this.f6879u) {
            arrayList.add(glVar.f6886b);
        }
        return arrayList;
    }

    public final int mo961a() {
        return this.f6879u.size();
    }

    public final Object mo1372a(ViewGroup viewGroup, int i) {
        boolean z;
        gt bmVar;
        int a = C5872c.m27301a(this, i);
        boolean z2 = a == this.f6861c;
        gl glVar = (gl) this.f6879u.get(a);
        ab abVar = glVar.f6885a;
        C1552e dj = C1473m.f7980a.dj();
        boolean a2 = dj.mo2294a(12632600);
        boolean z3;
        if (this.f6882x) {
            z3 = this.f6881w.f6853e || (a != this.f6883y && this.f6884z == -1);
            z = z3;
        } else {
            z3 = this.f6881w.f6853e || (a2 && a != this.f6883y);
            z = z3;
        }
        int i2 = mo961a() > 1 ? 0 : 2;
        byte[] bArr = abVar.d;
        if (glVar.f6889e) {
            boolean z4;
            if (C1473m.f7980a.dj().mo2294a(12637322)) {
                this.f6859D.mo1385a(1733, bArr, null, true);
            }
            Context context = this.f6862d;
            C3748a c3748a = this.f6865g;
            C1611k c1611k = this.f6864f;
            C1294w c1294w = this.f6869k;
            LayoutInflater layoutInflater = this.f6863e;
            DfeToc dfeToc = this.f6867i;
            FinskyHeaderListLayout finskyHeaderListLayout = this.f6875q;
            if (C1473m.f7980a.mo2036P().f8184h && dj.mo2294a(12638373)) {
                z4 = true;
            } else {
                z4 = false;
            }
            bmVar = new bm(context, c3748a, c1611k, c1294w, layoutInflater, glVar, dfeToc, i2, finskyHeaderListLayout, z4, this.f6874p);
        } else {
            if (C1473m.f7980a.dj().mo2294a(12637322)) {
                this.f6859D.mo1385a(1733, bArr, null, !m6606k());
            }
            if (glVar.f6886b == null) {
                glVar.f6886b = C2721l.m14735a(C2721l.m14731a(this.f6868j, abVar.f));
            }
            C2720j c2720j = glVar.f6891g;
            Object obj;
            if (m6606k()) {
                C3228d c3228d;
                if (this.f6876r.m11029h()) {
                    c3228d = new C3228d(this.f6862d, this.f6865g, this.f6868j, this.f6863e, glVar, i2, this.f6873o, this.f6877s, this.f6875q, this.f6876r, z2, this.f6858C, bArr, this.f6874p, this.f6859D, this);
                } else {
                    c3228d = new C3226c(this.f6862d, this.f6865g, this.f6868j, this.f6863e, glVar, i2, this.f6873o, this.f6877s, this.f6875q, this.f6876r, z2, this.f6858C, bArr, this.f6874p, this.f6859D, this.f6866h);
                }
                obj = c3228d;
            } else {
                eo eoVar;
                Context context2 = this.f6862d;
                C1461c aN = C1473m.f7980a.aN();
                C1611k c1611k2 = this.f6864f;
                C3748a c3748a2 = this.f6865g;
                C1294w c1294w2 = this.f6869k;
                C1254c c1254c = this.f6868j;
                LayoutInflater layoutInflater2 = this.f6863e;
                DfeToc dfeToc2 = this.f6867i;
                C4808a c4808a = this.f6870l;
                C2581g c2581g = this.f6871m;
                gm gmVar = this.f6872n;
                ah ahVar = this.f6873o;
                C2495w c2495w = this.f6874p;
                C1044f c1044f = this.f6858C;
                ff ffVar = this.f6877s;
                FinskyHeaderListLayout finskyHeaderListLayout2 = this.f6875q;
                boolean z5 = C1473m.f7980a.mo2036P().f8184h && dj.mo2294a(12637256);
                C1041g c1041g = this.f6882x ? this : this.f6866h;
                if ((a2 && z) || this.f6882x) {
                    eoVar = null;
                } else {
                    Object obj2 = this;
                }
                obj = new ek(context2, aN, c1611k2, c3748a2, c1294w2, c1254c, layoutInflater2, glVar, dfeToc2, c4808a, c2581g, z, i2, gmVar, ahVar, c2495w, c2720j, z2, c1044f, ffVar, finskyHeaderListLayout2, z5, c1041g, eoVar, this.f6859D);
            }
        }
        bmVar.mo1310a(glVar.f6888d);
        bmVar.mo1311a(this.f6883y == a);
        glVar.f6887c = bmVar;
        viewGroup.addView(bmVar.mo1309a());
        if (z && (bmVar instanceof ek)) {
            this.f6881w.f6852d.add((ek) bmVar);
        }
        if (this.f6860E != null) {
            this.f6860E.m15373c(i);
        }
        return bmVar;
    }

    public final void m6617c(int i) {
        gl glVar;
        int i2 = 0;
        while (i2 < this.f6879u.size()) {
            glVar = (gl) this.f6879u.get(i2);
            if (!(glVar.f6887c == null || i2 == i)) {
                glVar.f6887c.mo1311a(false);
            }
            i2++;
        }
        glVar = (gl) this.f6879u.get(i);
        if (glVar.f6887c != null) {
            glVar.f6887c.mo1311a(true);
        }
        if (this.f6883y != i) {
            this.f6884z = this.f6883y;
            this.f6883y = i;
        }
    }

    public final boolean mo959a(View view, Object obj) {
        return !this.f6857B && ((gt) obj).mo1309a() == view;
    }

    public final float mo1376b(int i) {
        if (i == 0 && this.f6879u.size() > 1 && ((gl) this.f6879u.get(0)).f6889e) {
            return ((float) this.f6862d.getResources().getInteger(C7582R.integer.category_tab_width_in_percent)) / 100.0f;
        }
        return 1.0f;
    }

    public final void mo1377b() {
    }

    private final void m6605a(ab[] abVarArr, ac acVar, C2720j[] c2720jArr) {
        int i;
        List list;
        List list2;
        Object obj = 1;
        this.f6879u.clear();
        for (int i2 = 0; i2 < abVarArr.length; i2++) {
            C2720j c2720j;
            ab abVar = abVarArr[i2];
            boolean z = abVar.i.length > 0;
            gl glVar = new gl(abVar, z);
            if (z) {
                i = 401;
            } else {
                i = 403;
            }
            glVar.f6890f = new ai(i, abVar.d, this.f6880v);
            if (c2720jArr != null) {
                c2720j = c2720jArr[i2];
            } else {
                c2720j = null;
            }
            glVar.f6891g = c2720j;
            this.f6879u.add(glVar);
        }
        if (acVar == null || !acVar.m21689a("TabbedAdapter.TabInstanceStates")) {
            list = null;
        } else {
            list = acVar.m21691c("TabbedAdapter.TabInstanceStates");
        }
        if (acVar == null || !acVar.m21689a("TabbedAdapter.TabDfeLists")) {
            list2 = null;
        } else {
            List<C2730u> c = acVar.m21691c("TabbedAdapter.TabDfeLists");
            if (c != null) {
                for (C2730u c2730u : c) {
                    if (c2730u != null) {
                        c2730u.m14767a(this.f6868j);
                    }
                }
            }
            list2 = c;
        }
        Object obj2 = (list2 == null || list2.size() != this.f6879u.size()) ? null : 1;
        if (list == null || list.size() != this.f6879u.size()) {
            obj = null;
        }
        for (i = 0; i < abVarArr.length; i++) {
            gl glVar2 = (gl) this.f6879u.get(i);
            if (obj2 != null) {
                glVar2.f6886b = (C2730u) list2.get(i);
            }
            if (obj != null) {
                glVar2.f6888d = (ac) list.get(i);
            }
        }
    }

    public final void L_() {
        this.f6881w.m6596a();
    }

    public final void mo1255B() {
        if (this.f6882x) {
            gi giVar = this.f6881w;
            if (giVar.f6850b == 1 && !giVar.f6855g) {
                giVar.m6596a();
                giVar.f6855g = true;
            }
        }
        if (this.f6866h != null && this.f6884z == -1) {
            this.f6866h.mo1255B();
        }
    }

    public final boolean mo1379d() {
        return Math.abs(this.f6883y - this.f6884z) <= this.f6878t;
    }

    public final ek mo1380e() {
        return (ek) ((gl) this.f6879u.get(this.f6883y)).f6887c;
    }

    public final boolean mo1381g() {
        return this.f6856A;
    }

    public final void mo1375a(boolean z) {
        if (this.f6856A != z) {
            this.f6856A = z;
            M_();
        }
    }

    private final boolean m6606k() {
        return this.f6876r.m11022a(this.f6867i) && this.f6865g.mo3680a();
    }

    public final int m6623h() {
        gt gtVar = ((gl) this.f6879u.get(this.f6883y)).f6887c;
        if (gtVar != null) {
            if (gtVar instanceof C3226c) {
                return ((C3226c) gtVar).f16580c.f16678e;
            }
            if (gtVar instanceof C3228d) {
                return ((C3228d) gtVar).f16586b.m16346a();
            }
        }
        return 0;
    }

    public final void mo1378d(int i) {
        if (m6606k() && this.f6876r.m11029h()) {
            int a = C5872c.m27301a(this, i);
            C3228d c3228d = (C3228d) ((gl) this.f6879u.get(a)).f6887c;
            boolean z = this.f6884z == -1 && a == this.f6883y;
            c3228d.m16291b(z);
        }
    }

    public final void mo1374a(C2964d c2964d) {
        this.f6860E = c2964d;
    }

    public final void mo1382i() {
        this.f6860E = null;
    }

    public final void mo1383j() {
        if (m6606k() && this.f6876r.m11029h()) {
            if (this.f6860E != null) {
                C2964d c2964d = this.f6860E;
                c2964d.m15375e(c2964d.f15608a.mo3207a());
            }
            if (this.f6866h != null && this.f6884z == -1) {
                this.f6866h.mo1255B();
            }
        }
    }

    public final /* synthetic */ CharSequence mo1371a(int i) {
        if (i >= this.f6879u.size()) {
            return "";
        }
        return ((gl) this.f6879u.get(i)).f6885a.c.toUpperCase();
    }
}
