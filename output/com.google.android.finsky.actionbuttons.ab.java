package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.p;
import android.view.View;
import com.google.android.finsky.at.k;
import com.google.android.finsky.br.a;
import com.google.android.finsky.by.o;
import com.google.android.finsky.ce.a;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.cw.a;
import com.google.android.finsky.cw.d;
import com.google.android.finsky.cw.e;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.ab extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final com.google.android.finsky.navigationmanager.a f;
    public final Document g;
    public final Account h;
    public final Account i;
    public final com.google.android.finsky.cw.a j;
    public final com.google.android.finsky.br.a k;
    public final com.google.android.finsky.installer.k l;
    public final com.google.android.finsky.ce.a m;
    public final com.google.android.finsky.cw.d n;

    ab(Context p0, int p1, com.google.android.finsky.navigationmanager.a p2, Document p3, com.google.android.finsky.d.ad p4, Account p5, com.google.android.finsky.cw.a p6, com.google.android.finsky.d.w p7, com.google.android.finsky.br.a p8, com.google.android.finsky.installer.k p9, com.google.android.finsky.by.o p10, com.google.android.finsky.ce.a p11, com.google.android.finsky.cw.d p12) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p7, p4);
        this.g = p3;
        this.f = p2;
        this.h = p5;
        this.j = p6;
        this.i = p10.a(this.g, this.h);
        this.k = p8;
        this.l = p9;
        this.m = p11;
        this.n = p12;
    }

    public final int a() {
        if (this.g.a.f == 3)
            v0 = 2911;
        else if (this.j != 0)
            v0 = com.google.android.finsky.actionbuttons.j.a(this.j, this.g.a.f);
        else
            v0 = 0;
        return v0;
    }

    public final void a(PlayActionButtonV2 p0) {
        v0 = "";
        if (this.g.a.f == 3)
            v0 = this.a.getResources().getString(2131952071);
        else if (this.j != 0) {
            v0 = new com.google.android.finsky.cw.e();
            if (this.a.getResources().getBoolean(2131492903))
                this.n.b(this.j, this.g.a.f, v0);
            else
                this.n.a(this.j, this.g.a.f, v0);
            v0 = v0.a(this.a);
        }
        p0.a(this.g.a.f, v0, this);
        p0.setActionStyle(this.b);
        this.b();
    }

    public final void onClick(View p0) {
        if (this.g.a.f == 3) {
            this.c();
            if (this.m.e())
                this.l.p(this.g.N().k);
            else {
                v0 = new com.google.android.finsky.at.k();
                v0.a(2131952603).d(2131952688);
                v0.a().a(this.f.j(), "download_no_network_dialog");
            }
        }
        else if (this.j != 0 && this.g.a.f == 4) {
            this.c();
            if (!this.k.a(this.a.getPackageManager(), this.g.a.f))
                this.f.b(this.g.a.f);
            else
                this.a.startActivity(this.k.b(this.a, this.g, this.i.name));
        }
    }

}
