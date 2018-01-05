package com.google.android.finsky.stream.controllers.editorial.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.squareup.leakcanary.C7582R;

public class EditorialRowLayout extends BucketRowLayout {
    public EditorialRowLayout(Context context) {
        this(context, null);
    }

    public EditorialRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
    }
}
