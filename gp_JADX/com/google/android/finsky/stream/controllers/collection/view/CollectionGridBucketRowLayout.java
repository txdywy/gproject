package com.google.android.finsky.stream.controllers.collection.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.finsky.frameworkviews.C3146p;
import com.google.android.finsky.stream.base.view.C4296f;
import com.squareup.leakcanary.C7582R;

public class CollectionGridBucketRowLayout extends C4296f implements C3146p {
    public CollectionGridBucketRowLayout(Context context) {
        this(context, null);
    }

    public CollectionGridBucketRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_grid_card_to_card_vpadding);
        int dimensionPixelSize2 = dimensionPixelSize - resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(C7582R.dimen.flat_grid_horizontal_margin);
        setContentHorizontalPadding(0);
        setHorizontalMargin(dimensionPixelSize3);
        m19906a(dimensionPixelSize2, true);
        m19906a(0, false);
        setBottomPadding(dimensionPixelSize);
    }
}
