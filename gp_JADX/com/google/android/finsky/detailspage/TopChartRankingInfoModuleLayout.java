package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.layout.play.PlayRoundedPillItemView;
import com.google.android.finsky.playcard.FadingEdgeTextView;
import com.squareup.leakcanary.C7582R;

public class TopChartRankingInfoModuleLayout extends LinearLayout {
    public TextView f14196a;
    public PlayRoundedPillItemView f14197b;
    public FadingEdgeTextView f14198c;

    public TopChartRankingInfoModuleLayout(Context context) {
        this(context, null);
    }

    public TopChartRankingInfoModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14196a = (TextView) findViewById(C7582R.id.li_top_charts_title_info);
        this.f14198c = (FadingEdgeTextView) findViewById(C7582R.id.li_fading_top_charts_title_info);
        this.f14197b = (PlayRoundedPillItemView) findViewById(C7582R.id.rounded_pill);
        setBackgroundColor(getResources().getColor(C7582R.color.play_white));
    }
}
