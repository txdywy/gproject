package com.google.android.finsky.billing.myaccount;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.recyclerview.g;
import com.google.android.finsky.recyclerview.h;
import com.google.wireless.android.finsky.dfe.c.a.bb;
import com.google.wireless.android.finsky.dfe.c.a.bh;

public final class com.google.android.finsky.billing.myaccount.w extends com.google.android.finsky.recyclerview.h
{

    public static final Typeface c;
    public final Context d;
    public final com.google.android.finsky.bg.l e;
    public final com.google.android.finsky.d.w f;
    public final com.google.android.finsky.d.ad g;
    public final int h;
    public com.google.android.finsky.billing.myaccount.af i;
    public ab[] j;

    static {
        com.google.android.finsky.billing.myaccount.w.c = Typeface.create("sans-serif-medium", 0);
    }

    w(Context p0, com.google.android.finsky.bg.l p1, com.google.android.finsky.d.w p2, com.google.android.finsky.d.ad p3) {
        com.google.android.finsky.recyclerview.h();
        this.j = new ab[0];
        this.d = p0;
        this.e = p1;
        this.f = p2;
        this.g = p3;
        this.h = FinskyHeaderListLayout.a(p0, 2, 0);
    }

    static void a(com.google.android.finsky.billing.myaccount.ab p0, com.google.android.finsky.d.ad p1) {
        if (p0.a.c != 0 && p0.a.c.d())
            p1.a(new com.google.android.finsky.d.o(p0.a.c.b, p0.a.c.c, p1));
    }

    static void a(com.google.android.finsky.billing.myaccount.ab p0, com.google.android.finsky.d.ad p1, com.google.android.finsky.d.w p2) {
        if (p0.a.c != 0 && p0.a.c.d())
            p2.b(new com.google.android.finsky.d.d(p1).a(p0.a.c.b).a(p0.a.c.c));
    }

    public final int a() {
        return this.j.length;
    }

    public final int a(int p0) {
        return this.j[p0].b;
    }

    public final android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        v1 = LayoutInflater.from(this.d);
        switch (p1) {
            case 0:
                v0 = new com.google.android.finsky.billing.myaccount.z(v1, p0, this.h);
                break;
            case 1:
                v0 = new com.google.android.finsky.billing.myaccount.x(this, v1, p0);
                break;
            case 2:
                v0 = new com.google.android.finsky.billing.myaccount.aa(p0);
                break;
            default:
                throw new IllegalStateException(46 + "Unknown type in onCreateViewHolder " + p1);
        }
        return v0;
    }

    public final void a(android.support.v7.widget.fr p0, int p1) {
        if ((com.google.android.finsky.recyclerview.g)p0 instanceof com.google.android.finsky.billing.myaccount.ac)
            ((com.google.android.finsky.billing.myaccount.ac)(com.google.android.finsky.recyclerview.g)p0).a(this.j[p1], this.g, this.f);
    }

}
