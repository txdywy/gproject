package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.AsyncTask;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.support.v4.view.ViewPager;
import android.support.v4.view.af;
import android.support.v4.view.b.b;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ff;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.animation.Animation;
import android.widget.FrameLayout$LayoutParams;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.android.finsky.a.a;
import com.google.android.finsky.a.c;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.api.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.d;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bb.b;
import com.google.android.finsky.bb.c;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ad;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.bl.a;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.detailscomponents.g;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.g;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.l;
import com.google.android.finsky.dfemodel.u;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.dq.h;
import com.google.android.finsky.ea.c;
import com.google.android.finsky.ea.d;
import com.google.android.finsky.ea.g;
import com.google.android.finsky.family.b.a;
import com.google.android.finsky.frameworkviews.InsetsFrameLayout;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.headerlistlayout.FinskyTabStrip;
import com.google.android.finsky.headerlistlayout.c;
import com.google.android.finsky.headerlistlayout.i;
import com.google.android.finsky.ia2.Ia2SubNavView;
import com.google.android.finsky.ia2.c;
import com.google.android.finsky.ia2.d;
import com.google.android.finsky.ia2.l;
import com.google.android.finsky.ia2.q;
import com.google.android.finsky.ia2.v;
import com.google.android.finsky.layout.o;
import com.google.android.finsky.layout.play.FinskyViewPager;
import com.google.android.finsky.layout.play.ah;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.o;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.pagesystem.j;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.stream.a.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.v.b;
import com.google.android.finsky.y.a;
import com.google.android.libraries.bind.b.c;
import com.google.android.play.animation.e;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;
import com.google.android.play.utils.k;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.aa;
import com.google.wireless.android.finsky.dfe.nano.ab;
import com.google.wireless.android.finsky.dfe.nano.ae;
import com.google.wireless.android.finsky.dfe.nano.gj;
import com.google.wireless.android.finsky.dfe.nano.gp;
import com.google.wireless.android.finsky.dfe.nano.y;
import com.google.wireless.android.finsky.dfe.nano.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.activities.gn extends com.google.android.finsky.pagesystem.j implements android.support.v4.view.bi, com.google.android.finsky.activities.gm, com.google.android.finsky.d.al, com.google.android.finsky.frameworkviews.ah, com.google.android.finsky.ia2.x, com.google.android.play.headerlist.n
{

    public com.google.android.finsky.dfemodel.g a;
    public FinskyTabStrip aA;
    public com.google.android.finsky.headerlistlayout.c aB;
    public AsyncTask aC;
    public AsyncTask aD;
    public android.support.v7.widget.ff aE;
    public com.google.android.finsky.ea.d aF;
    public com.google.android.finsky.accounts.c aG;
    public com.google.android.finsky.by.c aH;
    public com.google.android.finsky.detailscomponents.g aI;
    public com.google.android.finsky.bg.k aJ;
    public com.google.android.finsky.ea.g aK;
    public com.google.android.finsky.bl.a aL;
    public Ia2SubNavView aM;
    public int aN;
    public int ag;
    public int ah;
    public int ai;
    public com.google.android.finsky.utils.ac aj;
    public com.google.wireless.android.a.a.a.a.ce ak;
    public boolean al;
    public int am;
    public int an;
    public boolean ao;
    public boolean ap;
    public com.google.android.finsky.activities.gq aq;
    public boolean ar;
    public FinskyViewPager as;
    public FinskyHeaderListLayout at;
    public com.google.android.finsky.a.a au;
    public com.google.android.finsky.activities.gk av;
    public ViewGroup aw;
    public com.google.android.finsky.layout.o ax;
    public ViewGroup az;
    public boolean c;
    public int e;
    public int f;
    public int g;
    public String h;
    public com.google.android.finsky.ba.c n_;
    public j[] s_;

    gn() {
        com.google.android.finsky.pagesystem.j();
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.ah = 3;
        this.ai = -1;
        this.aj = new com.google.android.finsky.utils.ac();
        this.ak = com.google.android.finsky.d.j.a(1);
    }

    public static com.google.android.finsky.activities.gn a(String p0, String p1, int p2, DfeToc p3, com.google.android.finsky.d.w p4) {
        return com.google.android.finsky.activities.gn.a(p0, p1, 0, p2, 0, p3, p4);
    }

    public static com.google.android.finsky.activities.gn a(String p0, String p1, boolean p2, int p3, int p4, DfeToc p5, com.google.android.finsky.d.w p6) {
        v0 = new com.google.android.finsky.activities.gn();
        if (p3 >= 0)
            v0.e = p3;
        if (p4 != 0)
            v0.f = p4;
        if (!TextUtils.isEmpty(p1))
            v0.h = p1;
        v0.a(p5, p0);
        v0.a(p6);
        v0.d("TabbedBrowseFragment.IsFromDeeplink", p2);
        return v0;
    }

    private final void a(int p0, boolean p1) {
  1:    v1 = 0;
 12:    this.e = this.a.a.d[p0].l;
 26:    if (this.a.a.d[p0].f())
 36:        v0 = this.a.a.d[p0].n;
        else
213:        v0 = 0;
 38:    this.f = v0;
 52:    if (this.a.a.d[p0].e())
 62:        v0 = this.a.a.d[p0].m;
        else
216:        v0 = 0;
 64:    this.g = v0;
 75:    this.bm.a(this.e, this.f, this.g, 1);
 78:    if (p1 == 0) {
 82:        v0 = this.aA.getPager();
 86:        if (v0 == 0)
 88:            v0 = 0;
            else
219:            v0 = v0.getAdapter();
 89:        if (v0 == 0)
 91:            v0 = 0;
            else
231:            v0 = this.aA.d.getChildAt(com.google.android.libraries.bind.b.c.b(v0, p0));
 93:        v2 = new int[2];
 95:        v0.getLocationOnScreen(v2);
109:        this.aB.m = v0.getWidth() / 2 + v2[0];
        }
115:    this.aB.a(this.e);
127:    v0 = this.bn.getResources().getColor(2131558832);
133:    this.at.a(v0, v0);
149:    if (com.google.android.finsky.m.a.dj().a(12633956)) {
170:        switch (this.e) {
                case 1:
241:                v0 = 2131558653;
260:                break;
                case 2:
253:                v0 = 2131558729;
260:                break;
                case 3:
237:                v0 = 2131558635;
260:                break;
                case 4:
249:                v0 = 2131558709;
260:                break;
                case 5:
173:                v0 = 2131558718;
260:                break;
                case 6:
245:                v0 = 2131558740;
260:                break;
                default:
173:                v0 = 2131558718;
260:                break;
            }
180:        while (v1 < this.aA.d.getChildCount()) {
204:            if (this.aA.getPager().getCurrentItem() == v1)
206:                v2 = this.aA.getResources().getColor(17170443);
                else
257:                v2 = this.aA.getResources().getColor(v0);
207:            ((TextView)this.aA.d.getChildAt(v1)).setTextColor(v2);
210:            v1 = v1 + 1;
            }
        }
212:    goto 259;
259:    return;
    }

    private final boolean aq() {
        v0 = 1;
        if (this.al == 0) {
            if ((TextUtils.equals(this.bF, this.k_.a.h)) || TextUtils.equals(this.bF, this.k_.a.i))
                v2 = 1;
            else
                v2 = 0;
            if (v2 == 0 || this.k_.b().size() <= 1)
                v0 = 0;
        }
        return v0;
    }

    private final ColorDrawable ar() {
        return new ColorDrawable(com.google.android.finsky.bg.h.a(this.h(), this.e));
    }

    private final boolean as() {
        if (this.q.getBoolean("TabbedBrowseFragment.IsFromDeeplink") && this.aq != 0 && this.aq.b != 0 && this.aq.b.e() != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final void av() {
        v3 = 0;
        v1 = 0;
        if (this.a == 0) {
            this.ap = 0;
            v0 = this.bF;
            if (TextUtils.equals(this.bF, this.k_.a.h)) {
                v0 = Uri.parse(v0).buildUpon();
                v0.appendQueryParameter("nocache_isui", Boolean.toString(1));
                v0 = v0.build().toString();
            }
            this.a = new com.google.android.finsky.dfemodel.g(this.bo, v0);
            this.a.a(this);
            this.a.a(this);
            return;
        }
        if (!this.a.a()) {
            this.ap = 0;
            v0 = this.bF;
            if (TextUtils.equals(this.bF, this.k_.a.h)) {
                v0 = Uri.parse(v0).buildUpon();
                v0.appendQueryParameter("nocache_isui", Boolean.toString(1));
                v0 = v0.build().toString();
            }
            this.a = new com.google.android.finsky.dfemodel.g(this.bo, v0);
            this.a.a(this);
            this.a.a(this);
        }
        else {
            if (this.ao()) {
                if (this.a.a == 0 || this.a.a.k.length == 0)
                    v0 = 0;
                else
                    v0 = this.a.a.k;
                com.google.android.finsky.d.j.a(this.ak, v0);
                if (this.a.a.r != 0 || this.a.a.i != 0)
                    v3 = new com.google.android.finsky.activities.gq(this.a.a.r, this.a.a.i);
                this.aq = v3;
                this.c = 1;
                if (!com.google.android.finsky.m.a.dj().a(12636210))
                    this.l(1719);
                return;
            }
            if (this.ap != 0) {
                if (this.a.a == 0 || this.a.a.k.length == 0)
                    v0 = 0;
                else
                    v0 = this.a.a.k;
                com.google.android.finsky.d.j.a(this.ak, v0);
                if (this.a.a.r != 0 || this.a.a.i != 0)
                    v3 = new com.google.android.finsky.activities.gq(this.a.a.r, this.a.a.i);
                this.aq = v3;
                this.c = 1;
                if (!com.google.android.finsky.m.a.dj().a(12636210))
                    this.l(1719);
                return;
            }
            if (TextUtils.isEmpty(this.a.a.d[this.a.a.e].g)) {
                if (this.a.a == 0 || this.a.a.k.length == 0)
                    v0 = 0;
                else
                    v0 = this.a.a.k;
                com.google.android.finsky.d.j.a(this.ak, v0);
                if (this.a.a.r != 0 || this.a.a.i != 0)
                    v3 = new com.google.android.finsky.activities.gq(this.a.a.r, this.a.a.i);
                this.aq = v3;
                this.c = 1;
                if (!com.google.android.finsky.m.a.dj().a(12636210))
                    this.l(1719);
                return;
            }
            if (this.s_ != 0 && (this.s_[this.a.a.e].a())) {
                if (this.aj()) {
                    this.al = 1;
                    if (this.s_[this.a.a.e].m() <= 0)
                        v1 = 1;
                    this.ao = v1;
                }
                else {
                    if (this.bp.a()) {
                        v1 = 1;
                        v0 = this;
                    }
                    else if (this.s_[this.a.a.e].m() > 0) {
                        v1 = 1;
                        v0 = this;
                    }
                    else
                        v0 = this;
                    v0.al = v1;
                }
                if (this.a.a == 0 || this.a.a.k.length == 0)
                    v0 = 0;
                else
                    v0 = this.a.a.k;
                com.google.android.finsky.d.j.a(this.ak, v0);
                if (this.a.a.r != 0 || this.a.a.i != 0)
                    v3 = new com.google.android.finsky.activities.gq(this.a.a.r, this.a.a.i);
                this.aq = v3;
                this.c = 1;
                if (!com.google.android.finsky.m.a.dj().a(12636210))
                    this.l(1719);
                return;
            }
            this.s_ = new j[this.a.a.d.length];
            v0 = 0;
            while (v0 < this.a.a.d.length) {
                if (TextUtils.isEmpty(this.a.a.d[v0].g))
                    this.s_[v0] = 0;
                else {
                    com.google.android.finsky.m.a.aO();
                    v5 = com.google.android.finsky.dfemodel.l.a(this.bo, this.a.a.d[v0].g, 0, 1);
                    this.s_[v0] = v5;
                    if (v0 == this.a.a.e) {
                        v5.a(this);
                        v5.a(this);
                        v5.n();
                    }
                }
                v0 = v0 + 1;
            }
        }
    }

    private final String aw() {
        v0 = 0;
        if (this.a != 0 && this.a.a != 0)
            v0 = this.a.a.j;
        return v0;
    }

    private final void b(int p0, boolean p1) {
        if (this.aM != 0 && this.a.a.d[p0].h != 0) {
            v6 = this.av.h();
            this.al();
            if (p1 != 0) {
                this.aM.a.clearAnimation();
                this.aM.g.removeCallbacksAndMessages(0);
                this.aM.a.startAnimation(this.aM.h);
                this.aM.g.postDelayed(new com.google.android.finsky.ia2.v(this.aM, this.a.a.d[p0].h.b, this.a.a.d[p0].l, this.a.a.d[p0].m, this, v6), this.aM.h.getDuration());
            }
            else {
                this.aM.g.removeCallbacksAndMessages(0);
                this.aM.a(this.a.a.d[p0].h.b, this.a.a.d[p0].l, this.a.a.d[p0].m, this, v6);
            }
            this.n(v6);
            this.o(v6);
        }
    }

    private final void l(int p0) {
        if (TextUtils.equals(this.bF, this.k_.a.h)) {
            if (p0 == 1703)
                this.i(1);
            else if (p0 == 1704 || p0 == 1706 || p0 == 1705)
                this.j(p0);
            else
                this.k(p0);
        }
    }

    private final com.google.wireless.android.finsky.dfe.nano.z m(int p0) {
        if (this.a.a.d[this.av.y].h != 0 && p0 >= 0 && p0 < this.a.a.d[this.av.y].h.b.length)
            v0 = this.a.a.d[this.av.y].h.b[p0];
        else
            v0 = 0;
        return v0;
    }

    private final void n(int p0) {
        v0 = this.m(p0);
        if (v0 != 0)
            com.google.android.finsky.m.a.h(com.google.android.finsky.m.a.cZ()).e = v0.h;
    }

    private final void o(int p0) {
        v0 = 0;
        v3 = this.m(p0);
        if (v3 != 0) {
            if (v3.b & 16)
                v1 = 1;
            else
                v1 = 0;
            if (v1 != 0)
                v0 = v3.i;
            this.f = v0;
            this.bm.a(this.e, this.f, this.g, 1);
        }
    }

    final boolean N_() {
        v0 = 1;
        if (this.a.a.d.length <= 1 || this.a.a.h != 2)
            v0 = 0;
        return v0;
    }

    protected final int Z() {
        return 2130968962;
    }

    protected final com.google.android.finsky.layoutswitcher.e a(ContentFrame p0) {
        return new com.google.android.finsky.headerlistlayout.i(p0, this, 0);
    }

    public final void a(int p0, float p1, int p2) {
    }

    public final void a(int p0, byte[] p1, byte[] p2) {
        if (this.ar != 0 && this.bC > 0)
            this.bE.a(this.bw, p0, this.bC, p1, p2);
    }

    public final void a(int p0, byte[] p1, byte[] p2, boolean p3) {
        if (p0 == 1733)
            this.bE.a(this.bw, p0, this.bC, p1, 0);
        else if (p0 == 1737)
            this.bE.a(this.bw, p0, this.bC, p1, p2);
        this.ar = p3;
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.o)com.google.android.finsky.providers.d.a(com.google.android.finsky.o)).a(this);
        super.a(p0);
    }

    public final void a(VolleyError p0) {
        if (this.a != 0 && this.a.a()) {
            this.ap = 1;
            this.s_ = 0;
            this.av();
            if (this.c != 0)
                super.m_();
        }
        else
            super.a(p0);
    }

    public final void a(com.google.android.finsky.activities.gp p0) {
        v2 = 0;
        v1 = 1;
        if (this.al == 0) {
            if (this.av.a() == 1)
                v0 = 1;
            else
                v0 = 0;
            if (this.aq != 0)
                v4 = 1;
            else
                v4 = 0;
            if (p0 != 0 && p0.c())
                v3 = 1;
            else
                v3 = 0;
            if (v0 != 0 && (v4 != 0 || v3 != 0)) {
                this.ax.a(0);
                this.at.post(new com.google.android.finsky.activities.go(this, v3, p0));
                this.at.setAlwaysUseFloatingBackground(0);
                if (p0 != 0)
                    this.at.setHeaderShadowMode(1);
                v4 = this.bn.getResources();
                v0 = 0;
                if (v3 != 0)
                    v2 = (int)((float)v4.getDimensionPixelSize(2131625236) * 1050253722) + 0;
                else if (this.aq != 0)
                    v0 = 1058013184;
                v0 = com.google.android.finsky.detailscomponents.g.a(this.bn, com.google.android.finsky.bg.k.l(v4), 1, v0, com.google.android.finsky.bg.k.n(v4)) + v2;
                if (this.ax != 0)
                    v0 = v0 + this.ax.d;
                if (InsetsFrameLayout.a != 0)
                    v0 = v0 - com.google.android.play.utils.k.e(this.bn);
                this.am = v0;
                this.at.b(2, this.ah());
                this.au = new com.google.android.finsky.a.a(this.h().getWindow(), this.at);
                this.at.setOnLayoutChangedListener(this.au);
                this.au.b();
            }
            else {
                if (this.ax != 0)
                    this.ax.a(8);
                if (this.ag == 1)
                    v1 = 0;
                this.at.setAlwaysUseFloatingBackground(v1);
                this.at.setOnLayoutChangedListener(0);
            }
        }
    }

    protected final void aa() {
        this.av();
    }

    public final int ab() {
        return this.e;
    }

    public final void ac() {
        this.bm.c(this.h);
        this.bm.a(this.e, this.f, this.g, this.c);
        if (com.google.android.finsky.m.a.dj().a(12624205))
            this.bm.d(this.aw());
        if ((this.aq()) || this.aj())
            this.bm.c(1);
        else if (this.c != 0) {
            if (this.as()) {
                this.bq.j();
                this.bm.c(this.h);
                this.bm.d(this.aw());
            }
            this.bm.z();
        }
    }

    protected final Transition ae() {
        return new com.google.android.finsky.dq.h(this.e);
    }

    public final int af() {
        if ((this.aq()) || this.c == 0)
            v0 = this.i().getColor(2131558767);
        else
            v0 = com.google.android.finsky.bg.h.a(this.h(), this.e);
        return v0;
    }

    protected final boolean ag() {
        return 1;
    }

    public final int ah() {
        if (this.ao != 0)
            v0 = this.an;
        else
            v0 = this.am;
        return v0;
    }

    final boolean aj() {
        v0 = 0;
        if (this.c != 0 && this.a.a.h == 3 && this.bp.a())
            v0 = 1;
        return v0;
    }

    protected final int ak() {
        return this.ah;
    }

    public final com.google.android.finsky.d.ad al() {
        if (this.as == 0 || this.av == 0)
            v0 = super.al();
        else
            v0 = ((com.google.android.finsky.activities.gl)this.av.u.get(com.google.android.libraries.bind.b.c.a(this.av, this.as.getCurrentItem()))).f;
        return v0;
    }

    public final boolean am() {
  0:    v0 = 1;
  5:    if (this.ao() && this.aM != 0 && this.av != 0 && this.av.h() > 0) {
 27:        this.aM.a(0, 1, 2);
 30:        return v0;
        }
 37:    if (this.bp.g() != 1) goto 70;
 42:    if (this.e == 3) {
 46:        if (this.g != 0 && TextUtils.equals(this.bF, this.k_.a.h))
 66:            this.bp.a(this.k_, this.bw);
            else
 70:            v0 = super.am();
        }
 69:    return v0;
    }

    public final boolean an() {
        v0 = 1;
        if (com.google.android.finsky.m.a.dj().a(12626320) && this.aq != 0 && this.aq.b != 0 && this.aq.b.e() != 0)
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0)
            this.bp.a(this.k_, this.bw);
        else
            v0 = super.an();
        return v0;
    }

    final boolean ao() {
        if (this.aL.a(this.k_) && this.bp.a())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    final void ap() {
        if (this.ax.e.getVisibility() == 0)
            v0 = 1;
        else
            v0 = 0;
        this.at.setHasBackgroundImage(v0);
    }

    public final void b(int p0) {
        v1 = com.google.android.libraries.bind.b.c.a(this.av, p0);
        this.av.c(v1);
        if (this.ao())
            this.b(v1, 1);
        v0 = (String)this.av.a(v1);
        if (!TextUtils.isEmpty(v0) && this.bp != 0 && this.bp.h()) {
            v5 = new Object[1];
            v5[0] = v0;
            com.google.android.finsky.bg.a.a(this.bn, this.bn.getString(2131951652, v5), this.as, 0);
        }
        if (this.aj()) {
            if (this.aA.h != 0)
                this.aA.setTabStripClicked(0);
            this.a(v1, this.aA.h);
        }
    }

    public final void b(int p0, int p1) {
        if (this.av != 0) {
            v0 = ((com.google.android.finsky.activities.gl)this.av.u.get(this.av.y)).c;
            if (v0 != 0) {
                if (v0 instanceof com.google.android.finsky.ia2.c) {
                    if (((com.google.android.finsky.ia2.c)v0).c != 0)
                        ((com.google.android.finsky.ia2.c)v0).c.a(p0, p1, 1);
                }
                else if (v0 instanceof com.google.android.finsky.ia2.d) {
                    ((com.google.android.finsky.ia2.d)v0).b.a(p0, p1);
                    ((com.google.android.finsky.ia2.d)v0).b(1);
                }
                else {
                    v0 = String.valueOf(v0.getClass().toString());
                    if (v0.length() != 0)
                        v0 = "Unexpected ViewPagerTab type:".concat(v0);
                    else
                        v0 = new String("Unexpected ViewPagerTab type:");
                    FinskyLog.e(v0, new Object[0]);
                }
            }
        }
        this.n(p0);
        this.o(p0);
    }

    public final void b(int p0, byte[] p1, byte[] p2, boolean p3) {
        if (p0 == 1734 || p0 == 1736 || p0 == 1735)
            this.bE.a(this.bw, p0, this.bC, p1, 0);
        else if (p0 == 1738 || p0 == 1740 || p0 == 1739)
            this.bE.a(this.bw, p0, this.bC, p1, p2);
        if (this.ar != 0 && p3 == 0)
            v0 = 1;
        else
            v0 = 0;
        this.ar = v0;
    }

    public final void b(Bundle p0) {
        v0 = 1;
        super.b(p0);
        this.l(1703);
        this.L = 1;
        if (!this.aq())
            v0 = 0;
        this.ag = v0;
    }

    public final void cg_() {
  4:    if (this.a != 0 && this.a.b()) {
 36:        if (this.a.b() && this.a.a.p != 0)
 44:            v2 = 1;
            else
1146:            v2 = 0;
 45:        com.google.android.finsky.m.a.h(com.google.android.finsky.m.a.cZ()).e = v2;
        }
 47:    v26 = this.i();
 59:    this.at = (FinskyHeaderListLayout)this.bt;
 79:    if (this.aq != 0)
 81:        v2 = 1;
        else
1149:        v2 = 0;
 91:    this.at.a(new com.google.android.finsky.activities.gr(this, this.at.getContext(), this.ag, v2));
102:    this.at.setBackgroundViewForTouchPassthrough(this.aw);
110:    this.at.setAlwaysUseFloatingBackground(1);
121:    this.at.setFloatingControlsBackground(this.ar());
134:    this.e = this.a.a.c;
140:    if (this.h == 0) {
146:        if (this.as())
155:            v2 = this.bn.getString(2131951701);
            else {
1158:            v2 = this.a.a.b;
1160:            if (v2 == 0) {
1170:                v2 = this.k_.a(this.e);
1174:                if (v2 == 0)
1176:                    v2 = "";
1188:                else if (!this.bp.w())
1197:                    v2 = this.bn.getString(2131952409);
                    else
1203:                    v2 = v2.d;
                }
            }
161:        this.h = v2;
        }
163:    this.ac();
174:    if (!TextUtils.isEmpty(this.h) && this.bp != 0 && this.bp.h())
205:        com.google.android.finsky.bg.a.a(this.bn, this.h, this.R, 0);
212:    v4 = this.h().getLayoutInflater();
216:    v21 = 0;
222:    if (this.al != 0)
228:        v21 = this.s_;
236:    v2 = com.google.android.finsky.m.a.aN().dj();
244:    if (this.aE == 0 && this.h() instanceof MainActivity && v2.a(12630046) && v2.a(12635663) && this.bp.a()) {
286:        v2 = (MainActivity)this.h();
291:        v2.ac = 0;
295:        this.aE = v2.ac;
        }
312:    this.as = (FinskyViewPager)this.bt.findViewById(2131756034);
427:    this.av = new com.google.android.finsky.activities.gk(this.bn, v4, this.aJ, this.bp, this.k_, this.bo, com.google.android.finsky.m.a.h(com.google.android.finsky.m.a.cZ()), this.aI, this.bD, this.a.a.d, this.a.a.e, (com.google.android.finsky.utils.ac)this.aj.b("TabbedBrowseFragment.AdapterState"), this, this, this, this.at, this.as.getOffscreenPageLimit(), this.bw, v21, this, this.aE, this.br, this);
438:    if (this.av.a() > 1)
441:        v3 = 0;
        else
1208:        v3 = 2;
450:    if ((this.N_()) || this.aL.a())
462:        v2 = 1;
        else
1211:        v2 = 0;
463:    this.aA.setAnimateOnTabClick(v2);
470:    if ((this.N_()) || this.al != 0 || this.aj()) {
488:        if (!this.aj()) {
495:            this.aA.c = 1;
497:            v2 = this.aA.getResources();
508:            this.aA.setSelectedUnderlineThickness(v2.getDimensionPixelSize(2131624400));
518:            this.aA.f = v2.getBoolean(2131492903);
527:            if (v2.getBoolean(2131492906))
530:                this.aA.f = 1;
534:            if (this.aA.f != 0) {
539:                v6 = this.aA.findViewById(2131756414);
547:                v2 = (FrameLayout$LayoutParams)v6.getLayoutParams();
551:                v2.gravity = 17;
553:                v6.setLayoutParams(v2);
                }
556:            this.aA.requestLayout();
            }
563:        this.aA.d();
571:        this.at.setAlwaysUseFloatingBackground(0);
582:        this.aB.i = this.at;
585:        this.aB.k = 0;
        }
597:    if (this.e != 9)
599:        v2 = 1;
        else
1214:        v2 = 0;
600:    this.at.setShouldUseScrollLocking(v2);
611:    this.as.setAdapter(this.av);
618:    if (this.ao() && this.aL.h()) {
638:        if (this.aL.a() && this.aL.b.dj().a(12642036))
655:            v2 = 1;
            else
1217:            v2 = 0;
656:        if (v2 != 0)
665:            v2 = new com.google.android.finsky.ea.d(new com.google.android.finsky.ea.c());
            else
1220:            v2 = com.google.android.finsky.ea.g.a();
670:        this.aF = v2;
684:        this.aF.a(this.as, this.av);
        }
700:    this.as.setPageMargin(v26.getDimensionPixelSize(2131625512));
707:    if (!this.ao()) {
774:        if (this.bp.a() && this.n_.dj().a(12644646))
798:            this.as.ah = 1;
806:        this.at.K.d();
815:        this.at.setOnPageChangeListener(this);
824:        this.at.setOnTabSelectedListener(this);
831:        if (!this.N_())
858:            this.at.a(v26.getColor(2131558832), com.google.android.finsky.bg.h.a(this.bn, this.e));
865:        if ((this.al != 0 || this.N_()) && !this.aj()) {
884:            this.as.ah = 1;
891:            this.at.setHeaderMode(0);
            }
898:        if (this.ao())
926:            this.an = FinskyHeaderListLayout.b(this.bn, v3, this.at.getActionBarHeight(), this.at.getSubNavHeight());
            else
1266:            this.an = FinskyHeaderListLayout.a(this.bn, v3, 0, this.at.getActionBarHeight());
932:        if (this.ax == 0)
960:            this.ax = new com.google.android.finsky.layout.o(this.e, this.aw, this.az, v4, this.bn, this);
971:        this.ax.a(this.aq, 0);
974:        this.ap();
981:        if (this.aq != 0) {
985:            v2 = this.at;
990:            v4 = v2;
991:            v2 = 2;
            }
1278:        else if (this.bp.a() && com.google.android.finsky.m.a.ay().a()) {
1294:            v4 = this.at;
1296:            v2 = 3;
            }
            else {
1303:            if (this.al == 0) {
1008:                if (this.az != 0) {
1019:                    this.az.getLayoutParams().width = -1;
1030:                    this.az.getLayoutParams().height = -1;
                    }
1038:                this.am = this.an;
1048:                this.at.b(v3, this.ah());
1056:                if (this.ag != 1)
1066:                    this.at.setFloatingControlsBackground(this.ar());
1074:                if (this.ai != -1) {
1078:                    v2 = this.ai;
1083:                    this.ai = -1;
                    }
                    else
1332:                    v2 = this.a.a.e;
1105:                v4 = com.google.android.libraries.bind.b.c.b(this.av, v2);
1109:                if (com.google.android.libraries.bind.b.c.a(this.av, this.as.getCurrentItem()) == v2) {
1115:                    this.av.c(v2);
1120:                    this.h(v4);
                    }
                    else {
1341:                    this.as.a(v4, 0);
1346:                    this.h(v4);
                    }
1127:                if (this.ao())
1132:                    this.b(v2, 0);
1135:                this.O_();
1142:                this.by.run();
1145:                return;
                }
1309:            if (this.aj()) {
1008:                if (this.az != 0) {
1019:                    this.az.getLayoutParams().width = -1;
1030:                    this.az.getLayoutParams().height = -1;
                    }
1038:                this.am = this.an;
1048:                this.at.b(v3, this.ah());
1056:                if (this.ag != 1)
1066:                    this.at.setFloatingControlsBackground(this.ar());
1074:                if (this.ai != -1) {
1078:                    v2 = this.ai;
1083:                    this.ai = -1;
                    }
                    else
1332:                    v2 = this.a.a.e;
1105:                v4 = com.google.android.libraries.bind.b.c.b(this.av, v2);
1109:                if (com.google.android.libraries.bind.b.c.a(this.av, this.as.getCurrentItem()) == v2) {
1115:                    this.av.c(v2);
1120:                    this.h(v4);
                    }
                    else {
1341:                    this.as.a(v4, 0);
1346:                    this.h(v4);
                    }
1127:                if (this.ao())
1132:                    this.b(v2, 0);
1135:                this.O_();
1142:                this.by.run();
1145:                return;
                }
1313:            v2 = this.at;
1316:            if (v3 == 2) {
990:                v4 = v2;
991:                v2 = 2;
993:                v4.setHeaderShadowMode(v2);
1001:                this.at.setAlwaysUseFloatingBackground(1);
1008:                if (this.az != 0) {
1019:                    this.az.getLayoutParams().width = -1;
1030:                    this.az.getLayoutParams().height = -1;
                    }
1038:                this.am = this.an;
1048:                this.at.b(v3, this.ah());
1056:                if (this.ag != 1)
1066:                    this.at.setFloatingControlsBackground(this.ar());
1074:                if (this.ai != -1) {
1078:                    v2 = this.ai;
1083:                    this.ai = -1;
                    }
                    else
1332:                    v2 = this.a.a.e;
1105:                v4 = com.google.android.libraries.bind.b.c.b(this.av, v2);
1109:                if (com.google.android.libraries.bind.b.c.a(this.av, this.as.getCurrentItem()) == v2) {
1115:                    this.av.c(v2);
1120:                    this.h(v4);
                    }
                    else {
1341:                    this.as.a(v4, 0);
1346:                    this.h(v4);
                    }
1127:                if (this.ao())
1132:                    this.b(v2, 0);
1135:                this.O_();
1142:                this.by.run();
1145:                return;
                }
1321:            v4 = v2;
1322:            v2 = 3;
            }
993:        v4.setHeaderShadowMode(v2);
1001:        this.at.setAlwaysUseFloatingBackground(1);
1008:        if (this.az != 0) {
1019:            this.az.getLayoutParams().width = -1;
1030:            this.az.getLayoutParams().height = -1;
            }
1038:        this.am = this.an;
1048:        this.at.b(v3, this.ah());
1056:        if (this.ag != 1)
1066:            this.at.setFloatingControlsBackground(this.ar());
1074:        if (this.ai != -1) {
1078:            v2 = this.ai;
1083:            this.ai = -1;
            }
            else
1332:            v2 = this.a.a.e;
1105:        v4 = com.google.android.libraries.bind.b.c.b(this.av, v2);
1109:        if (com.google.android.libraries.bind.b.c.a(this.av, this.as.getCurrentItem()) == v2) {
1115:            this.av.c(v2);
1120:            this.h(v4);
            }
            else {
1341:            this.as.a(v4, 0);
1346:            this.h(v4);
            }
1127:        if (this.ao())
1132:            this.b(v2, 0);
1135:        this.O_();
1142:        this.by.run();
1145:        return;
        }
717:    if (Build$VERSION.SDK_INT >= 21)
723:        v2 = com.google.android.play.animation.e.a(this.bn);
        else
1228:        v2 = new android.support.v4.view.b.b();
731:    v6 = ViewPager.getDeclaredField("k");
736:    v6.setAccessible(1);
748:    v6.set(this.as, new com.google.android.finsky.layout.play.ah(this.as.getContext(), v2));
756:    this.as.ah = 1;
763:    this.aA.setSelectedTabIndicator(0);
774:    if (this.bp.a() && this.n_.dj().a(12644646))
798:        this.as.ah = 1;
806:    this.at.K.d();
815:    this.at.setOnPageChangeListener(this);
824:    this.at.setOnTabSelectedListener(this);
831:    if (!this.N_())
858:        this.at.a(v26.getColor(2131558832), com.google.android.finsky.bg.h.a(this.bn, this.e));
865:    if ((this.al != 0 || this.N_()) && !this.aj()) {
884:        this.as.ah = 1;
891:        this.at.setHeaderMode(0);
        }
898:    if (this.ao())
926:        this.an = FinskyHeaderListLayout.b(this.bn, v3, this.at.getActionBarHeight(), this.at.getSubNavHeight());
        else
1266:        this.an = FinskyHeaderListLayout.a(this.bn, v3, 0, this.at.getActionBarHeight());
932:    if (this.ax == 0)
960:        this.ax = new com.google.android.finsky.layout.o(this.e, this.aw, this.az, v4, this.bn, this);
971:    this.ax.a(this.aq, 0);
974:    this.ap();
981:    if (this.aq != 0) {
985:        v2 = this.at;
990:        v4 = v2;
991:        v2 = 2;
        }
1278:    else if (this.bp.a() && com.google.android.finsky.m.a.ay().a()) {
1294:        v4 = this.at;
1296:        v2 = 3;
        }
        else {
1303:        if (this.al == 0) {
1008:            if (this.az != 0) {
1019:                this.az.getLayoutParams().width = -1;
1030:                this.az.getLayoutParams().height = -1;
                }
1038:            this.am = this.an;
1048:            this.at.b(v3, this.ah());
1056:            if (this.ag != 1)
1066:                this.at.setFloatingControlsBackground(this.ar());
1074:            if (this.ai != -1) {
1078:                v2 = this.ai;
1083:                this.ai = -1;
                }
                else
1332:                v2 = this.a.a.e;
1105:            v4 = com.google.android.libraries.bind.b.c.b(this.av, v2);
1109:            if (com.google.android.libraries.bind.b.c.a(this.av, this.as.getCurrentItem()) == v2) {
1115:                this.av.c(v2);
1120:                this.h(v4);
                }
                else {
1341:                this.as.a(v4, 0);
1346:                this.h(v4);
                }
1127:            if (this.ao())
1132:                this.b(v2, 0);
1135:            this.O_();
1142:            this.by.run();
1145:            return;
            }
1309:        if (this.aj()) {
1008:            if (this.az != 0) {
1019:                this.az.getLayoutParams().width = -1;
1030:                this.az.getLayoutParams().height = -1;
                }
1038:            this.am = this.an;
1048:            this.at.b(v3, this.ah());
1056:            if (this.ag != 1)
1066:                this.at.setFloatingControlsBackground(this.ar());
1074:            if (this.ai != -1) {
1078:                v2 = this.ai;
1083:                this.ai = -1;
                }
                else
1332:                v2 = this.a.a.e;
1105:            v4 = com.google.android.libraries.bind.b.c.b(this.av, v2);
1109:            if (com.google.android.libraries.bind.b.c.a(this.av, this.as.getCurrentItem()) == v2) {
1115:                this.av.c(v2);
1120:                this.h(v4);
                }
                else {
1341:                this.as.a(v4, 0);
1346:                this.h(v4);
                }
1127:            if (this.ao())
1132:                this.b(v2, 0);
1135:            this.O_();
1142:            this.by.run();
1145:            return;
            }
1313:        v2 = this.at;
1316:        if (v3 == 2) {
990:            v4 = v2;
991:            v2 = 2;
993:            v4.setHeaderShadowMode(v2);
1001:            this.at.setAlwaysUseFloatingBackground(1);
1008:            if (this.az != 0) {
1019:                this.az.getLayoutParams().width = -1;
1030:                this.az.getLayoutParams().height = -1;
                }
1038:            this.am = this.an;
1048:            this.at.b(v3, this.ah());
1056:            if (this.ag != 1)
1066:                this.at.setFloatingControlsBackground(this.ar());
1074:            if (this.ai != -1) {
1078:                v2 = this.ai;
1083:                this.ai = -1;
                }
                else
1332:                v2 = this.a.a.e;
1105:            v4 = com.google.android.libraries.bind.b.c.b(this.av, v2);
1109:            if (com.google.android.libraries.bind.b.c.a(this.av, this.as.getCurrentItem()) == v2) {
1115:                this.av.c(v2);
1120:                this.h(v4);
                }
                else {
1341:                this.as.a(v4, 0);
1346:                this.h(v4);
                }
1127:            if (this.ao())
1132:                this.b(v2, 0);
1135:            this.O_();
1142:            this.by.run();
1145:            return;
            }
1321:        v4 = v2;
1322:        v2 = 3;
        }
993:    v4.setHeaderShadowMode(v2);
1001:    this.at.setAlwaysUseFloatingBackground(1);
1008:    if (this.az != 0) {
1019:        this.az.getLayoutParams().width = -1;
1030:        this.az.getLayoutParams().height = -1;
        }
1038:    this.am = this.an;
1048:    this.at.b(v3, this.ah());
1056:    if (this.ag != 1)
1066:        this.at.setFloatingControlsBackground(this.ar());
1074:    if (this.ai != -1) {
1078:        v2 = this.ai;
1083:        this.ai = -1;
        }
        else
1332:        v2 = this.a.a.e;
1105:    v4 = com.google.android.libraries.bind.b.c.b(this.av, v2);
1109:    if (com.google.android.libraries.bind.b.c.a(this.av, this.as.getCurrentItem()) == v2) {
1115:        this.av.c(v2);
1120:        this.h(v4);
        }
        else {
1341:        this.as.a(v4, 0);
1346:        this.h(v4);
        }
1127:    if (this.ao())
1132:        this.b(v2, 0);
1135:    this.O_();
1142:    this.by.run();
1145:    return;
1233:    v2 = ex;
1237:    v6 = new Object[1];
1240:    v6[0] = v2;
1242:    FinskyLog.e("Error setting animation parameters: %s", v6);
1245:    goto 751;
1351:    v2 = ex;
1352:    goto 1234;
1353:    v2 = ex;
1354:    goto 1234;
1355:    try
            run 727...751
        catch (NoSuchFieldException ex) {
727:        goto 1233;
        }
        catch (IllegalArgumentException ex) {
727:        goto 1353;
        }
        catch (IllegalAccessException ex) {
727:        goto 1351;
        }
    }

    public final void d() {
        if (this.c != 0 && this.as != 0) {
            this.ai = com.google.android.libraries.bind.b.c.a(this.av, this.as.getCurrentItem());
            v1 = new com.google.android.finsky.utils.ac();
            this.av.B = 1;
            if (this.av.u != 0 && !this.av.u.isEmpty()) {
                v3 = new ArrayList();
                v4 = this.av.u.iterator();
                while (v4.hasNext()) {
                    v0 = (com.google.android.finsky.activities.gl)v4.next();
                    if (v0.c != 0)
                        v0.d = v0.c.b();
                    v3.add(v0.d);
                    if (v0.b == 0)
                        continue;
                    com.google.android.finsky.dfemodel.x.a(v0.b.a);
                }
                v1.a("TabbedAdapter.TabInstanceStates", v3);
                v1.a("TabbedAdapter.TabDfeLists", this.av.f());
            }
            this.aj.a("TabbedBrowseFragment.AdapterState", v1);
        }
        this.bm.A().a();
        if (this.at != 0) {
            this.at.setOnPageChangeListener(0);
            this.at.setOnTabSelectedListener(0);
        }
        if (this.aF != 0) {
            this.aF.a();
            this.aF = 0;
        }
        if (this.as != 0) {
            this.as.setAdapter(0);
            this.as = 0;
        }
        if (this.aM != 0) {
            this.aM.d = 0;
            this.aM = 0;
        }
        this.av = 0;
        if (this.at != 0)
            this.at.f();
        if (this.au != 0) {
            this.au.e();
            this.au = 0;
        }
        this.aw = 0;
        if (this.ax != 0) {
            if (this.ax.e != 0)
                this.ax.e.setOnLoadedListener(0);
            this.ax.e = 0;
            this.ax.g = 0;
            this.ax = 0;
        }
        this.az = 0;
        this.aA = 0;
        if (this.aC != 0) {
            this.aC.cancel(0);
            this.aC = 0;
        }
        if (this.aD != 0) {
            this.aD.cancel(0);
            this.aD = 0;
        }
        this.aE = 0;
        if (this.aB != 0) {
            this.aB.a();
            this.aB = 0;
        }
        super.d();
    }

    public final void d(Bundle p0) {
  3:    v1 = 1;
  5:    super.d(p0);
 14:    this.aN = this.aL.b();
 22:    if (this.bp.a()) {
 30:        v0 = com.google.android.finsky.m.a.aN().dj();
 41:        if (v0.a(12630046) && this.aC == 0 && this.aD == 0 && !v0.a(12635663)) {
315:            v3 = this.bn.getResources();
328:            this.aE = new com.google.android.finsky.bg.ad();
332:            v4 = com.google.android.finsky.m.a.cn();
338:            v4.a(v3, this.aE);
352:            this.aC = new com.google.android.finsky.activities.fr(this.h(), this.aE);
357:            v6 = new Integer[4];
363:            v6[0] = Integer.valueOf(com.google.android.finsky.m.a.h().a(0));
373:            v6[1] = Integer.valueOf(v4.a(v3));
382:            v6[2] = Integer.valueOf(2130969271);
390:            v6[3] = Integer.valueOf(5);
392:            com.google.android.finsky.utils.bb.a(this.aC, v6);
408:            if (this.n_.dj().a(12642058)) {
421:                this.aD = new com.google.android.finsky.activities.ft(this.h(), this.aE);
425:                v3 = new Integer[2];
434:                v3[0] = Integer.valueOf(2130968883);
444:                v3[1] = Integer.valueOf(v4.a());
446:                com.google.android.finsky.utils.bb.a(this.aD, v3);
                }
            }
        }
 53:    if (this.c == 0) {
 55:        this.au();
 60:        this.l(1718);
 63:        this.aa();
 66:        this.ac();
        }
        else
451:        this.cg_();
 71:    this.bq.a();
 74:    if (p0 == 0)
 76:        v0 = 1;
        else
456:        v0 = 0;
 89:    if (this.bF.equals(this.k_.a.h) && com.google.android.finsky.m.a.aY().f()) {
115:        v3 = new com.google.android.finsky.family.b.a(this.bp, this.bm, v0, this.bw.a());
134:        if (com.google.android.finsky.m.a.aY().a(v3.d).k())
144:            com.google.android.finsky.m.a.ap().c("", 1, v3, v3);
            else
459:            v3.b();
        }
147:    if (p0 == 0)
149:        v0 = 1;
        else
464:        v0 = 0;
156:    v4 = this.bn.getResources().getConfiguration();
168:    if (!this.bp.a(this.e))
297:        return;
172:    v3 = this.n_.dj();
183:    if ((v3.a(12623744)) || v3.a(12623745))
194:        v3 = 1;
        else
467:        v3 = 0;
195:    if (v3 == 0) goto 476;
199:    v3 = this.n_.dj();
216:    if ((v3.a(87)) || v3.a(12602761))
220:        v3 = 1;
        else
470:        v3 = 0;
243:    if (v3 != 0 && !com.google.android.finsky.m.a.Y().a(this.aH.a(this.aG.cY())))
247:        v3 = 1;
        else
473:        v3 = 0;
248:    if (v3 == 0) goto 476;
250:    if (v1 != 0 && !com.google.android.finsky.activities.fa.W() && v0 != 0 && v4.screenHeightDp >= 400 && v4.screenWidthDp >= 400) {
276:        v1 = new com.google.android.finsky.activities.fa();
281:        v2 = new Bundle();
284:        this.bw.a().a(v2);
287:        v1.f(v2);
294:        v1.a(this.B, "music_home_microsite");
        }
297:    return;
476:    v1 = 0;
477:    goto 250;
    }

    public final void d_(int p0) {
        com.google.android.finsky.utils.bb.a();
        this.av.w.f = p0;
        if (p0 == 2) {
            this.av.w.c.removeCallbacks(this.av.w);
            this.av.w.e = 1;
        }
        if (p0 == 0) {
            switch (this.av.w.b) {
                case 0:
                    this.av.w.a();
                    break;
                case 1:
                    this.av.w.g = 0;
                    if (this.av.w.a.d()) {
                        this.av.w.a();
                        this.av.w.g = 1;
                    }
                    else {
                        v1 = this.av.w.a.e();
                        this.av.w.d.remove(v1);
                        v1.c();
                    }
                    this.av.w.e = 0;
                    break;
                default:
                    FinskyLog.e(33 + "Do not recognize mode:" + this.av.w.b, new Object[0]);
                    break;
            }
        }
    }

    public final void f(int p0) {
        this.av.w.e = 1;
        if (this.av.w.b == 0)
            this.av.w.c.postDelayed(this.av.w, 500);
        this.av.z = this.av.y;
        this.av.y = com.google.android.libraries.bind.b.c.a(this.av, p0);
        v0 = com.google.android.libraries.bind.b.c.a(this.av, p0);
        if (v0 >= 0 && v0 < this.av.u.size())
            this.av.p.b(new com.google.android.finsky.d.d(((com.google.android.finsky.activities.gl)this.av.u.get(v0)).f));
    }

    public final void g(int p0) {
        this.h(p0);
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.ak;
    }

    public final void h(int p0) {
        v3 = com.google.android.libraries.bind.b.c.a(this.av, p0);
        if (!com.google.android.finsky.m.a.dj().a(12642869) && ((this.ao()) || this.aj())) {
            if (this.a.a.d[v3].b & 512)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0)
                com.google.android.finsky.aa.a.bH.a(Integer.valueOf(this.a.a.d[v3].o));
            else
                com.google.android.finsky.aa.a.bH.c();
        }
        else
            com.google.android.finsky.aa.a.bH.c();
        if (this.aj())
            this.a(v3, 1);
        else if (this.N_()) {
            this.e = this.a.a.d[v3].l;
            if (this.a.a.d[v3].f())
                v0 = this.a.a.d[v3].n;
            else
                v0 = 0;
            this.f = v0;
            if (this.a.a.d[v3].e())
                v0 = this.a.a.d[v3].m;
            else
                v0 = 0;
            this.g = v0;
            this.bm.a(this.e, this.f, this.g, 1);
            this.aB.a(this.e);
            this.at.a(this.bn.getResources().getColor(2131558832), Color.alpha(0));
        }
    }

    public final void m_() {
        if (this.c == 0)
            this.av();
        if (this.c != 0)
            super.m_();
    }

    public final void p_() {
        if (this.av != 0 && this.av.a() == 1) {
            super.p_();
            if (this.au != 0)
                this.au.a(1);
        }
    }

    public final void q_() {
        if (this.av != 0 && this.av.a() == 1) {
            super.q_();
            if (this.au != 0)
                this.au.a(0);
        }
    }

}
