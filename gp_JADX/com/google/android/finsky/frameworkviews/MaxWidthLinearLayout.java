package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import com.android.vending.C0629a;

public class MaxWidthLinearLayout extends LinearLayout {
    public int f16210b;

    public MaxWidthLinearLayout(Context context) {
        this(context, null);
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.MaxSizeView);
        this.f16210b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }

    public void setMaxWidth(int i) {
        if (i != this.f16210b) {
            this.f16210b = i;
            requestLayout();
        }
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        if (this.f16210b > 0 && this.f16210b < size) {
            i = MeasureSpec.makeMeasureSpec(this.f16210b, MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }
}
