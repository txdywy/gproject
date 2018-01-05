package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class SpacerHeightAwareFrameLayout extends FrameLayout {
    public ah f16227a;

    public SpacerHeightAwareFrameLayout(Context context) {
        super(context);
    }

    public SpacerHeightAwareFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpacerHeightAwareFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setSpacerHeightProvider(ah ahVar) {
        this.f16227a = ahVar;
        requestLayout();
    }

    protected void onMeasure(int i, int i2) {
        if (this.f16227a != null) {
            int ah = this.f16227a.ah();
            if (ah != getPaddingTop()) {
                setPadding(getPaddingLeft(), ah, getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i, i2);
    }
}
