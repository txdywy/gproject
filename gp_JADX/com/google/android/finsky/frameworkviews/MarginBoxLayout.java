package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class MarginBoxLayout extends FrameLayout {
    public int f16208a;
    public int f16209b;

    public MarginBoxLayout(Context context) {
        this(context, null);
    }

    public MarginBoxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f16208a = resources.getDimensionPixelSize(C7582R.dimen.play_collection_max_width);
        this.f16209b = resources.getDimensionPixelSize(C7582R.dimen.play_collection_edge_padding) - resources.getDimensionPixelSize(C7582R.dimen.play_collection_card_spacing);
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(Math.min(this.f16208a, size - (this.f16209b * 2)), MemoryMappedFileBuffer.DEFAULT_SIZE);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getLayoutParams().height == -1) {
                childAt.measure(makeMeasureSpec, MeasureSpec.makeMeasureSpec(size2, MemoryMappedFileBuffer.DEFAULT_SIZE));
            } else {
                childAt.measure(makeMeasureSpec, MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i6 = (width - measuredWidth) / 2;
            int i7 = (height - measuredHeight) / 2;
            childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
        }
    }
}
