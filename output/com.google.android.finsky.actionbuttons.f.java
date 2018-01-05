package com.google.android.finsky.actionbuttons;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.z.e;
import com.google.android.finsky.z.h;

public final class com.google.android.finsky.actionbuttons.f implements View$OnClickListener
{

    public final String a;
    public final ViewGroup b;
    public final com.google.android.finsky.actionbuttons.c c;

    f(com.google.android.finsky.actionbuttons.c p0, String p1, ViewGroup p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        this.c.v.b(new com.google.android.finsky.d.d(this.c.g).a(2917));
        this.c.l.a(this.a).a(com.google.android.finsky.z.h.a);
        this.b.setVisibility(4);
    }

}
