package com.google.android.finsky.actionbuttons;

import android.view.View;
import com.google.android.finsky.cw.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.k implements View$OnClickListener
{

    public final com.google.android.finsky.d.w a;
    public final com.google.android.finsky.d.ad b;
    public final com.google.android.finsky.navigationmanager.a c;
    public final com.google.android.finsky.cw.a d;
    public final String e;

    k(com.google.android.finsky.d.w p0, com.google.android.finsky.d.ad p1, com.google.android.finsky.navigationmanager.a p2, com.google.android.finsky.cw.a p3, String p4) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
    }

    public final void onClick(View p0) {
        this.a.b(new com.google.android.finsky.d.d(this.b).a(221));
        this.c.a(this.d.i, this.d.h, this.d.e, this.d.f, this.e, 0, this.a);
        if (p0 != 0)
            p0.postDelayed(new com.google.android.finsky.actionbuttons.l(this), 300);
    }

}
