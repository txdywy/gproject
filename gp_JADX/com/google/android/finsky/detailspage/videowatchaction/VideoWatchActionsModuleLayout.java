package com.google.android.finsky.detailspage.videowatchaction;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.frameworkviews.C2573z;
import com.google.android.finsky.frameworkviews.C2622l;
import com.squareup.leakcanary.C7582R;

public class VideoWatchActionsModuleLayout extends LinearLayout implements C2622l, C2573z {
    public TextView f14759a;
    public ExpandableListView f14760b;
    public TextView f14761c;
    public DetailsSummaryDynamic f14762d;
    public WatchActionSummaryView f14763e;
    public C2675d f14764f;

    public VideoWatchActionsModuleLayout(Context context) {
        this(context, null);
    }

    public VideoWatchActionsModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14759a = (TextView) findViewById(C7582R.id.video_availability_message);
        this.f14760b = (ExpandableListView) findViewById(C7582R.id.watch_actions_list);
        this.f14761c = (TextView) findViewById(C7582R.id.offer_note);
        this.f14762d = (DetailsSummaryDynamic) findViewById(C7582R.id.title_details_summary_dynamic);
        this.f14763e = (WatchActionSummaryView) findViewById(C7582R.id.watch_action_summary);
    }
}
