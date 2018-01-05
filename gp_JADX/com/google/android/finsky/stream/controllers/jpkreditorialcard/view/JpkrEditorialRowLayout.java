package com.google.android.finsky.stream.controllers.jpkreditorialcard.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.squareup.leakcanary.C7582R;

public class JpkrEditorialRowLayout extends BucketRowLayout {
    public JpkrEditorialRowLayout(Context context) {
        this(context, null);
    }

    public JpkrEditorialRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
    }
}
