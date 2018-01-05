package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ai;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.support.v7.widget.ew;
import android.support.v7.widget.ff;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cc;
import com.google.android.finsky.cv.a.cd;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.ko;
import com.google.android.finsky.cv.a.m;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.u;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layout.f;
import com.google.android.finsky.layout.play.PlayHighlightsBannerView;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.e;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.recyclerview.e;
import com.google.android.finsky.recyclerview.g;
import com.google.android.finsky.stream.base.d;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterView;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewHeader;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewV2;
import com.google.android.finsky.stream.base.playcluster.a;
import com.google.android.finsky.stream.base.playcluster.e;
import com.google.android.finsky.stream.base.playcluster.h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.y.a;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.w;
import com.google.android.play.layout.b;
import com.google.android.play.layout.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

public class CardRecyclerViewAdapter extends com.google.android.finsky.adapters.m implements com.google.android.finsky.activities.gp, com.google.android.finsky.dx.h, com.google.android.finsky.playcard.ab
{

    public android.support.v7.widget.ff A;
    public Map B;
    public com.google.android.finsky.layout.f C;
    public final com.google.android.finsky.dx.a D;
    public final com.google.android.play.image.w c;
    public final int d;
    public final com.google.android.finsky.d.ad e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final com.google.android.finsky.stream.base.playcluster.e i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final com.google.android.finsky.d.w n;
    public boolean o;
    public final com.google.android.finsky.y.a p;
    public final com.google.android.finsky.navigationmanager.a q;
    public final int r;
    public final com.google.android.finsky.frameworkviews.ah s;
    public final int t;
    public ArrayList u;
    public int v;
    public int w;
    public boolean x;
    public boolean y;
    public HashSet z;

    CardRecyclerViewAdapter(Context p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.play.image.w p2, com.google.android.finsky.y.a p3, com.google.android.finsky.dfemodel.u p4, boolean p5, com.google.android.finsky.d.ad p6, com.google.android.finsky.d.w p7) {
  1:    v1 = 1;
  3:    com.google.android.finsky.adapters.m(p0, p4);
  6:    this.o = 1;
 13:    this.u = new ArrayList();
 21:    this.D = com.google.android.finsky.m.a.au();
 25:    v0 = com.google.android.finsky.m.a.av();
 29:    v4 = p0.getResources();
 33:    this.q = p1;
 35:    this.c = p2;
 37:    this.p = p3;
 39:    this.j = 0;
 45:    this.f = v0.g(v4);
 52:    this.i = new com.google.android.finsky.stream.base.playcluster.e();
 54:    com.google.android.finsky.bg.k.m(v4);
 60:    v4.getDimensionPixelSize(2131625189);
 65:    com.google.android.finsky.m.a.h();
 81:    this.g = this.J.getResources().getBoolean(2131492882);
 83:    this.s = 0;
 86:    this.t = 2;
 88:    this.n = p7;
 92:    com.google.android.finsky.m.a.h();
 99:    this.d = v0.a(v4);
101:    this.e = p6;
109:    if (this.H.a.a == 0) goto 254;
115:    if (this.H.a.a.a.r == 0)
117:        v0 = 0;
        else
250:        v0 = this.H.a.a.a.r.g;
118:    if (v0 == 0) goto 254;
120:    v0 = 1;
121:    this.l = v0;
123:    if (this.H.a.a != 0)
127:        v0 = this.H.a.a.a.c;
263:    else if (this.H.a instanceof com.google.android.finsky.dfemodel.j)
267:        v0 = ((com.google.android.finsky.dfemodel.j)this.H.a).d;
        else
271:        v0 = 0;
129:    this.m = v0;
131:    this.h = 0;
133:    this.a(v4);
138:    new ArrayList();
147:    if (TextUtils.isEmpty(this.j))
274:        v1 = 0;
149:    this.k = v1;
164:    this.y = this.J.getResources().getBoolean(2131492902);
179:    if (com.google.android.finsky.m.a.dj().a(12617606))
184:        v0 = v4.getDimensionPixelSize(2131624404);
        else
279:        v0 = v4.getDimensionPixelSize(2131624059);
188:    this.r = v0;
195:    this.z = new HashSet();
202:    this.B = new HashMap();
209:    this.C = new com.google.android.finsky.layout.f(p0);
211:    if (p5 == 0)
213:        this.o();
218:    this.D.a(this);
234:    if (com.google.android.finsky.m.a.dj().a(12631899))
242:        com.google.android.finsky.m.a.cr().a();
245:    return;
254:    v0 = 0;
255:    goto 121;
    }

    private static int a(int p0, int p1, int p2) {
        if ((float)(p1 + p0) / (float)p1 > 1056964608)
            v0 = 1;
        else
            v0 = 0;
        if (v0 == 0)
            p2 = p2 + 1;
        return p2;
    }

    private static String a(String p0) {
        v1 = String.valueOf("CardRecyclerViewAdapter.rowClusterScrollStatePrefix.");
        v0 = String.valueOf(p0);
        if (v0.length() != 0)
            v0 = v1.concat(v0);
        else
            v0 = new String(v1);
        return v0;
    }

    private final void a(com.google.android.finsky.recyclerview.g p0) {
        if (this.z.contains(p0)) {
            this.c(p0.a);
            if (p0.a instanceof PlayCardClusterViewV2 && this.H.b.containsKey(((PlayCardClusterViewV2)p0.a).getContentId())) {
                v2 = this.H.a(((PlayCardClusterViewV2)p0.a).getContentId());
                v2.b((PlayCardClusterViewV2)p0.a);
                v2.b((PlayCardClusterViewV2)p0.a);
            }
            this.z.remove(p0);
            if (p0.a instanceof com.google.android.finsky.frameworkviews.ae)
                ((com.google.android.finsky.frameworkviews.ae)p0.a).Z_();
            if (p0.a instanceof PlayCardClusterView)
                this.i.a((PlayCardClusterView)p0.a);
        }
    }

    private final void c(View p0) {
        if (p0 instanceof PlayHighlightsBannerView)
            v1 = "CardRecyclerViewAdapter.highlightsScrollState";
        else {
            if (!(p0 instanceof PlayCardClusterViewV2))
                return;
            v1 = CardRecyclerViewAdapter.a(((PlayCardClusterViewV2)p0).getContentId());
        }
        v0 = (Bundle)this.B.get(v1);
        if (v0 != 0)
            v0.clear();
        else
            v0 = new Bundle();
        ((com.google.android.finsky.stream.base.playcluster.h)p0).a(v0);
        this.B.put(v1, v0);
    }

    private final void f(int p0) {
        v0 = this.u.size();
        if (v0 > 0) {
            v0 = this.u.get(v0 - 1);
            if (((CardRecyclerViewAdapter$ItemEntry)v0).a())
                ((CardRecyclerViewAdapter$ItemEntry)v0).b = p0 - 1;
        }
    }

    private final void o() {
  6:    v6 = this.H.a.m();
 16:    if (this.u.size() > 0)
 36:        v0 = ((CardRecyclerViewAdapter$ItemEntry)this.u.get(this.u.size() - 1)).b + 1;
        else
208:        v0 = 0;
 40:    com.google.android.finsky.m.a.cZ();
 43:    v4 = v0;
 44:    if (v4 >= v6) {
195:        if (v6 > 0)
201:            this.f(this.H.a.m());
204:        return;
        }
 50:    v0 = (Document)this.H.a.a(v4, 0);
 52:    if (v0 == 0) {
 58:        FinskyLog.a("Loaded null doc, forcing a hard reload of list data.", new Object[0]);
 61:        this.H.a.ac_();
 64:        this.H.a.n();
 69:        this.u.clear();
 72:        return;
        }
 77:    if (v0.aZ()) goto 118;
 79:    v3 = v0.bg();
 83:    if (v3 != 0 && v3.F != 0)
 89:        v3 = 1;
        else
187:        v3 = 0;
 90:    if (v3 != 0) goto 118;
 92:    v3 = v0.bg();
 96:    if (v3 != 0 && v3.ax != 0)
102:        v3 = 1;
        else
189:        v3 = 0;
103:    if (v3 != 0) goto 118;
105:    v0 = v0.bg();
109:    if (v0 != 0 && v0.G != 0)
115:        v0 = 1;
        else
191:        v0 = 0;
116:    if (v0 == 0) goto 193;
118:    v0 = 1;
119:    if (v0 != 0)
121:        this.x = 1;
129:    if (this.u.size() <= 0) goto 206;
141:    v0 = this.u.get(this.u.size() - 1);
151:    if (!((CardRecyclerViewAdapter$ItemEntry)v0).a()) goto 206;
159:    if (v4 - ((CardRecyclerViewAdapter$ItemEntry)v0).a >= this.v) goto 206;
161:    v0 = 1;
162:    if (v0 == 0) {
166:        v0 = new CardRecyclerViewAdapter$ItemEntry();
169:        v0.a = v4;
172:        v0.c = 6;
174:        this.f(v4);
179:        this.u.add(v0);
        }
184:    v4 = v4 + 1;
185:    goto 44;
193:    v0 = 0;
194:    goto 119;
206:    v0 = 0;
207:    goto 162;
    }

    private final int p() {
        v0 = this.u.size();
        if (this.K != 0)
            v0 = v0 + 1;
        return v0;
    }

    private final int q() {
        if (this.s())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final int r() {
        if (this.e())
            v0 = 1;
        else
            v0 = 0;
        return v0 + 1;
    }

    private final boolean s() {
        v0 = 1;
        if (this.k == 0)
            v0 = 0;
        else if (this.H.a.m() > 0) {
        }
        return v0;
    }

    private final int t() {
        return this.g() + this.r();
    }

    public final void P_() {
        this.u.clear();
        this.o();
        this.a.b();
    }

    public final int a() {
        v0 = this.f();
        v1 = this.g();
        if (!(v0 + v1))
            v0 = 0;
        else
            v0 = v0 + v1 + this.r();
        return v0;
    }

    public int a(int p0) {
        if (p0 == 0)
            v0 = 21;
        else {
            v0 = p0 - 1;
            if (this.e()) {
                if (v0 == 0) {
                    v0 = 22;
                    return v0;
                }
                v0 = v0 - 1;
            }
            if (this.K != 0 && v0 == this.p() + this.q() - 1) {
                if (this.K == 1)
                    v0 = 1;
                else if (this.K == 2)
                    v0 = 0;
                else if (this.K == 3)
                    v0 = 27;
                else {
                    v1 = new Object[1];
                    v1[0] = Integer.valueOf(this.K);
                    FinskyLog.e("Unexpected footer mode: %d", v1);
                    v0 = 0;
                }
                return v0;
            }
            if (this.s()) {
                if (v0 == 0) {
                    v0 = 7;
                    return v0;
                }
                v1 = v0 - 1;
            }
            else
                v1 = v0;
            v0 = (CardRecyclerViewAdapter$ItemEntry)this.u.get(v1);
            if (v1 == this.u.size() - 1 && v0.b < this.H.a.m() - 1)
                this.H.a(this.H.a.m() - 1);
            if (this.H.a(v0.a) == 0)
                v0 = 25;
            else
                v0 = v0.c;
        }
        return v0;
    }

    public android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        return this.c(p0, p1);
    }

    protected void a(Resources p0) {
        if (this.g != 0 && this.h == 0 && this.l == 0)
            v0 = 1;
        else
            v0 = 0;
        if (this.H.a.a == 0)
            FinskyLog.e("Container Document was null", new Object[0]);
        if (this.h != 0) {
            this.w = 2130969234;
            this.v = this.f;
        }
        else if (v0 != 0) {
            this.w = 2130969221;
            this.v = p0.getInteger(2131820598);
        }
        else if (this.H.a.a != 0 && this.H.a.a.a.f == 3 && com.google.android.finsky.m.a.dj().a(12607749) && this.l != 0) {
            this.w = 2130969217;
            this.v = 1;
        }
        else {
            this.w = 2130969608;
            this.v = com.google.android.finsky.m.a.av().h(p0);
        }
    }

    public final void a(android.support.v7.widget.fr p0) {
        this.a((com.google.android.finsky.recyclerview.g)p0);
    }

    public void a(android.support.v7.widget.fr p0, int p1) {
        this.a((com.google.android.finsky.recyclerview.g)p0, p1);
    }

    protected void a(View p0) {
        p0.getLayoutParams().height = this.d();
    }

    public void a(HeroGraphicView p0) {
        v1 = this.H.a.a.c(14);
        if (v1 == 0 || v1.isEmpty())
            p0.a.setVisibility(8);
        else {
            p0.a.setVisibility(0);
            p0.y.a(p0.a, ((com.google.android.finsky.cv.a.bd)v1.get(0)).f, ((com.google.android.finsky.cv.a.bd)v1.get(0)).i);
            p0.h = 0;
        }
    }

    public final void a(Document p0, com.google.android.play.layout.d p1) {
        this.p.b(p0.a.c);
        this.a.b();
    }

    public final void a(com.google.android.finsky.dfemodel.a p0) {
        super.a(p0);
        this.u.clear();
        this.o();
        this.a.b();
    }

    protected void a(BucketRowLayout p0) {
    }

    public final void a(PlayRecyclerView p0, Bundle p1) {
        v1 = 0;
        super.a(p0, p1);
        if (this.u.size() != 0) {
            if (p0.getLayoutManager() instanceof LinearLayoutManager)
                v0 = ((LinearLayoutManager)p0.getLayoutManager()).j();
            else
                v0 = 0;
            if (p0.getChildCount() > 0) {
                v1 = p0.getChildAt(0);
                v2 = v1.getTop();
                v1 = v1.getHeight();
            }
            else
                v2 = 0;
            p1.putInt("CardRecyclerViewAdapter.firstVisibleRow", v0);
            p1.putInt("CardRecyclerViewAdapter.firstVisibleItemEntry", CardRecyclerViewAdapter.a(v2, v1, v0) - this.t());
            p1.putInt("CardRecyclerViewAdapter.rowPixelOffset", v2);
            p1.putInt("CardRecyclerViewAdapter.rowPixelHeight", v1);
            p1.putInt("CardRecyclerViewAdapter.looseItemColumnCount", this.v);
            p1.putInt("CardRecyclerViewAdapter.columnCount", this.f);
            p1.putInt("CardRecyclerViewAdapter.prependedRowsCount", this.g());
            p1.putParcelableArrayList("CardRecyclerViewAdapter.itemEntriesList", this.u);
            p1.putBoolean("CardRecyclerViewAdapter.filterToggleButtonState", this.o);
            v1 = this.z.iterator();
            while (v1.hasNext())
                this.c(((com.google.android.finsky.recyclerview.g)v1.next()).a);
            v2 = this.B.entrySet().iterator();
            while (v2.hasNext()) {
                v0 = (Map$Entry)v2.next();
                p1.putBundle((String)v0.getKey(), (Bundle)v0.getValue());
            }
        }
    }

    public void a(com.google.android.finsky.recyclerview.g p0, int p1) {
  6:    this.z.add(p0);
 17:    v3 = p1 - this.t();
 28:    if (v3 < this.u.size() && v3 >= 0)
 42:        v3 = (CardRecyclerViewAdapter$ItemEntry)this.u.get(v3);
        else
627:        v3 = 0;
 47:    switch (p0.f) {
            case 0:
 47:            goto 142;
            case 1:
 47:            goto 147;
            case 6:
 47:            goto 256;
            case 7:
 47:            goto 165;
            case 16:
 47:            goto 205;
            case 21:
 47:            goto 148;
            case 22:
 47:            goto 154;
            case 25:
 47:            goto 147;
            case 27:
 47:            goto 147;
            default:
        }
 56:    v3 = this.H.a(v3.a);
 64:    if (this.g != 0)
 66:        v4 = 2130969221;
        else
472:        v4 = 2130969234;
 73:    if (this.A == 0)
 82:        this.A = new android.support.v7.widget.ff();
 90:    this.A.a(v4, 50);
103:    ((PlayCardClusterViewV2)p0.a).a(this.d);
114:    v5 = this.H.a(v3.a.c);
118:    v5.a((PlayCardClusterViewV2)p0.a);
121:    v5.a((PlayCardClusterViewV2)p0.a);
138:    if (this == 0)
141:        throw 0;
139:    goto 477;
144:    this.b(p0.a);
147:    return;
150:    this.a(p0.a);
153:    goto 147;
162:    p0.a.getLayoutParams().height = this.r;
164:    goto 147;
177:    if (this.H.a.c())
183:        v3 = this.H.a.a.a.f;
        else
203:        v3 = 0;
192:    ((PlayCardClusterViewHeader)p0.a).a(v3, this.j, 0, 0, 0);
199:    ((PlayCardClusterViewHeader)p0.a).setExtraHorizontalPadding(this.d);
202:    goto 147;
229:    if (!TextUtils.isEmpty(this.H.a.a.a.v.j.a.b))
237:        ((DocImageView)p0.a).setBackgroundColor(Color.parseColor(this.H.a.a.a.v.j.a.b));
245:    v5 = new int[1];
250:    v5[0] = 9;
252:    ((DocImageView)p0.a).a(this.H.a.a, this.c, v5);
255:    goto 147;
258:    v22 = v3.a;
262:    v23 = v3.b;
274:    v3 = 0;
276:    v20 = 0;
278:    while (v20 < this.v) {
288:        if (v22 + v20 > v23)
290:            v2 = 1;
            else
353:            v2 = 0;
291:        if (v2 != 0)
293:            v4 = 0;
            else
359:            v4 = this.H.a(v22 + v20);
298:        if (TextUtils.isEmpty(v3) && v4 != 0)
306:            v21 = v4.a.c;
            else
623:            v21 = v3;
308:        if (v4 != 0 && v4.aZ())
316:            v14 = 1;
            else
364:            v14 = 0;
321:        v3 = (com.google.android.play.layout.d)((BucketRowLayout)p0.a).getChildAt(v20);
329:        if (v4 == 0) {
331:            if (v2 == 0 || v22 + v20 < this.H.a.m()) {
340:                v3.setVisibility(0);
343:                v3.b();
                }
                else
366:                v3.d();
            }
            else {
390:            if (this == 0)
393:                throw 0;
399:            v9 = 0;
404:            if (this.x != 0) {
410:                if (this.y != 0)
412:                    v9 = 1;
                    else
455:                    v9 = this.v;
413:                v9 = -v9;
                }
418:            if (this.l != 0)
420:                v12 = v22 + v20;
                else
458:                v12 = -1;
439:            if (this.q.g() != 10)
441:                v16 = 1;
                else
460:                v16 = 0;
449:            com.google.android.finsky.m.a.cr().a(v3, v4, v22 + v20, this.m, this.q, this.a(v4), this, this.e, 1, v12 + v9, 0, v14, this.n, v16, 0, 0);
            }
348:        v20 = v20 + 1;
350:        v3 = v21;
        }
467:    this.a((BucketRowLayout)p0.a);
470:    goto 147;
483:    v2 = new com.google.android.finsky.adapters.c(v3, v4, v5, (PlayCardClusterViewV2)p0.a, this.J, this.p, this.q, this, this.n);
524:    if (v3 == 0)
526:        v13 = 0;
        else
614:        v13 = v3.a.D;
529:    ((PlayCardClusterViewV2)p0.a).a(v2, this.C.a(v4), this.f, this.A, (Bundle)this.B.get(CardRecyclerViewAdapter.a(v2.a())), this.e, v13, 0);
534:    if (((PlayCardClusterViewV2)p0.a).g != 0)
536:        v2 = 1;
        else
617:        v2 = 0;
537:    if (v2 != 0) {
543:        if (v3.o())
549:            v13 = v3.a.r.i;
            else
619:            v13 = 0;
559:        if (com.google.android.finsky.navigationmanager.e.a(v3))
565:            v2 = new com.google.android.finsky.adapters.b(this, v3, ((PlayCardClusterViewV2)p0.a).getPlayStoreUiElementNode());
            else
621:            v2 = 0;
607:        ((PlayCardClusterViewV2)p0.a).a(v3.a.f, v3.a.g, v3.a.h, com.google.android.finsky.m.a.ct().a(this.J, v3, v3.a(), 0, 0), v2, this.d, v13, 0);
        }
    }

    protected boolean a(Document p0) {
        return com.google.android.finsky.playcard.ac.a(this.p, p0);
    }

    public final void b(PlayRecyclerView p0, Bundle p1) {
  2:    this.B.clear();
  9:    v1 = p1.keySet().iterator();
 13:    while (v1.hasNext()) {
 23:        v0 = (String)v1.next();
 31:        if ((v0.startsWith("CardRecyclerViewAdapter.rowClusterScrollStatePrefix.")) || (v0.equals("CardRecyclerViewAdapter.tagLinksScrollState")) || v0.equals("CardRecyclerViewAdapter.highlightsScrollState"))
 55:            this.B.put(v0, p1.getBundle(v0));
        }
 61:    v5 = p1.getParcelableArrayList("CardRecyclerViewAdapter.itemEntriesList");
 67:    v6 = p1.getInt("CardRecyclerViewAdapter.firstVisibleRow");
 74:    v7 = p1.getInt("CardRecyclerViewAdapter.firstVisibleItemEntry", -1);
 80:    v8 = p1.getInt("CardRecyclerViewAdapter.rowPixelOffset");
 93:    v0 = p1.getInt("CardRecyclerViewAdapter.columnCount", -1);
100:    v1 = p1.getInt("CardRecyclerViewAdapter.looseItemColumnCount", -1);
107:    v2 = p1.getInt("CardRecyclerViewAdapter.prependedRowsCount", -1);
117:    this.o = p1.getBoolean("CardRecyclerViewAdapter.filterToggleButtonState");
119:    if (v5 == 0) {
136:        this.o();
141:        this.a.b();
148:        this.H.a.n();
151:        super.b(p0, p1);
154:        return;
        }
125:    if (v5.size() == 0) {
136:        this.o();
141:        this.a.b();
148:        this.H.a.n();
151:        super.b(p0, p1);
154:        return;
        }
128:    if (v1 == -1) {
136:        this.o();
141:        this.a.b();
148:        this.H.a.n();
151:        super.b(p0, p1);
154:        return;
        }
131:    if (v2 == -1) {
136:        this.o();
141:        this.a.b();
148:        this.H.a.n();
151:        super.b(p0, p1);
154:        return;
        }
134:    if (v0 == -1) {
136:        this.o();
141:        this.a.b();
148:        this.H.a.n();
151:        super.b(p0, p1);
154:        return;
        }
157:    if (v0 != this.f || v1 != this.v || v2 != this.g())
169:        v0 = 1;
        else
228:        v0 = 0;
170:    if (v0 == 0) {
422:        this.u = v5;
426:        this.a.b();
435:        if (p0.getLayoutManager() instanceof LinearLayoutManager)
443:            ((LinearLayoutManager)p0.getLayoutManager()).a(v6, v8);
446:        return;
        }
173:    v1 = 0;
178:    if (v1 >= v5.size()) goto 305;
190:    if (!((CardRecyclerViewAdapter$ItemEntry)v5.get(v1)).a()) goto 288;
193:    v2 = v1;
194:    v3 = 0;
195:    v4 = v1;
196:    while (v2 < v5.size()) {
206:        v0 = (CardRecyclerViewAdapter$ItemEntry)v5.get(v2);
212:        if (!v0.a())
212:            break;
222:        v3 = v3 + v0.b + 1 - v0.a;
225:        v4 = v2;
226:        v2 = v2 + 1;
        }
243:    v1 = ((CardRecyclerViewAdapter$ItemEntry)v5.get(v1)).a;
253:    v0 = 0;
254:    while (v0 < (v3 + this.v - 1) / this.v) {
267:        v11 = new CardRecyclerViewAdapter$ItemEntry();
270:        v11.a = v1;
272:        v11.b = Math.min(this.v + v1 - 1, ((CardRecyclerViewAdapter$ItemEntry)v5.get(v4)).b);
275:        v11.c = 6;
279:        this.u.add(v11);
284:        v1 = v1 + this.v;
285:        v0 = v0 + 1;
        }
287:    goto 300;
296:    this.u.add((CardRecyclerViewAdapter$ItemEntry)v5.get(v1));
299:    v4 = v1;
302:    v1 = v4 + 1;
303:    goto 174;
305:    if (v7 < 0) goto 388;
311:    v0 = (CardRecyclerViewAdapter$ItemEntry)v5.get(v7);
316:    v2 = 0;
323:    if (v2 >= this.u.size()) goto 385;
331:    v1 = (CardRecyclerViewAdapter$ItemEntry)this.u.get(v2);
337:    if (v1.a < v0.a) goto 381;
343:    if (v1.a > v0.a) goto 385;
346:    if (v0.d != -1) goto 373;
352:    v0 = this.t() + v2;
357:    if (v0 >= this.a())
419:        v0 = this.a() - 1;
361:    this.a.b();
368:    p0.getLayoutManager().d(v0);
371:    return;
375:    if (v1.d <= v0.d && v0.d <= v1.e) {
352:        v0 = this.t() + v2;
357:        if (v0 >= this.a())
419:            v0 = this.a() - 1;
361:        this.a.b();
368:        p0.getLayoutManager().d(v0);
371:        return;
        }
383:    v2 = v2 + 1;
384:    goto 317;
385:    v2 = v2 - 1;
387:    goto 348;
388:    v0 = CardRecyclerViewAdapter.a(v8, p1.getInt("CardRecyclerViewAdapter.rowPixelHeight"), v6);
401:    if (v0 >= this.r() + this.g())
412:        v0 = this.r() + this.g() - 1;
414:    goto 353;
    }

    public final boolean b(android.support.v7.widget.fr p0) {
        return 1;
    }

    public com.google.android.finsky.recyclerview.g c(ViewGroup p0, int p1) {
        v1 = 0;
        switch (p1) {
            case 0:
                v0 = this.a(2130968823, p0);
                break;
            case 1:
                v0 = this.a(2130969082, p0);
                break;
            case 6:
                if (this.h != 0)
                    v0 = this.a(2130969213, p0);
                else {
                    v0 = (BucketRowLayout)this.a(2130968667, p0);
                    if (this.w == 2130969217)
                        android.support.v4.view.ai.a(v0, 0, 0, 0, 0);
                    else
                        v0.setContentHorizontalPadding(this.d);
                    while (v1 < this.v) {
                        v0.addView(this.a(this.w, v0));
                        v1 = v1 + 1;
                    }
                }
                break;
            case 7:
                v0 = this.a(2130969215, p0);
                break;
            case 16:
                v0 = this.a(2130968643, p0);
                break;
            case 21:
                v0 = this.a(p0);
                break;
            case 22:
                v0 = this.a(2130969494, p0);
                break;
            case 25:
                v0 = this.a(2130969085, p0);
                break;
            case 27:
                v0 = this.a(2130969156, p0);
                break;
            default:
                v0 = this.a(2130969216, p0);
                break;
        }
        return new com.google.android.finsky.recyclerview.g(v0);
    }

    public boolean c() {
        return 0;
    }

    public final void ce_() {
    }

    protected int d() {
        if (this.s != 0) {
            v0 = this.s.ah();
            if (v0 > 0)
                return v0;
        }
        v0 = FinskyHeaderListLayout.a(this.J, this.t, 0);
        return v0;
    }

    protected boolean e() {
        return 1;
    }

    protected int f() {
        return this.p();
    }

    protected int g() {
        return this.q();
    }

    public final void h() {
        v0 = this.z.toArray(new g[this.z.size()]);
        v1 = 0;
        while (v1 < ((g[])v0).length) {
            this.a(((g[])v0)[v1]);
            v1 = v1 + 1;
        }
        this.D.b(this);
        super.h();
    }

    public void m_() {
        this.o();
        super.m_();
    }

}
