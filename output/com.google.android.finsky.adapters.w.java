package com.google.android.finsky.adapters;

import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.iu;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ratereview.p;
import com.google.android.finsky.ratereview.q;
import java.util.List;

public final class com.google.android.finsky.adapters.w implements View$OnClickListener
{

    public final com.google.android.finsky.cv.a.iu a;
    public final int b;
    public final com.google.android.finsky.adapters.y c;
    public final com.google.android.finsky.ratereview.p d;
    public final com.google.android.finsky.adapters.u e;

    w(com.google.android.finsky.adapters.u p0, com.google.android.finsky.cv.a.iu p1, int p2, com.google.android.finsky.adapters.y p3, com.google.android.finsky.ratereview.p p4) {
        this.e = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
    }

    public final void onClick(View p0) {
        this.e.l.b(this.e.c.a.c, this.a.c, this.d);
        this.e.o.add(this.b, this.c);
        this.e.a.a(this.b, 1);
    }

}
