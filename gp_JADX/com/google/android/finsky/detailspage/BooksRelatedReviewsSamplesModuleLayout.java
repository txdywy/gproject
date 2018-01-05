package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import com.squareup.leakcanary.C7582R;

public class BooksRelatedReviewsSamplesModuleLayout extends C2627n {
    public BooksRelatedReviewsSamplesModuleLayout(Context context) {
        this(context, null);
    }

    public BooksRelatedReviewsSamplesModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected String getFooterText() {
        return getContext().getString(C7582R.string.audiobook_related_ebook_reviews).toUpperCase();
    }

    protected String getSectionTitleText() {
        return getContext().getString(C7582R.string.audiobook_related_ebook_reviews_section_title).toUpperCase();
    }
}
