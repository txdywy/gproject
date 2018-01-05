package com.google.android.finsky.activities;

import android.content.Intent;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.RateReviewEditor;
import com.google.android.finsky.ratereview.c;
import java.util.List;

public final class com.google.android.finsky.activities.fv implements com.google.android.finsky.frameworkviews.b
{

    public final boolean a;
    public final RateReviewActivity b;

    fv(RateReviewActivity p0, boolean p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void u_() {
        if (this.b.E == 0) {
            this.b.E = 1;
            if (this.a != 0)
                v0 = 1205;
            else
                v0 = 1204;
            this.b.C.b(new com.google.android.finsky.d.d(this.b).a(v0));
            if (this.b.y != 0)
                this.b.r.a(this.b.s, this.b.u, this.b.v, this.b.G.getUserRating(), this.b.G.getUserTitle(), this.b.G.getUserComment(), 0, this.b.x, this.b, 0, this.b, 0);
            v1 = new Intent();
            v1.putExtra("doc_id", this.b.u);
            v1.putExtra("rating", this.b.G.getUserRating());
            v1.putExtra("review_title", this.b.G.getUserTitle());
            v1.putExtra("review_comment", this.b.G.getUserComment());
            if (this.b.y == 0)
                v1.putExtra("author", this.b.x);
            if (this.b.z == 0) {
                v1.putExtra("author_title", this.b.x.a.g);
                v1.putExtra("author_profile_image_url", ((com.google.android.finsky.cv.a.bd)this.b.x.c(4).get(0)).f);
            }
            this.b.setResult(1, v1);
            this.b.finish();
        }
    }

    public final void v_() {
        if (this.b.E == 0) {
            this.b.E = 1;
            this.b.C.b(new com.google.android.finsky.d.d(this.b).a(1206));
            if (this.b.y != 0)
                this.b.r.a(this.b.s, this.b.u, this.b.v, this.b, 0, 0);
            v0 = new Intent();
            v0.putExtra("doc_id", this.b.u);
            this.b.setResult(2, v0);
            this.b.finish();
        }
    }

}
