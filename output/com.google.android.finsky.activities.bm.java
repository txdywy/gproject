package com.google.android.finsky.activities;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cz;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.adapters.e;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.d.ai;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.fastscroll.ScrubberView;
import com.google.android.finsky.fastscroll.n;
import com.google.android.finsky.frameworkviews.d;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.recyclerview.g;
import com.google.android.finsky.stream.base.view.g;
import com.google.android.finsky.utils.ac;
import com.google.android.play.image.w;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ab;
import java.util.HashSet;
import java.util.Iterator;

public final class com.google.android.finsky.activities.bm implements com.google.android.finsky.activities.gt
{

    public final LayoutInflater a;
    public final Context b;
    public final com.google.android.finsky.navigationmanager.a c;
    public final com.google.android.finsky.bg.k d;
    public final DfeToc e;
    public final com.google.android.play.image.w f;
    public final x[] g;
    public final ag[] h;
    public final String i;
    public final int j;
    public final int k;
    public final String l;
    public boolean m;
    public com.google.android.finsky.adapters.e n;
    public ViewGroup o;
    public PlayRecyclerView p;
    public com.google.android.finsky.utils.ac q;
    public com.google.android.finsky.d.ai r;
    public final int s;
    public final boolean t;
    public final FinskyHeaderListLayout u;
    public ScrubberView v;
    public final com.google.android.finsky.d.w w;

    bm(Context p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.finsky.bg.k p2, com.google.android.play.image.w p3, LayoutInflater p4, com.google.android.finsky.activities.gl p5, DfeToc p6, int p7, FinskyHeaderListLayout p8, boolean p9, com.google.android.finsky.d.w p10) {
        this.q = com.google.android.finsky.utils.ac.a;
        this.b = p0;
        this.c = p1;
        this.d = p2;
        this.f = p3;
        this.a = p4;
        this.e = p6;
        this.i = p5.a.j;
        this.j = p5.a.l;
        this.k = p5.a.n;
        this.l = p5.a.k;
        this.g = p5.a.i;
        this.h = p5.a.e;
        this.r = p5.f;
        this.s = p7;
        this.u = p8;
        this.t = p9;
        this.w = p10;
    }

    public final View a() {
        if (this.o == 0) {
            if (this.t != 0)
                v0 = 2130968686;
            else
                v0 = 2130968685;
            this.o = (ViewGroup)this.a.inflate(v0, 0);
            this.p = (PlayRecyclerView)this.o.findViewById(2131755428);
            this.p.setVisibility(0);
            v0 = new com.google.android.finsky.adapters.e(this.b, this.g, this.c, this.j, this.k, this.e, this.f, this.h, this.i, this.l, this.s, this.r, this.w);
            this.n = v0;
            if (this.q.a("CategoryTab.AdapterInstanceState")) {
                v1 = (com.google.android.finsky.utils.ac)this.q.b("CategoryTab.AdapterInstanceState");
                if (v1 != 0)
                    v0.B = (Bundle)v1.b("CategoryAdapterV2.QuickLinksViewState");
            }
            v1 = new android.support.v7.widget.cz();
            this.p.setLayoutManager(v1);
            v1.g = new com.google.android.finsky.activities.bn(v0);
            this.p.a(new com.google.android.finsky.activities.bo(v0));
            this.p.a(new com.google.android.finsky.frameworkviews.d(this.b, 2131558777));
            v0 = this.d.a(this.b.getResources());
            this.p.a(new com.google.android.finsky.stream.base.view.g(v0, v0));
            this.p.setAdapter(this.n);
            if (this.q.a("CategoryTab.RecyclerViewState"))
                this.p.a((Parcelable)this.q.b("CategoryTab.RecyclerViewState"));
            if (this.t != 0) {
                this.v = (ScrubberView)this.o.findViewById(2131755429);
                v0 = this.v.getConfigurator();
                v0.d = this.p;
                v0.e = this.u;
                v0.a();
            }
        }
        return this.o;
    }

    public final void a(com.google.android.finsky.utils.ac p0) {
        if (p0 != 0)
            this.q = p0;
    }

    public final void a(boolean p0) {
        if (p0 != this.m) {
            if (p0 != 0) {
                com.google.android.finsky.d.j.c(this.r);
                this.r.a(1);
                if (this.r.getPlayStoreUiElement().f.length == 0)
                    com.google.android.finsky.d.j.a(this.o);
            }
            else
                this.r.a(0);
            this.m = p0;
        }
    }

    public final com.google.android.finsky.utils.ac b() {
        if (this.t != 0) {
            this.v.getConfigurator().b();
            this.v = 0;
        }
        v1 = new com.google.android.finsky.utils.ac();
        if (this.p != 0 && this.n != 0) {
            v1.a("CategoryTab.RecyclerViewState", this.p.x());
            v3 = this.n.z.iterator();
            while (v3.hasNext())
                this.n.a((com.google.android.finsky.recyclerview.g)v3.next());
            this.n.z.clear();
            v0 = new com.google.android.finsky.utils.ac();
            v0.a("CategoryAdapterV2.QuickLinksViewState", this.n.B);
            v1.a("CategoryTab.AdapterInstanceState", v0);
        }
        this.n = 0;
        this.o = 0;
        return v1;
    }

}
