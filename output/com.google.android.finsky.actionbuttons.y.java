package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.y extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final Document f;
    public final com.google.android.finsky.navigationmanager.a g;
    public final Account h;
    public final com.google.android.finsky.bn.b i;

    y(Context p0, int p1, Document p2, Account p3, com.google.android.finsky.d.ad p4, com.google.android.finsky.navigationmanager.a p5, com.google.android.finsky.d.w p6, com.google.android.finsky.bn.b p7) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p6, p4);
        this.f = p2;
        this.g = p5;
        this.h = p3;
        this.i = p7;
    }

    public final int a() {
        return 219;
    }

    public final void a(PlayActionButtonV2 p0) {
        p0.a(this.f.a.f, this.a.getResources().getString(2131951948), this);
        p0.setActionStyle(this.b);
        this.b();
    }

    public final void onClick(View p0) {
        this.c();
        this.g.a(this.h, this.f, 1);
        this.i.b(this.f.a.c, 0);
    }

}
