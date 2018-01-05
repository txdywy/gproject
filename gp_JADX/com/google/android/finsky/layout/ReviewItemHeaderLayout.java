package com.google.android.finsky.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.layout.play.SingleLineContainer;
import com.google.android.play.layout.StarRatingBar;
import com.squareup.leakcanary.C7582R;

public class ReviewItemHeaderLayout extends SingleLineContainer {
    public StarRatingBar f18299a;
    public TextView f18300b;
    public TextView f18301c;
    public TextView f18302d;

    public ReviewItemHeaderLayout(Context context) {
        super(context);
    }

    public ReviewItemHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18299a = (StarRatingBar) findViewById(C7582R.id.review_rating);
        this.f18300b = (TextView) findViewById(C7582R.id.review_source);
        this.f18301c = (TextView) findViewById(C7582R.id.review_date);
        this.f18302d = (TextView) findViewById(C7582R.id.review_edited);
    }

    public void setReviewInfo(iu iuVar) {
        boolean z;
        Object obj = iuVar.f12722j;
        Object obj2 = iuVar.f12721i;
        if (TextUtils.isEmpty(obj)) {
            this.f18300b.setVisibility(8);
        } else {
            this.f18300b.setText(obj.toUpperCase());
            this.f18300b.setVisibility(0);
            if (TextUtils.isEmpty(obj2)) {
                this.f18300b.setOnClickListener(null);
            } else {
                this.f18300b.setOnClickListener(new be(obj2));
            }
        }
        if ((iuVar.f12714b & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f18299a.setVisibility(0);
            this.f18299a.setRating((float) iuVar.f12717e);
            this.f18299a.setShowEmptyStars(true);
        } else {
            this.f18299a.setVisibility(8);
        }
        if (iuVar.bs_()) {
            this.f18301c.setText(C1473m.f7980a.bb().m21826a(iuVar.f12724l));
            this.f18301c.setVisibility(0);
        } else {
            this.f18301c.setVisibility(8);
        }
        this.f18302d.setVisibility(8);
        if (iuVar.m12828d() && iuVar.m12829e() && iuVar.bs_() && iuVar.f12724l > iuVar.f12727o) {
            this.f18302d.setVisibility(0);
        }
    }
}
