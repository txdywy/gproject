package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.g;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.da;
import com.google.android.finsky.cv.a.lr;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.DetailsTextBlock;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.detailscomponents.g;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.dfemodel.u;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.frameworkviews.InsetsFrameLayout;
import com.google.android.finsky.layout.EditorialDescriptionSectionLegacy;
import com.google.android.finsky.layout.EditorialHeroSpacerView;
import com.google.android.finsky.layout.aa;
import com.google.android.finsky.layout.y;
import com.google.android.finsky.layout.z;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.recyclerview.e;
import com.google.android.finsky.recyclerview.g;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewHeader;
import com.google.android.finsky.y.a;
import com.google.android.play.image.w;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.search.PlaySearchToolbar;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.android.play.utils.k;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.adapters.j extends CardRecyclerViewAdapter
{

    public final Document E;
    public final int F;
    public final int G;

    j(Context p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.play.image.w p2, com.google.android.finsky.y.a p3, Document p4, com.google.android.finsky.dfemodel.u p5, boolean p6, com.google.android.finsky.d.ad p7, com.google.android.finsky.d.w p8, com.google.android.finsky.detailscomponents.g p9) {
        CardRecyclerViewAdapter(p0, p1, p2, p3, p5, p6, p7, p8);
        v0 = p0.getResources();
        this.F = v0.getInteger(2131820556);
        this.G = v0.getDimensionPixelSize(2131625117);
        this.E = p4;
    }

    private final int o() {
        return (int)Math.ceil((double)this.E.aD().g.length / (double)this.F);
    }

    public final int a(int p0) {
        if (p0 == 0)
            v0 = 21;
        else {
            v2 = this.o();
            if (v2 > 0)
                v0 = 1;
            else
                v0 = 0;
            if (p0 == 1)
                v0 = 28;
            else if (v0 != 0 && !this.i()) {
                v0 = this.a();
                if (p0 == v0 - (v2 + 1))
                    v0 = 29;
                else if (p0 >= v0 - v2)
                    v0 = 30;
                else
                    v0 = super.a(p0 - 1);
            }
            else
                v0 = super.a(p0 - 1);
        }
        return v0;
    }

    public final android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        return this.c(p0, p1);
    }

    protected final View a(ViewGroup p0) {
        return this.a(2130968803, p0);
    }

    protected final void a(Resources p0) {
        if (this.H.a.c())
            v0 = this.H.a.a.a.f;
        else
            v0 = 0;
        if (v0 == 3)
            v0 = 2130968802;
        else
            v0 = 2130968804;
        this.w = v0;
        this.v = p0.getInteger(2131820556);
    }

    public final void a(android.support.v7.widget.fr p0, int p1) {
        this.a((com.google.android.finsky.recyclerview.g)p0, p1);
    }

    protected final void a(View p0) {
        if (com.google.android.finsky.detailscomponents.g.a(this.E) != 0)
            v0 = 1;
        else
            v0 = 0;
        ((EditorialHeroSpacerView)p0).a = v0;
        ((EditorialHeroSpacerView)p0).b = com.google.android.finsky.detailscomponents.g.a(this.E.a.e);
    }

    public final void a(HeroGraphicView p0) {
        v2 = this.E.aD();
        p0.setFillColor(com.google.android.finsky.bg.g.a(v2, p0.a(this.E.a.f)));
        p0.a(com.google.android.finsky.detailscomponents.g.a(this.E), this.E, 0, this.e);
        if (TextUtils.isEmpty(v2.d))
            v0 = v2.b;
        else
            v0 = v2.d;
        p0.f.setText(v0);
        p0.f.setVisibility(0);
        p0.e.setVisibility(0);
        v0 = new Object[1];
        v0[0] = this.E.a.g;
        p0.a(v0);
        p0.l = 1;
        p0.n = PlaySearchToolbar.a(p0.getContext()) * 2;
    }

    protected final void a(BucketRowLayout p0) {
        p0.setSameChildHeight(1);
    }

    public final void a(com.google.android.finsky.recyclerview.g p0, int p1) {
        switch (p0.f) {
            case 28:
                v1 = (EditorialDescriptionSectionLegacy)p0.a;
                v2 = v1.getResources().getColor(2131558892);
                if (this.E.d(1))
                    v2 = com.google.android.finsky.bg.g.a(this.E.aD(), v2);
                v4 = this.E.A();
                v1.h = this.n;
                v1.a = this.q;
                if (!TextUtils.isEmpty(v4))
                    UrlSpanUtils.a(v4, 0, new com.google.android.finsky.layout.y(v1));
                v1.c.setVisibility(8);
                v1.e.a(0, v4, v1.b);
                v1.e.a();
                v1.d.setVisibility(0);
                v1.setOnClickListener(new com.google.android.finsky.layout.z(v1));
                v1.e.setBodyClickListener(new com.google.android.finsky.layout.aa(v1));
                if (com.google.android.finsky.bg.g.a(v2))
                    v3 = 2131558680;
                else
                    v3 = 2131558892;
                v3 = v1.getResources().getColor(v3);
                v1.setBackgroundColor(v2);
                v1.e.a(v2, v3);
                v1.f.setTextColor(v3);
                v1.setVisibility(0);
                break;
            case 29:
                if (this.H.a.c())
                    v2 = this.H.a.a.a.f;
                else
                    v2 = 0;
                ((PlayCardClusterViewHeader)p0.a).a(v2, this.J.getString(2131952996), 0, 0, 0);
                ((PlayCardClusterViewHeader)p0.a).setExtraHorizontalPadding(this.G);
                break;
            case 30:
                v13 = (p1 - super.f() - super.g() - 3) * this.F;
                ((BucketRowLayout)p0.a).setSameChildHeight(1);
                v14 = this.E.aD().g;
                v15 = new ArrayList();
                v12 = 0;
                while (v12 < this.F) {
                    v1 = (com.google.android.finsky.adapters.k)((BucketRowLayout)p0.a).getChildAt(v12).getTag();
                    if (v13 + v12 > v14.length - 1)
                        v1.a.setVisibility(4);
                    else {
                        v1.a.setVisibility(0);
                        v1.c.setText(v14[v13 + v12].d);
                        v1.d.setText(v14[v13 + v12].e);
                        v2 = 0;
                        v3 = 0;
                        while (v3 < v14[v13 + v12].c.length) {
                            if (v14[v13 + v12].c[v3].c == 3)
                                v2 = v14[v13 + v12].c[v3].f;
                            else if (v14[v13 + v12].c[v3].c == 1)
                                v15.add(v14[v13 + v12].c[v3]);
                            v3 = v3 + 1;
                        }
                        if (!TextUtils.isEmpty(v2)) {
                            if (v15.size() > 0) {
                                v1.b.k = 0;
                                v1.b.h = 1058013184;
                                v5 = com.google.android.finsky.bg.af.a(v15, 0, v1.b.getResources().getDimensionPixelSize(2131625237));
                                v1.b.y.a(v1.b.a, v5.f, v5.i);
                                v1.b.setBackgroundResource(0);
                                v1.b.a(v2, v14[v13 + v12].d, 0, this.E.a.E, this.E.a.f, this.e, 0, 0);
                            }
                        }
                        v15.clear();
                    }
                    v12 = v12 + 1;
                }
                android.support.v4.view.ai.a(p0.a, this.G, p0.a.getPaddingTop(), this.G, p0.a.getPaddingBottom());
                break;
            default:
                super.a(p0, p1);
                break;
        }
    }

    public final com.google.android.finsky.recyclerview.g c(ViewGroup p0, int p1) {
  0:    switch (p1) {
            case 28:
 11:            v1 = this.a(2130968808, p0);
107:            break;
            case 29:
 24:            v1 = this.a(2130969215, p0);
107:            break;
            case 30:
 32:            v1 = this.a(2130968667, p0);
 37:            v3 = 0;
 38:            while (v3 < this.F) {
 52:                v0 = (ViewGroup)this.a(2130968809, (ViewGroup)v1);
 56:                v4 = new com.google.android.finsky.adapters.k();
 59:                v4.a = v0;
 70:                v4.b = (HeroGraphicView)v0.findViewById(2131755700);
 81:                v4.c = (TextView)v0.findViewById(2131755701);
 92:                v4.d = (TextView)v0.findViewById(2131755702);
 94:                v0.setTag(v4);
100:                ((ViewGroup)v1).addView(v0);
105:                v3 = v3 + 1;
                }
107:            break;
            default:
  3:            v0 = super.c(p0, p1);
  7:            return v0;
        }
 17:    v0 = new com.google.android.finsky.recyclerview.g(v1);
 20:    goto 7;
    }

    public final boolean c() {
        return 1;
    }

    public final int d() {
        com.google.android.finsky.m.a.av();
        if (com.google.android.finsky.detailscomponents.g.a(this.E) != 0)
            v0 = 1;
        else
            v0 = 0;
        v0 = com.google.android.finsky.detailscomponents.g.a(this.J, com.google.android.finsky.bg.k.l(this.J.getResources()), v0, com.google.android.finsky.detailscomponents.g.a(this.E.a.e), com.google.android.finsky.bg.k.n(this.J.getResources()));
        if (InsetsFrameLayout.a != 0)
            v0 = v0 - com.google.android.play.utils.k.e(this.J);
        return v0;
    }

    protected final boolean e() {
        return 0;
    }

    protected final int f() {
        v0 = super.f();
        v1 = this.o();
        if (v1 > 0)
            v0 = v0 + v1 + 1;
        return v0;
    }

    public final int g() {
        return super.g() + 1;
    }

}
