package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import com.squareup.leakcanary.C7582R;

public class ReviewsSamplesModuleLayout extends C2627n {
    public ReviewsSamplesModuleLayout(Context context) {
        this(context, null);
    }

    public ReviewsSamplesModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected String getFooterText() {
        return getContext().getString(C7582R.string.all_reviews).toUpperCase();
    }

    protected String getSectionTitleText() {
        return getContext().getString(C7582R.string.reviews_section_title).toUpperCase();
    }
}
