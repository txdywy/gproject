package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.play.image.FifeImageView;

public class SquareFifeImageView extends FifeImageView {
    public SquareFifeImageView(Context context) {
        this(context, null);
    }

    public SquareFifeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }
}
