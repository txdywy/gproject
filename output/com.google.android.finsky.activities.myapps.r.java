package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.support.v4.view.af;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.activities.b;
import com.google.android.finsky.activities.gt;
import com.google.android.finsky.api.c;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.by.c;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.ai;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.u;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.libraries.bind.b.c;
import com.google.android.play.utils.k;
import com.google.wireless.android.finsky.dfe.a.a.m;
import com.google.wireless.android.finsky.dfe.a.a.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class com.google.android.finsky.activities.myapps.r extends android.support.v4.view.af implements com.google.android.libraries.bind.b.a
{

    public final Context c;
    public final com.google.android.finsky.navigationmanager.a d;
    public final com.google.android.finsky.api.c e;
    public final DfeToc f;
    public final List g;
    public final com.google.android.finsky.frameworkviews.ah h;
    public int i;
    public com.google.android.finsky.d.ad j;
    public boolean k;
    public boolean l;
    public final com.google.android.finsky.activities.myapps.t m;
    public com.google.android.finsky.d.w n;

    r(Context p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.finsky.api.c p2, DfeToc p3, com.google.android.finsky.frameworkviews.ah p4, com.google.android.finsky.utils.ac p5, com.google.android.finsky.d.ad p6, com.google.wireless.android.finsky.dfe.a.a.m p7, boolean p8, com.google.android.finsky.activities.myapps.t p9, com.google.android.finsky.d.w p10) {
        android.support.v4.view.af();
        this.g = new ArrayList();
        this.c = p0;
        this.d = p1;
        this.e = p2;
        this.f = p3;
        this.h = p4;
        this.i = 0;
        if (p8 != 0 && com.google.android.finsky.m.a.dj().a(12609286))
            v0 = 1;
        else
            v0 = 0;
        this.k = v0;
        this.j = p6;
        this.a(p5, p7);
        if (!com.google.android.play.utils.k.b(p0))
            v0 = 1;
        else
            v0 = 0;
        this.l = v0;
        this.m = p9;
        this.n = p10;
    }

    private final void a(com.google.android.finsky.utils.ac p0, com.google.wireless.android.finsky.dfe.a.a.m p1) {
        if (p0 != 0 && p0.a("MyAppsTabbedAdapterV2.TabBundles"))
            v9 = p0.c("MyAppsTabbedAdapterV2.TabBundles");
        else
            v9 = 0;
        if (p0 != 0 && p0.a("MyAppsTabbedAdapterV2.TabLists")) {
            v2 = p0.c("MyAppsTabbedAdapterV2.TabLists");
            if (v2 != 0) {
                v3 = v2.iterator();
                while (v3.hasNext()) {
                    v1 = (com.google.android.finsky.dfemodel.u)v3.next();
                    if (v1 == 0)
                        continue;
                    v1.a(this.e);
                }
            }
            v7 = v2;
        }
        else
            v7 = 0;
        this.g.clear();
        v8 = 0;
        while (v8 < p1.b.length) {
            switch (p1.b[v8].c) {
                case 1:
                    v3 = this.d(2131952546);
                    break;
                case 2:
                    v3 = this.d(2131952547);
                    break;
                case 3:
                    v3 = this.d(2131952548);
                    break;
                default:
                    v4 = new Object[1];
                    v4[0] = Integer.valueOf(p1.b[v8].c);
                    FinskyLog.e("Unknown tab type: %d", v4);
                    v3 = 0;
                    break;
            }
            switch (p1.b[v8].c) {
                case 1:
                    v5 = 405;
                    break;
                case 2:
                    v5 = 406;
                    break;
                case 3:
                    v5 = 457;
                    break;
                default:
                    v14 = new Object[1];
                    v14[0] = Integer.valueOf(p1.b[v8].c);
                    FinskyLog.e("Unknown tab type: %d", v14);
                    v5 = 0;
                    break;
            }
            this.g.add(new com.google.android.finsky.activities.myapps.s(p1.b[v8].c, v3, this.j, v5, p1.b[v8].d));
            v8 = v8 + 1;
        }
        if (this.k != 0)
            this.g.add(new com.google.android.finsky.activities.myapps.s(this.d(2131952545), this.j));
        if (v9 != 0 && v9.size() == this.g.size())
            v5 = 1;
        else
            v5 = 0;
        if (v7 != 0 && v7.size() == this.g.size())
            v3 = 1;
        else
            v3 = 0;
        v4 = 0;
        while (v4 < this.g.size()) {
            if (v5 != 0)
                ((com.google.android.finsky.activities.myapps.s)this.g.get(v4)).e = (com.google.android.finsky.utils.ac)v9.get(v4);
            if (v3 != 0)
                ((com.google.android.finsky.activities.myapps.s)this.g.get(v4)).g = (com.google.android.finsky.dfemodel.u)v7.get(v4);
            v4 = v4 + 1;
        }
    }

    private final String d(int p0) {
        return this.c.getString(p0).toUpperCase(Locale.getDefault());
    }

    public final int a() {
        return this.g.size();
    }

    public final CharSequence a(int p0) {
        return ((com.google.android.finsky.activities.myapps.s)this.g.get(p0)).b;
    }

    public final Object a(ViewGroup p0, int p1) {
        v16 = com.google.android.libraries.bind.b.c.a(this, p1);
        v15 = (com.google.android.finsky.activities.myapps.s)this.g.get(v16);
        v2 = v15.d;
        if (v2 == 0) {
            switch (v15.a) {
                case -2:
                    if (this.c instanceof com.google.android.finsky.activities.b)
                        v2 = new com.google.android.finsky.activities.myapps.b((com.google.android.finsky.activities.b)this.c, this.e, this.f, this.d, com.google.android.finsky.m.a.ah().a(this.e.b()), v15.f, this.n);
                    break;
                default:
                    if (com.google.android.finsky.m.a.dj().a(12637256) && com.google.android.finsky.m.a.P().h != 0)
                        v11 = 1;
                    else
                        v11 = 0;
                    if (v16 == 0)
                        v14 = this.m;
                    else
                        v14 = 0;
                    v2 = new com.google.android.finsky.activities.myapps.o(this.c, v15.c, this.e, v15.g, this.f, this.d, this.h, (FinskyHeaderListLayout)this.m.bt, v11, v15.f, this.n, v14);
                    break;
            }
        }
        v15.d = v2;
        p0.addView(v2.a());
        v2.a(v15.e);
        if (v16 == this.i)
            this.c(v16);
        if (v2 instanceof com.google.android.finsky.activities.myapps.m) {
            v2 = (com.google.android.finsky.activities.myapps.m)v2;
            v2.g();
            if (v2.i())
                v2.m_();
        }
        else {
            v2 = (com.google.android.finsky.activities.myapps.o)v2;
            v2.c();
        }
        return v2;
    }

    public final void a(ViewGroup p0, int p1, Object p2) {
        p0.removeView(((com.google.android.finsky.activities.gt)p2).a());
        v0 = (com.google.android.finsky.activities.myapps.s)this.g.get(com.google.android.libraries.bind.b.c.a(this, p1));
        v0.e = v0.d.b();
        if (v0.d instanceof com.google.android.finsky.activities.myapps.o)
            v1 = ((com.google.android.finsky.activities.myapps.o)v0.d).r;
        else
            v1 = 0;
        v0.g = v1;
        v0.d = 0;
    }

    public final void a(boolean p0) {
        if (this.l != p0) {
            this.l = p0;
            this.M_();
        }
    }

    public final boolean a(View p0, Object p1) {
        if (((com.google.android.finsky.activities.gt)p1).a() == p0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void b() {
    }

    final void c(int p0) {
        v0 = (com.google.android.finsky.activities.myapps.s)this.g.get(p0);
        if (v0.d != 0) {
            if (this.i == p0)
                v1 = 1;
            else
                v1 = 0;
            v0.f.a(v1);
            v0.d.a(v1);
            if (v1 != 0) {
                com.google.android.finsky.d.j.c(v0.f);
                com.google.android.finsky.d.j.a((ViewGroup)v0.d.a());
            }
        }
    }

    public final int e() {
        v1 = 0;
        while (v1 < this.g.size()) {
            if (((com.google.android.finsky.activities.myapps.s)this.g.get(v1)).a == 3)
                return v1;
            v1 = v1 + 1;
        }
        v1 = -1;
        return v1;
    }

    public final void f() {
        if (this.e() >= 0) {
            v0 = this.g.get(this.e());
            if (((com.google.android.finsky.activities.myapps.s)v0).d instanceof com.google.android.finsky.activities.myapps.o)
                ((com.google.android.finsky.activities.myapps.o)((com.google.android.finsky.activities.myapps.s)v0).d).d();
        }
    }

    public final boolean g() {
        return this.l;
    }

}
