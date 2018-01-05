package com.google.android.finsky.adapters;

import android.support.design.widget.Snackbar;
import android.support.design.widget.g;
import android.support.v7.widget.em;
import com.google.android.finsky.cv.a.iu;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.layout.ReviewItemLayout;
import com.google.android.finsky.ratereview.p;
import java.util.List;

public final class com.google.android.finsky.adapters.v implements com.google.android.finsky.layout.bi
{

    public final com.google.android.finsky.cv.a.iu a;
    public final ReviewItemLayout b;
    public final com.google.android.finsky.adapters.y c;
    public final com.google.android.finsky.adapters.u d;

    v(com.google.android.finsky.adapters.u p0, com.google.android.finsky.cv.a.iu p1, ReviewItemLayout p2, com.google.android.finsky.adapters.y p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void a(ReviewItemLayout p0) {
        this.d.a(p0, com.google.android.finsky.ratereview.p.a, this.a);
        Snackbar.a(p0, 2131953053, 0).a();
    }

    public final void a(ReviewItemLayout p0, com.google.android.finsky.ratereview.p p1) {
        this.b.setReviewFeedbackActionListener(0);
        v2 = (com.google.android.finsky.cv.a.iu)this.d.d.a(this.c.b, 1);
        v3 = this.d.o.indexOf(this.c);
        this.d.a(p0, p1, v2);
        this.d.o.remove(v3);
        Snackbar.a(p0, 2131953053, 0).a(2131953054, new com.google.android.finsky.adapters.w(this.d, v2, v3, this.c, p1)).a();
        this.d.d(v3);
    }

    public final void b(ReviewItemLayout p0) {
        this.d.a(p0, com.google.android.finsky.ratereview.p.b, this.a);
        Snackbar.a(p0, 2131953053, 0).a();
    }

}
