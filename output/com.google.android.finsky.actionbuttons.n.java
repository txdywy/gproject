package com.google.android.finsky.actionbuttons;

import android.view.View;
import com.google.android.finsky.cw.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.n implements View$OnClickListener
{

    public final com.google.android.finsky.navigationmanager.a a;
    public final com.google.android.finsky.cw.a b;
    public final com.google.android.finsky.d.w c;
    public final com.google.android.finsky.d.ad d;

    n(com.google.android.finsky.navigationmanager.a p0, com.google.android.finsky.cw.a p1, com.google.android.finsky.d.w p2, com.google.android.finsky.d.ad p3) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    public final void onClick(View p0) {
        this.a.a(this.b.h, this.c);
        this.c.b(new com.google.android.finsky.d.d(this.d));
    }

}
