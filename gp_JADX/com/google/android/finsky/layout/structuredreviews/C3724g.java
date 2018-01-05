package com.google.android.finsky.layout.structuredreviews;

import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.frameworkviews.PlayRatingBar;
import com.google.android.finsky.frameworkviews.ac;
import com.squareup.leakcanary.C7582R;

final class C3724g implements ac {
    public final /* synthetic */ ac f18840a;
    public final /* synthetic */ ReviewRatingQuestion f18841b;

    C3724g(ReviewRatingQuestion reviewRatingQuestion, ac acVar) {
        this.f18841b = reviewRatingQuestion;
        this.f18840a = acVar;
    }

    public final void mo1472a(PlayRatingBar playRatingBar, int i) {
        if (i > 0) {
            C1601a.m9199a(this.f18841b.getContext(), this.f18841b.getResources().getQuantityString(C7582R.plurals.content_description_rated, i, new Object[]{Integer.valueOf(i)}), this.f18841b.f18828d, false);
            this.f18841b.m17600a(i);
        }
        if (this.f18840a != null) {
            this.f18840a.mo1472a(playRatingBar, i);
        }
        if (this.f18841b.f18831g) {
            if (this.f18841b.f18830f != null) {
                this.f18841b.f18830f.mo1471a(i);
            }
            this.f18841b.postDelayed(new C3725h(this), 600);
        }
        this.f18841b.f18829e.setVisibility(8);
    }
}
