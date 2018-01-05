package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import com.google.android.finsky.b.f;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.cw.a;
import com.google.android.finsky.cw.d;
import com.google.android.finsky.cw.e;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ds.b;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.q extends com.google.android.finsky.actionbuttons.o
{

    public final Document f;
    public final com.google.android.finsky.navigationmanager.a g;
    public final Account h;
    public final String i;
    public final com.google.android.finsky.cw.a j;
    public final com.google.android.finsky.b.f k;
    public final com.google.android.finsky.bg.k l;
    public final com.google.android.finsky.by.c m;
    public final com.google.android.finsky.by.o n;
    public final com.google.android.finsky.cw.d o;
    public final com.google.android.finsky.ds.b p;
    public int q;
    public boolean r;

    q(Context p0, int p1, Document p2, String p3, com.google.android.finsky.d.ad p4, Account p5, com.google.android.finsky.navigationmanager.a p6, com.google.android.finsky.cw.a p7, com.google.android.finsky.d.w p8, com.google.android.finsky.b.f p9, com.google.android.finsky.bg.k p10, com.google.android.finsky.by.c p11, com.google.android.finsky.by.o p12, com.google.android.finsky.cw.d p13, com.google.android.finsky.ds.b p14, boolean p15) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p8, p4);
        this.q = 0;
        this.f = p2;
        this.g = p6;
        this.h = p5;
        this.i = p3;
        this.j = p7;
        this.k = p9;
        this.l = p10;
        this.m = p11;
        this.n = p12;
        this.o = p13;
        this.p = p14;
        this.r = p15;
    }

    public final int a() {
        return this.q;
    }

    public final void a(PlayActionButtonV2 p0) {
        if (this.f.a.f == 3) {
            if (this.n.a(this.f, this.h) != 0)
                v0 = 1;
            else
                v0 = 0;
            this.k.a(p0);
            if (this.p.c(this.f.N().k))
                p0.setEnabled(0);
        }
        else
            v0 = 0;
        if (this.j == 0) {
            if (v0 != 0)
                v1 = 221;
            else if (!this.f.ah()) {
                if (this.f.a.f == 3)
                    v1 = 221;
                else if (this.f.a.f == 1)
                    v1 = 225;
                else
                    v1 = 200;
            }
            else
                v1 = 200;
            this.q = v1;
            this.b();
        }
        if (this.j != 0) {
            v0 = new com.google.android.finsky.cw.e();
            if (this.l.k(this.a.getResources()))
                this.o.b(this.j, this.f.a.f, v0);
            else
                this.o.a(this.j, this.f.a.f, v0);
            v9 = v0.a(this.a);
        }
        else if (v0 != 0)
            v9 = this.a.getString(2131952292);
        else if (!this.f.ah()) {
            if (this.f.a.f == 3)
                v9 = this.a.getString(2131952292);
            else if (this.f.a.f == 1)
                v9 = this.a.getString(2131952690);
            else {
                v0 = this.f.e(1);
                if (v0 != 0 && v0.aL_())
                    v9 = v0.g;
                else
                    v9 = "";
            }
        }
        else {
            v0 = this.f.e(1);
            if (v0 != 0 && v0.aL_())
                v9 = v0.g;
            else
                v9 = "";
        }
        v0 = 0;
        if (this.j != 0) {
            if (this.j.a == 15) {
                if (this.f.a.f == 4)
                    v0 = new com.google.android.finsky.actionbuttons.s(this, this.f);
            }
            else
                v0 = com.google.android.finsky.actionbuttons.j.a(this.j, this.f.a.f, this.g, this.i, this.d, this.a, this.c);
        }
        else
            v0 = new com.google.android.finsky.actionbuttons.r(this, this.g.a(this.h, this.f, 1, 0, this.i, this.q, this.d, this.c));
        p0.a(this.f.a.f, v9, v0);
        p0.setActionStyle(this.b);
    }

}
