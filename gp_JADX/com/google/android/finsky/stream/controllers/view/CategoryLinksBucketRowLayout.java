package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.squareup.leakcanary.C7582R;

public class CategoryLinksBucketRowLayout extends BucketRowLayout {
    public CategoryLinksBucketRowLayout(Context context) {
        this(context, null);
    }

    public CategoryLinksBucketRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
    }
}
