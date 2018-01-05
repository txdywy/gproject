package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.ak extends com.google.android.finsky.actionbuttons.o
{

    public final Document f;
    public final com.google.android.finsky.navigationmanager.a g;
    public final Account h;
    public final String i;

    ak(Context p0, int p1, Document p2, String p3, Account p4, com.google.android.finsky.navigationmanager.a p5, com.google.android.finsky.d.ad p6, com.google.android.finsky.d.w p7) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p7, p6);
        this.f = p2;
        this.g = p5;
        this.h = p4;
        this.i = p3;
    }

    public final int a() {
        return 234;
    }

    public final void a(PlayActionButtonV2 p0) {
        v3 = new Object[1];
        v3[0] = this.f.e(1).g;
        p0.a(this.f.a.f, this.a.getString(2131952907, v3), this.g.a(this.h, this.f, this.f.e(1).p, 0, this.i, 234, this.d, this.c));
        p0.setActionStyle(this.b);
        this.b();
    }

}
