package com.google.android.finsky.detailspage.videowatchaction;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.squareup.leakcanary.C7582R;

public class WatchActionSummaryView extends LinearLayout {
    public PlayActionButtonV2 f14771a;
    public ViewGroup f14772b;
    public TextView f14773c;
    public TextView f14774d;
    public ProgressBar f14775e;
    public ImageView f14776f;

    public WatchActionSummaryView(Context context) {
        this(context, null);
    }

    public WatchActionSummaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14771a = (PlayActionButtonV2) findViewById(C7582R.id.watch_action_button);
        this.f14772b = (ViewGroup) findViewById(C7582R.id.download_progress_panel);
        this.f14773c = (TextView) this.f14772b.findViewById(C7582R.id.downloading_bytes);
        this.f14774d = (TextView) this.f14772b.findViewById(C7582R.id.downloading_percentage);
        this.f14775e = (ProgressBar) this.f14772b.findViewById(C7582R.id.progress_bar);
        this.f14776f = (ImageView) this.f14772b.findViewById(C7582R.id.cancel_download);
    }
}
