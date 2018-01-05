package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.support.v7.widget.fr;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.m;
import com.google.android.finsky.as.e;
import com.google.android.finsky.bg.aa;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.iu;
import com.google.android.finsky.cv.a.iv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.n;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.layout.HistogramView;
import com.google.android.finsky.layout.ReviewItemLayout;
import com.google.android.finsky.layout.ReviewsControlContainer;
import com.google.android.finsky.layout.ReviewsTipHeaderLayout;
import com.google.android.finsky.layout.RottenTomatoesMeter;
import com.google.android.finsky.layout.RottenTomatoesReviewItem;
import com.google.android.finsky.layout.RottenTomatoesReviewsHeader;
import com.google.android.finsky.layout.bk;
import com.google.android.finsky.layout.bl;
import com.google.android.finsky.layout.bm;
import com.google.android.finsky.layout.bn;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.ratereview.o;
import com.google.android.finsky.ratereview.p;
import com.google.android.finsky.ratereview.q;
import com.google.android.finsky.recyclerview.e;
import com.google.android.finsky.recyclerview.g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ak;
import com.google.android.finsky.utils.al;
import com.google.wireless.android.finsky.dfe.nano.bm;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.adapters.u extends com.google.android.finsky.recyclerview.e implements com.android.volley.w, com.google.android.finsky.dfemodel.w
{

    public final Document c;
    public final com.google.android.finsky.dfemodel.n d;
    public final DfeToc e;
    public final boolean f;
    public final com.google.android.finsky.adapters.x g;
    public final com.google.android.finsky.navigationmanager.a h;
    public final com.google.android.finsky.d.ad i;
    public final com.google.android.finsky.d.w j;
    public final int k;
    public final com.google.android.finsky.ratereview.q l;
    public final com.google.android.finsky.ratereview.o m;
    public final NumberFormat n;
    public final List o;

    u(Context p0, Document p1, com.google.android.finsky.dfemodel.n p2, boolean p3, DfeToc p4, com.google.android.finsky.adapters.x p5, com.google.android.finsky.navigationmanager.a p6, com.google.android.finsky.ratereview.o p7, com.google.android.finsky.d.ad p8, com.google.android.finsky.d.w p9) {
        com.google.android.finsky.recyclerview.e(p0, p2.h(), p2.t);
        this.o = new ArrayList();
        this.c = p1;
        this.d = p2;
        this.f = p3;
        this.d.a(this);
        this.d.a(this);
        this.k = 2147483647;
        this.g = p5;
        this.h = p6;
        this.i = p8;
        this.j = p9;
        this.m = p7;
        this.l = com.google.android.finsky.m.a.i(com.google.android.finsky.m.a.cZ());
        this.n = NumberFormat.getIntegerInstance();
        this.e = p4;
        this.b();
    }

    private final boolean a(com.google.android.finsky.cv.a.iu p0, com.google.android.finsky.ratereview.p p1) {
        return this.l.c(this.c.a.c, p0.c, p1);
    }

    private final void b() {
        this.o.clear();
        if (this.d.a()) {
            if (!this.c() && this.c != 0 && this.c.bn() && this.f == 0)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0)
                this.o.add(new com.google.android.finsky.adapters.y(2130969350));
            if (!this.c() && this.c != 0 && this.c.a.e == 1 && this.f == 0 && !com.google.android.finsky.m.a.O().b())
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0)
                this.o.add(new com.google.android.finsky.adapters.y(2130969346));
            if (!this.c() && this.f != 0 && this.d.g != 0)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0)
                this.o.add(new com.google.android.finsky.adapters.y(2130969356));
            if (this.c())
                this.o.add(new com.google.android.finsky.adapters.y(2130969353));
            if (this.d.m() == 0) {
                if (this.d.t != 0)
                    v0 = 2130969082;
                else
                    v0 = 2130969347;
                this.o.add(new com.google.android.finsky.adapters.y(v0));
            }
            v2 = 0;
            while (v2 < this.d.m()) {
                v0 = (com.google.android.finsky.cv.a.iu)this.d.a(v2, 0);
                if (this.f != 0)
                    this.o.add(new com.google.android.finsky.adapters.y(2130969355, v2));
                else if (!this.a(v0, com.google.android.finsky.ratereview.p.c)) {
                    if (!this.a(v0, com.google.android.finsky.ratereview.p.d))
                        this.o.add(new com.google.android.finsky.adapters.y(2130969337, v2));
                }
                v2 = v2 + 1;
            }
            if (this.K != 0) {
                if (this.K == 1)
                    this.o.add(new com.google.android.finsky.adapters.y(2130969082));
                else if (this.K == 2)
                    this.o.add(new com.google.android.finsky.adapters.y(2130968823));
                else {
                    FinskyLog.d("No footer or item in last row", new Object[0]);
                    this.o.add(new com.google.android.finsky.adapters.y(2130968823));
                }
            }
            this.a.b();
        }
    }

    private final boolean c() {
        if (this.d.k != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final int a() {
        return this.o.size();
    }

    public final int a(int p0) {
        return ((com.google.android.finsky.adapters.y)this.o.get(p0)).a;
    }

    public final android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        if (p1 == 2130969082)
            v0 = this.a(2130969082, p0);
        else if (p1 == 2130968823)
            v0 = this.a(2130968823, p0);
        else
            v0 = this.a(p1, p0);
        return new com.google.android.finsky.recyclerview.g(v0);
    }

    public final void a(android.support.v7.widget.fr p0, int p1) {
  2:    v11 = 0;
  4:    v7 = 0;
  7:    v0 = ((com.google.android.finsky.recyclerview.g)p0).a;
  9:    v1 = ((com.google.android.finsky.recyclerview.g)p0).f;
 14:    if (v1 == 2130969350) {
 24:        if (!this.c.bn()) {
 30:            FinskyLog.c("No histogram data received from server", new Object[0]);
 33:            ((HistogramView)v0).setVisibility(8);
            }
 58:        ((HistogramView)v0).a(this.c.K(), com.google.android.finsky.bg.aa.a(this.c.J()), this.c.L());
 61:        return;
        }
 65:    if (v1 != 2130969346) {
130:        if (v1 == 2130969356) {
133:            v1 = (RottenTomatoesReviewsHeader)v0;
153:            v1.a.setText(this.d.g.b.toUpperCase());
172:            com.google.android.finsky.m.a.ar().a(v1.b, this.d.g.c.f, this.d.g.c.i);
183:            v1.c.setText(Integer.toString(this.d.g.e));
190:            if (this.d.g.a & 2)
192:                v0 = 1;
                else
260:                v0 = 0;
193:            if (v0 != 0) {
204:                v6 = new Object[1];
212:                v6[0] = Integer.valueOf(this.d.g.d);
222:                v1.d.setText(Html.fromHtml(v1.getResources().getString(2131953067, v6)));
227:                v1.d.setVisibility(0);
                }
                else
264:                v1.d.setVisibility(8);
234:            v1.e.setPercentValue(this.d.g.e);
241:            v1.f.setText(this.d.g.f);
246:            if (this.d.g.g != 0)
255:                v1.f.setOnClickListener(new com.google.android.finsky.layout.bn(v1, this.h, this.d.g, this.e, this.j));
                else
270:                v1.f.setOnClickListener(0);
258:            return;
            }
278:        if (v1 == 2130969347)
 61:            return;
283:        if (v1 == 2130969337) {
294:            v10 = (com.google.android.finsky.adapters.y)this.o.get(p1);
304:            v2 = (com.google.android.finsky.cv.a.iu)this.d.a(v10.b, 1);
312:            if (!TextUtils.isEmpty(v2.c))
314:                v12 = 1;
                else
362:                v12 = 0;
347:            ((ReviewItemLayout)v0).a(this.c, v2, this.k, this.a(v2, com.google.android.finsky.ratereview.p.a), this.a(v2, com.google.android.finsky.ratereview.p.c), this.a(v2, com.google.android.finsky.ratereview.p.b), this.a(v2, com.google.android.finsky.ratereview.p.d), this.i, this.j);
350:            if (v12 != 0)
357:                ((ReviewItemLayout)v0).setReviewFeedbackActionListener(new com.google.android.finsky.adapters.v(this, v2, (ReviewItemLayout)v0, v10));
                else
364:                ((ReviewItemLayout)v0).setActionClickListener(0);
360:            return;
            }
372:        if (v1 == 2130969355) {
392:            v1 = (com.google.android.finsky.cv.a.iu)this.d.a(((com.google.android.finsky.adapters.y)this.o.get(p1)).b, 1);
410:            com.google.android.finsky.m.a.ar().a(((RottenTomatoesReviewItem)v0).a, v1.f.f, v1.f.i);
419:            if (TextUtils.isEmpty(v1.i))
424:                ((RottenTomatoesReviewItem)v0).b.setVisibility(4);
                else {
452:                ((RottenTomatoesReviewItem)v0).b.setVisibility(0);
462:                ((RottenTomatoesReviewItem)v0).b.setOnClickListener(new com.google.android.finsky.layout.bm((RottenTomatoesReviewItem)v0, v1));
                }
431:            ((RottenTomatoesReviewItem)v0).c.setText(v1.h);
438:            ((RottenTomatoesReviewItem)v0).d.setText(v1.t);
445:            ((RottenTomatoesReviewItem)v0).e.setText(v1.j);
448:            return;
            }
469:        if (v1 == 2130969082)
 61:            return;
474:        if (v1 == 2130968823) {
476:            this.b(v0);
479:            return;
            }
484:        if (v1 != 2130969353)
564:            throw new IllegalStateException(45 + "Unknown type for onBindViewHolder " + v1);
496:        if (this.d.k.b & 8)
498:            v1 = 1;
            else
536:            v1 = 0;
499:        if (v1 != 0) {
513:            v5 = new Object[1];
523:            v5[0] = this.n.format(this.d.k.f);
525:            v11 = this.J.getResources().getQuantityString(2131886100, (int)this.d.k.f, v5);
            }
531:        ((ReviewsTipHeaderLayout)v0).a(this.d.k.d, v11);
534:        return;
        }
 84:    if (v7 >= com.google.android.finsky.utils.ak.a.length) goto 125;
 90:    if (this.d.f != com.google.android.finsky.utils.ak.a[v7].a) goto 122;
 94:    v1 = ((ReviewsControlContainer)v0).getContext().getString(com.google.android.finsky.utils.ak.a[v7].b);
 98:    ((ReviewsControlContainer)v0).a.setText(v1);
108:    ((ReviewsControlContainer)v0).a.setOnClickListener(new com.google.android.finsky.layout.bk(this.g));
118:    ((ReviewsControlContainer)v0).b.setOnClickListener(new com.google.android.finsky.layout.bl(this.g));
121:    return;
122:    v7 = v7 + 1;
124:    goto 84;
125:    v1 = 0;
126:    goto 98;
    }

    public final void a(VolleyError p0) {
        this.e(2);
    }

    final void a(ReviewItemLayout p0, com.google.android.finsky.ratereview.p p1, com.google.android.finsky.cv.a.iu p2) {
        if (this.m != 0)
            this.m.a(this.c.a.c, p2.c, p1);
        if (this.l.c(this.c.a.c, p2.c, p1))
            this.l.b(this.c.a.c, p2.c, p1);
        else
            this.l.a(this.c.a.c, p2.c, p1);
        p0.a(this.c, p2, this.k, this.a(p2, com.google.android.finsky.ratereview.p.a), this.a(p2, com.google.android.finsky.ratereview.p.c), this.a(p2, com.google.android.finsky.ratereview.p.b), this.a(p2, com.google.android.finsky.ratereview.p.d), this.i, this.j);
    }

    protected final boolean i() {
        return this.d.t;
    }

    protected final void j() {
        this.d.q();
    }

    protected final String l() {
        return com.google.android.finsky.api.m.a(this.J, this.d.g());
    }

    public final void m_() {
        if (this.i())
            this.e(1);
        else
            this.e(0);
        this.b();
    }

}
