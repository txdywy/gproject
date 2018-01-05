package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.android.vending.C0629a;

public class MaxSizeLinearLayout extends MaxWidthLinearLayout {
    public int f16211a;

    public MaxSizeLinearLayout(Context context) {
        this(context, null);
    }

    public MaxSizeLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.MaxSizeView);
        this.f16211a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public void setMaxHeight(int i) {
        if (i != this.f16211a) {
            this.f16211a = i;
            requestLayout();
        }
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i2);
        if (this.f16211a > 0 && this.f16211a < size) {
            i2 = MeasureSpec.makeMeasureSpec(this.f16211a, MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }
}
