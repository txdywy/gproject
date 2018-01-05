package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.finsky.frameworkviews.AccessibleLinearLayout;
import com.squareup.leakcanary.C7582R;

public class DetailsRefundAndFlagItemsSection extends AccessibleLinearLayout {
    public boolean f18123a;
    public View f18124b;
    public View f18125d;

    public DetailsRefundAndFlagItemsSection(Context context) {
        this(context, null);
    }

    public DetailsRefundAndFlagItemsSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18124b = findViewById(C7582R.id.refund);
        this.f18125d = findViewById(C7582R.id.flag);
    }
}
