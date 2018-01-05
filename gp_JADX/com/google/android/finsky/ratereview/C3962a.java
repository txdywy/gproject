package com.google.android.finsky.ratereview;

import android.widget.Toast;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.frameworkviews.C1056b;
import com.squareup.leakcanary.C7582R;

final class C3962a implements C1056b {
    public final /* synthetic */ PublicReviewsActivity f20000a;

    C3962a(PublicReviewsActivity publicReviewsActivity) {
        this.f20000a = publicReviewsActivity;
    }

    public final void u_() {
        if (!this.f20000a.f19998t) {
            this.f20000a.f19998t = true;
            Toast.makeText(this.f20000a.getBaseContext(), C7582R.string.gplus_public_reviews_confirmed, 0).show();
            if (this.f20000a.f19997s.dj().mo2294a(12637755)) {
                C0954a.ad.m5777b(this.f20000a.f19996r.cZ()).m5763a(Boolean.valueOf(true));
            } else {
                C0954a.ae.m5777b(this.f20000a.f19996r.cZ()).m5763a(Boolean.valueOf(true));
            }
            this.f20000a.setResult(-1);
            this.f20000a.finish();
        }
    }

    public final void v_() {
        if (!this.f20000a.f19998t) {
            this.f20000a.f19998t = true;
            this.f20000a.setResult(0);
            this.f20000a.finish();
        }
    }
}
