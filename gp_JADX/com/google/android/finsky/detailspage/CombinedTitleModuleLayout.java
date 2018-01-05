package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.layout.C2623r;
import com.google.android.finsky.layout.DiscoveryBar;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class CombinedTitleModuleLayout extends LinearLayout implements C2621k, C2622l, C2623r {
    public DiscoveryBar f13957a;
    public WarningMessageModuleView f13958b;
    public TopChartRankingInfoModuleLayout f13959c;

    public CombinedTitleModuleLayout(Context context) {
        super(context);
    }

    public CombinedTitleModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13957a = (DiscoveryBar) findViewById(C7582R.id.discovery_bar);
        this.f13958b = (WarningMessageModuleView) findViewById(C7582R.id.warning_message_module);
        this.f13957a.setBackgroundDrawable(null);
        this.f13959c = (TopChartRankingInfoModuleLayout) findViewById(C7582R.id.top_chart_ranking_info_module);
    }

    public View getTitleModuleLayout() {
        return this;
    }

    public TopChartRankingInfoModuleLayout getTopChartRankingInfoModuleLayout() {
        return this.f13959c;
    }

    public DiscoveryBar getDiscoveryBarModuleLayout() {
        return this.f13957a;
    }

    public WarningMessageModuleView getWarningMessageModuleView() {
        return this.f13958b;
    }

    public final void mo2983b(List list) {
        list.add(findViewById(C7582R.id.secondary_stack));
    }

    public final void mo2982a(List list) {
        list.add(Integer.valueOf(C7582R.id.secondary_stack));
    }
}
