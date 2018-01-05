package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.finsky.stream.base.view.C4296f;
import com.squareup.leakcanary.C7582R;

public class NonOrderedTopChartsRowLayout extends C4296f {
    public int f23002g;
    public int f23003h;
    public int f23004i;
    public int f23005j;

    public NonOrderedTopChartsRowLayout(Context context) {
        this(context, null);
    }

    public NonOrderedTopChartsRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        Resources resources = getResources();
        this.f23002g = 0;
        this.f23003h = resources.getDimensionPixelSize(C7582R.dimen.flat_grid_horizontal_margin);
        this.f23005j = resources.getDimensionPixelSize(C7582R.dimen.flat_grid_card_to_card_vpadding);
        this.f23004i = this.f23005j - resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
    }
}
