package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cw.a;
import com.google.android.finsky.cw.d;
import com.google.android.finsky.cw.e;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.ao extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final com.google.android.finsky.navigationmanager.a f;
    public final Document g;
    public final com.google.android.finsky.cw.a h;
    public final com.google.android.finsky.cw.d i;

    ao(Context p0, int p1, com.google.android.finsky.navigationmanager.a p2, Document p3, com.google.android.finsky.d.ad p4, com.google.android.finsky.cw.a p5, com.google.android.finsky.d.w p6, com.google.android.finsky.cw.d p7) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p6, p4);
        this.f = p2;
        this.g = p3;
        this.h = p5;
        this.i = p7;
    }

    public final int a() {
        return com.google.android.finsky.actionbuttons.j.a(this.h, this.g.a.f);
    }

    public final void a(PlayActionButtonV2 p0) {
        if (this.h == 0)
            v0 = "";
        else {
            v0 = new com.google.android.finsky.cw.e();
            if (this.a.getResources().getBoolean(2131492903))
                this.i.b(this.h, this.g.a.f, v0);
            else
                this.i.a(this.h, this.g.a.f, v0);
            v0 = v0.a(this.a);
        }
        p0.a(this.g.a.f, v0, this.f.a(this, this.g));
        p0.setActionStyle(this.b);
        this.b();
    }

    public final void onClick(View p0) {
        this.f.a(this.g, this.d, this.c);
    }

}
