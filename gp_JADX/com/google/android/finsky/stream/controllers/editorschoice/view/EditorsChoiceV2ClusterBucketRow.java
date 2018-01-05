package com.google.android.finsky.stream.controllers.editorschoice.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.frameworkviews.C3139a;
import com.squareup.leakcanary.C7582R;

public class EditorsChoiceV2ClusterBucketRow extends BucketRowLayout implements C3139a {
    public boolean f22250a;

    public EditorsChoiceV2ClusterBucketRow(Context context) {
        this(context, null);
    }

    public EditorsChoiceV2ClusterBucketRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        setContentHorizontalPadding(0);
    }

    public final boolean mo4185a() {
        return this.f22250a;
    }
}
