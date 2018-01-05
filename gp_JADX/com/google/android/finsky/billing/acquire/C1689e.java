package com.google.android.finsky.billing.acquire;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.finsky.billing.acquire.p152a.C1665a;
import com.google.android.finsky.billing.acquire.p152a.C1667b;
import com.google.android.finsky.billing.acquire.p152a.C1668c;
import com.google.android.finsky.billing.acquire.p152a.C1672f;
import com.google.android.finsky.billing.acquire.p152a.C1675h;
import com.google.android.finsky.billing.acquire.p152a.C1676i;
import com.google.android.finsky.billing.acquire.p152a.C1678k;
import com.google.android.finsky.billing.p130b.C1763d;
import com.google.android.finsky.dialogbuilder.C1688g;
import com.google.android.finsky.dialogbuilder.C1762d;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.layout.C2806n;
import com.google.android.finsky.dialogbuilder.p137a.C1666l;
import com.google.android.finsky.dialogbuilder.p137a.C1671n;
import com.google.android.finsky.dialogbuilder.p137a.C2759a;
import com.google.android.finsky.dialogbuilder.p137a.C2762c;
import com.google.android.finsky.dialogbuilder.p137a.C2763d;
import com.google.android.finsky.dialogbuilder.p137a.C2767g;
import com.google.android.finsky.dialogbuilder.p137a.C2770i;
import com.google.android.finsky.dialogbuilder.p137a.C2771j;
import com.google.android.finsky.dialogbuilder.p137a.C2773o;
import com.google.android.finsky.dialogbuilder.p137a.C2774p;
import com.google.android.finsky.dialogbuilder.p137a.C2775q;
import com.google.android.finsky.dialogbuilder.p137a.C2776r;
import com.google.android.finsky.dialogbuilder.p137a.C2777s;
import com.google.android.finsky.dialogbuilder.p137a.C2779u;
import com.google.android.finsky.dialogbuilder.p137a.C2783x;
import com.google.android.finsky.dialogbuilder.p137a.C2785z;
import com.google.android.finsky.dialogbuilder.p137a.aa;
import com.google.android.finsky.dialogbuilder.p137a.ac;
import com.google.android.finsky.dialogbuilder.p137a.ae;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.dialogbuilder.p154b.C2793j;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.c.a.ah;
import com.google.wireless.android.finsky.dfe.c.a.bu;
import com.google.wireless.android.finsky.dfe.c.a.cb;
import com.google.wireless.android.finsky.dfe.c.a.cz;
import com.google.wireless.android.finsky.dfe.c.a.r;
import com.google.wireless.android.finsky.dfe.c.a.t;
import java.util.ArrayList;
import java.util.List;

public final class C1689e implements C1688g {
    public final C1763d f8732a;
    public final C2806n f8733b;
    public final View f8734c;
    public final boolean f8735d;
    public final C1665a f8736e;
    public final C2792h f8737f;
    public final C2793j f8738g;
    public final ArrayList f8739h = new ArrayList();

    protected C1689e(C1763d c1763d, C2806n c2806n, View view, boolean z, C1665a c1665a, C2792h c2792h, C2793j c2793j) {
        ((C1348d) C3947d.m18649a(C1348d.class)).mo1999b();
        this.f8732a = c1763d;
        this.f8733b = c2806n;
        this.f8734c = view;
        this.f8735d = z;
        this.f8736e = c1665a;
        this.f8737f = c2792h;
        this.f8738g = c2793j;
    }

    public final void mo2393a(C2797e c2797e, cz czVar, bu buVar, boolean z) {
        ah ahVar = (ah) czVar.m4921b(ah.a);
        mo2392a();
        this.f8739h.clear();
        C2793j c2793j = this.f8738g;
        if (!z) {
            c2793j.f15097d = true;
        } else if (!c2793j.f15097d) {
            c2793j.f15095b.clear();
        }
        c2793j.f15098e.clear();
        c2793j.f15099f.clear();
        c2793j.f15101h.clear();
        c2793j.f15100g.clear();
        c2793j.f15096c = false;
        this.f8737f.m14873b();
        if (this.f8735d) {
            this.f8734c.setVisibility(0);
            if (!(this.f8733b.m603h() == null || this.f8733b.m603h().getWindow() == null)) {
                Window window = this.f8733b.m603h().getWindow();
                LayoutParams attributes = window.getAttributes();
                attributes.flags |= 2;
                window.setAttributes(attributes);
            }
        }
        this.f8733b.mo3141Y();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        ViewGroup aa = this.f8733b.aa();
        for (r rVar : ahVar.b) {
            C1666l aeVar;
            C1665a c1665a = this.f8736e;
            LayoutInflater a = c1665a.f8675e.m14883a(rVar.d);
            if (rVar.e != null) {
                aeVar = new ae(a, rVar.e);
            } else if (rVar.i != null) {
                aeVar = new C2771j(a, rVar.i, c1665a.f8674d);
            } else if (rVar.j != null) {
                aeVar = new C2770i(a, rVar.j, c1665a.f8674d);
            } else if (rVar.v != null) {
                aeVar = new C1667b(a, rVar.v, c1665a.f8678h);
            } else if (rVar.g != null) {
                aeVar = new C2763d(a, rVar.g, c1665a.f8678h, c1665a.f8677g);
            } else if (rVar.h != null) {
                cb cbVar = rVar.h;
                aeVar = new C2774p(a);
            } else if (rVar.x != null) {
                aeVar = new C1668c(a, rVar.x, c1665a.f8678h);
            } else if (rVar.w != null) {
                aeVar = new C1678k(a, rVar.w, c1665a.f8673c, c1665a.f8676f);
            } else if (rVar.k != null) {
                aeVar = new C2783x(a, rVar.k);
            } else if (rVar.l != null) {
                aeVar = new C2777s(a, rVar.l);
            } else if (rVar.m != null) {
                aeVar = new ac(a, rVar.m, c1665a.f8677g);
            } else if (rVar.y != null) {
                aeVar = new C1672f(a, rVar.y, c1665a.f8671a);
            } else if (rVar.n != null) {
                aeVar = new C2762c(a, rVar.n);
            } else if (rVar.u != null) {
                aeVar = new C1675h(rVar.u, c1665a.f8672b);
            } else if (rVar.o != null) {
                aeVar = new C2773o(a, rVar.o);
            } else if (rVar.z != null) {
                aeVar = new C1676i(a, rVar.z);
            } else if (rVar.p != null) {
                aeVar = new C2785z(a, rVar.p);
            } else if (rVar.q != null) {
                aeVar = new aa(a, rVar.q, c1665a.f8677g, c1665a.f8676f);
            } else if (rVar.s != null) {
                aeVar = new C2767g(a, rVar.s, c1665a.f8677g, c1665a.f8676f, c1665a.f8678h);
            } else if (rVar.r != null) {
                aeVar = new C2779u(a, rVar.r, c1665a.f8677g, c1665a.f8676f);
            } else if (rVar.f != null) {
                aeVar = new C2775q(a, rVar.f);
            } else if (rVar.t != null) {
                aeVar = new C2776r(a, rVar.t);
            } else {
                aeVar = null;
            }
            if (aeVar != null) {
                if (aeVar instanceof C1671n) {
                    this.f8739h.add((C1671n) aeVar);
                }
                ad a2 = this.f8732a.m9661a(rVar.b, rVar.c);
                View a3 = aeVar.mo2383a(c2797e, aa);
                C2798j.m14898a(rVar.c, a3, c2797e);
                this.f8738g.m14878a(a3, rVar.c, a2);
                arrayList.add(a3);
            }
        }
        ViewGroup ac = this.f8733b.ac();
        for (t tVar : ahVar.c) {
            C1666l c2759a;
            C1665a c1665a2 = this.f8736e;
            LayoutInflater a4 = c1665a2.f8675e.m14883a(tVar.d);
            if (tVar.e != null) {
                c2759a = new C2759a(a4, tVar.e, c1665a2.f8676f);
            } else {
                c2759a = null;
            }
            if (c2759a != null) {
                this.f8732a.m9661a(tVar.b, null);
                View a5 = c2759a.mo2383a(c2797e, ac);
                C2798j.m14898a(tVar.c, a5, c2797e);
                arrayList2.add(a5);
            }
        }
        this.f8733b.m14923a(arrayList, arrayList2, buVar, czVar.d);
        this.f8738g.m14877a();
        mo2394b();
    }

    public final void mo2392a() {
        ArrayList arrayList = this.f8739h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C1671n) obj).mo2379b();
        }
    }

    public final void mo2394b() {
        ArrayList arrayList = this.f8739h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C1671n) obj).mo2380c();
        }
    }

    public final void mo2395c() {
        this.f8733b.mo3140X();
        C1762d c1762d = this.f8732a;
        ad c2473o = new C2473o(c1762d.f9089j);
        c2473o.mo1219a(C1762d.f9083d);
        c1762d.f9085f.m13373a(new C2488p().m13342a(c2473o).m13344a(), null);
    }
}
