package com.google.android.finsky.av;

import android.view.View;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.installer.k;

public final class com.google.android.finsky.av.b implements View$OnClickListener
{

    public final com.google.android.finsky.d.w a;
    public final com.google.android.finsky.d.ad b;
    public final com.google.android.finsky.installer.k c;
    public final String d;
    public final View e;

    b(com.google.android.finsky.d.w p0, com.google.android.finsky.d.ad p1, com.google.android.finsky.installer.k p2, String p3, View p4) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
    }

    public final void onClick(View p0) {
        this.a.b(new com.google.android.finsky.d.d(this.b).a(2911));
        this.c.p(this.d);
        this.e.setVisibility(8);
    }

}
