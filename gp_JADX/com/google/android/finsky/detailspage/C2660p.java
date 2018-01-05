package com.google.android.finsky.detailspage;

import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.layout.ReviewItemLayout;
import com.google.android.finsky.layout.bi;
import com.google.android.finsky.ratereview.C3973p;

final class C2660p implements bi {
    public final /* synthetic */ iu f14709a;
    public final /* synthetic */ ReviewItemLayout f14710b;
    public final /* synthetic */ C2627n f14711c;

    C2660p(C2627n c2627n, iu iuVar, ReviewItemLayout reviewItemLayout) {
        this.f14711c = c2627n;
        this.f14709a = iuVar;
        this.f14710b = reviewItemLayout;
    }

    public final void mo1512a(ReviewItemLayout reviewItemLayout) {
        C2627n c2627n = this.f14711c;
        iu iuVar = this.f14709a;
        C3973p c3973p = C3973p.HELPFUL;
        if (c2627n.f13930a != null) {
            c2627n.f13930a.mo1364a(c2627n.i, iuVar.f12715c, c3973p);
        }
    }

    public final void mo1514b(ReviewItemLayout reviewItemLayout) {
        C2627n c2627n = this.f14711c;
        iu iuVar = this.f14709a;
        C3973p c3973p = C3973p.NOT_HELPFUL;
        if (c2627n.f13930a != null) {
            c2627n.f13930a.mo1364a(c2627n.i, iuVar.f12715c, c3973p);
        }
    }

    public final void mo1513a(ReviewItemLayout reviewItemLayout, C3973p c3973p) {
        this.f14710b.setReviewFeedbackActionListener(null);
        C2627n c2627n = this.f14711c;
        iu iuVar = this.f14709a;
        if (c2627n.f13930a != null) {
            c2627n.f13930a.mo1364a(c2627n.i, iuVar.f12715c, c3973p);
        }
    }
}
