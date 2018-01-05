package com.google.android.finsky.billing.myaccount;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import com.google.android.finsky.billing.myaccount.layout.AccountSimpleRowView;
import com.google.android.finsky.billing.myaccount.layout.c;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.recyclerview.g;
import com.google.android.finsky.recyclerview.h;
import java.util.ArrayList;
import java.util.List;

public abstract class com.google.android.finsky.billing.myaccount.d extends com.google.android.finsky.recyclerview.h
{

    public final List i;
    public final com.google.android.finsky.d.w j;
    public final Bundle k;
    public final com.google.android.finsky.d.ad l;
    public final Context m;
    public final LayoutInflater n;

    d(Context p0, Bundle p1, com.google.android.finsky.d.ad p2, com.google.android.finsky.d.w p3) {
        com.google.android.finsky.recyclerview.h();
        this.i = new ArrayList();
        this.m = p0;
        this.n = LayoutInflater.from(p0);
        this.k = p1;
        this.l = p2;
        this.j = p3;
    }

    public final int a() {
        return this.i.size();
    }

    public final int a(int p0) {
        return ((Integer)this.i.get(p0)).intValue();
    }

    public final android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        return new com.google.android.finsky.recyclerview.g(this.n.inflate(this.e(p1), p0, 0));
    }

    protected final com.google.android.finsky.billing.myaccount.layout.c a(View$OnClickListener p0, int p1, int p2, int p3, int p4) {
        v0 = new com.google.android.finsky.billing.myaccount.layout.c();
        v0.a = p1;
        v0.e = p2;
        v0.g = p3;
        v0.k = p4;
        v0.i = p0;
        v0.j = this.l;
        this.a(v0);
        return v0;
    }

    public final void a(android.support.v7.widget.fr p0, int p1) {
        this.a(((com.google.android.finsky.recyclerview.g)p0).a, ((com.google.android.finsky.recyclerview.g)p0).f, p1);
    }

    public final void a(View p0) {
        p0.getLayoutParams().height = FinskyHeaderListLayout.a(this.m, 2, 0);
    }

    public abstract void a(View p0, int p1, int p2);

    public final void a(View p0, View$OnClickListener p1, int p2, int p3, int p4, int p5) {
        ((AccountSimpleRowView)p0).a(this.a(p1, p2, p3, p4, p5), this.j);
    }

    public final void a(com.google.android.finsky.billing.myaccount.layout.c p0) {
        v1 = String.valueOf("SeenLandingRow_");
        v0 = String.valueOf(String.valueOf(p0.k));
        if (v0.length() != 0)
            v0 = v1.concat(v0);
        else
            v0 = new String(v1);
        p0.h = Boolean.valueOf(this.k.getBoolean(v0));
        this.k.putBoolean(v0, 1);
    }

    public abstract int e(int p0);

}
