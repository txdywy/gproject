package com.google.android.finsky.activities;

import android.content.Intent;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.p111d.C2475d;

final class fv implements C1056b {
    public final /* synthetic */ boolean f6829a;
    public final /* synthetic */ RateReviewActivity f6830b;

    fv(RateReviewActivity rateReviewActivity, boolean z) {
        this.f6830b = rateReviewActivity;
        this.f6829a = z;
    }

    public final void u_() {
        if (!this.f6830b.f6409E) {
            int i;
            this.f6830b.f6409E = true;
            if (this.f6829a) {
                i = 1205;
            } else {
                i = 1204;
            }
            this.f6830b.f6407C.m13379b(new C2475d(this.f6830b).m13256a(i));
            if (this.f6830b.f6420y) {
                this.f6830b.f6413r.m18681a(this.f6830b.f6414s, this.f6830b.f6416u, this.f6830b.f6417v, this.f6830b.f6411G.getUserRating(), this.f6830b.f6411G.getUserTitle(), this.f6830b.f6411G.getUserComment(), null, this.f6830b.f6419x, this.f6830b, null, this.f6830b, false);
            }
            Intent intent = new Intent();
            intent.putExtra("doc_id", this.f6830b.f6416u);
            intent.putExtra("rating", this.f6830b.f6411G.getUserRating());
            intent.putExtra("review_title", this.f6830b.f6411G.getUserTitle());
            intent.putExtra("review_comment", this.f6830b.f6411G.getUserComment());
            if (!this.f6830b.f6420y) {
                intent.putExtra("author", this.f6830b.f6419x);
            }
            if (!this.f6830b.f6421z) {
                intent.putExtra("author_title", this.f6830b.f6419x.f14885a.f12100g);
                intent.putExtra("author_profile_image_url", ((bd) this.f6830b.f6419x.m14644c(4).get(0)).f11860f);
            }
            this.f6830b.setResult(1, intent);
            this.f6830b.finish();
        }
    }

    public final void v_() {
        if (!this.f6830b.f6409E) {
            this.f6830b.f6409E = true;
            this.f6830b.f6407C.m13379b(new C2475d(this.f6830b).m13256a(1206));
            if (this.f6830b.f6420y) {
                this.f6830b.f6413r.m18683a(this.f6830b.f6414s, this.f6830b.f6416u, this.f6830b.f6417v, this.f6830b, null, false);
            }
            Intent intent = new Intent();
            intent.putExtra("doc_id", this.f6830b.f6416u);
            this.f6830b.setResult(2, intent);
            this.f6830b.finish();
        }
    }
}
