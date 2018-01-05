package com.google.android.finsky.billing.myaccount;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bb.b;
import com.google.android.finsky.bb.c;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.myaccount.layout.AccountPaymentMethodsActionRowView;
import com.google.android.finsky.billing.myaccount.layout.AccountPaymentMethodsCreatableInstrumentRowView;
import com.google.android.finsky.billing.myaccount.layout.AccountPaymentMethodsExistingInstrumentRowView;
import com.google.android.finsky.billing.myaccount.layout.AccountSeparatorRowView;
import com.google.android.finsky.billing.profile.m;
import com.google.android.finsky.billing.profile.q;
import com.google.android.finsky.billing.profile.w;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.recyclerview.g;
import com.google.android.finsky.recyclerview.h;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.a.a.ak;
import com.google.wireless.android.finsky.a.a.ao;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.google.wireless.android.finsky.dfe.nano.v;
import java.util.ArrayList;

final class com.google.android.finsky.billing.myaccount.l extends com.google.android.finsky.recyclerview.h
{

    public final Context c;
    public final com.google.android.finsky.billing.profile.m d;
    public com.google.wireless.android.finsky.dfe.nano.u e;
    public final com.google.android.finsky.d.ad f;
    public final com.google.android.finsky.d.ad g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final LayoutInflater n;
    public final ArrayList o;
    public final ArrayList p;
    public final com.google.android.finsky.d.w q;
    public final com.google.android.finsky.accounts.c r;
    public final com.google.android.finsky.bb.b s;
    public final com.google.android.finsky.bg.l t;
    public final com.google.android.finsky.ba.c u;
    public boolean v;
    public ao[] w;
    public boolean x;

    l(Context p0, com.google.android.finsky.billing.profile.m p1, com.google.android.finsky.accounts.c p2, com.google.android.finsky.bb.b p3, com.google.android.finsky.bg.l p4, com.google.android.finsky.ba.c p5, com.google.android.finsky.d.ad p6, com.google.android.finsky.d.ad p7, com.google.android.finsky.d.w p8) {
        v0 = 0;
        com.google.android.finsky.recyclerview.h();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.c = p0;
        this.d = p1;
        this.r = p2;
        this.s = p3;
        this.t = p4;
        this.u = p5;
        this.f = p6;
        this.g = p7;
        this.q = p8;
        this.h = FinskyHeaderListLayout.a(p0, 2, 0);
        this.i = this.c.getResources().getDimensionPixelSize(2131624020);
        this.j = this.c.getResources().getDimensionPixelSize(2131624021);
        this.k = this.c.getResources().getDimensionPixelSize(2131624019);
        this.l = this.c.getResources().getDimensionPixelSize(2131624023);
        this.n = LayoutInflater.from(this.c);
        if (!this.u.dj().a(12603133))
            v0 = 1;
        this.v = v0;
        this.m = this.h + this.j + this.l;
    }

    private final void a(int p0, Object[] p1, int p2) {
        v3 = Math.min(p2, p1.length);
        v2 = 0;
        while (v2 < v3) {
            if (v2 == v3 - 1)
                v0 = 1;
            else
                v0 = 0;
            this.o.add(new com.google.android.finsky.billing.myaccount.p(p0, p1[v2], v0));
            v2 = v2 + 1;
        }
        if (p1.length > p2)
            this.o.add(new com.google.android.finsky.billing.myaccount.p(7, Integer.valueOf(this.o.size())));
        v0 = v2;
        while (v0 < p1.length) {
            this.p.add(p1[v0]);
            v0 = v0 + 1;
        }
    }

    private final void b(ao[] p0) {
        v0 = 0;
        this.x = 0;
        v1 = new ArrayList();
        while (v0 < p0.length) {
            if (p0[v0].y != 0)
                v1.add(p0[v0]);
            if (p0[v0].w != 0)
                this.x = 1;
            v0 = v0 + 1;
        }
        this.w = (ao[])v1.toArray(new ao[v1.size()]);
    }

    private final boolean c() {
        v1 = 1;
        if (!this.s.c().h()) {
            v1 = 0;
            return v1;
        }
        if (this.x == 0)
            v1 = 0;
        else {
            if (this.w.length > 0)
                v0 = 1;
            else
                v0 = 0;
            v3 = 0;
            while (v3 < this.w.length) {
                if (this.w[v3].w != 0) {
                    if (this.w.length <= 1)
                        v1 = 0;
                    return v1;
                }
                v3 = v3 + 1;
            }
            v1 = v0;
        }
        return v1;
    }

    public final int a() {
        return this.o.size();
    }

    public final int a(int p0) {
        return ((com.google.android.finsky.billing.myaccount.p)this.o.get(p0)).a;
    }

    public final android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        switch (p1) {
            case 0:
                v0 = this.n.inflate(2130968970, p0, 0);
                break;
            case 1:
                v0 = this.n.inflate(2130968606, p0, 0);
                break;
            case 2:
                v0 = this.n.inflate(2130968604, p0, 0);
                break;
            case 3:
                v0 = this.n.inflate(2130968608, p0, 0);
                break;
            case 4:
                v0 = this.n.inflate(2130968603, p0, 0);
                break;
            case 5:
                v0 = this.n.inflate(2130968603, p0, 0);
                break;
            case 6:
                v0 = this.n.inflate(2130968605, p0, 0);
                break;
            case 7:
                v0 = this.n.inflate(2130968609, p0, 0);
                break;
            default:
                throw new IllegalStateException(47 + "Unknown type for onCreateViewHolder " + p1);
        }
        return new com.google.android.finsky.recyclerview.g(v0);
    }

    final void a(int p0, Object[] p1) {
        this.a(p0, p1, 2147483647);
    }

    public final void a(android.support.v7.widget.fr p0, int p1) {
        v2 = ((com.google.android.finsky.recyclerview.g)p0).a;
        switch (((com.google.android.finsky.recyclerview.g)p0).f) {
            case 0:
                v2.getLayoutParams().height = this.h;
                break;
            case 1:
                v0 = (com.google.android.finsky.billing.myaccount.p)this.o.get(p1);
                v1 = (com.google.wireless.android.finsky.a.a.ao)v0.b;
                if (this.d.al == 0)
                    throw new IllegalStateException("Cannot create edit instrument click listener without the billing profile.");
                if (!TextUtils.isEmpty(v1.u) && v1.t != 0 && v1.t.length > 0)
                    v3 = new com.google.android.finsky.billing.profile.q(this.d, v1, this.q, this.f);
                else
                    v3 = 0;
                v2 = (AccountPaymentMethodsExistingInstrumentRowView)v2;
                v2.k = v0.c;
                if (v2.a.dj().a(12622358)) {
                    v0 = 1;
                    v4 = v2;
                }
                else if (v0.c == 0) {
                    v0 = 1;
                    v4 = v2;
                }
                else {
                    v0 = 0;
                    v4 = v2;
                }
                v4.setShouldDrawSeparator(v0);
                v2.g.setText(v1.d);
                if (v1.e != 0) {
                    v2.b.a(v2.e, v1.e.f, v1.e.i);
                    v2.e.setVisibility(0);
                }
                else
                    v2.e.setVisibility(8);
                if (v1.e()) {
                    v2.h.setText(v1.x);
                    v2.h.setVisibility(0);
                }
                else
                    v2.h.setVisibility(8);
                if (v1.r.length > 0)
                    v0 = v1.r[0].d;
                else
                    v0 = 0;
                if (!TextUtils.isEmpty(v0)) {
                    v2.i.setText(v0);
                    v2.i.setVisibility(0);
                }
                else
                    v2.i.setVisibility(8);
                if (!TextUtils.isEmpty(v1.u) && v1.t != 0 && v1.t.length > 0) {
                    v2.j.setText(v1.u.toUpperCase());
                    v2.j.setVisibility(0);
                    v2.setOnClickListener(v3);
                }
                else {
                    v2.j.setVisibility(8);
                    v2.setOnClickListener(0);
                    v2.setClickable(0);
                }
                com.google.android.finsky.d.j.a(v2.c, v1.v);
                v2.d = this.f;
                v2.d.a(v2);
                break;
            case 2:
                v0 = (com.google.android.finsky.billing.myaccount.p)this.o.get(p1);
                v1 = (com.google.wireless.android.finsky.dfe.nano.v)v0.b;
                v4 = this.d.a(v1, this.d.al.e, this.g, this.q);
                v2 = (AccountPaymentMethodsCreatableInstrumentRowView)v2;
                v2.g = v0.c;
                if (v2.a.dj().a(12622358)) {
                    v0 = 1;
                    v3 = v2;
                }
                else if (v0.c == 0) {
                    v0 = 1;
                    v3 = v2;
                }
                else {
                    v0 = 0;
                    v3 = v2;
                }
                v3.setShouldDrawSeparator(v0);
                v2.f.setText(v1.e);
                if (v1.f != 0) {
                    v2.b.a(v2.e, v1.f.f, v1.f.i);
                    v2.e.setVisibility(0);
                }
                else
                    v2.e.setVisibility(8);
                v2.setOnClickListener(v4.f);
                v2.c.b(v4.h);
                com.google.android.finsky.d.j.a(v2.c, v1.g);
                v2.d = this.g;
                v2.d.a(v2);
                break;
            case 3:
                v0 = (com.google.android.finsky.billing.myaccount.p)this.o.get(p1);
                if (v0.b != 0) {
                    ((TextView)v2).setText((String)v0.b);
                    v2.setPadding(this.k, v2.getPaddingTop(), this.k, v2.getPaddingBottom());
                    v2.getLayoutParams().height = this.j;
                }
                else {
                    v2.getLayoutParams().height = this.i;
                    v2.setPadding(0, 0, 0, 0);
                }
                break;
            case 4:
                ((AccountPaymentMethodsActionRowView)v2).a(2131952503, 2131361879, new com.google.android.finsky.billing.myaccount.m(this), ((com.google.android.finsky.billing.myaccount.p)this.o.get(p1)).c, 2623, this.f);
                break;
            case 5:
                ((AccountPaymentMethodsActionRowView)v2).a(2131951814, 2131361820, new com.google.android.finsky.billing.myaccount.n(this, v2), ((com.google.android.finsky.billing.myaccount.p)this.o.get(p1)).c, 2629, this.f);
                break;
            case 6:
                v0 = (FifeImageView)v2.findViewById(16908294);
                if (this.e.q != 0) {
                    v0.setVisibility(0);
                    this.t.a(v0, this.e.q.f, this.e.q.i);
                }
                else
                    v0.setVisibility(8);
                ((TextView)v2.findViewById(16908308)).setText(this.e.r);
                this.f.a(new com.google.android.finsky.d.o(2632, this.f));
                break;
            case 7:
                ((TextView)v2.findViewById(16908310)).setText(this.e.n);
                v2.setOnClickListener(new com.google.android.finsky.billing.myaccount.o(this, (com.google.android.finsky.billing.myaccount.p)this.o.get(p1)));
                this.f.a(new com.google.android.finsky.d.o(2631, this.f));
                break;
            default:
                throw new IllegalStateException(45 + "Unknown type for onBindViewHolder " + ((com.google.android.finsky.recyclerview.g)p0).f);
        }
    }

    public final void a(ao[] p0) {
        this.b(p0);
        this.b();
        this.a(1, p0);
        if (this.v != 0) {
            this.o.add(new com.google.android.finsky.billing.myaccount.p(3));
            this.o.add(new com.google.android.finsky.billing.myaccount.p(4));
        }
        if (this.c()) {
            if (this.v == 0)
                this.o.add(new com.google.android.finsky.billing.myaccount.p(3));
            this.o.add(new com.google.android.finsky.billing.myaccount.p(5));
        }
        this.a.b();
    }

    public final void a(ao[] p0, v[] p1) {
        this.b(p0);
        this.e = this.d.al;
        this.b();
        if (p0.length > 0)
            this.a(1, p0, Math.max(1, (this.c.getResources().getDisplayMetrics().heightPixels - this.m) / this.l - 1));
        else
            this.o.add(new com.google.android.finsky.billing.myaccount.p(6));
        if (p1.length > 0) {
            this.o.add(new com.google.android.finsky.billing.myaccount.p(3, this.e.o));
            this.a(2, p1);
        }
        v2 = this.c();
        if (this.v != 0) {
            this.o.add(new com.google.android.finsky.billing.myaccount.p(3, this.e.p));
            if (v2 == 0)
                v0 = 1;
            else
                v0 = 0;
            this.o.add(new com.google.android.finsky.billing.myaccount.p(4, 0, v0));
        }
        if (v2 != 0) {
            if (this.v == 0)
                this.o.add(new com.google.android.finsky.billing.myaccount.p(3, this.e.p));
            this.o.add(new com.google.android.finsky.billing.myaccount.p(5, 0, 1));
        }
        this.a.b();
    }

    final void b() {
        this.o.clear();
        this.o.add(new com.google.android.finsky.billing.myaccount.p(0));
        this.p.clear();
    }

}
