package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.controllers.view.C4501r;
import com.squareup.leakcanary.C7582R;

public abstract class bj extends C4250b {
    public final ff f21926a;
    public int f21927b = C7582R.layout.jpkr_highlights_banner_cluster;
    public int f21928o = C7582R.layout.jpkr_highlights_banner_item;
    public int f21929p = 16;
    public int f21930q = 9;
    public int f21931r;
    public float f21932s;
    public bl f21933t;

    public bj(Context context, C3748a c3748a, ff ffVar, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f21926a = ffVar;
    }

    protected abstract int mo4148b();

    protected abstract float mo4149c();

    public void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f21931r = mo4148b();
        this.f21932s = mo4149c();
        this.l = this.f21931r;
        this.f21933t = new bl(this, this.g.f14908a.m14638a());
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return this.f21927b;
    }

    public final void mo1510a(View view, int i) {
        C4501r c4501r = (C4501r) view;
        c4501r.mo4235a(new bk(this, c4501r, this.g.f14908a, this.g, this.f21928o), this.g, this.f21931r, this.h, this.D != null ? ((bm) this.D).f21941a : null, this.f21926a, this.f21933t, this.k, null);
    }

    public final void mo1511b(View view, int i) {
        C4501r c4501r = (C4501r) view;
        if (this.D == null) {
            this.D = new bm();
            ((bm) this.D).f21941a = new Bundle();
        }
        ((bm) this.D).f21941a.clear();
        c4501r.mo2995a(((bm) this.D).f21941a);
        c4501r.Z_();
    }
}
