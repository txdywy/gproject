package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import android.view.View;
import com.google.android.finsky.api.h;
import com.google.android.finsky.at.k;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cw.a;
import com.google.android.finsky.cw.d;
import com.google.android.finsky.cw.e;
import com.google.android.finsky.cz.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;

public final class com.google.android.finsky.actionbuttons.t extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final Document f;
    public final Fragment g;
    public final Account h;
    public final com.google.android.finsky.api.h i;
    public final com.google.android.finsky.cw.d j;
    public final com.google.android.finsky.cz.a k;
    public boolean l;
    public com.google.android.finsky.cw.a m;

    t(Context p0, int p1, Document p2, Account p3, com.google.android.finsky.d.ad p4, Fragment p5, com.google.android.finsky.d.w p6, com.google.android.finsky.cw.a p7, com.google.android.finsky.api.h p8, com.google.android.finsky.cw.d p9, com.google.android.finsky.cz.a p10) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p6, p4);
        this.f = p2;
        this.g = p5;
        this.h = p3;
        this.m = p7;
        this.i = p8;
        this.j = p9;
        this.k = p10;
    }

    public final int a() {
        if (this.m != 0)
            v0 = com.google.android.finsky.actionbuttons.j.a(this.m, this.f.a.f);
        else
            v0 = 235;
        return v0;
    }

    public final void a(PlayActionButtonV2 p0) {
        if (this.m == 0)
            v0 = this.a.getResources().getString(2131951801);
        else {
            v0 = new com.google.android.finsky.cw.e();
            if (this.a.getResources().getBoolean(2131492903))
                this.j.b(this.m, this.f.a.f, v0);
            else
                this.j.a(this.m, this.f.a.f, v0);
            v0 = v0.a(this.a);
        }
        p0.a(this.f.a.f, v0, this);
        if (this.l == 0)
            v0 = 1;
        else
            v0 = 0;
        p0.setEnabled(v0);
        p0.setActionStyle(this.b);
        this.b();
    }

    public final void onClick(View p0) {
        if (this.g.B.a("confirm_cancel_dialog") == 0) {
            this.c();
            v2 = new Object[1];
            v2[0] = this.f.a.g;
            v7 = new com.google.android.finsky.at.k();
            v7.a(this.a.getResources().getString(2131951845, v2)).d(2131953511).e(2131952618).a(305, this.f.a.D, 245, 246, this.c);
            v0 = new Bundle();
            v0.putParcelable("doc", this.f);
            v0.putString("ownerAccountName", this.h.name);
            v7.a(this.g, 7, v0);
            v7.a().a(this.g.B, "confirm_cancel_dialog");
        }
    }

}
