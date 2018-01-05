package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class HistogramBar extends View {
    public double f16198a;
    public double f16199b;
    public int f16200c;

    public HistogramBar(Context context) {
        this(context, null);
    }

    public HistogramBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setMaxBarWidth(double d) {
        this.f16199b = d;
    }

    public void setWidthPercentage(double d) {
        this.f16198a = d;
    }

    public void setBarHeight(int i) {
        this.f16200c = i;
    }

    public void setColor(int i) {
        super.setBackgroundColor(getContext().getResources().getColor(i));
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = (int) (this.f16198a * this.f16199b);
        if (i3 >= 0) {
            setMeasuredDimension(i3, this.f16200c);
        }
    }

    public int getBaseline() {
        return getMeasuredHeight();
    }
}
