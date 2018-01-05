package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import com.google.android.finsky.bg.g;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layout.CategoryRow;
import com.google.android.finsky.layout.play.PlayQuickLinksBannerView;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.recyclerview.g;
import com.google.android.finsky.recyclerview.h;
import com.google.android.finsky.stream.base.playcluster.PlayClusterViewContentV2;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.a;
import com.google.android.play.image.w;
import com.google.wireless.android.finsky.dfe.nano.x;
import java.util.HashSet;

public final class com.google.android.finsky.adapters.e extends com.google.android.finsky.recyclerview.h
{

    public final com.google.android.finsky.d.w A;
    public Bundle B;
    public final LayoutInflater c;
    public final com.google.android.finsky.navigationmanager.a d;
    public final int e;
    public final int f;
    public final DfeToc g;
    public final com.google.android.play.image.w h;
    public final x[] i;
    public final ag[] j;
    public final String k;
    public final String l;
    public final com.google.android.finsky.d.ad m;
    public final Context n;
    public final boolean o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final com.google.android.finsky.adapters.h x;
    public final com.google.android.finsky.adapters.g y;
    public final HashSet z;

    e(Context p0, x[] p1, com.google.android.finsky.navigationmanager.a p2, int p3, int p4, DfeToc p5, com.google.android.play.image.w p6, ag[] p7, String p8, String p9, int p10, com.google.android.finsky.d.ad p11, com.google.android.finsky.d.w p12) {
        com.google.android.finsky.recyclerview.h();
        this.c = LayoutInflater.from(p0);
        this.i = p1;
        this.d = p2;
        this.e = p3;
        this.f = p4;
        this.g = p5;
        this.h = p6;
        this.k = p8;
        this.l = p9;
        this.n = p0;
        this.A = p12;
        v2 = this.n.getResources();
        this.o = v2.getBoolean(2131492879);
        this.j = p7;
        if (this.j != 0)
            v1 = this.j.length;
        else
            v1 = 0;
        if (v1 > 1)
            v1 = 1;
        else
            v1 = 0;
        this.p = v1;
        this.t = this.p * 2 + 5;
        this.q = FinskyHeaderListLayout.a(p0, p10, 0);
        this.r = v2.getDimensionPixelSize(2131624059);
        this.u = v2.getDimensionPixelSize(2131624066);
        this.v = v2.getDimensionPixelSize(2131624065);
        this.s = this.u * 2;
        this.m = p11;
        if (v2.getBoolean(2131492903))
            this.w = (com.google.android.finsky.bg.k.l(v2) - com.google.android.finsky.m.a.av().f(v2)) / 2;
        else
            this.w = this.v;
        this.x = new com.google.android.finsky.adapters.h(p0);
        this.y = new com.google.android.finsky.adapters.g(this);
        this.z = new HashSet();
    }

    private final View a(int p0, ViewGroup p1) {
        return this.c.inflate(p0, p1, 0);
    }

    private final boolean b() {
        v0 = 1;
        if (this.o == 0 || this.i.length % 2 != 1)
            v0 = 0;
        return v0;
    }

    public final int a() {
        if (this.b())
            v0 = 1;
        else
            v0 = 0;
        return v0 + this.i.length + this.t + 2;
    }

    public final int a(int p0) {
        v0 = 8;
        if (p0 == 0)
            v0 = 0;
        else {
            if (!(p0 - 1)) {
                v0 = 1;
                return v0;
            }
            v1 = p0 - 1 - 1;
            if (this.p > 0) {
                if (v1 == 0) {
                    v0 = 2;
                    return v0;
                }
                if (!(v1 - 1)) {
                    v0 = 3;
                    return v0;
                }
                v1 = v1 - 1 - this.p;
            }
            if (v1 == 0) {
                v0 = 4;
                return v0;
            }
            if (!(v1 - 1)) {
                v0 = 5;
                return v0;
            }
            if (!(v1 - 1 - 1))
                return v0;
            if (v1 - 1 - 1 - 1 >= 0 && v1 - 1 - 1 - 1 < this.i.length) {
                v0 = 6;
                return v0;
            }
            v1 = v1 - 1 - 1 - 1 - this.i.length;
            if (this.b()) {
                if (v1 == 0) {
                    v0 = 7;
                    return v0;
                }
                v1 = v1 - 1;
            }
            if (v1 != 0)
                v0 = 9;
        }
        return v0;
    }

    public final android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        v0 = 0;
        switch (p1) {
            case 0:
                v0 = this.a(2130968970, p0);
                v0.getLayoutParams().height = this.q;
                break;
            case 1:
                v0 = this.a(2130969494, p0);
                v0.getLayoutParams().height = this.r;
                break;
            case 2:
                v0 = this.a(2130968684, p0);
                break;
            case 3:
                v0 = this.a(2130969282, p0);
                break;
            case 4:
                v0 = this.a(2130968684, p0);
                break;
            case 5:
                v0 = this.a(2130969494, p0);
                v0.getLayoutParams().height = this.u;
                break;
            case 6:
                v0 = this.a(2130968681, p0);
                break;
            case 7:
                v0 = this.a(2130968683, p0);
                v0.getLayoutParams().height = this.n.getResources().getDimensionPixelSize(2131624067);
                break;
            case 8:
                v0 = this.a(2130968683, p0);
                break;
            case 9:
                v0 = this.a(2130969494, p0);
                v0.getLayoutParams().height = this.s;
                break;
            default:
                break;
        }
        return new com.google.android.finsky.recyclerview.g(v0);
    }

    public final void a(android.support.v7.widget.fr p0) {
        this.a((com.google.android.finsky.recyclerview.g)p0);
    }

    public final void a(android.support.v7.widget.fr p0, int p1) {
        this.z.add((com.google.android.finsky.recyclerview.g)p0);
        switch (((com.google.android.finsky.recyclerview.g)p0).f) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ((TextView)((com.google.android.finsky.recyclerview.g)p0).a).setText(this.k);
                break;
            case 3:
                v0 = (PlayQuickLinksBannerView)((com.google.android.finsky.recyclerview.g)p0).a;
                v0.i(this.w);
                if (v0.aG == 0) {
                    v0.aG = com.google.android.finsky.d.j.a(429);
                    com.google.android.finsky.d.j.a(v0.aG, 0);
                }
                v0.aH = this.m;
                this.y.a = v0;
                v0.a(this.y, this.x, com.google.android.finsky.m.a.av().g(this.n.getResources()), 1, 0, this.B, 0, 0);
                break;
            case 4:
                ((TextView)((com.google.android.finsky.recyclerview.g)p0).a).setText(this.l);
                break;
            case 5:
                break;
            case 6:
                v0 = (CategoryRow)((com.google.android.finsky.recyclerview.g)p0).a;
                v0.a.setText(this.i[p1 - this.t].c);
                if (this.i[p1 - this.t].d != 0) {
                    if (!TextUtils.isEmpty(this.i[p1 - this.t].d.f)) {
                        com.google.android.finsky.m.a.be();
                        v1 = com.google.android.finsky.bg.h.a(v0.getContext(), this.e);
                        if (this.i[p1 - this.t].d != 0)
                            v1 = com.google.android.finsky.bg.g.a(this.i[p1 - this.t].d, v1);
                        v0.b.setBitmapTransformation(com.google.android.play.image.a.b(v0.getResources(), v1));
                        com.google.android.finsky.m.a.ar().a(v0.b, this.i[p1 - this.t].d.f, 1);
                    }
                }
                v0.d = this.m;
                com.google.android.finsky.d.j.a(v0.c, this.i[p1 - this.t].f);
                v0.d.a(v0);
                v0.setOnClickListener(new com.google.android.finsky.adapters.f(this, this.i[p1 - this.t], v0));
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                break;
        }
    }

    public final void a(com.google.android.finsky.recyclerview.g p0) {
        if (p0.f == 3) {
            if (this.B == 0)
                this.B = new Bundle();
            else
                this.B.clear();
            ((PlayQuickLinksBannerView)p0.a).a(this.B);
        }
        if (p0.a instanceof com.google.android.finsky.frameworkviews.ae)
            ((com.google.android.finsky.frameworkviews.ae)p0.a).Z_();
    }

    public final boolean e(int p0) {
        v0 = 0;
        if (this.o != 0) {
            v1 = this.a(p0);
            if (v1 == 6 || v1 == 7)
                v0 = 1;
        }
        return v0;
    }

}
