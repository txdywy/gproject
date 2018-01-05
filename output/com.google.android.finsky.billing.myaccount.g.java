package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import com.google.android.finsky.api.m;
import com.google.android.finsky.billing.myaccount.layout.OrderHistoryRowView;
import com.google.android.finsky.billing.myaccount.layout.RewardRowView;
import com.google.android.finsky.billing.myaccount.layout.SubscriptionRowView;
import com.google.android.finsky.billing.myaccount.layout.a;
import com.google.android.finsky.billing.myaccount.layout.e;
import com.google.android.finsky.billing.myaccount.layout.n;
import com.google.android.finsky.billing.myaccount.layout.o;
import com.google.android.finsky.billing.myaccount.layout.p;
import com.google.android.finsky.billing.myaccount.layout.q;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.f.b;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.recyclerview.e;
import com.google.android.finsky.recyclerview.g;
import com.google.android.play.image.w;

public final class com.google.android.finsky.billing.myaccount.g extends com.google.android.finsky.recyclerview.e implements com.google.android.finsky.dfemodel.w
{

    public final int c;
    public final DfeToc d;
    public final com.google.android.finsky.billing.myaccount.bn e;
    public final com.google.android.finsky.d.w f;
    public com.google.android.finsky.dfemodel.j g;
    public RecyclerView h;
    public final com.google.android.play.image.w i;
    public final com.google.android.finsky.billing.myaccount.layout.p j;
    public final com.google.android.finsky.billing.myaccount.layout.q k;
    public final com.google.android.finsky.billing.myaccount.layout.o l;
    public final com.google.android.finsky.billing.myaccount.layout.n m;
    public final com.google.android.finsky.billing.myaccount.layout.e n;
    public final com.google.android.finsky.d.ad o;
    public final com.google.android.finsky.f.b p;
    public final com.google.android.finsky.navigationmanager.a q;

    g(Account p0, Context p1, com.google.android.finsky.dfemodel.j p2, com.google.android.play.image.w p3, com.google.android.finsky.navigationmanager.a p4, com.google.android.finsky.billing.myaccount.layout.e p5, com.google.android.finsky.billing.myaccount.layout.p p6, com.google.android.finsky.billing.myaccount.layout.q p7, com.google.android.finsky.billing.myaccount.layout.o p8, com.google.android.finsky.billing.myaccount.layout.n p9, com.google.android.finsky.d.ad p10, DfeToc p11, com.google.android.finsky.f.b p12, com.google.android.finsky.d.w p13) {
        com.google.android.finsky.recyclerview.e(p1, p2.h(), p2.t);
        this.d = p11;
        this.q = p4;
        this.g = p2;
        this.g.a(this);
        this.c = FinskyHeaderListLayout.a(p1, 2, 0);
        this.p = p12;
        this.f = p13.a(p0);
        this.e = new com.google.android.finsky.billing.myaccount.bn(this.f);
        this.i = p3;
        this.j = p6;
        this.k = p7;
        this.l = p8;
        this.m = p9;
        this.n = p5;
        this.o = p10;
    }

    private final void a(com.google.android.finsky.billing.myaccount.layout.a p0, int p1) {
        if (this.e.c == p0)
            this.e.c = 0;
        if (p1 == this.e.b)
            this.e.c = p0;
        p0.setRowPosition(p1);
        p0.setOnClickListener(this.e);
        if (p1 == this.e.b)
            p0.setClickable(0);
        if (this.e.b != -1)
            v0 = 1;
        else
            v0 = 0;
        if (v0 == 0) {
            this.e.c = p0;
            this.e.b = p1;
            p0.g = 1;
            p0.getLayoutParams().height = p0.b;
            p0.invalidate();
            p0.setClickable(0);
        }
    }

    private final boolean f(int p0) {
        if (p0 == this.e.b)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private static int g(int p0) {
        if (p0 <= 0)
            v0 = -1;
        else
            v0 = p0 - 1;
        return v0;
    }

    public final int a() {
        v0 = this.g.m();
        if (v0 == 0)
            v0 = 0;
        else {
            v0 = v0 + 1;
            if (this.K != 0)
                v0 = v0 + 1;
        }
        return v0;
    }

    public final int a(int p0) {
        if (p0 == 0)
            v0 = 0;
        else if (p0 == this.a() - 1) {
            if (this.K == 1)
                v0 = 3;
            else if (this.K == 2)
                v0 = 4;
            else {
                v0 = com.google.android.finsky.billing.myaccount.g.g(p0);
                if (this.g.a(v0)) {
                    v0 = (Document)this.g.a(v0, 1);
                    if (v0.aI())
                        v0 = 6;
                    else if (v0.bx())
                        v0 = 7;
                    else
                        v0 = 5;
                }
                else
                    v0 = -1;
            }
        }
        else {
            v0 = com.google.android.finsky.billing.myaccount.g.g(p0);
            if (this.g.a(v0)) {
                v0 = (Document)this.g.a(v0, 1);
                if (v0.aI())
                    v0 = 6;
                else if (v0.bx())
                    v0 = 7;
                else
                    v0 = 5;
            }
            else
                v0 = -1;
        }
        return v0;
    }

    public final android.support.v7.widget.fr a(ViewGroup p0, int p1) {
        switch (p1) {
            case 0:
                v0 = this.a(2130968970, p0);
                break;
            case 1:
                throw new IllegalStateException(41 + "Unknown type for onCreateView " + p1);
            case 2:
                throw new IllegalStateException(41 + "Unknown type for onCreateView " + p1);
            case 3:
                v0 = this.a(2130969082, p0);
                break;
            case 4:
                v0 = this.a(2130968823, p0);
                break;
            case 5:
                v0 = this.a(2130969150, p0);
                break;
            case 6:
                v0 = this.a(2130969354, p0);
                break;
            case 7:
                v0 = this.a(2130969402, p0);
                break;
            default:
                throw new IllegalStateException(41 + "Unknown type for onCreateView " + p1);
        }
        return new com.google.android.finsky.recyclerview.g(v0);
    }

    public final void a(RecyclerView p0) {
        super.a(p0);
        this.h = p0;
    }

    public final void a(android.support.v7.widget.fr p0, int p1) {
        switch (((com.google.android.finsky.recyclerview.g)p0).f) {
            case 0:
                ((com.google.android.finsky.recyclerview.g)p0).a.getLayoutParams().height = this.c;
                break;
            case 1:
                throw new IllegalStateException(39 + "Unknown type for onBindView " + ((com.google.android.finsky.recyclerview.g)p0).f);
            case 2:
                throw new IllegalStateException(39 + "Unknown type for onBindView " + ((com.google.android.finsky.recyclerview.g)p0).f);
            case 3:
                break;
            case 4:
                this.b(((com.google.android.finsky.recyclerview.g)p0).a);
                break;
            case 5:
                this.a((OrderHistoryRowView)((com.google.android.finsky.recyclerview.g)p0).a, p1);
                v1 = (Document)this.g.a(com.google.android.finsky.billing.myaccount.g.g(p1), 1);
                ((OrderHistoryRowView)((com.google.android.finsky.recyclerview.g)p0).a).a(v1, this.i, this.f(p1), this.n, this.q, this.p.a(v1.a.d), this.o, this.f);
                break;
            case 6:
                this.a((RewardRowView)((com.google.android.finsky.recyclerview.g)p0).a, p1);
                ((RewardRowView)((com.google.android.finsky.recyclerview.g)p0).a).a((Document)this.g.a(com.google.android.finsky.billing.myaccount.g.g(p1), 1), this.i, this.f(p1), this.d, this.q, this.o, this.f);
                break;
            case 7:
                this.a((SubscriptionRowView)((com.google.android.finsky.recyclerview.g)p0).a, p1);
                ((SubscriptionRowView)((com.google.android.finsky.recyclerview.g)p0).a).a((Document)this.g.a(com.google.android.finsky.billing.myaccount.g.g(p1), 1), this.i, this.f(p1), this.d, this.j, this.k, this.l, this.m, this.q, this.o, this.f);
                break;
            default:
                throw new IllegalStateException(39 + "Unknown type for onBindView " + ((com.google.android.finsky.recyclerview.g)p0).f);
        }
    }

    public final void b(RecyclerView p0) {
        super.b(p0);
        this.h = 0;
    }

    public final boolean i() {
        return this.g.t;
    }

    public final void j() {
        this.g.q();
    }

    public final String l() {
        return com.google.android.finsky.api.m.a(this.J, this.g.g());
    }

    public final void m_() {
        if (this.i())
            this.e(1);
        else
            this.e(0);
    }

}
