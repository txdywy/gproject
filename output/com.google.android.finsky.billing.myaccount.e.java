package com.google.android.finsky.billing.myaccount;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.a.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.headerlistlayout.i;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.recyclerview.a;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.wireless.android.a.a.a.a.ce;

public class com.google.android.finsky.billing.myaccount.e extends com.google.android.finsky.pagesystem.b implements com.google.android.finsky.d.ad
{

    public final Bundle a;
    public String c;
    public RecyclerView e;
    public android.support.v7.widget.em f;
    public final com.google.wireless.android.a.a.a.a.ce x_;

    e() {
        com.google.android.finsky.pagesystem.b();
        this.a = new Bundle();
        this.x_ = com.google.android.finsky.d.j.a(this.ao());
    }

    protected final int Z() {
        return 2130968962;
    }

    public View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        ((FinskyHeaderListLayout)this.bt).a(new com.google.android.finsky.billing.myaccount.f(((FinskyHeaderListLayout)this.bt).getContext()));
        this.c = p1.getContext().getString(this.aj());
        this.e = (RecyclerView)this.bt.findViewById(2131755301);
        p1.getContext();
        this.e.setLayoutManager(new LinearLayoutManager());
        this.e.setAdapter(new com.google.android.finsky.recyclerview.a());
        return super.a(p0, p1, p2);
    }

    protected final com.google.android.finsky.layoutswitcher.e a(ContentFrame p0) {
        return new com.google.android.finsky.headerlistlayout.i(p0, this);
    }

    public void aa() {
    }

    public final void ac() {
        this.bm.c(this.c);
        this.bm.a(0, 1);
        this.bm.z();
    }

    public boolean ah() {
        return 1;
    }

    public abstract android.support.v7.widget.em ai();

    public abstract int aj();

    protected final int ak() {
        return 3;
    }

    public abstract int ao();

    public void b(Bundle p0) {
        super.b(p0);
        this.L = 1;
    }

    public void cg_() {
        if (this.f == 0) {
            this.f = this.ai();
            this.e.setAdapter(this.f);
        }
    }

    public void d() {
        if (this.e != 0)
            this.e = 0;
        if (this.f != 0)
            this.f = 0;
        super.d();
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.ac();
        if (!this.ah()) {
            this.au();
            this.aa();
        }
        else
            this.cg_();
        this.bq.a();
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.x_;
    }

}
