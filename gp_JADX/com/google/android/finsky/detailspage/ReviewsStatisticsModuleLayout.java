package com.google.android.finsky.detailspage;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.layout.HistogramView;
import com.squareup.leakcanary.C7582R;

public class ReviewsStatisticsModuleLayout extends ForegroundLinearLayout implements C2625e, C2621k {
    public boolean f14043a;
    public HistogramView f14044b;
    public TextView f14045c;
    public Paint f14046d;
    public String f14047e;

    public ReviewsStatisticsModuleLayout(Context context) {
        this(context, null);
    }

    public ReviewsStatisticsModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14044b = (HistogramView) findViewById(C7582R.id.reviews_statistics_panel);
        this.f14045c = (TextView) findViewById(C7582R.id.ratings_section_title);
        this.f14046d = new Paint();
        this.f14046d.setColor(getResources().getColor(C7582R.color.play_main_background));
        this.f14046d.setStrokeWidth((float) getResources().getDimensionPixelSize(C7582R.dimen.play_hairline_separator_thickness));
    }
}
