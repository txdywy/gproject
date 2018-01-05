package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.z.e;
import com.google.android.finsky.z.h;

public final class com.google.android.finsky.actionbuttons.w extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final Document f;
    public final com.google.android.finsky.installqueue.g g;

    w(Context p0, int p1, Document p2, com.google.android.finsky.d.ad p3, com.google.android.finsky.d.w p4, com.google.android.finsky.installqueue.g p5) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p4, p3);
        this.f = p2;
        this.g = p5;
    }

    public final int a() {
        return 2917;
    }

    public final void a(PlayActionButtonV2 p0) {
        p0.a(this.f.a.f, 2131951800, this);
        this.b();
    }

    public final void onClick(View p0) {
        this.c();
        this.g.a(this.f.N().k).a(com.google.android.finsky.z.h.a);
    }

}
