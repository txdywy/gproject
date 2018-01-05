package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.play.layout.StarRatingBar;
import com.squareup.leakcanary.C7582R;

public class VettedGameFeatureLayout extends LinearLayout {
    public StarRatingBar f14206a;
    public ProgressBar f14207b;
    public TextView f14208c;

    public VettedGameFeatureLayout(Context context) {
        this(context, null);
    }

    public VettedGameFeatureLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14206a = (StarRatingBar) findViewById(C7582R.id.feature_rating);
        this.f14207b = (ProgressBar) findViewById(C7582R.id.rating_ring);
        this.f14208c = (TextView) findViewById(C7582R.id.feature_title);
    }
}
