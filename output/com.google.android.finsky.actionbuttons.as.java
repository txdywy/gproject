package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installer.k;

public final class com.google.android.finsky.actionbuttons.as extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final Document f;
    public final com.google.android.finsky.f.a g;
    public final String h;
    public final Fragment i;
    public final com.google.android.finsky.by.o j;
    public final com.google.android.finsky.installer.k k;

    as(Context p0, int p1, Document p2, com.google.android.finsky.d.ad p3, Fragment p4, com.google.android.finsky.d.w p5, com.google.android.finsky.f.b p6, com.google.android.finsky.by.o p7, com.google.android.finsky.installer.k p8) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p5, p3);
        this.f = p2;
        this.i = p4;
        this.h = this.f.N().k;
        this.g = p6.a(this.h);
        this.j = p7;
        this.k = p8;
    }

    public final int a() {
        return 215;
    }

    public final void a(PlayActionButtonV2 p0) {
        p0.a(this.f.a.f, this.a.getResources().getString(2131953292), this);
        p0.setActionStyle(this.b);
        this.b();
    }

    public final void onClick(View p0) {
        this.c();
        com.google.android.finsky.actionbuttons.at.a(this.h, this.i, this.g.j, this.g.i, this.j.a(this.h));
    }

}
