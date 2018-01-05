package com.google.android.finsky.layout;

import android.os.Build.VERSION;
import com.google.android.finsky.frameworkviews.C1056b;

final class bb implements C1056b {
    public final /* synthetic */ C1056b f18512a;
    public final /* synthetic */ RateReviewEditor2 f18513b;

    bb(RateReviewEditor2 rateReviewEditor2, C1056b c1056b) {
        this.f18513b = rateReviewEditor2;
        this.f18512a = c1056b;
    }

    public final void u_() {
        RateReviewEditor2 rateReviewEditor2 = this.f18513b;
        Runnable bcVar = new bc(this);
        if (VERSION.SDK_INT >= 21) {
            rateReviewEditor2.postDelayed(bcVar, 150);
        } else {
            bcVar.run();
        }
    }

    public final void v_() {
        RateReviewEditor2 rateReviewEditor2 = this.f18513b;
        Runnable bdVar = new bd(this);
        if (VERSION.SDK_INT >= 21) {
            rateReviewEditor2.postDelayed(bdVar, 150);
        } else {
            bdVar.run();
        }
    }
}
