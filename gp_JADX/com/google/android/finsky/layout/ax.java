package com.google.android.finsky.layout;

import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.frameworkviews.PlayRatingBar;
import com.google.android.finsky.frameworkviews.ac;
import com.squareup.leakcanary.C7582R;

final class ax implements ac {
    public final /* synthetic */ RateReviewEditor f18505a;

    ax(RateReviewEditor rateReviewEditor) {
        this.f18505a = rateReviewEditor;
    }

    public final void mo1472a(PlayRatingBar playRatingBar, int i) {
        if (i > 0) {
            C1601a.m9199a(this.f18505a.getContext(), this.f18505a.getResources().getQuantityString(C7582R.plurals.content_description_rated, i, new Object[]{Integer.valueOf(i)}), this.f18505a.f18283c, false);
            this.f18505a.mo3567b(i);
        }
        if (this.f18505a.f18287g != null) {
            this.f18505a.f18287g.mo1291l();
        }
    }
}
