package com.google.android.finsky.adapters;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.em;
import android.view.View;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.layout.ReviewItemLayout;
import com.google.android.finsky.layout.bi;
import com.google.android.finsky.ratereview.C3973p;
import com.squareup.leakcanary.C7582R;

final class C1178v implements bi {
    public final /* synthetic */ iu f7242a;
    public final /* synthetic */ ReviewItemLayout f7243b;
    public final /* synthetic */ C1180y f7244c;
    public final /* synthetic */ C1177u f7245d;

    C1178v(C1177u c1177u, iu iuVar, ReviewItemLayout reviewItemLayout, C1180y c1180y) {
        this.f7245d = c1177u;
        this.f7242a = iuVar;
        this.f7243b = reviewItemLayout;
        this.f7244c = c1180y;
    }

    public final void mo1512a(ReviewItemLayout reviewItemLayout) {
        this.f7245d.m7116a(reviewItemLayout, C3973p.HELPFUL, this.f7242a);
        Snackbar.m499a((View) reviewItemLayout, (int) C7582R.string.review_feedback_posted, 0).m493a();
    }

    public final void mo1514b(ReviewItemLayout reviewItemLayout) {
        this.f7245d.m7116a(reviewItemLayout, C3973p.NOT_HELPFUL, this.f7242a);
        Snackbar.m499a((View) reviewItemLayout, (int) C7582R.string.review_feedback_posted, 0).m493a();
    }

    public final void mo1513a(ReviewItemLayout reviewItemLayout, C3973p c3973p) {
        this.f7243b.setReviewFeedbackActionListener(null);
        em emVar = this.f7245d;
        C1180y c1180y = this.f7244c;
        iu iuVar = (iu) emVar.f7230d.m14679a(c1180y.f7252b, true);
        int indexOf = emVar.f7241o.indexOf(c1180y);
        emVar.m7116a(reviewItemLayout, c3973p, iuVar);
        emVar.f7241o.remove(indexOf);
        Snackbar.m499a((View) reviewItemLayout, (int) C7582R.string.review_feedback_posted, 0).m501a((int) C7582R.string.review_feedback_undo, new C1179w(emVar, iuVar, indexOf, c1180y, c3973p)).m493a();
        emVar.m3633d(indexOf);
    }
}
