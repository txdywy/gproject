package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.finsky.stream.base.view.C4296f;
import com.squareup.leakcanary.C7582R;

public class CollectionReasonGridBucketRowLayout extends C4296f {
    public CollectionReasonGridBucketRowLayout(Context context) {
        this(context, null);
    }

    public CollectionReasonGridBucketRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_grid_card_to_card_vpadding);
        int dimensionPixelSize2 = dimensionPixelSize - resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
        setContentHorizontalPadding(0);
        setHorizontalMargin(resources.getDimensionPixelSize(C7582R.dimen.flat_grid_horizontal_margin));
        m19906a(dimensionPixelSize2, true);
        m19906a(0, false);
        setBottomPadding(dimensionPixelSize);
    }
}
