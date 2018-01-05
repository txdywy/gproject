package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.af;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.a.c;
import com.google.android.finsky.activities.b;
import com.google.android.finsky.activities.gt;
import com.google.android.finsky.api.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.d;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bu.b;
import com.google.android.finsky.by.a;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.e;
import com.google.android.finsky.by.g;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.d.j;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dq.h;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.headerlistlayout.i;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.m;
import com.google.android.finsky.m.b;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.stream.controllers.assist.security.d;
import com.google.android.finsky.stream.controllers.assist.security.u;
import com.google.android.finsky.stream.myapps.aa;
import com.google.android.finsky.stream.myapps.s;
import com.google.android.finsky.utils.ac;
import com.google.android.finsky.utils.bb;
import com.google.android.libraries.bind.b.c;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.a.a.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.activities.myapps.t extends com.google.android.finsky.pagesystem.b implements android.support.v4.view.bi, com.android.volley.x, com.google.android.finsky.frameworkviews.ah
{

    public String a;
    public com.google.android.finsky.activities.myapps.v ag;
    public ViewPager ah;
    public com.google.android.finsky.activities.myapps.r ai;
    public int aj;
    public com.google.wireless.android.finsky.dfe.a.a.m c;
    public com.google.android.finsky.stream.myapps.s e;
    public com.google.android.finsky.utils.ac f;
    public com.google.wireless.android.a.a.a.a.ce g;
    public boolean h;
    public int t_;

    t() {
        com.google.android.finsky.pagesystem.b();
        this.f = new com.google.android.finsky.utils.ac();
        this.g = com.google.android.finsky.d.j.a(9);
        this.h = 0;
        this.aj = -1;
    }

    private final boolean aj() {
        if (this.c != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final String ao() {
        return this.q.getString("my_apps_url", this.k_.c());
    }

    private final void ap() {
        if (this.bt != 0)
            ((PlayHeaderListLayout)this.bt).setOnPageChangeListener(0);
        this.ah = 0;
        this.ai = 0;
    }

    protected final int Z() {
        return 2130968962;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        ((FinskyHeaderListLayout)this.bt).a(new com.google.android.finsky.activities.myapps.u(((FinskyHeaderListLayout)this.bt).getContext()));
        return (ContentFrame)super.a(p0, p1, p2);
    }

    protected final com.google.android.finsky.layoutswitcher.e a(ContentFrame p0) {
        return new com.google.android.finsky.headerlistlayout.i(p0, this, 0);
    }

    public final void a(int p0, float p1, int p2) {
    }

    protected final void aa() {
        this.ap();
        this.k(1718);
        if (this.n_.dj().a(12640333)) {
            this.ag = new com.google.android.finsky.activities.myapps.v(this.bo, com.google.android.finsky.m.a.cy(), this.bw, this.ao(), this, this);
            com.google.android.finsky.utils.bb.a(this.ag, new Void[0]);
        }
        else
            this.bo.p(this.ao(), this, this);
    }

    public final void ac() {
        this.bm.c(this.a);
        this.bm.a(3, 1);
        this.bm.z();
    }

    protected final Transition ae() {
        return new com.google.android.finsky.dq.h(3);
    }

    public final int af() {
        return com.google.android.finsky.bg.h.a(this.h(), 3);
    }

    public final int ah() {
        if (this.aj < 0)
            this.aj = FinskyHeaderListLayout.a(this.bn, 0, 0);
        return this.aj;
    }

    public final void b(int p0) {
        v2 = com.google.android.libraries.bind.b.c.a(this.ai, p0);
        this.ai.i = v2;
        v0 = 0;
        while (v0 < this.ai.g.size()) {
            this.ai.c(v0);
            v0 = v0 + 1;
        }
        v0 = (String)this.ai.a(v2);
        if (!TextUtils.isEmpty(v0)) {
            v5 = new Object[1];
            v5[0] = v0;
            com.google.android.finsky.bg.a.a(this.bn, this.bn.getString(2131951652, v5), this.ah, 0);
        }
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.i(3);
        this.L = 1;
    }

    public final void b_(Object p0) {
        this.c = (com.google.wireless.android.finsky.dfe.a.a.m)p0;
        this.t_ = this.c.d;
        if (this.t_ < 0 || this.t_ >= this.c.b.length)
            this.t_ = 0;
        this.m_();
    }

    public final void cg_() {
        this.O_();
        this.ac();
        if (this.ah == 0 || this.ai == 0) {
            com.google.android.finsky.d.j.a(this.g, this.c.c);
            this.ai = new com.google.android.finsky.activities.myapps.r((com.google.android.finsky.activities.b)this.h(), this.bp, this.bo, this.k_, this, this.f, this, this.c, this.h, this, this.bw);
            this.ah = (ViewPager)this.bt.findViewById(2131756034);
            if (this.ah != 0) {
                this.ah.setAdapter(this.ai);
                this.ah.setPageMargin(this.i().getDimensionPixelSize(2131625512));
                ((PlayHeaderListLayout)this.bt).K.d();
                ((PlayHeaderListLayout)this.bt).setOnPageChangeListener(this);
                ((PlayHeaderListLayout)this.bt).setFloatingControlsBackground(new ColorDrawable(com.google.android.finsky.bg.h.a(this.h(), 3)));
            }
            if (this.q.getBoolean("trigger_update_all")) {
                this.ai.e();
                this.ah.a(this.ai.e(), 0);
                this.ai.f();
                this.d("trigger_update_all", 0);
            }
            else
                this.ah.a(this.t_, 0);
        }
    }

    public final void d() {
        if (this.aj()) {
            if (this.ai != 0 && this.ai.g != 0 && !this.ai.g.isEmpty()) {
                v4 = new ArrayList();
                v5 = new ArrayList();
                v6 = this.ai.g.iterator();
                while (v6.hasNext()) {
                    v0 = (com.google.android.finsky.activities.myapps.s)v6.next();
                    if (v0.d != 0) {
                        v0.e = v0.d.b();
                        if (v0.d instanceof com.google.android.finsky.activities.myapps.o)
                            v1 = ((com.google.android.finsky.activities.myapps.o)v0.d).r;
                        else
                            v1 = 0;
                        v0.g = v1;
                    }
                    v4.add(v0.e);
                    v5.add(v0.g);
                }
                this.f.a("MyAppsTabbedAdapterV2.TabBundles", v4);
                this.f.a("MyAppsTabbedAdapterV2.TabLists", v5);
            }
            if (this.ah != 0)
                this.t_ = this.ah.getCurrentItem();
        }
        this.ap();
        if (this.bt instanceof PlayHeaderListLayout)
            ((PlayHeaderListLayout)this.bt).f();
        this.e = 0;
        super.d();
    }

    public final void d(Bundle p0) {
        super.d(p0);
        v3 = com.google.android.finsky.m.a.dn();
        v0 = 0;
        if (v3 != 0)
            v0 = v3.b();
        v0 = com.google.android.finsky.bg.h.a(3, v0);
        if (TextUtils.isEmpty(v0))
            v0 = this.bn.getString(2131952553);
        this.a = v0;
        this.e = com.google.android.finsky.m.a.cq().a(com.google.android.finsky.m.a.cZ());
        if (com.google.android.finsky.m.a.ay().c() && com.google.android.finsky.m.a.v().a())
            v0 = 1;
        else
            v0 = 0;
        this.e.q = v0;
        com.google.android.finsky.m.a.r().a();
        this.h = 0;
        v3 = com.google.android.finsky.m.a.ah().a(this.bo.b()).b().iterator();
        while (true) {
            if (!v3.hasNext()) {
                if (!this.aj()) {
                    this.au();
                    this.aa();
                    this.ac();
                }
                else
                    this.cg_();
                this.bq.a();
                return;
            }
            v0 = (com.google.android.finsky.by.g)v3.next();
            if (v0.l != 1)
                continue;
            if (com.google.android.finsky.m.a.L().a(v0.k) != 0) {
                this.h = 1;
                if (!this.aj()) {
                    this.au();
                    this.aa();
                    this.ac();
                }
                else
                    this.cg_();
                this.bq.a();
                return;
            }
        }
    }

    public final void d_(int p0) {
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.g;
    }

    public final void p_() {
    }

    public final void q_() {
    }

    public final void u() {
        super.u();
        com.google.android.finsky.m.a.bS().a(this.g(), this.bw);
        if (com.google.android.finsky.stream.controllers.assist.security.d.a != 0)
            com.google.android.finsky.stream.controllers.assist.security.d.a.c.e();
    }

    public final void w() {
        super.w();
        if (this.ag != 0)
            this.ag.cancel(1);
    }

}
