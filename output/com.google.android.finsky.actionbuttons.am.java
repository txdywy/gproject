package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import android.view.View;
import com.google.android.finsky.at.k;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.cx.b;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;

public final class com.google.android.finsky.actionbuttons.am extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final Document f;
    public final String g;
    public final com.google.android.finsky.f.a h;
    public final Fragment i;
    public final com.google.android.finsky.cx.b j;
    public final int k;

    am(Context p0, int p1, Document p2, com.google.android.finsky.d.ad p3, Fragment p4, com.google.android.finsky.d.w p5, com.google.android.finsky.f.b p6, com.google.android.finsky.cx.b p7) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p5, p3);
        this.f = p2;
        this.i = p4;
        this.g = this.f.N().k;
        this.h = p6.a(this.g);
        this.j = p7;
        if (this.h != 0 && this.h.b())
            v0 = 215;
        else
            v0 = 214;
        this.k = v0;
    }

    public final int a() {
        return this.k;
    }

    public final void a(PlayActionButtonV2 p0) {
        p0.a(this.f.a.f, this.a.getResources().getString(2131952992), this);
        p0.setActionStyle(this.b);
        this.b();
    }

    public final void onClick(View p0) {
        this.c();
        if (this.k == 215)
            v0 = 1;
        else
            v0 = 0;
        if (this.i.B.a("refund_confirm") == 0) {
            v4 = new com.google.android.finsky.at.k();
            v4.a(2131953333).d(2131953511).e(2131952618);
            v5 = new Bundle();
            v5.putString("package_name", this.g);
            v5.putString("account_name", this.h.r);
            v5.putBoolean("try_uninstall", v0);
            v4.a(this.i, 4, v5);
            v4.a().a(this.i.B, "refund_confirm");
        }
    }

}
