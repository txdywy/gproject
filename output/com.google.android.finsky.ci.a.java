package com.google.android.finsky.ci;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.a.c;
import com.google.android.finsky.bd.a;
import com.google.android.finsky.cv.a.gl;
import com.google.android.finsky.d.j;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.l;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.headerlistlayout.i;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.m;
import com.google.android.finsky.notification.k;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.recyclerview.a;
import com.google.android.finsky.stream.a.b;
import com.google.android.finsky.stream.a.d;
import com.google.android.finsky.stream.base.n;
import com.google.android.finsky.stream.base.view.g;
import com.google.android.finsky.utils.ac;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.gp;
import java.util.List;

public final class com.google.android.finsky.ci.a extends com.google.android.finsky.pagesystem.b implements com.google.android.finsky.frameworkviews.ah, com.google.android.finsky.notification.m
{

    public PlayRecyclerView a;
    public com.google.android.finsky.utils.ac ag;
    public com.google.android.finsky.notification.k ah;
    public int ai;
    public final com.google.wireless.android.a.a.a.a.ce aj;
    public com.google.android.finsky.stream.base.n c;
    public com.google.android.finsky.stream.a.b f;
    public com.google.android.finsky.dfemodel.j h;

    a() {
        com.google.android.finsky.pagesystem.b();
        com.google.android.finsky.m.a.aO();
        this.ai = -1;
        this.aj = com.google.android.finsky.d.j.a(29);
    }

    protected final int Z() {
        return 2130968962;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        ((FinskyHeaderListLayout)this.bt).a(new com.google.android.finsky.ci.b(((FinskyHeaderListLayout)this.bt).getContext()));
        this.a = (PlayRecyclerView)this.bt.findViewById(2131755301);
        this.a.setLayoutManager(new LinearLayoutManager());
        this.a.a(new com.google.android.finsky.stream.base.view.g(0, 0));
        this.ah.a(this);
        return super.a(p0, p1, p2);
    }

    protected final com.google.android.finsky.layoutswitcher.e a(ContentFrame p0) {
        return new com.google.android.finsky.headerlistlayout.i(p0, this);
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.ci.c)com.google.android.finsky.providers.d.a(com.google.android.finsky.ci.c)).a(this);
        super.a(p0);
    }

    public final void a(List p0) {
  1:    v1 = 0;
  4:    if (this.a == 0)
 41:        return;
 10:    if (p0.isEmpty()) goto 42;
 12:    if (v1 != 0) {
 21:        this.a.setAdapter(new com.google.android.finsky.recyclerview.a());
 35:        this.a.setEmptyView(this.bt.findViewById(2131755302));
 39:        this.c = 0;
        }
 41:    return;
 44:    if (this.h == 0) goto 60;
 52:    if (!this.h.a()) goto 60;
 58:    if (this.h.a != 0) goto 62;
 60:    v1 = 1;
 61:    goto 12;
 66:    v0 = 0;
 71:    if (v0 >= this.h.a.a()) goto 96;
 81:    if (!this.h.a.a(v0).ba()) goto 98;
 94:    if (this.h.a.a(v0).bb().a.length == 0)
 96:        v1 = 1;
 97:    goto 12;
 98:    v0 = v0 + 1;
100:    goto 67;
    }

    protected final void aa() {
        this.h = com.google.android.finsky.dfemodel.l.a(com.google.android.finsky.m.a.ap(), this.k_.a.C, 0, 0);
        this.h.a(this);
        this.h.a(this);
        this.h.n();
    }

    public final int ab() {
        return 3;
    }

    public final void ac() {
        this.bm.c(this.g().getString(com.google.android.finsky.bd.a.ar.intValue()));
        this.bm.a(3, 0);
        this.bm.z();
    }

    public final int ah() {
        if (this.ai < 0) {
            this.ai = FinskyHeaderListLayout.a(this.bn, 2, 0);
            this.ai = this.ai - this.bn.getResources().getDimensionPixelSize(2131625115);
        }
        return this.ai;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.L = 1;
    }

    protected final void cg_() {
        if (this.c == 0)
            this.c = new com.google.android.finsky.stream.base.n();
        this.f = com.google.android.finsky.m.a.co().a(com.google.android.finsky.dfemodel.l.a(this.h), this.c, this.a, this.bn, this.bp, this, this.bw, 2, 0, this, 0, 0, 0, 0, 0, 0, 0, 0);
        if (this.ag != 0)
            this.c.a(this.ag);
    }

    public final void d() {
        super.d();
        this.a = 0;
        if (this.c != 0) {
            this.ag = new com.google.android.finsky.utils.ac();
            this.c.b(this.ag);
            this.c = 0;
        }
        if (this.f != 0) {
            this.f.d();
            this.f = 0;
        }
        if (this.ah != 0)
            this.ah.b(this);
        if (this.h != 0) {
            this.h.b(this);
            this.h.b(this);
        }
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.ac();
        if (this.h != 0 && this.h.a())
            v0 = 1;
        else
            v0 = 0;
        if (v0 == 0) {
            this.au();
            this.aa();
        }
        else
            this.cg_();
        this.bq.a();
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.aj;
    }

}
