package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.finsky.stream.base.view.C4298h;
import com.squareup.leakcanary.C7582R;

public class FlatFullWidthListRowLayout extends C4298h {
    public FlatFullWidthListRowLayout(Context context) {
        this(context, null);
    }

    public FlatFullWidthListRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        Resources resources = getResources();
        setContentHorizontalPadding(resources.getDimensionPixelSize(C7582R.dimen.flat_search_results_with_title_extra_padding));
        m19906a(0, true);
        m19906a(0, false);
        setBottomPadding(0);
        setDividerSize(resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_card_to_card_vpadding));
    }
}
