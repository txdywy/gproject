package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.av extends com.google.android.finsky.actionbuttons.o
{

    public final Document f;
    public final com.google.android.finsky.navigationmanager.a g;
    public final Account h;
    public final String i;

    av(Context p0, int p1, Document p2, Account p3, com.google.android.finsky.navigationmanager.a p4, String p5, com.google.android.finsky.d.ad p6, com.google.android.finsky.d.w p7) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p7, p6);
        this.f = p2;
        this.g = p4;
        this.h = p3;
        this.i = p5;
    }

    public final int a() {
        return 217;
    }

    public final void a(PlayActionButtonV2 p0) {
        p0.a(this.f.a.f, this.a.getResources().getString(2131953338), this.g.a(this.h, this.f, 1, 0, this.i, 217, this.d, this.c));
        p0.setActionStyle(this.b);
        this.b();
    }

}
