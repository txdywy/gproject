package com.google.android.finsky.billing.acquire;

import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import android.view.View;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import com.google.android.finsky.billing.acquire.a.a;
import com.google.android.finsky.billing.acquire.a.b;
import com.google.android.finsky.billing.acquire.a.c;
import com.google.android.finsky.billing.acquire.a.f;
import com.google.android.finsky.billing.acquire.a.h;
import com.google.android.finsky.billing.acquire.a.i;
import com.google.android.finsky.billing.acquire.a.k;
import com.google.android.finsky.billing.b.d;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dialogbuilder.a.a;
import com.google.android.finsky.dialogbuilder.a.aa;
import com.google.android.finsky.dialogbuilder.a.ac;
import com.google.android.finsky.dialogbuilder.a.ae;
import com.google.android.finsky.dialogbuilder.a.c;
import com.google.android.finsky.dialogbuilder.a.d;
import com.google.android.finsky.dialogbuilder.a.g;
import com.google.android.finsky.dialogbuilder.a.i;
import com.google.android.finsky.dialogbuilder.a.j;
import com.google.android.finsky.dialogbuilder.a.l;
import com.google.android.finsky.dialogbuilder.a.n;
import com.google.android.finsky.dialogbuilder.a.o;
import com.google.android.finsky.dialogbuilder.a.p;
import com.google.android.finsky.dialogbuilder.a.q;
import com.google.android.finsky.dialogbuilder.a.r;
import com.google.android.finsky.dialogbuilder.a.s;
import com.google.android.finsky.dialogbuilder.a.u;
import com.google.android.finsky.dialogbuilder.a.x;
import com.google.android.finsky.dialogbuilder.a.z;
import com.google.android.finsky.dialogbuilder.b.h;
import com.google.android.finsky.dialogbuilder.b.j;
import com.google.android.finsky.dialogbuilder.c;
import com.google.android.finsky.dialogbuilder.d;
import com.google.android.finsky.dialogbuilder.e;
import com.google.android.finsky.dialogbuilder.j;
import com.google.android.finsky.dialogbuilder.layout.n;
import com.google.android.finsky.providers.d;
import com.google.protobuf.nano.b;
import com.google.wireless.android.finsky.dfe.c.a.ah;
import com.google.wireless.android.finsky.dfe.c.a.bu;
import com.google.wireless.android.finsky.dfe.c.a.cz;
import com.google.wireless.android.finsky.dfe.c.a.r;
import com.google.wireless.android.finsky.dfe.c.a.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.billing.acquire.e implements com.google.android.finsky.dialogbuilder.g
{

    public final com.google.android.finsky.billing.b.d a;
    public final com.google.android.finsky.dialogbuilder.layout.n b;
    public final View c;
    public final boolean d;
    public final com.google.android.finsky.billing.acquire.a.a e;
    public final com.google.android.finsky.dialogbuilder.b.h f;
    public final com.google.android.finsky.dialogbuilder.b.j g;
    public final ArrayList h;

    e(com.google.android.finsky.billing.b.d p0, com.google.android.finsky.dialogbuilder.layout.n p1, View p2, boolean p3, com.google.android.finsky.billing.acquire.a.a p4, com.google.android.finsky.dialogbuilder.b.h p5, com.google.android.finsky.dialogbuilder.b.j p6) {
        this.h = new ArrayList();
        ((com.google.android.finsky.billing.acquire.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.acquire.d)).b();
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.g = p6;
    }

    public final void a() {
        v2 = 0;
        while (v2 < ((ArrayList)this.h).size()) {
            v1 = ((ArrayList)this.h).get(v2);
            v2 = v2 + 1;
            ((com.google.android.finsky.dialogbuilder.a.n)v1).b();
        }
    }

    public final void a(com.google.android.finsky.dialogbuilder.e p0, com.google.wireless.android.finsky.dfe.c.a.cz p1, com.google.wireless.android.finsky.dfe.c.a.bu p2, boolean p3) {
        v7 = (com.google.wireless.android.finsky.dfe.c.a.ah)p1.b(com.google.wireless.android.finsky.dfe.c.a.ah.a);
        this.a();
        this.h.clear();
        if (p3 != 0) {
            if (this.g.d == 0)
                this.g.b.clear();
        }
        else
            this.g.d = 1;
        this.g.e.clear();
        this.g.f.clear();
        this.g.h.clear();
        this.g.g.clear();
        this.g.c = 0;
        this.f.b();
        if (this.d != 0) {
            this.c.setVisibility(0);
            if (this.b.h() != 0 && this.b.h().getWindow() != 0) {
                v1 = this.b.h().getWindow();
                v2 = v1.getAttributes();
                v2.flags = v2.flags | 2;
                v1.setAttributes(v2);
            }
        }
        this.b.Y();
        v9 = new ArrayList();
        v10 = new ArrayList();
        v8 = 0;
        while (v8 < v7.b.length) {
            v14 = v7.b[v8];
            v2 = this.e.e.a(v14.d);
            if (v14.e != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.ae(v2, v14.e);
            else if (v14.i != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.j(v2, v14.i, this.e.d);
            else if (v14.j != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.i(v2, v14.j, this.e.d);
            else if (v14.v != 0)
                v2 = new com.google.android.finsky.billing.acquire.a.b(v2, v14.v, this.e.h);
            else if (v14.g != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.d(v2, v14.g, this.e.h, this.e.g);
            else if (v14.h != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.p(v2);
            else if (v14.x != 0)
                v2 = new com.google.android.finsky.billing.acquire.a.c(v2, v14.x, this.e.h);
            else if (v14.w != 0)
                v2 = new com.google.android.finsky.billing.acquire.a.k(v2, v14.w, this.e.c, this.e.f);
            else if (v14.k != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.x(v2, v14.k);
            else if (v14.l != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.s(v2, v14.l);
            else if (v14.m != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.ac(v2, v14.m, this.e.g);
            else if (v14.y != 0)
                v2 = new com.google.android.finsky.billing.acquire.a.f(v2, v14.y, this.e.a);
            else if (v14.n != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.c(v2, v14.n);
            else if (v14.u != 0)
                v2 = new com.google.android.finsky.billing.acquire.a.h(v14.u, this.e.b);
            else if (v14.o != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.o(v2, v14.o);
            else if (v14.z != 0)
                v2 = new com.google.android.finsky.billing.acquire.a.i(v2, v14.z);
            else if (v14.p != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.z(v2, v14.p);
            else if (v14.q != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.aa(v2, v14.q, this.e.g, this.e.f);
            else if (v14.s != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.g(v2, v14.s, this.e.g, this.e.f, this.e.h);
            else if (v14.r != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.u(v2, v14.r, this.e.g, this.e.f);
            else if (v14.f != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.q(v2, v14.f);
            else if (v14.t != 0)
                v2 = new com.google.android.finsky.dialogbuilder.a.r(v2, v14.t);
            else
                v2 = 0;
            if (v2 != 0) {
                if (v2 instanceof com.google.android.finsky.dialogbuilder.a.n)
                    this.h.add((com.google.android.finsky.dialogbuilder.a.n)v2);
                v2 = v2.a(p0, this.b.aa());
                com.google.android.finsky.dialogbuilder.j.a(v14.c, v2, p0);
                this.g.a(v2, v14.c, this.a.a(v14.b, v14.c));
                v9.add(v2);
            }
            v8 = v8 + 1;
        }
        v2 = 0;
        while (v2 < v7.c.length) {
            v6 = v7.c[v2];
            v7 = this.e;
            v8 = v7.e.a(v6.d);
            if (v6.e != 0) {
                v7 = v7.f;
                v1 = new com.google.android.finsky.dialogbuilder.a.a(v8, v6.e, v7);
            }
            else
                v1 = 0;
            if (v1 != 0) {
                this.a.a(v6.b, 0);
                v1 = v1.a(p0, this.b.ac());
                com.google.android.finsky.dialogbuilder.j.a(v6.c, v1, p0);
                v10.add(v1);
            }
            v2 = v2 + 1;
        }
        this.b.a(v9, v10, p2, p1.d);
        this.g.a();
        this.b();
    }

    public final void b() {
        v2 = 0;
        while (v2 < ((ArrayList)this.h).size()) {
            v1 = ((ArrayList)this.h).get(v2);
            v2 = v2 + 1;
            ((com.google.android.finsky.dialogbuilder.a.n)v1).c();
        }
    }

    public final void c() {
        this.b.X();
        v1 = new com.google.android.finsky.d.o(this.a.j);
        v1.a(com.google.android.finsky.dialogbuilder.d.d);
        this.a.f.a(new com.google.android.finsky.d.p().a(v1).a(), 0);
    }

}
