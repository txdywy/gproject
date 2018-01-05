package com.google.android.finsky.activities;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.af;
import android.support.v7.widget.ff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.api.c;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.bl.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.ai;
import com.google.android.finsky.d.al;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.g;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.l;
import com.google.android.finsky.dfemodel.u;
import com.google.android.finsky.ea.d;
import com.google.android.finsky.ea.f;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.ia2.c;
import com.google.android.finsky.ia2.d;
import com.google.android.finsky.ia2.l;
import com.google.android.finsky.ia2.q;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.pagesystem.f;
import com.google.android.finsky.pagesystem.g;
import com.google.android.finsky.utils.ac;
import com.google.android.finsky.y.a;
import com.google.android.libraries.bind.b.c;
import com.google.android.play.image.w;
import com.google.android.play.utils.k;
import com.google.wireless.android.finsky.dfe.nano.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.activities.gk extends android.support.v4.view.af implements com.google.android.finsky.activities.eo, com.google.android.finsky.activities.gj, com.google.android.finsky.ea.e, com.google.android.finsky.ia2.e, com.google.android.finsky.pagesystem.g, com.google.android.libraries.bind.b.a
{

    public boolean A;
    public boolean B;
    public com.google.android.finsky.pagesystem.f C;
    public com.google.android.finsky.d.al D;
    public com.google.android.finsky.ea.d E;
    public final int c;
    public final Context d;
    public final LayoutInflater e;
    public final com.google.android.finsky.bg.k f;
    public final com.google.android.finsky.navigationmanager.a g;
    public final com.google.android.finsky.pagesystem.g h;
    public final DfeToc i;
    public final com.google.android.finsky.api.c j;
    public final com.google.android.play.image.w k;
    public final com.google.android.finsky.y.a l;
    public final com.google.android.finsky.detailscomponents.g m;
    public final com.google.android.finsky.activities.gm n;
    public final com.google.android.finsky.frameworkviews.ah o;
    public final com.google.android.finsky.d.w p;
    public final FinskyHeaderListLayout q;
    public final com.google.android.finsky.bl.a r;
    public final android.support.v7.widget.ff s;
    public final int t;
    public List u;
    public final com.google.android.finsky.d.ad v;
    public final com.google.android.finsky.activities.gi w;
    public final boolean x;
    public int y;
    public int z;

    gk(Context p0, LayoutInflater p1, com.google.android.finsky.bg.k p2, com.google.android.finsky.navigationmanager.a p3, DfeToc p4, com.google.android.finsky.api.c p5, com.google.android.finsky.y.a p6, com.google.android.finsky.detailscomponents.g p7, com.google.android.play.image.w p8, ab[] p9, int p10, com.google.android.finsky.utils.ac p11, com.google.android.finsky.d.ad p12, com.google.android.finsky.activities.gm p13, com.google.android.finsky.frameworkviews.ah p14, FinskyHeaderListLayout p15, int p16, com.google.android.finsky.d.w p17, j[] p18, com.google.android.finsky.pagesystem.f p19, android.support.v7.widget.ff p20, com.google.android.finsky.pagesystem.g p21, com.google.android.finsky.d.al p22) {
        android.support.v4.view.af();
        com.google.android.finsky.m.a.aO();
        this.u = new ArrayList();
        this.d = p0;
        this.e = p1;
        this.f = p2;
        this.g = p3;
        this.i = p4;
        this.j = p5;
        this.l = p6;
        this.m = p7;
        this.k = p8;
        this.o = p14;
        this.C = p19;
        this.q = p15;
        this.c = p10;
        this.v = p12;
        this.y = -1;
        this.n = p13;
        this.s = p20;
        this.h = p21;
        this.t = p16;
        this.D = p22;
        this.a(p9, p11, p18);
        if (!com.google.android.play.utils.k.b(this.d))
            v4 = 1;
        else
            v4 = 0;
        this.A = v4;
        this.B = 0;
        this.p = p17;
        this.r = com.google.android.finsky.m.a.bT();
        if (com.google.android.finsky.m.a.dj().a(12641966) && !this.k())
            v4 = 1;
        else
            v4 = 0;
        this.x = v4;
        if (this.x != 0)
            v4 = 1;
        else
            v4 = 0;
        this.w = new com.google.android.finsky.activities.gi(v4, this);
    }

    private final void a(ab[] p0, com.google.android.finsky.utils.ac p1, j[] p2) {
        v3 = 1;
        this.u.clear();
        v0 = 0;
        while (v0 < p0.length) {
            if (p0[v0].i.length > 0)
                v2 = 1;
            else
                v2 = 0;
            v6 = new com.google.android.finsky.activities.gl(p0[v0], v2);
            if (v2 != 0)
                v2 = 401;
            else
                v2 = 403;
            v6.f = new com.google.android.finsky.d.ai(v2, p0[v0].d, this.v);
            if (p2 != 0)
                v2 = p2[v0];
            else
                v2 = 0;
            v6.g = v2;
            this.u.add(v6);
            v0 = v0 + 1;
        }
        if (p1 != 0 && p1.a("TabbedAdapter.TabInstanceStates"))
            v6 = p1.c("TabbedAdapter.TabInstanceStates");
        else
            v6 = 0;
        if (p1 != 0 && p1.a("TabbedAdapter.TabDfeLists")) {
            v4 = p1.c("TabbedAdapter.TabDfeLists");
            if (v4 != 0) {
                v2 = v4.iterator();
                while (v2.hasNext()) {
                    v0 = (com.google.android.finsky.dfemodel.u)v2.next();
                    if (v0 == 0)
                        continue;
                    v0.a(this.j);
                }
            }
            v5 = v4;
        }
        else
            v5 = 0;
        if (v5 != 0 && v5.size() == this.u.size())
            v4 = 1;
        else
            v4 = 0;
        if (v6 == 0 || v6.size() != this.u.size())
            v3 = 0;
        v2 = 0;
        while (v2 < p0.length) {
            v0 = (com.google.android.finsky.activities.gl)this.u.get(v2);
            if (v4 != 0)
                v0.b = (com.google.android.finsky.dfemodel.u)v5.get(v2);
            if (v3 != 0)
                v0.d = (com.google.android.finsky.utils.ac)v6.get(v2);
            v2 = v2 + 1;
        }
    }

    private final boolean k() {
        if (this.r.a(this.i) && this.g.a())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void B() {
        if (this.x != 0 && this.w.b == 1 && this.w.g == 0) {
            this.w.a();
            this.w.g = 1;
        }
        if (this.h != 0 && this.z == -1)
            this.h.B();
    }

    public final void L_() {
        this.w.a();
    }

    public final int a() {
        return this.u.size();
    }

    public final CharSequence a(int p0) {
        if (p0 >= this.u.size())
            v0 = "";
        else
            v0 = ((com.google.android.finsky.activities.gl)this.u.get(p0)).a.c.toUpperCase();
        return v0;
    }

    public final Object a(ViewGroup p0, int p1) {
        v49 = com.google.android.libraries.bind.b.c.a(this, p1);
        if (v49 == this.c)
            v22 = 1;
        else
            v22 = 0;
        v8 = (com.google.android.finsky.activities.gl)this.u.get(v49);
        v12 = com.google.android.finsky.m.a.dj();
        v4 = v12.a(12632600);
        if (this.x != 0) {
            if (this.w.e != 0 || v49 != this.y && this.z == -1)
                v2 = 1;
            else
                v2 = 0;
            v35 = v2;
        }
        else {
            if (this.w.e != 0 || v4 != 0 && v49 != this.y)
                v2 = 1;
            else
                v2 = 0;
            v35 = v2;
        }
        if (this.a() > 1)
            v10 = 0;
        else
            v10 = 2;
        if (v8.e != 0) {
            if (com.google.android.finsky.m.a.dj().a(12637322))
                this.D.a(1733, v8.a.d, 0, 1);
            if (com.google.android.finsky.m.a.P().h != 0 && v12.a(12638373))
                v12 = 1;
            else
                v12 = 0;
            v3 = new com.google.android.finsky.activities.bm(this.d, this.g, this.f, this.k, this.e, v8, this.i, v10, this.q, v12, this.p);
        }
        else {
            if (com.google.android.finsky.m.a.dj().a(12637322)) {
                if (!this.k())
                    v2 = 1;
                else
                    v2 = 0;
                this.D.a(1733, v8.a.d, 0, v2);
            }
            if (v8.b == 0)
                v8.b = com.google.android.finsky.dfemodel.l.a(com.google.android.finsky.dfemodel.l.a(this.j, v8.a.f));
            if (this.k()) {
                if (this.r.h())
                    v11 = new com.google.android.finsky.ia2.d(this.d, this.g, this.j, this.e, v8, v10, this.o, this.s, this.q, this.r, v22, this.C, v8.a.d, this.p, this.D, this);
                else
                    v11 = new com.google.android.finsky.ia2.c(this.d, this.g, this.j, this.e, v8, v10, this.o, this.s, this.q, this.r, v22, this.C, v8.a.d, this.p, this.D, this.h);
                v3 = v11;
            }
            else {
                if (com.google.android.finsky.m.a.P().h != 0 && v12.a(12637256))
                    v45 = 1;
                else
                    v45 = 0;
                if (this.x != 0)
                    v46 = this;
                else
                    v46 = this.h;
                if (v4 != 0) {
                    if (v35 != 0 || this.x != 0)
                        v47 = 0;
                    else
                        v47 = this;
                }
                v3 = new com.google.android.finsky.activities.ek(this.d, com.google.android.finsky.m.a.aN(), this.f, this.g, this.k, this.j, this.e, v8, this.i, this.l, this.m, v35, v10, this.n, this.o, this.p, v8.g, v22, this.C, this.s, this.q, v45, v46, v47, this.D);
            }
        }
        v3.a(v8.d);
        if (this.y == v49)
            v2 = 1;
        else
            v2 = 0;
        v3.a(v2);
        v8.c = v3;
        p0.addView(v3.a());
        if (v35 != 0 && v3 instanceof com.google.android.finsky.activities.ek)
            this.w.d.add((com.google.android.finsky.activities.ek)v3);
        if (this.E != 0)
            this.E.c(p1);
        return v3;
    }

    public final void a(ViewGroup p0, int p1, Object p2) {
        if (this.B == 0) {
            p0.removeView(((com.google.android.finsky.activities.gt)p2).a());
            v0 = (com.google.android.finsky.activities.gl)this.u.get(com.google.android.libraries.bind.b.c.a(this, p1));
            v0.d = v0.c.b();
            v0.c = 0;
            if (this.E != 0)
                this.E.d(p1);
        }
    }

    public final void a(com.google.android.finsky.ea.d p0) {
        this.E = p0;
    }

    public final void a(boolean p0) {
        if (this.A != p0) {
            this.A = p0;
            this.M_();
        }
    }

    public final boolean a(View p0, Object p1) {
        if (this.B == 0 && ((com.google.android.finsky.activities.gt)p1).a() == p0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final float b(int p0) {
        if (p0 == 0 && this.u.size() > 1 && ((com.google.android.finsky.activities.gl)this.u.get(0)).e != 0)
            v0 = (float)this.d.getResources().getInteger(2131820549) / 1120403456;
        else
            v0 = 1065353216;
        return v0;
    }

    public final void b() {
    }

    public final void c(int p0) {
        v1 = 0;
        while (v1 < this.u.size()) {
            v0 = (com.google.android.finsky.activities.gl)this.u.get(v1);
            if (v0.c != 0) {
                if (v1 != p0)
                    v0.c.a(0);
            }
            v1 = v1 + 1;
        }
        v0 = (com.google.android.finsky.activities.gl)this.u.get(p0);
        if (v0.c != 0)
            v0.c.a(1);
        if (this.y != p0) {
            this.z = this.y;
            this.y = p0;
        }
    }

    public final void d(int p0) {
        if (this.k() && this.r.h()) {
            v1 = com.google.android.libraries.bind.b.c.a(this, p0);
            v0 = ((com.google.android.finsky.activities.gl)this.u.get(v1)).c;
            if (this.z == -1 && v1 == this.y)
                v1 = 1;
            else
                v1 = 0;
            ((com.google.android.finsky.ia2.d)v0).b(v1);
        }
    }

    public final boolean d() {
        if (Math.abs(this.y - this.z) <= this.t)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final com.google.android.finsky.activities.ek e() {
        return (com.google.android.finsky.activities.ek)((com.google.android.finsky.activities.gl)this.u.get(this.y)).c;
    }

    final ArrayList f() {
        if (this.u == 0 || this.u.isEmpty())
            v0 = 0;
        else {
            v1 = new ArrayList();
            v2 = this.u.iterator();
            while (v2.hasNext())
                v1.add(((com.google.android.finsky.activities.gl)v2.next()).b);
            v0 = v1;
        }
        return v0;
    }

    public final boolean g() {
        return this.A;
    }

    public final int h() {
        v0 = ((com.google.android.finsky.activities.gl)this.u.get(this.y)).c;
        if (v0 != 0) {
            if (v0 instanceof com.google.android.finsky.ia2.c)
                v0 = ((com.google.android.finsky.ia2.c)v0).c.e;
            else if (v0 instanceof com.google.android.finsky.ia2.d)
                v0 = ((com.google.android.finsky.ia2.d)v0).b.a();
            else
                v0 = 0;
        }
        else
            v0 = 0;
        return v0;
    }

    public final void i() {
        this.E = 0;
    }

    public final void j() {
        if (this.k() && this.r.h()) {
            if (this.E != 0)
                this.E.e(this.E.a.a());
            if (this.h != 0 && this.z == -1)
                this.h.B();
        }
    }

}
