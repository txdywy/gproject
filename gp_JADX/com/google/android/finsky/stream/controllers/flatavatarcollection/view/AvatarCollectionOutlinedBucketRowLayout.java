package com.google.android.finsky.stream.controllers.flatavatarcollection.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.finsky.frameworkviews.C3075q;
import com.google.android.finsky.stream.base.view.C4298h;
import com.squareup.leakcanary.C7582R;

public class AvatarCollectionOutlinedBucketRowLayout extends C4298h implements C3075q {
    public AvatarCollectionOutlinedBucketRowLayout(Context context) {
        this(context, null);
    }

    public AvatarCollectionOutlinedBucketRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_grid_horizontal_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.flat_grid_card_to_card_extended_vpadding);
        int dimensionPixelSize3 = dimensionPixelSize2 - resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
        setContentHorizontalPadding(0);
        setHorizontalMargin(dimensionPixelSize);
        m19906a(dimensionPixelSize3, true);
        m19906a(0, false);
        setBottomPadding(dimensionPixelSize2);
        setDividerSize(resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_card_to_card_vpadding));
    }
}
