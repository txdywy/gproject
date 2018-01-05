package com.google.android.finsky.actionbuttons;

import android.view.View;
import com.google.android.finsky.api.l;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.s implements View$OnClickListener
{

    public final Document a;
    public final com.google.android.finsky.actionbuttons.q b;

    s(com.google.android.finsky.actionbuttons.q p0, Document p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.c.b(new com.google.android.finsky.d.d(this.b.d).a(2703));
        v0 = this.b.n.e(this.a, this.b.m.a(this.b.h));
        if (v0 != 0)
            this.b.g.b(com.google.android.finsky.api.l.a(com.google.android.finsky.dfemodel.q.d(v0.b)), this.b.c);
    }

}
