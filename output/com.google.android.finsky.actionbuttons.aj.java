package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.aj extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final com.google.android.finsky.navigationmanager.a f;
    public final Document g;

    aj(Context p0, int p1, com.google.android.finsky.navigationmanager.a p2, Document p3, com.google.android.finsky.d.ad p4, com.google.android.finsky.d.w p5) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p5, p4);
        this.f = p2;
        this.g = p3;
    }

    public final int a() {
        return 2919;
    }

    public final void a(PlayActionButtonV2 p0) {
        p0.a(this.g.a.f, this.a.getResources().getString(2131952502), this.f.a(this, this.g));
        p0.setActionStyle(this.b);
        this.b();
    }

    public final void onClick(View p0) {
        this.f.a(this.g, this.d, this.c);
    }

}
