package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.preregistration.g;

public final class com.google.android.finsky.actionbuttons.al extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final Document f;
    public final com.google.android.finsky.api.c g;
    public final Fragment h;
    public final com.google.android.finsky.preregistration.g i;

    al(Context p0, int p1, Document p2, com.google.android.finsky.d.ad p3, com.google.android.finsky.d.w p4, Fragment p5, Account p6, com.google.android.finsky.api.h p7, com.google.android.finsky.preregistration.g p8) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p4, p3);
        this.f = p2;
        this.h = p5;
        this.g = p7.a(p6.name);
        this.i = p8;
    }

    public final int a() {
        return 295;
    }

    public final void a(PlayActionButtonV2 p0) {
        p0.a(this.f.a.f, this.a.getString(2131952912), this);
        p0.setActionStyle(this.b);
        this.b();
    }

    public final void onClick(View p0) {
        this.c();
        this.i.a(this.f, this.g, 1, this.h, this.a);
    }

}
