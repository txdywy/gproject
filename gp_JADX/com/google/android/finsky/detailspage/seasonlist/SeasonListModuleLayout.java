package com.google.android.finsky.detailspage.seasonlist;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.detailspage.videowatchaction.WatchActionSummaryView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class SeasonListModuleLayout extends LinearLayout implements C2621k {
    public View f14719a;
    public Spinner f14720b;
    public PlayActionButtonV2 f14721c;
    public WatchActionSummaryView f14722d;
    public WishlistPlayActionButton f14723e;
    public TextView f14724f;
    public TextView f14725g;
    public ExpandableListView f14726h;
    public List f14727i;
    public Document f14728j;
    public C2663i f14729k;
    public Handler f14730l = new Handler(Looper.getMainLooper());
    public Runnable f14731m = new C2668e(this);

    public SeasonListModuleLayout(Context context) {
        super(context);
    }

    public SeasonListModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SeasonListModuleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f14721c = (PlayActionButtonV2) findViewById(C7582R.id.buy_button);
        this.f14722d = (WatchActionSummaryView) findViewById(C7582R.id.watch_action_summary);
        this.f14723e = (WishlistPlayActionButton) findViewById(C7582R.id.wishlist_action_button);
        this.f14724f = (TextView) findViewById(C7582R.id.season_offer_discount_message);
        this.f14725g = (TextView) findViewById(C7582R.id.season_availability_message);
        this.f14719a = findViewById(C7582R.id.season_in_progress_snippet);
        this.f14720b = (Spinner) findViewById(C7582R.id.header_spinner);
        this.f14720b.setOnItemSelectedListener(new C2669f(this));
        this.f14726h = (ExpandableListView) findViewById(C7582R.id.watch_actions_list);
    }
}
