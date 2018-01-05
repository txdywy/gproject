package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.api.l;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.activities.co implements View$OnClickListener
{

    public final Document a;
    public final com.google.android.finsky.activities.cm b;

    co(com.google.android.finsky.activities.cm p0, Document p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.d(2703);
        v0 = com.google.android.finsky.m.a.Y().e(this.a, com.google.android.finsky.m.a.ah().a(this.b.C));
        if (v0 != 0)
            this.b.z.b(com.google.android.finsky.api.l.a(com.google.android.finsky.dfemodel.q.d(v0.b)), this.b.S);
    }

}
