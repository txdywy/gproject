package com.google.android.finsky.be;

import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.support.v7.widget.ff;
import android.view.ViewGroup;
import com.android.volley.VolleyError;
import com.google.android.finsky.activities.gm;
import com.google.android.finsky.adapters.CardRecyclerViewAdapter;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.g;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.u;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.recyclerview.e;
import com.google.android.finsky.stream.a.b;
import com.google.android.finsky.stream.base.n;
import com.google.android.finsky.y.a;

public final class com.google.android.finsky.be.f extends com.google.android.finsky.be.g implements com.android.volley.w, com.google.android.finsky.dfemodel.w
{

    public ViewGroup a;
    public CardRecyclerViewAdapter b;
    public com.google.android.finsky.stream.base.n c;
    public com.google.android.finsky.stream.a.b d;
    public PlayRecyclerView e;
    public boolean f;
    public final com.google.android.finsky.y.a g;
    public final com.google.android.finsky.detailscomponents.g h;
    public final com.google.android.finsky.d.w i;
    public final android.support.v7.widget.ff j;
    public com.google.android.finsky.activities.gm k;

    f(com.google.android.finsky.y.a p0, com.google.android.finsky.detailscomponents.g p1, com.google.android.finsky.d.w p2, android.support.v7.widget.ff p3) {
        com.google.android.finsky.be.g();
        this.g = p0;
        this.h = p1;
        this.i = p2;
        this.j = p3;
    }

    public final void a() {
        if (this.o != 0) {
            if (((com.google.android.finsky.dfemodel.u)this.o).a != 0) {
                ((com.google.android.finsky.dfemodel.u)this.o).a.b(this);
                ((com.google.android.finsky.dfemodel.u)this.o).a.b(this);
            }
            this.o = 0;
        }
    }

    public final void a(VolleyError p0) {
        if (this.e != 0 && this.b != 0)
            this.b.e(2);
    }

    public final void a(com.google.android.finsky.dfemodel.u p0) {
        this.a();
        super.a(p0);
        this.f = 0;
        if (this.o != 0 && p0.a != 0) {
            p0.a.a(this);
            p0.a.a(this);
        }
    }

    public final void a(Object p0) {
        this.a((com.google.android.finsky.dfemodel.u)p0);
    }

    public final void m_() {
        if (this.f == 0 && this.e != 0) {
            this.e.setEmptyView(this.a.findViewById(2131755302));
            this.f = 1;
        }
        if (this.b != 0)
            this.b.a.b();
    }

}
