package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.support.c.a.l;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cw.a;
import com.google.android.finsky.cw.d;
import com.google.android.finsky.cw.e;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.aq extends com.google.android.finsky.actionbuttons.o
{

    public final Document f;
    public final com.google.android.finsky.navigationmanager.a g;
    public final Account h;
    public final String i;
    public final com.google.android.finsky.cw.a j;
    public final com.google.android.finsky.d.ad k;
    public final com.google.android.finsky.by.c l;
    public final com.google.android.finsky.by.o m;
    public final com.google.android.finsky.cw.d n;
    public final com.google.android.finsky.actionbuttons.an o;
    public int p;

    aq(Context p0, int p1, Document p2, String p3, com.google.android.finsky.d.ad p4, Account p5, com.google.android.finsky.navigationmanager.a p6, com.google.android.finsky.cw.a p7, com.google.android.finsky.d.w p8, com.google.android.finsky.d.ad p9, com.google.android.finsky.by.c p10, com.google.android.finsky.by.o p11, com.google.android.finsky.cw.d p12, com.google.android.finsky.actionbuttons.an p13, int p14) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p8, p4);
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
    }

    public static void a(Context p0, PlayActionButtonV2 p1, int p2) {
  0:    v0 = 2130837788;
  3:    switch (p2) {
            case 1:
 11:            v0 = android.support.c.a.l.a(p0.getResources(), v0, 0);
 15:            if (v0 != 0)
 17:                com.google.android.finsky.actionbuttons.p.a(p1, v0);
 20:            return;
            case 2:
 11:            v0 = android.support.c.a.l.a(p0.getResources(), v0, 0);
 15:            if (v0 != 0)
 17:                com.google.android.finsky.actionbuttons.p.a(p1, v0);
 20:            return;
            case 3:
 11:            v0 = android.support.c.a.l.a(p0.getResources(), v0, 0);
 15:            if (v0 != 0)
 17:                com.google.android.finsky.actionbuttons.p.a(p1, v0);
 20:            return;
            case 4:
 25:            break;
            case 5:
 25:            break;
            case 6:
 11:            v0 = android.support.c.a.l.a(p0.getResources(), v0, 0);
 15:            if (v0 != 0)
 17:                com.google.android.finsky.actionbuttons.p.a(p1, v0);
 20:            return;
            case 7:
 11:            v0 = android.support.c.a.l.a(p0.getResources(), v0, 0);
 15:            if (v0 != 0)
 17:                com.google.android.finsky.actionbuttons.p.a(p1, v0);
 20:            return;
            case 8:
 11:            v0 = android.support.c.a.l.a(p0.getResources(), v0, 0);
 15:            if (v0 != 0)
 17:                com.google.android.finsky.actionbuttons.p.a(p1, v0);
 20:            return;
            default:
 11:            v0 = android.support.c.a.l.a(p0.getResources(), v0, 0);
 15:            if (v0 != 0)
 17:                com.google.android.finsky.actionbuttons.p.a(p1, v0);
 20:            return;
        }
 21:    v0 = 2130837768;
 24:    goto 6;
    }

    public final int a() {
        if (this.j != 0)
            v0 = com.google.android.finsky.actionbuttons.j.a(this.j, this.f.a.f);
        else
            v0 = 0;
        return v0;
    }

    public final void a(PlayActionButtonV2 p0) {
        if (this.j == 0)
            v9 = this.a.getResources().getString(2131953086);
        else {
            v0 = new com.google.android.finsky.cw.e();
            if (this.a.getResources().getBoolean(2131492903))
                this.n.b(this.j, this.f.a.f, this.p, v0);
            else
                this.n.a(this.j, this.f.a.f, this.p, v0);
            v9 = v0.a(this.a);
        }
        if (this.j != 0 && com.google.android.finsky.actionbuttons.j.a(this.j))
            v0 = com.google.android.finsky.actionbuttons.j.a(this.j, this.f.a.f, this.g, this.i, this.d, this.a, this.c);
        else if (this.j.a == 21)
            v0 = new com.google.android.finsky.actionbuttons.ar(this);
        else if (this.m.a(this.f, this.l.a(this.h), 2))
            v0 = this.g.a(this.f, this.h, this.k, this.c);
        else
            v0 = this.g.a(this.h, this.f, 2, 0, this.i, 222, this.d, this.c);
        p0.a(this.f.a.f, v9, v0);
        p0.setActionStyle(this.b);
        if (this.j.a == 21)
            com.google.android.finsky.actionbuttons.aq.a(this.a, p0, this.p);
        this.c.a(new com.google.android.finsky.d.p().b(this.k));
    }

}
