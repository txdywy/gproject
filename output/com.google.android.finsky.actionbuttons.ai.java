package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import com.google.android.finsky.br.a;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.ai extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final com.google.android.finsky.navigationmanager.a f;
    public final Document g;
    public final Account h;
    public final boolean i;
    public final com.google.android.finsky.br.a j;

    ai(Context p0, int p1, com.google.android.finsky.navigationmanager.a p2, Document p3, com.google.android.finsky.d.ad p4, Account p5, com.google.android.finsky.d.w p6, boolean p7, com.google.android.finsky.br.a p8) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p6, p4);
        this.g = p3;
        this.f = p2;
        this.h = p5;
        this.i = p7;
        this.j = p8;
    }

    public final int a() {
        return 285;
    }

    public final void a(PlayActionButtonV2 p0) {
        p0.a(this.g.a.f, this.a.getResources().getString(2131952450), this);
        p0.setActionStyle(this.b);
        if (this.i != 0)
            this.b();
    }

    public final void onClick(View p0) {
        this.c();
        if (!this.j.a(this.a.getPackageManager(), this.g.a.f))
            this.f.b(this.g.a.f);
        else {
            v0 = this.j.a(this.a, this.g, this.h.name);
            v0.addFlags(268435456);
            this.a.startActivity(v0);
        }
    }

}
