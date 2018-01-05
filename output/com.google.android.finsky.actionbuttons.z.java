package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import android.view.View;
import com.google.android.finsky.at.k;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;

public final class com.google.android.finsky.actionbuttons.z extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final Document f;
    public final Fragment g;

    z(Context p0, int p1, Document p2, com.google.android.finsky.d.ad p3, Fragment p4, com.google.android.finsky.d.w p5) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p5, p3);
        this.f = p2;
        this.g = p4;
    }

    public final int a() {
        return 216;
    }

    public final void a(PlayActionButtonV2 p0) {
        p0.a(this.f.a.f, this.a.getResources().getString(2131951956), this);
        p0.setActionStyle(this.b);
        this.b();
    }

    public final void onClick(View p0) {
        if (this.g.B.a("deactivate_dialog") == 0) {
            this.c();
            v1 = new com.google.android.finsky.at.k();
            v1.a(2131951957).d(2131952688);
            v1.a().a(this.g.B, "deactivate_dialog");
        }
    }

}
