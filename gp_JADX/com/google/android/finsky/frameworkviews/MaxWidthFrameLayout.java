package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.android.vending.C0629a;

public class MaxWidthFrameLayout extends FrameLayout {
    public int f16212a;

    public MaxWidthFrameLayout(Context context) {
        this(context, null);
    }

    public MaxWidthFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.MaxSizeView);
        this.f16212a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }

    public void setMaxWidth(int i) {
        if (i != this.f16212a) {
            this.f16212a = i;
            requestLayout();
        }
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        if (this.f16212a > 0 && this.f16212a < size) {
            i = MeasureSpec.makeMeasureSpec(this.f16212a, MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }
}
