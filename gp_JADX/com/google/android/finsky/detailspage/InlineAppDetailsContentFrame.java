package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.squareup.leakcanary.C7582R;

public class InlineAppDetailsContentFrame extends ContentFrame {
    public InlineAppDetailsContentFrame(Context context) {
        super(context);
    }

    public InlineAppDetailsContentFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InlineAppDetailsContentFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected int getLoadingIndicatorLayoutResId() {
        return C7582R.layout.inline_app_details_page_loading_indicator;
    }

    protected int getErrorIndicatorLayoutResId() {
        return C7582R.layout.inline_app_details_page_error_indicator;
    }
}
