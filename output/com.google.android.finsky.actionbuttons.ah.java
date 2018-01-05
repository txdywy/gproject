package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.by.o;
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

public final class com.google.android.finsky.actionbuttons.ah extends com.google.android.finsky.actionbuttons.o
{

    public final com.google.android.finsky.navigationmanager.a f;
    public final Document g;
    public final Account h;
    public final Account i;
    public final com.google.android.finsky.cw.a j;
    public final String k;
    public final boolean l;
    public final com.google.android.finsky.cw.d m;
    public final com.google.android.finsky.ds.b n;

    ah(Context p0, int p1, com.google.android.finsky.navigationmanager.a p2, Document p3, com.google.android.finsky.d.ad p4, Account p5, com.google.android.finsky.cw.a p6, String p7, com.google.android.finsky.d.w p8, boolean p9, com.google.android.finsky.by.o p10, com.google.android.finsky.cw.d p11, com.google.android.finsky.ds.b p12) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p8, p4);
        this.g = p3;
        this.f = p2;
        this.h = p5;
        this.j = p6;
        this.k = p7;
        this.l = p9;
        this.i = p10.a(this.g, this.h);
        this.m = p11;
        this.n = p12;
    }

    public final int a() {
        if (this.j != 0)
            v0 = com.google.android.finsky.actionbuttons.j.a(this.j, this.g.a.f);
        else
            v0 = 218;
        return v0;
    }

    public final void a(PlayActionButtonV2 p0) {
        v0 = this.a.getResources();
        if (this.g.a.f == 3) {
            if (this.l != 0)
                v7 = v0.getString(2131952878);
            else
                v7 = v0.getString(2131952690);
        }
        else if (this.j != 0) {
            v0 = new com.google.android.finsky.cw.e();
            if (this.a.getResources().getBoolean(2131492903))
                this.m.b(this.j, this.g.a.f, v0);
            else
                this.m.a(this.j, this.g.a.f, v0);
            v7 = v0.a(this.a);
        }
        else
            v7 = v0.getString(com.google.android.finsky.bg.h.e(this.g.a.f));
        if (this.j == 0) {
            if (this.g.a.f == 3)
                v0 = this.h;
            else
                v0 = this.i;
            v0 = this.f.a(this.g, v0, this.d, this.c);
        }
        else
            v0 = com.google.android.finsky.actionbuttons.j.a(this.j, this.g.a.f, this.f, this.k, this.d, this.a, this.c);
        p0.a(this.g.a.f, v7, v0);
        p0.setActionStyle(this.b);
        if (this.g.a.f == 3 && this.n.c(this.g.N().k))
            p0.setEnabled(0);
        this.b();
    }

}
